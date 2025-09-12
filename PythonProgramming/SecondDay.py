#-------------Function overloading ------------
'''
class sumClass:
    #def sum(self,a,b):
     #   print("First Method: " ,a+b)
    def sum(self,a=None,b=None,c=None):
        if a != None and b==None or c==None:
            print("provide more numbers")
        else:
            print("First Method:",a+b+c)

obj = sumClass()    
obj.sum(19,8,77)
obj.sum(18,20)
obj.sum(15)
'''
#-------------method Overriding-----------------
'''
class Parent:
    def __init__(self):
        self.value = "Parent object"

    def show(self):
        print(self.value)

class Child:
    def __init__(self):
        self.value = "Child Object"

    def show(self):
        print(self.value)

ob1 = Parent()
ob2 = Child()

ob1.show()
ob2.show()
'''
#----------------exception Handling-------------
'''
import sys
r_list = ['a',0,2]

for entry in r_list:
    r = 1/int(entry)
    try:
        print("the entry is : ",entry)
        
        break
    except:
        print("Opps",sys.exc_info()[0],"Occurred.")
        print("Next Entry\\n")
        print("the reciprocal of ",entry,"is",r)
        
try: 
   # do something 
   pass 
except ValueError: 
   # handle ValueError exception 
   pass 
except (TypeError, ZeroDivisionError): 
   # handle multiple exceptions 
   # TypeError and ZeroDivisionError 
   pass 
except: 
   # handle all other exceptions 
   pass

'''
"""
try:
    num = int(input("Enter a number: "))
    assert num % 2 == 0
except:
    print("not an even number")
else:
    reciprocal = 1/num
    print(reciprocal)
    """
#Custom Error Syntax
'''
>>> class CustomError(Exception): 
...     
... 
pass 
>>> raise CustomError 
Traceback (most recent call last): 
... 
__main__.CustomError 
>>> raise CustomError("An error occurred") 
Traceback (most recent call last): 
... 
__main__.CustomError: An error occurred
'''
#___________________Custom Error Example________________
class Error(Exception):
    pass

class ValueTooSmall(Error):
    #raised when value is too small
    pass
class ValueTooLarge(Error):
    #raised when value is too large
    pass

number = 10
while True:
    try:
        i_num =int(input("Enter a number: "))
        if i_num < number:
            raise ValueTooSmall
        elif i_num > number:
            raise ValueTooLarge
        break
    except ValueTooSmall:
        print("This value is small, try again")
        print()
    except ValueTooLarge:
        print("This value is big, try again")
print("Congratulations, you guessed it right")





    
#-------------
# creating a list containing elements belonging to different data types 

'''
sample_list = [1,"ABC",['k','j']] 
print(sample_list)
import array 
sample_array = array.array('i', [4, 5, 6]) 
# accessing elements of array 
for i in sample_array: 
 print(i)
 '''