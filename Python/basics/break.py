#use of break:-

num = int(input())
fact = 1

for n in range(1,num+1):
	fact*=n
print(fact)

# Use of continue:-
numbers = [1,7,10,18,33,99]

for i in range(1,101):
	if i in numbers:
		continue
	print(i)