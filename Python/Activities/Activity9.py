list1 = [12, 11, 14, 19, 18]
list2 = [55, 23, 20, 22, 12]

print("First List ", list1)
print("Second List ", list2)

list3 = []

for num in list1:
    if (num % 2 != 0):
        list3.append(num)
        
for num in list2:
    if (num % 2 == 0):
        list3.append(num)

print("result List is:")
print(list3)