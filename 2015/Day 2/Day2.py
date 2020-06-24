file = open('input.txt','r')
lines = file.readlines()
longueur = len(lines) # prints 1000

print(type(lines[0]))

papier = 0
ruban = 0

for i in lines:
    line = i.split('x')

    minCote = 0
    cote1 = int(line[0]) * int(line[1])
    cote2 = int(line[0]) * int(line[2])
    cote3 = int(line[1]) * int(line[2])
    minCote = min(cote1, cote2, cote3)
    papier = papier + minCote + 2*(cote1+cote2+cote3)

    perimetre1 = 2 * (int(line[0]) + int(line[1]))
    perimetre2 = 2 * (int(line[0]) + int(line[2]))
    perimetre3 = 2 * (int(line[1]) + int(line[2]))
    ruban = ruban + min(perimetre1, perimetre2, perimetre3)+(int(line[0]) * int(line[1]) * int(line[2]))


print(papier)
print(ruban)
