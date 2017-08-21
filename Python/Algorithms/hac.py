class Stack:
    def __init__(self):
        self.items = []
    def push(self,item):
        return self.items.append(item)
    def pop(self):
        return self.items.pop()
    def __getitem__(self,index):
        return self.items[index]
    def __str__(self):
        return self.items
    def size(self):
        return len(self.items)
    def isEmpty(self):
        return self.items == []
    def peek(self):
        return self.items[len(self.items)-1]



test=int(input())

for i in range(test):
    n=int(input())
    h=[int(h) for h in input().split()]
    r=[]
    s=Stack()
    r.append(1)
    s.push(0)
    
    for i in range(1,n):
        while not s.isEmpty() and h[s.peek()]<=h[i]:
            s.pop()
        if s.isEmpty():
            r.append(i+1)
        else:
            r.append(i-s.peek())
        s.push(i)

    print(' '.join(str(r) for r in r))


