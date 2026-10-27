from functools import reduce
marks = [35, 50, 72, 88, 95]
passed_marks = list(filter(lambda mark: mark >= 50, marks))
print("Marks scoring 50 or above:", passed_marks)
grace_marks = list(map(lambda mark: min(mark + 5, 100), marks))
print("Marks after grace marks:", grace_marks)
total = reduce(lambda a, b: a + b, grace_marks, 0)
print("Total marks after grace marks:", total)