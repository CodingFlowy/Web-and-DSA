print("Helloworld")
my_name = "Rahul Singh"
'''
def my_function():
    print("Hi " + my_name[0:5])
my_function()

# age = 21
# txt = " my age is {}"
# print(txt.format(age))
#string.upper() , string.lower()

# for i in my_name:
#     print(i)

#---------------------List----------
items = ["seb","kela","aaloo","tamatar"]
notItems = ["air","counting"]
print(items)
print(items+notItems)
print(len(items))

#-- tuples - An ordered and unchangeable group of things is referred to as a tuple
tup1 = ('sabji',"aaloo","tamatar");
tup2 = (1,5,9);
print(tup1)
print(tup1+tup2)
print(tup2*2)
print(5 in tup2)
for item in tup1:
    print(item)

#---OOP concepts---------
class Testing:
    

    def __init__(self,name):   #init is constructor
        self.name = name
attr = "test1"
#---> A function connected to an object is the method


obj = Testing(attr)
print(obj.name)
'''
#---------------inheritance-------------------\
'''
class Person:  #parent class
    def __init__(self,name,idNumber):
        self.name = name
        self.idNumber = idNumber        
    def Display(self):
        print(self.name)
        print(self.idNumber)

class Employee(Person):
    def __init__(self, name, idNumber,salary,post):
        self.salary = salary
        self.post = post
        Person.__init__(self,name,idNumber)
    
a = Employee('Rahul',99,20000,'notyet')
a.Display()   
'''
#------encapsulation-----

class Actor:
    def __init__(self):
        self.m="Move"
        self.__j="Jump"

class Player(Actor):
    def __init__(self):
        Actor.__init__(self) #calling base class constructor
        print("calling private member of base class: ")
        print(self.m)

obj1 = Actor()
print(obj1.m)

obj2 = Player()


