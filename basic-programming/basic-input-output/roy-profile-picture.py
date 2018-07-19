# Problem Url : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/

# Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
# Minimum dimension of the picture can be L x L, where L is the length of the side of square.

# Now Roy has N photos of various dimensions.
# Dimension of a photo is denoted as W x H 
# where W - width of the photo and H - Height of the photo

# When any photo is uploaded following events may occur:

# [1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
# [2] If width and height, both are large enough and 
# (a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
# (b) else user is prompted to crop it. Print "CROP IT" in this case.

# (quotes are only for clarification)

def validate_profile_pic(width, height):
    if width < minimum_length or height < minimum_length:
        print ('UPLOAD ANOTHER')
    elif width == height:
        print ('ACCEPTED')
    elif width > minimum_length or height > minimum_length:
        print('CROP IT')

minimum_length = int(input())
no_of_photos = int(input())

i = 0
while i < no_of_photos:
    width, height = map(int,input().split())
    validate_profile_pic (width,height)
    i += 1


