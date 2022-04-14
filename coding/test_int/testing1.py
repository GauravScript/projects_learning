from collections import Counter

x = "This Lion"
# output = "tHIS lION"
print(x.swapcase())

def convert_case():
    temp = []
    for i in x:
        if i.isupper():
            temp +=i.lower()
        elif i.islower():
            temp += i.upper()
        else:
            temp += " "

    print("".join(temp))

convert_case()


def convert_case2():
    temp = []
    for i in x:
        if i.isupper():
            temp.append(i.lower())
        elif i.islower():
            temp.append(i.upper())
        else:
            temp += " "

    print("".join(temp))

convert_case2()

# y= "hello perrot"
# print(Counter(y))
#
# def char_count():
#     temp = {}
#     for i in y:
#         if i in temp.keys():
#             temp[i] = temp[i]  +1
#         else:
#             temp[i] = 1
#     print(temp)
#
# char_count()