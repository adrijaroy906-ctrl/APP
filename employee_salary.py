#Question2
from functools import reduce

salaries = [30000, 45000, 35000, 50000, 25000]

# a) Revise salaries
revised = list(map(
    lambda s: s * 1.10 if s < 40000 else s,
    salaries
))

# b) Identify eligible employees
eligible = list(filter(lambda s: s < 40000, salaries))

# c) Calculate total revised salary
total = reduce(lambda a, b: a + b, revised)

print("Original Salaries:", salaries)
print("Eligible Salaries:", eligible)
print("Revised Salaries:", revised)
print("Total Salary Expenditure:", total)
