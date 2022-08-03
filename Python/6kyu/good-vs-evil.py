# I don't know why side wins when side lose... But thats works!

def good_vs_evil(good, evil):
    goodArr = list(map(int, good.split(" ")))
    evilArr = list(map(int, evil.split(" ")))
    goodPoints = goodArr[0]*1 + goodArr[1]*2 + goodArr[2]*3 + goodArr[3]*3 + goodArr[4]*4 + goodArr[5]*10
    evilPoints = evilArr[0]*1 + evilArr[1]*2 + evilArr[2]*2 + evilArr[3]*2 + evilArr[4]*3 + evilArr[5]*5 + evilArr[6]*10
    if(goodPoints == evilPoints): return 'Battle Result: No victor on this battle field'
    return ('Battle Result: Evil eradicates all trace of Good', 'Battle Result: Good triumphs over Evil')[evilPoints < goodPoints]