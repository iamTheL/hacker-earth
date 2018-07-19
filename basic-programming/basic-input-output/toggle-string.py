# https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/

# You have been given a String S consisting of uppercase and lowercase English alphabets. 
# You need to change the case of each alphabet in this String. 
# That is, all the uppercase letters should be converted to lowercase and 
# all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

# Input Format
# The first and only line of input contains the String S

# Output Format
# Print the resultant String on a single line.

input_string = input()
print (''.join(c.lower() if c.isupper() else c.upper() for c in input_string))