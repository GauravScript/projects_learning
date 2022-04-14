def test():
    data = [100, 4, 200,1,3,2]
    data.sort()
    temp_dic = {}
    max_ = 0
    start = 0
    last = 0
    for i in data:
        if i - 1 in temp_dic.keys():
            temp_dic[i] = [temp_dic[i - 1][0], temp_dic[i - 1][1] + 1]
            temp_dic.pop(i - 1)
        else:
            temp_dic[i] = [i, 1]

    for key, value in temp_dic.items():
        if max_ < value[1]:
            max_ = value[1]
            last = key
            start = value[0]

    print([x for x in range(start, last + 1)], max_)
