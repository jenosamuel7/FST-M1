user1 = input("what is the player 1 name : ")
user2 = input("what is the player 2 name : ")

while True:

 player1 = input(user1+" Please choose rock, paper and scissor : ").lower()
 player2 = input(user2+" Please choose rock, paper and scissor : ").lower()

 if player1 == player2:
     print("Both are tie")

 elif player1 == 'rock':
     if player2 == 'scissor':
        print("rock wins")
     else:
        print("paper wins")  

 elif player1 == 'paper':
     if player2 == 'scissor':
        print("scissor wins")
     else:
        print("rock wins")   

 elif player1 == 'rock':
     if player2 == 'paper':
        print("paper wins")
     else:
        print("scissor wins") 

 else:
    print("Invalid answer found, please choose rock, paper and scissor to play")     

 repeat = input(" Do you want to play again. Please reply with yes or no ").lower()

 if(repeat == 'yes'):
     pass
 elif(repeat == 'no'):
     raise SystemExit
    
 else:
     print("You entered a wrong option. Exiting now ")
     raise SystemExit




