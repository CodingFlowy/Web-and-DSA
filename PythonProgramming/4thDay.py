import math
import statistics

'''
print("the floor and ceiling value of 23.56 are",math.floor(23.56)," , ",math.ceil(23.56))
x = 6
y = -4
print("value of x after copying the sign from y ",math.copysign(x,y))
print("absolute value of -56 and 23 are ",math.fabs(-56)," ",math.fabs(23))
my_list = [1,3,4,6,33,63]
print("the sum of the elements of the list is : ",math.fsum(my_list))
print("GCD of 24 and 56",math.gcd(24,56))
z = float('nan')
if math.isnan(z):
    print("It is not a number")

a = float('inf')
if math.isinf(a):
    print('it is infinite')
print(math.isfinite(a))
print(math.isnan(z))

'''
#---------power and logarithmic functions -------
'''
print("the value of 5^8 : ",math.pow(5,8))
print("square root of 400 : ",math.sqrt(400))
print("the value of 5^e",math.exp(5))
print("The value of log 650 base 5 is : ",math.log(650,5))
print("The value of log 1024 base 2 is : ",math.log2(1024))
print("The value of log 1024 base 10 is : ",math.log10(1024))
'''

#---------Trigonometric and angular conversion functions------------
'''
print("the value of cos(pi) : ",math.cos(math.pi) )
print("the value of sin(60): ",math.sin(math.radians(60)))
print("The angle of sin(0.8660)",math.degrees(math.asin(0.8660)))
'''
#------------Statistical Funtions in python -------------------


my_list = [1,2,3,3,4,7,9,5]
print("Mean value of mylist: ",statistics.mean(my_list))
print("Median value of mylist: ",statistics.median(my_list))
print("Harmonic Mean value of mylist: ",statistics.harmonic_mean(my_list))
"there are median low median high median grouped"
print("mode value of mylist ",statistics.mode(my_list))

#-------------sort search and count function ---------------

