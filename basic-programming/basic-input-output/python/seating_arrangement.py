# Problem Statement Url : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/

facing_lookup_table = {
    "WS" : [1,6,7,0],
    "AS" : [3,4,9,10],
    "MS" : [2,5,8,11]
}



def find_seating(input_data):

    facing_pivot = input_data % 12

    if facing_pivot in facing_lookup_table["WS"]:
        facing = "WS"
    elif facing_pivot in facing_lookup_table["AS"]:
        facing = "AS"
    elif facing_pivot in facing_lookup_table["MS"]:
        facing = "MS"

    if facing_pivot == 0:
        input_data -= 11
    elif facing_pivot == 1:
        input_data += 11
    elif facing_pivot == 2:
        input_data += 9
    elif facing_pivot == 3:
        input_data += 7
    elif facing_pivot == 4:
        input_data += 5
    elif facing_pivot == 5:
        input_data += 3
    elif facing_pivot == 6:
        input_data += 1
    elif facing_pivot == 7:
        input_data -= 1
    elif facing_pivot == 8:
        input_data -= 3
    elif facing_pivot == 9:
        input_data -= 5
    elif facing_pivot == 10:
        input_data -= 7
    elif facing_pivot == 11:
        input_data -= 9

    print(str(input_data) + ' ' +facing)
        


find_seating(90)