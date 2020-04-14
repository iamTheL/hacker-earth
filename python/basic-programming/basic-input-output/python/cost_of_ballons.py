from typing import List
no_of_test_cases = input()
no_of_test_cases = int(no_of_test_cases)

class TestCase:
    def __init__():
        
    def __init__(self, green_cost:int, purple_cost:int, result: List[int]):
        self.green_cost = green_cost
        self.purple_cost = purple_cost
        self.result = result

all_test_cases : List[TestCase] = []

for i in range(0,no_of_test_cases):
    costs = input()
    test_case  = TestCase()
    test_case.green_cost = int(costs.split()[0])
    test_case.purple_cost = int(costs.split()[1])
    no_of_students = input()
    no_of_students = int(no_of_students)
    all_test_cases.append(test_case)
    # for x in range(0,no_of_students)
    # print (i)

