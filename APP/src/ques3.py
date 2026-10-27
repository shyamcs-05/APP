prices = [500, 1200, 2500, 900, 1500]
def discounted_price(price):
    if price > 1000:
        return price * 0.80
    return price
discounted_prices = list(map(discounted_price, prices))
print("Original prices:", prices)
print("Prices after discount:", discounted_prices)
eligible_prices = list(filter(lambda price: price > 1000, prices))
print("Products eligible for discount:", eligible_prices)