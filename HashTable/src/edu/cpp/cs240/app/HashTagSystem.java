package edu.cpp.cs240.app;

import java.util.Scanner;

import edu.cpp.cs240.generics.HashTable;
import edu.cpp.cs240.generics.HashTableImpl;

public class HashTagSystem {

	HashTable<String, GenericList<String>> hashTable =
			new HashTableImpl<String, GenericList<String>>();

	public void newTwitt(String hashtag, String twitt) {
		GenericList<String> twitts = hashTable.get(hashtag);
		if (twitts == null) {
			twitts = new GenericArrayList<String>();
		}
		twitts.add(twitt);
		hashTable.put(hashtag, twitts);
	}

	public GenericList<String> searchHashtag(String hashtag) {
		return hashTable.get(hashtag);
	}

	public void publishMessage(String message) {
		Scanner s = new Scanner(message);
		while(s.hasNext()) {
			String token = s.next();
			if (token.startsWith("#")) {
				String tag = token.substring(1).trim();
				newTwitt(tag, message);
			}
		}
	}

	public static void main(String[] args) {
		HashTagSystem system = new HashTagSystem();
//		system.newTwitt("MothersDay", "This is a great #MothersDay!");
//		system.newTwitt("MothersDay", "#MothersDay is awesome!");
//		system.newTwitt("MothersDay", "I bought this for my #MothersDay!");
//		system.newTwitt("MothersDay", "What would you do for #MothersDay?");
//		system.newTwitt("NBADraft", "#NBADraft is awesome!");
//		system.newTwitt("NBADraft", "I bought this for my #NBADraft!");
//		system.newTwitt("NBADraft", "What would you do for #NBADraft?");

//		System.out.println(system.hashTable);
//		System.out.println(system.searchHashtag("MothersDay"));
//		System.out.println(system.searchHashtag("NBADraft"));

		system.publishMessage("Find out who will receive the first pick in the 2015 @NBADraft at 8:30pm/et on @ESPN! #NBADraftLottery ");
		system.publishMessage("I was in the back room at the #NBADraftLottery on Tuesday night. So were some relatives of #NBA bigwigs. My story http://www.sheridanhoops.com/2015/05/19/sheridan-inside-the-ping-pong-ball-room-at-nba-draft-");
//		system.publishMessage("The stage is set for the 2015 #NBADraftLottery, next on @ESPN! ");
//		system.publishMessage("Finished the first optimization round for my #CPP #OpenGL dungeon crawler. Running at a stable v-synced 60fps Full HD on 1st gen Intel HD :)");
//		system.publishMessage("#cdnpoli Y does #Harper not want Canadians to #BOYCOTT #Israeli companies? #CPP funds invested there. http://www.icj-cij.org/docket/index.php?pr=71&code=mwp&p1=3&p2=4&p3=6&ca … TY #NigelWright");

		System.out.println(system.hashTable);
		System.out.println(system.searchHashtag("NBADraftLottery"));
	}
}
