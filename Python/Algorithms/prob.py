n = int(input())
a = [int(x) for x in input().split()]
b=[0]*n
f=[0]*n
b[0]=-1
f[n-1]=-1
sb=[0]
fb=[n-1]
for i in range(1,n):
    while len(sb) > 0 and a[i]>=a[sb[-1]]:
        sb.pop()
    if len(sb)>0:
        b[i]=sb[-1]+1
    else:
        b[i]=-1
    sb.append(i)
#print(b)
for i in range(n-2,-1,-1):
    while len(fb)> 0 and a[i]>=a[fb[-1]]:
        fb.pop()
    if len(fb)>0:
        f[i]=fb[-1]+1
    else:
        f[i]=-1
    fb.append(i)
#print(f)
for i in range(0,n):
    x=b[i]+f[i]
    print(x,end=' ')