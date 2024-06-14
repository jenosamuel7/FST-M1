tuplenum = (12, 25, 44, 75, 55)
print("Given list is ", tuplenum)

print("Elements that are divisible by 5: ")
for num in tuplenum:
    if (num % 5 == 0):
        print(num)