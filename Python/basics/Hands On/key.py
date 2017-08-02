import keyword

key = "elif"
s="vinit"
if keyword.iskeyword(key):
	print(key," is keyword")
else:
	print(key," is not keyword")
if keyword.iskeyword(s):
	print(s," is keyword")
else:
	print(s," is not keyword")
#This method is use to print the set of keywords present in python
	
print(keyword.kwlist)