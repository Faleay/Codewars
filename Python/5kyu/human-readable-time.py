def make_readable(seconds):
    hours = seconds//3600
    minutes = seconds//60 - hours*60
    secs = seconds - hours*3600 - minutes*60
    
    minutes = str(minutes)
    hours = str(hours)
    secs = str(secs)
    
    if len(minutes) == 1:
        minutes = "0"+minutes
    if len(hours) == 1:
        hours = "0"+hours
    if len(secs) == 1:
        secs = "0"+secs
    return hours+":"+minutes+":"+secs