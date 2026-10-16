#Question1
from functools import reduce

marks = [45, 60, 85, 35, 95]

# a) Filter students scoring 50 or above
passed = list(filter(lambda x: x >= 50, marks))

# b) Add 5 grace marks, maximum 100
updated = list(map(lambda x: min(x + 5, 100), marks))

# c) Calculate total marks
total = reduce(lambda a, b: a + b, updated)

print("Passed Marks:", passed)
print("Updated Marks:", updated)
print("Total Marks:", total)
