file = open('input.txt','r')
lines = file.readlines()
# print(len(lines)) # prints 1

# Part1
floor = 0

# Part2
basement = 0
index = 0

for i in lines[0]:
    #Part1
    if (i == '('):
        floor = floor+1
    elif (i == ')'):
        floor = floor-1

    #Part2
    index = index + 1
    if (basement == 0 and floor == -1):
        basement=index

print("Question 1 : ",floor)
print("Question 2 : ",basement)