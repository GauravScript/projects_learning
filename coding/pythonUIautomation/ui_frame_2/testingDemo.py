def munber_comb(input):
    result = []
    result_1 = []

    temp = {'1': ['a', 'b', 'c'],
            '2': ['d', 'e', 'f'],
            '3': ['g', 'h', 'i'],
            '4': ['j', 'k', 'l'],
            '5': ['m', 'n', 'o'],
            '6': ['p', 'q', 'r']}

# 2 =['d', 'e', 'f']
# 3-> []

    for i in input:
        if len(result) == 0:
            result =temp[i]
            continue
        for j in temp[i]:
            for k in result:
                result_1.append(j + k)
            result.clear()
            result.deepcopy(result_1)
            result_1.clear()

    print(result)


munber_comb('12')