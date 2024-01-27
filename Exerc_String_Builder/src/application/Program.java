package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(sdf.parse("21/06/2013 13:05:44"),"Traveling to New Zealean", "I'm going to visit this wonderful country", 12);

		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys", "See you tomorrow", 5);

		p2.addComment(c1);
		p2.addComment(c2);		
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
	}

}
