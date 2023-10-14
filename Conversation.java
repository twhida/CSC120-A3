import java.util.*;
public class Conversation {

  public static void main(String[] arguments) {
    Scanner sc = new Scanner(System.in);
    //give greeting
    System.out.println("Hey there, welcome! What's your name?");
    
    //Ask for user's name
    //String input
    String name = sc.nextLine();
    

    //Ask for number of conversation rounds
    System.out.println("Hey " + name + ", what a great name! How many rounds would you like to hold our conversation for?");
    
    String[] canned_responses = {"Well, that's a shocker!", "Interesting...", 
    "Get a load of this society.", "That's a lot... of words...", 
    "This reminds me of that one movie... Joker...","Haha!", 
    "Sounds like things are going swell!"};

    int num_rounds = sc.nextInt();
    sc.nextLine();

    //
    String[] transcript = new String [2 * num_rounds + 2];
    transcript[0] = "Got it, let's chat for " + num_rounds + " rounds!";
    System.out.println(transcript[0]);
    for (int i = 0; i < num_rounds; i++) {
      String user_words =  sc.nextLine();
      String mirrored;
      String new_version = user_words.replace("I", "You");
      new_version = user_words.replace("You", "I");
      new_version = new_version.replace("me","you");
      new_version = user_words.replace("you", "I");
      new_version = new_version.replace("am","are");
      new_version = user_words.replace("You are", "I am");
      new_version = new_version.replace("You are", "I am");
      new_version = new_version.replace("my", "your");
      new_version = new_version.replace("My", "Your");
      new_version = new_version.replace("Your", "my");
      new_version = new_version.replace("Do you", "I don't");
      
    if (!new_version.equals(user_words)) {
      mirrored = new_version;
    }
    else {
       mirrored = canned_responses[(int)  Math.floor(num_rounds * Math.random())];
    }
    System.out.println(mirrored);
    transcript[2 * i + 1] = user_words;
    transcript[2 * i + 1] = mirrored;
  }
  System.out.println("Thank you for chatting with me!");
  System.out.println("Transcript");
  for (int i = 0; i <= transcript.length; i++) {
    System.out.println(transcript[i]);
  }
  //  System.out.println("How are you feeling today on a scale of 1-10?");
  // //Numerical data input
  //  int mood = sc.nextInt();
    
    //Print 
  //  if (mood <=3){
  //  System.out.println(mood + "? It sounds like you've been having a tough time...");
    
  //  }
  //  if (3< mood && mood <7){
  //    System.out.println(mood + "! Not bad... it could be way worse, right?");

  //  }

  //  if (mood >= 6){
  //    System.out.println(mood + "! That's great!");
    
  //  }
  sc.close();
  System.exit(0);
  }
}
