def queue_time(customers, n):
    if len(customers) == 0: return 0
    if len(customers) == 1: return customers[0]
    order = [0]*n 
    for j in customers:
        order[order.index(min(order))]+=j
    return max(order)