# You are given an array of n numbers and q queries. For each query you have to print the floor of the expected value(mean) of the subarray from L to R.
# Input:
# First line contains two integers N and Q denoting number of array elements and number of queries.
# Next line contains N space seperated integers denoting array elements.
# Next Q lines contain two integers L and R(indices of the array).
# Output:
# print a single integer denoting the answer.
# Constraints:
# 1<= N ,Q,L,R <= 10^6
# 1<= Array elements <= 10^9
# https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/play-with-numbers-2/


# template begins
#####################################
 
# import libraries for input/ output handling
# on generic level
import atexit, io, sys
 
# A stream implementation using an in-memory bytes 
# buffer. It inherits BufferedIOBase.
buffer = io.BytesIO()
sys.stdout = buffer
 
# print via here
@atexit.register
def write():
    sys.__stdout__.write(buffer.
 
#####################################
# template ends

# array_size, query_size = map(int,input().split())
# input_array = list(map(int,input().split()))

# i = 0

# while i < query_size:
#     left, right = map(int,input().split())
#     answer = 0
#     divisor = 0
#     while left < right - 1:
#         answer += input_array[left]  
#         divisor += 1
#         left += 1
#     print((answer//divisor).encode())

#     i += 1

data = bytes("1" , 'utf-8')
print(data)