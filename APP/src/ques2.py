from functools import reduce
salaries = [35000, 42000, 28000, 50000, 39000]
eligible = list(filter(lambda salary: salary < 40000, salaries))
print("Eligible salaries:", eligible)
revised = list(map(lambda salary: salary * 1.10 if salary < 40000 else salary,salaries))
revised = [round(salary, 2) for salary in revised]
print("Revised salaries:", revised)
total_expenditure = reduce(lambda a, b: a + b, revised, 0)
print("Total salary expenditure:", total_expenditure)