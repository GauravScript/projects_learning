


class stack:

    def __init__(self):
        self.stack = []

    def add(self, data):
        self.stack.append(data)

    # stack_1= [5,4,3,2,1]

    def queue_pop(self):
        stack_temp = []
        length = len(self.stack)
        for i in range(0,length-1):
            stack_temp.append(self.stack.pop())
        element = self.stack[0]
        self.stack.clear()
        for i in stack_temp:
            self.stack.append(i)
        return element

queue = stack()
queue.add(1)
queue.add(2)
queue.add(3)
queue.add(4)
print(queue.queue_pop())
print(queue.stack)
print(queue.queue_pop())
print(queue.queue_pop())
print(queue.queue_pop())