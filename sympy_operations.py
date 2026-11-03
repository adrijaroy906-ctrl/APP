import sympy as sp

x = sp.symbols('x')

# Expansion
expr = (x + 2) ** 2
print("Expansion:", sp.expand(expr))

# Factorization
expr = x**2 + 5*x + 6
print("Factorization:", sp.factor(expr))

# Simplification
expr = (x**2 - 1) / (x - 1)
print("Simplification:", sp.simplify(expr))

# Solve quadratic equation
eq = x**2 - 5*x + 6
print("Solutions:", sp.solve(eq, x))
