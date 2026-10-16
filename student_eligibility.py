#Question 5
students = [
    ("Arun", "Pass", "Pass"),
    ("Bala", "Pass", "Fail"),
    ("Charan", "Pass", "Pass"),
    ("Divya", "Fail", "Pass")
]

eligible = list(filter(
    lambda s: s[1] == "Pass" and s[2] == "Pass",
    students
))

print("Eligible Students:")
for s in eligible:
    print(s[0])
