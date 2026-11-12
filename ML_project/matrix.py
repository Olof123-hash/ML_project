##import numpy as np


x = [[1,2,3], [4,5,6], [7,8,9]]
y = [[9,8,7], [6,5,4], [3,2,1]]

def multiply_matrix(m,c):
    if (len(c) != len(m[0])):
        return "Not valid multiplication"


    result = [[0]*len(c[0]) for _ in range (len(m))]
    
    for i in range(len(m)):
        for j in range(len(c[0])):
            for k in range(len(m[0])):
                result[i][j] += ((m[i][k] * c[k][j]))
                
    return result

def add_matrix(m, c):
    pass

def subtract_matrix(m, c):
    pass

def transpose(m):
    return list(zip(*m))


##def multiply_matrix_usingnumpy(m,c):
    return np.dot(m,c) 

print(multiply_matrix(x,y))
print(transpose(x))

