def rot13(message):
    res = ""
    input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    output = "NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm"
    
    for i in message:
        res += output[input.find(i)] if input.find(i) != -1 else i
        
    return res
