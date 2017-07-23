def vinit():
	print("Vinit Is Awesome")

def usd_to_inr(usd):
	amount = 65*usd
	print(amount)

vinit()
usd_to_inr(5)
usd_to_inr(50)
usd_to_inr(500)

#return type function:-
print("-------------Return type function----------------")

def dating(myAge):
	girlAge=myAge/2+5
	return girlAge

vinit_limit = dating(20)
print("vinit should date girls of age ",vinit_limit," or greater")
#this is the return type function with some more concepts
print("-------Dating Table------------")

def dating_table(i):
	girl_Age = i/1.5 + 4
	return girl_Age

Age = [19,27,28,25,13]
print("Age \t Limit")
for i in Age:
	x=dating_table(i)
	print(i,"\t",x)


#Flexible Argument Programm
print("------------Flexible Argument-----------")

def sum(*args):
	total=0
	for i in args:
		total+=i
	print(total)

sum(3)
sum(3,6,78,789,76)
sum(1,2,2,3,3,44,5,56,6,77,7,8,9,9,9,9,7,4,4,3444)
