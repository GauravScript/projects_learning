# Input: arr[] = {7, 10, 4, 3, 20, 15}
# k = 3


def find():

    # data = input("Enter a list element separated by space ")
    # data = data.split(" ")
    # n= int(input("inter place in list "))
    data = [7, 10, 4, 3, 20, 15]
    data.sort()
    n=1
    for i in range(1, len(data)):
        for j in range(0, i):
            print(i,j)
            if data[i]<data[j]:
                data[i],data[j]=data[j],data[i]
                print("->")
                print(i,j)
                print(data)

    # print(data[n-1])
    # print(data)

find()