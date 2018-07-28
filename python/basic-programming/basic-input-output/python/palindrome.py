# You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

# Input Format
# The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

# Output Format
# Print the required answer on a single line.

# Constraints 

# Note
# String S consists of lowercase English Alphabets only.

# https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/


input_string = input()

reversed_string = input_string[::-1]

if input_string == reversed_string:
    print('YES')
else:
    print('NO')

# print(reversed_string)