def alphabet_position(text):
    correct = "abcdefghijklmnopqrstuvwxyz"
    res = ""
    for c in text.lower():
        if not(c in correct):
            continue
        res+=str(correct.find(c)+1)+" "
    return res.strip()