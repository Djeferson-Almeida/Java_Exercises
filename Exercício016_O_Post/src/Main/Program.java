package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment ("Have a nice trip!");
		Comment c2 = new Comment ("WOW that's awesome!");
		Post p1 = new Post(sdf.parse("21/01/2024 14:06:26"),
				"Traveling to New Zealand", "I'm going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		
	}

}
