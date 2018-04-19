1. Discuss the similarities and differences between Elevens, Thirteens, and Tens.

Similarities:
Have a board
Search for cards that add up to a number

Differences:
The cards have to add to different numbers
Boards are different sizes
Tens removes four K Q or J's
Thirteens removes K's and has point values to 12


2. As discussed previously, all of the instance variables are declared in the Board class. But it is the ElevensBoard class that “knows” the board size, and the ranks, suits, and point values of the cards in the deck. How do the Board instance variables get initialized with the ElevensBoard values? What is the exact mechanism?

Board is the super class so the variables in Board are inherited by Elevensboard and when you construct ElevensBoard it takes the values inherited by the Board class unless it is overwritten by the Elevensboard subclass.

3. Now examine the files Board.java, and ElevensBoard.java, found in the Activity8
Starter Code directory. Identify the abstract methods in Board.java. See how these
methods are implemented in ElevensBoard. Do they cover all the differences between Elevens, Thirteens, and Tens as discussed in question 1? Why or why not?

Abstract Methods: isLegal() and anotherPlayIsPossible()

yes, they cover all the differences because the games are structured the same but the plays that are allowed are the only thing that is different. The size of the board is also different, but you can just set that to a different variable in the subclasses.