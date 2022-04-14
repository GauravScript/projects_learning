# [10, 30 ,20 , 40,70]
# output :- 60


# + -> 10,30,20 // 20,40
# - 70,10

def test():
    data = [10, 30 ,20 , 40,70]
    exp=60
    result =set()

    for i in range(len(data)):
        if exp-data[i] == 60:
            result.add()