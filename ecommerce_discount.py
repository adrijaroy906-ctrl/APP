# Question 3
# Original product prices
prices = [500, 1200, 2000, 800, 1500]

# a) Pure function
def discount(price):
    if price > 1000:
        return price * 0.80
    return price

# b) Apply discount using map()
discounted = list(map(discount, prices))

# c) Identify products costing more than ₹1000
eligible = list(filter(lambda p: p > 1000, prices))

print("Original Prices:", prices)
print("Eligible Products:", eligible)
print("Discounted Prices:", discounted)
