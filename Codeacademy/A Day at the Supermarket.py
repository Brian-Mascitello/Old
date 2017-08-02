prices = {
    "banana" : 4,
    "apple"  : 2,
    "orange" : 1.5,
    "pear"   : 3,
}
stock = {
    "banana" : 6,
    "apple"  : 0,
    "orange" : 32,
    "pear"   : 15,
}

for key in prices:
    print(key)
    print("price: %s" % (prices[key]))
    print("stock: %s" % (stock[key]))
    
total = 0

for key in prices:
    print(prices[key] * stock[key])
    total += prices[key] * stock[key]
    
print(total)

shopping_list = ["banana", "orange", "apple"]

def compute_bill(food):
    total = 0
    
    for key in food:
        
        if stock[key] != 0:
            
            stock[key] = stock[key] - 1
            total += prices[key]
            
    return total

print("The shopping trip will cost $%.2f." % compute_bill(shopping_list))
