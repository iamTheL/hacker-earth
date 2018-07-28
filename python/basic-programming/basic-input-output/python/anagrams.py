# Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

# Input :

# test cases,t
# two strings a and b, for each test case
# Output:

# Desired O/p

# Constraints :

# string lengths<=10000

# Note :

# Anagram of a word is formed by rearranging the letters of the word.

# For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.

# https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/anagrams-651/

no_of_tests = input()
i = 0
while i < int(no_of_tests):
    string1 = list(input())
    string2 = list(input())
    string3 = string2.copy()
    common_chars = []

    j = 0
    while j < len(string1):
        if string1[j] in string2:
            common_chars.append(string1[j])
            string2.remove(string1[j])
        j += 1
    print ((len(string1)-len(common_chars)) + (len(string3) - len(common_chars)))

    i += 1