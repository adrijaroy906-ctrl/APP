#Question 4
from functools import reduce

units = [8, 12, 15, 7, 20, 10]

# a) Filter consumption above 10 units
high = list(filter(lambda x: x > 10, units))

# b) Calculate daily electricity cost
cost = list(map(lambda x: x * 6, units))

# c) Calculate total consumption
total_units = reduce(lambda a, b: a + b, units)

# d) Pure function to calculate bill
def bill(consumption):
    return reduce(lambda a, b: a + b, consumption) * 6

total_bill = bill(units)

print("Consumption Above 10 Units:", high)
print("Daily Costs:", cost)
print("Total Consumption:", total_units)
print("Total Electricity Bill:", total_bill)
