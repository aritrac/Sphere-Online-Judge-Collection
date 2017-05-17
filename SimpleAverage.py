#SPOJ CODE -> AVRG
#Theres a customer that always comes to a store and buys 6 diferent products, but the problem is that he always takes too much time chosing and trying the products be cause he needs that the average of the products gives an exact number.  
#Input
#
#As input it will be gived at you 6 lines with the values of each product
#
#Output
#
#Your problem should give as result the average value of the total of elements. 
#
#Example
#
#Input:
#3
#7
#5
#2
#1
#6
#Output:
#4
import decimal
sum = 0
for num in range(1,7):
    user_input = input()
    sum = sum + user_input
print round(sum/6.0,2) 