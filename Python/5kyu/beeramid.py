def beeramid(bonus, price):
    res = 0
    cans = bonus / price
    i = 1
    while i*i <= cans:
        cans -= i*i
        i += 1
        res += 1
    return res
