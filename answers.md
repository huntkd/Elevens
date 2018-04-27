1. The size of the board is one of the differences between Elevens and Thirteens. Why is size not an abstract method?
Size is not an abstract method because the board is just the number of cards dealt face up at once and can be changed in the subclasses to override the default variable in the Board class.

2. Why are there no abstract methods dealing with the selection of the cards to be removed or replaced in the array cards?
Replacing cards is the same no matter the game that is beig played so it can be coded in the Board class.

3. Another way to create “IS-A” relationships is by implementing interfaces. Suppose that instead of creating an abstract Board class, we created the following Board interface, and had ElevensBoard implement it. Would this new scheme allow the Elevens GUI to call isLegal and anotherPlayIsPossible polymorphically? Would this alternate design work as well as the abstract Board class design? Why or why not?
A class would be better because with an interface you would have to duplicate code in all the subclasses.