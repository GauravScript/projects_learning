from collections import Counter

x = "jflsadfdsafa"
print(Counter(x))

def testing():
    input = "my name is hello"
    print(' '.join([x[::-1] for x in input.split(' ')]))
    print(' '.join([x for x in input.split(' ')][::-1]))

testing()




class temp:
    i=0
    def __init__(self):
        temp.i += 1

test = temp()
test1 = temp()
print(temp.i)
#
