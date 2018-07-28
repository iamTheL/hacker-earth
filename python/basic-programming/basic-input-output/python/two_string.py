# Given two strings of equal length, you have to tell whether they both strings are identical.

# Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

# Input :

# First line, contains an intger 'T' denoting no. of test cases.
# Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
# Output:

# For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.

# https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/two-strings-4/

input_size = int(input())
i = 0
while i < input_size:
    string1, string2 = map(str, input().split())
    if string1 == string2:
        print('YES') 
    else:
        print('NO')
    i += 1