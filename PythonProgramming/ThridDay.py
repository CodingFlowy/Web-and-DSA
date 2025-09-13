#Learning numpy
import numpy as np
import math

# creating a list containing elements belonging to different data types 
"""
sample_list = [1,"ABC",['k','j']] 
print(sample_list)
import array 
sample_array = array.array('i', [4, 5, 6]) 
# accessing elements of array 
for i in sample_array: 
 print(i)
""" 

# x = [1,2,3]
# # a = np.asarray(x)
# # print(x)
# a = np.asarray(x,dtype=float)
# print(x)
'''
s = 'Hello World'  
b = np.frombuffer(s.encode(), dtype = 'S1') 
print(b)
list = range(5)  
print(list)
it = iter(list)   
# use iterator to create ndarray  
x = np.fromiter(it, dtype = float)
print(x)
'''
#_______________________Indexing_________________

'''

inputString = "I am learning python"
print("1st index character",inputString[0])
print("9th index character",inputString[8])
  
'''
#---------------some important methods------------
"""
append (): Adds an element at the end of the list 
clear (): Removes all the elements from the list 
copy (): Returns a copy of the list 
count (): Returns the number of elements with the specified value 
extend (): Add the elements of a list (or any iterable), to the end of the current list 
index (): Returns the index of the first element with the specified value 
insert (): Adds an element at the specified position 
pop (): Removes the element at the specified position 
remove (): Removes the first item with the specified value 
reverse (): Reverses the order of the list 
sort (): Sorts the list
"""

#-----------------Array again---------
'''
colors = ["red","green","blue"]
print(colors)
print(colors[1])
colors[0] = "yellow" #changing the value of the array
print(colors)
for x in colors:     #looping  array elements
    print(x)    
colors.append("red") #adding elements in the array
print(colors)
colors.pop(2)
print(colors)
'''
#------------------------------------------------------
""" ______Array methods
append() adds a new element to the list's end 
clear() removes all of the list's elements. 
copy() gives a copy of the list back 
count() returns the quantity of elements that have the given value. 
extend() To finish the current list, append the entries of another list (or any 
iterable) 
index() gives back the position of the first element with the given value. 
insert() adds a component in the designated location. 
pop() removes the component from the designated place. 
remove() the first item with the required value is eliminated. 
reverse() reverses the list sort's original order () 
sort() lists are sorted 
"""
#-------------------------------------------------------
arr1 = np.array([2,9,5,3])
arr2 = np.array([7,1,8,4])
resultArr = arr1*arr2      #we can perform multiplication on arrays
print(resultArr)

#-------------Constants------------------
""" 
pi 
Return the value of pi: 3.141592 
E 
Return the value of natural base e. e is 
0.718282
tau 
Returns the value of tau. tau = 6.283185 
inf 
Returns the infinite 
nan 
Not a number type
 """
#------------------functions-----------------
"""
1 Ceil(x) 
Give the Ceiling value back. It is the smallest integer that is either greater than or 
equal to x. 
2 copysign(x,y) 
It copies the sign of y to x and returns the number x. 
3 fbas(x) 
gives x's absolute value back. 
4 factorial(x) 
returns the x factorial, where x >=0. 
5 floor(x) 
Give the Floor value back. It is the greatest integer that is less than or equal to x. 
6 fsum(iterable) 
Calculate the elemental sum of an iterable object. 
7 gcd(x, y) 
returns the x and y's greatest common divisor. 
8 isfinite(x) 
determines whether x is neither a nan nor an infinite. 
9 isinf(x) 
determines if x is infinite 
10 isnan(x) 
determines whether or not x is a number. 
11 remainder(x,y) 
Calculate the leftover after dividing x by y.
"""


