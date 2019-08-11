package com.sparks.firstproject;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController 
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Wandering Traveller. This shipwrecked sailor bids you set sail.";
	}
	
	@RequestMapping("/random")
	public String random() {
		Random rand = new Random();
		int a = rand.nextInt(4);
		if(a == 0 ) {
			return "Hail Traveller!";
		}
		else if(a == 1) {
			return "ABANDON ALL HOPE FOR WHO ENTERS HERE.";
		}
		else if(a == 2) {
			return "It's a WONDERFUL day in Wellington Wells, where it's partly cloudy with splash of sunshine...";
		}
		else {
			return "You know Traveller, there was a story I heard once about a man who decided to go to a park one sunny day in Wellington Wells."
					+ " Believe it or not, it's a wonderful place if you ignore the terrible rumors that you hear about. Not much to do about it now since The Great War... Where was I?"
					+ " Oh yes, this man who I will speak as for the rest of the story, for story-telling reasons, grabbed some bread to feed the birds. Now I didn't exactly know at the time that feeding certain types of bread to birds caused them to swell up like feather covered balls."
					+ " It was definitely the mistake of a naive young man but, luckly for me, it was a private mistake. Anyways, while I feeding these birds, this man came to talk to me about a 'room without walls' or 'walls without a room' which was odd because I'm an architect on my spare time and its safe to say that a room is most definitely defined by its walls."
					+ " So... Anyways, I remember him saying something about a glowing lantern to show the way into this so called 'room without walls' to find enlightenment and personal growth. At this point, I just told him 'Foriru de mi, kultisto'. Sadly, I must of spoken the right set of words or something because he decided to stick around and act friendly to me."
					+ " Kept saying things like, 'Ne zorgu, ne timu.' and 'Mi elektas esti feliĉa kun vi, mia frato'. I just laughed and replied 'Dankon, frato.' but I don't remember much after that. I think around that point I had to go and catch my midnight flight to Pennsylvania. After I visited the town of Centralia, which is a whole other story for another day,"
					+ "I think I understood what he meant by a 'Room with no walls' as I walked through the powerless town with my camping lantern. Funny times. Wonderful Memories of a younger man I met long ago.";
		}
		
		
	}
}
