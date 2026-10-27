from functools import reduce
consumption = [8, 12, 9, 15, 11]
high_consumption = list(filter(lambda units: units > 10, consumption))
print("Consumption above 10 units:", high_consumption)
daily_costs = list(map(lambda units: units * 6, consumption))
print("Daily electricity costs:", daily_costs)
total_units = reduce(lambda a, b: a + b, consumption, 0)
print("Total consumption:", total_units, "units")
def calculate_bill(units, rate=6):
    return units * rate
print("Total electricity bill:", calculate_bill(total_units))