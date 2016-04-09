import java.util.*;
public class Deuces{

	static String[] Spade(){
		String[] spadeStack = new String[13];
		for(int i = 0; i < 13; ++i){
			int face = i;
			spadeStack[i] = i + 1 + " spades";
			switch (face) {
				case 0: spadeStack[0] = "A spades";
				break;
				case 10: spadeStack[10] = "J spades";
				break;
				case 11: spadeStack[11] = "Q spades";
				break;
				case 12: spadeStack[12] = "K spades";
				break;
			}
		}
		return spadeStack;
	}

	static String[] Clover(){
		String[] cloverStack = new String[13];
		for(int i = 0; i < 13; ++i){
			int face = i;
			cloverStack[i] = i + 1 + " clovers";
			switch(face){
				case 0: cloverStack[0] = "A clovers";
					break;
				case 10: cloverStack[10] = "J clovers";
					break;
				case 11: cloverStack[11] = "Q clovers";
					break;
				case 12: cloverStack[12] = "K clovers";
					break;
			}
		}
		return cloverStack;
	}

	static String[] Diamond(){
		String[] diamondStack = new String[13];
		for(int i = 0; i < 13; ++i){
			int face = i;
			diamondStack[i] = i + 1 + " diamonds";
			switch(face){
				case 0: diamondStack[0] = "A diamonds";
					break;
				case 10: diamondStack[10] = "J diamonds";
					break;
				case 11: diamondStack[11] = "Q diamonds";
					break;
				case 12: diamondStack[12] = "K diamonds";
					break;
			}
		}
		return diamondStack;
	}
	
	static String[] Heart(){
		String[] heartStack = new String[13];
		for(int i = 0; i < 13; ++i){
			int face = i;
			heartStack[i] = i + 1 + " hearts";
			switch(face){
				case 0: heartStack[0] = "A hearts";
					break;
				case 10: heartStack[10] = "J hearts";
					break;
				case 11: heartStack[11] = "Q hearts";
					break;
				case 12: heartStack[12] = "K hearts";
					break;
			}
		}
		return heartStack;
	}
	static void shuffle(String[] s){
		Random rndm = new Random();

		for(int i = 0; i < s.length; ++i){
			int rndmPos = rndm.nextInt(s.length);
			String temp = s[i];
			s[i] = s[rndmPos];				
		}
	}
	static String[] player1(String[] deck){
		String[] pHand = new String[13];
		for(int i = 0; i < 13; ++i){
		pHand[i] = deck[i];
		}
		return pHand;
	}
	static String[] player2(String[] deck){
		String[] p2Hand = new String[13];
		for(int i = 13; i < 26; ++i){
			p2Hand[i - 13] = deck[i];
		}
		return p2Hand;
	}
	public static void main(String[]args){
		String[] deck = new String[52];
		String[] spade = Spade();
		String[] clover = Clover();
		String[] diamond = Diamond();
		String[] heart = Heart();
		
		for(int i = 0; i < 13; ++i){
			 deck[i] = spade[i];
		}
		for(int j = 13; j < 26; ++j){
			deck[j] = clover[j - 13];
		}
		for( int k = 26; k < 39; ++k){
			deck[k] = diamond[k - 26];
		}
		for( int l = 39; l < 52; ++l){
			deck[l] = heart[l - 39];
		}
		for(int i = 0; i < deck.length; ++i){
			System.out.print(deck[i] + " ");
		}
		shuffle(deck);
		System.out.println();
		for(int i = 0; i < deck.length; ++i){
			System.out.print(deck[i] + " ");
		}
		
		String[] pHand = player1(deck);
		System.out.println();
		for(int i = 0; i < 13; ++i){
			System.out.print(pHand[i] + " ");
		}	
		String[] p2Hand = player2(deck);			
	}
}
