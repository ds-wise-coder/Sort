def s(N,stage):
    result = []
    m=len(stage)
    
    if m != 0:
        count = stage.count(stage)
        result[stage] = count/m
        m -= count
    else:
        result[stage] = 0

    return sorted(result, key=lambda X : result[X], reverse=True)
