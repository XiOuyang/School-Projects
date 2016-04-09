The end goal of this program will be to implement the card game 'Deuces'

#Rules:
-Each player is dealt 13 playing cards from a standard 52 card deck
-Objective: To empty your hand before your opponent
-Turn based game. Player with the lowest card plays first, and other players
must beat the card played by the previous player. If they cannot, that player
goes again, This process continues until all but 1 player empties out their 
hand.
-Lowest to highest: 3 to A, and 2 is the highest
-suits: spades, clovers, diamonds, hearts
-Can play out cards in pairs, triples, or straights.
Straights must be at least 3 consecutive cards such as:

3 4 5

#Bombs
-Kinds of Bombs:
	3 consecutive card pairs or more
	4 of a kind
-Only combo that will beat a 2, besides a 2 of higher suit
-Higher bombs will beat other bombs. Example:

33 44 55 < 44 55 66

#Instant Win Conditions
-All 4 2s in hand
-3 to A ('Dragon')
-All pairs

So far the program generates a 52 card deck, sorts the cards in order, prints 
both unsorted and sorted version, and prints out a player's starting hand.
More to come!

![Picture](http://i.imgur.com/yc1JkPu.jpg)