fruit = {
    "apple": 10,
    "orange": 15,
    "mangp": 8,
    "banana": 15
}

check = input("Type your fruit_ ").lower()

if(check in fruit):
    print("Yes, this is available")
else:
    print("No, this is not available")