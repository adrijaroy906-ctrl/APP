import sympy as sp

t = sp.symbols('t')

s = t**3 - 6*t**2 + 9*t + 5

# Velocity
v = sp.diff(s, t)
print("Velocity:", v)

# Acceleration
a = sp.diff(v, t)
print("Acceleration:", a)

# Vehicle momentarily at rest
rest = sp.solve(v, t)
print("Time at Rest:", rest)

# Displacement from t = 0 to t = 3
d = sp.integrate(v, (t, 0, 3))
print("Displacement:", d)
