package com.quotes.demo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class xlUtility {
	private static ArrayList<String> quotesList=new ArrayList<String>();
	xlUtility(){
		quotesList.add("My mother always used to say: The older you get, the better you get, unless you’re a banana\n-Wise Man");
		quotesList.add("Attitude of gratitude brings great things\n-Wise Man");
		quotesList.add("Clothes make the man. Naked people have little or no influence in society.\n—Mark Twain");
		quotesList.add("The purpose of our lives is to be happy.\n— Dalai Lama.");
		quotesList.add("Har Ghadi badal rahi hae roop zindgi, lit AF kabhi, kabhi hae poop zindgi.\n— Wise Man.");
		quotesList.add("When life give you lemons make a choclate cake and leave the bitches wondering.\n— Wise Man.");
	}
	
	public String getQuote()
	{
		
		return quotesList.get(new Random().nextInt(quotesList.size()));
	}
	
}
