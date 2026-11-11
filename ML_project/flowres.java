import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int number_placed = 0;

        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            if ((flowerbed[0] == 0) && n == 1 ) {
                return true;
            } 

        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                number_placed++;
            }

        if ((flowerbed[flowerbed.length - 1] == 0) && (flowerbed[flowerbed.length - 2] == 0)) {
                flowerbed[flowerbed.length - 1] = 1;
                number_placed++;
            }

        for (int i = 1; i < flowerbed.length - 2; i++) {


            if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                number_placed++;
            }

        }
        System.out.println(Arrays.toString(flowerbed));

        if (number_placed >= n) {
                return true;
        }
        
        return false;
    }

    public String reverseVowels(String s) {

        List<Character> vowels = new ArrayList<>(List.of('a', 'A', 'e', 'E', 'i','I','o','O','u', 'U'));
        System.out.println(vowels);

        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(i, s.charAt(i));
        }

        System.out.println(map);
        return s;
    }


    public static void main(String[] args) {

        flowers obj1 = new flowers();
        int[] test = {1,0,0,0,0,0,0};
        System.out.println(obj1.reverseVowels("test"));
    }
}