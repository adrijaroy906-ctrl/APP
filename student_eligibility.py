#Question 5
#a) logical facts
students = [
    ("Arun", "Pass", "Pass"),
    ("Bala", "Pass", "Fail"),
    ("Charan", "Pass", "Pass"),
    ("Divya", "Fail", "Pass")
]
#b)rule
eligible = list(filter(
    lambda s: s[1] == "Pass" and s[2] == "Pass",
    students
))
#c)query
print("Eligible Students:")
for s in eligible:
    print(s[0])
