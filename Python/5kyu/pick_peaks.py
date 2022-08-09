def pick_peaks(arr):
    result = {
        'pos': [],
        'peaks': []
    }

    # This string variable for determine which way graph is going
    decOrInc = ''
    
    # This loop insert chars at decOrInc
    for i in range(1, len(arr)):
        if arr[i] > arr[i-1]:
            decOrInc += '^'
        elif arr[i] == arr[i-1]:
            decOrInc += '-'
        else:
            decOrInc += 'v'
    
    # This loop checks decOrInc for bends in the graph
    for i in range(1, len(decOrInc)):
        if decOrInc[i-1] == '^' and decOrInc[i] == 'v':
            result['pos'].append(i)
            result['peaks'].append(arr[i])
        elif decOrInc[i] == '-' and decOrInc[i-1] == '^':
            for j in range(i, len(decOrInc)):
                if decOrInc[j] == 'v' and decOrInc[j-1] == '-':
                    result['pos'].append(i)
                    result['peaks'].append(arr[i])
                    break
                elif decOrInc[j] == '^' and decOrInc[j-1] == '-':
                    break

    return result