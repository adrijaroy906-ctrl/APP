#Question 6
# a) logical facts
employees = [
    ("Ravi", 6, "Completed", 5),
    ("Priya", 3, "Completed", 4),
    ("Kumar", 8, "Not Completed", 5),
    ("Meena", 7, "Completed", 4)
]
#b) logical rule 
eligible = list(filter(
    lambda e: e[1] >= 5 and e[2] == "Completed" and e[3] >= 4,
    employees
))
#c) query 
print("Employees Eligible for Promotion:")
for e in eligible:
    print(e[0])
