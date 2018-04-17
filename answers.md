1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class.
A deck of cards
Board

2. Write an algorithm that describes the actions necessary to play the Elevens game.
1. Start game
2. Draw nine cards for deck
3. Pick any KQJ or 11 matches and replace with new cards
4. Repeat process
5. If less than nine cards in the deck leave the spaces on the board empty
6. If there are no matches in the nine cards you lose
7. If there are no card left in the deck you win


3. Now examine the partially implemented ElevensBoard.java file found in the Activity7
Starter Code directory. Does the ElevensBoard class contain all the state and behavior
necessary to play the game?
yes

4. ElevensBoard.java contains three helper methods. These helper methods are private
because they are only called from the ElevensBoard class.
a. Elevensboard constructor and newGame

b. isLegal and anotherPlayIsPossible

c. 0  1  2  3  4
   J♥ 6♣ 2♠ A♠ 4♥
d. see code

e. anotherPlayIsPossible