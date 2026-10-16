# Question 7
#a) facts
parking = [
    ("S1", "Car", "Available"),
    ("S2", "Bike", "Occupied"),
    ("S3", "Car", "Available"),
    ("S4", "Bike", "Available"),
    ("S5", "Car", "Occupied")
]
#b) rule
available = list(filter(
    lambda p: p[1] == "Car" and p[2] == "Available",
    parking
))
#c) query
print("Available Car Parking Slots:")
for p in available:
    print(p[0])
