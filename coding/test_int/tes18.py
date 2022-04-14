

x= [2, 3, 8, 7, 7, 8, 4, 8, 9, 7]

# input data type
# input length should not be less then 1
# max  input length
# Null, string x= null
x= [0,0,0,0]
x= [1.23321,0.33333333333333333300]
x= [1ddfd333, ]



def find_orc():
    temp ={}
    for i in x:
        if i in temp.keys():
            temp[i] = temp[i] +1
        else:
            temp[i] = 1

    max = 0
    for key, value in temp.items():
        if max < value:
            max = value

    for key, value in temp.items():
        if value == max:
            print(key)


find_orc()
