def order(sentence):
    strArr = sentence.split(" ")
    res = ""
    for j in range(len(strArr)):
        for c in range(len(strArr)):
            if strArr[c].__contains__(str(j+1)):
                res = res + strArr[c] + " "
                break
    return res.strip()