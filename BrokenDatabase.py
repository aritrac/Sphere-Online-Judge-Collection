#SPOJ CODE -> BRKDB
#A university course database has broken, one of the column has been completely deleted and that column had the names of the 3 students that belong to that group. 
# It is known that in that course where only 3 students with the same surname and different last names and different id codes. You have the following data: “Monsalve” 
# had the code 200410061010, “Silva” had 200120039010 and “Pineda” 199810043010. Your goal is to get back the data base integrity and print the surnames, last names and 
# codes of the students one per line. 
#
#Input
#
#As input read the name that had been deleted and now has been recovered by the IT personal of the university.
#
#Output
#
#It is expected that your problem prints as outputs one line per person replaced with the given data:
#
#Name + space + Lastname1 + space + code1
#
#Name + space + Lastname2 + space + code2
#
#Name + space + Lastname3 + space + code3
#
#Example:
#
#Input:
#
#Antonio
#
#Output:
#
#Antonio Silva 200120039010
#
#Antonio Pineda 199810024010
#
#Antonio Monsalve 200410061010
inputName = raw_input()
print(inputName + " " + " Silva 200120039010\n")
print(inputName + " " + " Pineda 199810024010\n")
print(inputName + " " + " Monsalve 200410061010\n") 