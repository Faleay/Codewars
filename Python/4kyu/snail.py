def snail(snail_map):
    result = []
    
    while snail_map:
    
        for i in snail_map[0]:
            result.append(i)
        snail_map.pop(0)
        
        if not snail_map:
            break

        for j in snail_map:
            result.append(j[-1])
            j.pop()
        for k in range(len(snail_map[-1]) - 1, -1, -1):
            result.append(snail_map[-1][k])
        snail_map.pop()
        if not snail_map:
            break
        for l in reversed(snail_map):
            result.append(l[0])
            l.pop(0)
            
    return result


arr = snail([[1,2,3], [8,9,4], [7,6,5]])
print(arr)