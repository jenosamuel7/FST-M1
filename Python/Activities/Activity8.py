numList = list(input("Enter a sequence of comma separated values: "))

Firstnum = numList[0]

Lastnum = numList[-1]

if (Firstnum == Lastnum):
    print(True)
else:
    print(False)