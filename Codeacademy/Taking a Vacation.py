def hotel_cost(nights):
    return 140 * nights
    
def plane_ride_cost(city):
    if city == "Charlotte":
        return 183
    elif city == "Tampa":
        return 220
    elif city == "Pittsburgh":
        return 222
    elif city == "Los Angeles":
        return 475
    else:
        return "Data not available."
        
def rental_car_cost(days):
    if days < 3:
        return 40 * days
    elif days < 7:
        return 40 * days - 20
    else:
        return 40 * days - 50
        
def trip_cost(city, days, spending_money):
    return hotel_cost(days) + plane_ride_cost(city) + rental_car_cost(days) + spending_money

print("A five night hotel stay will cost $%s." % (hotel_cost(5)))
print("A plane ride to Charlotte, North Carolina costs $%s." % (plane_ride_cost("Charlotte")))
print("A rental car will cost $%s for five days." % (rental_car_cost(5)))
print("The total trip will cost $%s including $300 for spending money." % (trip_cost("Charlotte", 5, 300)))
