class Stack:
    def __init__(self):
        self.items=[]
    def push(self,item):
        return self.items.append(item)
    def pop(self):
        return self.items.pop()
    def isEmpty(self):
        return self.items == []
    def top(self):
        return self.items[len(self.items)-1]
    def __str__(self):
        return self.items
    def __getitem__(self,index):
        return self.items[index]

for _ in range(int(input())):
    n=int(input())
    h=[int(h) for h in input().split()]
    back=[0]*n
    front=[0]*n
    s1=Stack()
    s2=Stack()
    s1.push(0)
    for i in range(1,n):
        while not s1.isEmpty() and h[s1.top()]<h[i]:
            s1.pop()
        if s1.isEmpty():
            back[i]=i
        else:
            back[i]=i-s1.top()
        s1.push(i)
    s2.push(n-1)
    for j in range(n-2,-1,-1):
        while not s2.isEmpty() and h[s2.top()]<h[j]:
            s2.pop()
        if s2.isEmpty():
            front[j]=n-j-1
        else:
            front[j]=s2.top()-j
        s2.push(j)
    maxima=-1
    index=-1
    mod=(10**9)+7
    for i in range(n):
        height=back[i]+front[i]
        height=((height%mod)*i)%mod
        if height> maxima:
            maxima=height
            index=i

    print(index+1)