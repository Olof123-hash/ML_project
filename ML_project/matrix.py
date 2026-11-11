x = [[1,2,3], [4,5,6], [7,8,9]]
y = [[9,8,7], [6,5,4], [3,2,1]]
res = [[0]*3 for _ in range(3)]

for i in range(len(x)):
    for j in range(len(y)):
        res[i][j] = x[i][j] * y[i][j]

for r in res:
    print(r)



r1 = [1,2,3,5]
r2 = [2,3,4,5]
r3 = [5,6,7,6]

matrix = [r1,r2,r3]
print(matrix[1])

print(len(matrix[0]))

def print_matrix(m):
    if m == []:
        return
    
    num_rows = len(m)
    num_cols = len(m[0])

    for row in m:
        for num in row:
            print(num)
    return

print_matrix(matrix)