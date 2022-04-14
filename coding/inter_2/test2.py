def find_pair(data):

    temp=min_=max_=data[0]
    for i in range(0,len(data)):
        if max_<data[i]:
            max_ =data[i]
            min_= temp
        if min_> data[i]:
            temp = data[i]
    return [min_,max_]


def test():
    data = [58,56,100,56,55,54,53]
    result = find_pair(data)
    if result[0]==result[1]:
        print("no profit")
    else:
        print(result)
