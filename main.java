import java.util.Scanner;




public class main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ChipotleChatBot chatBot = new ChipotleChatBot();
      System.out.println("Welcome to the Chipotle chatBot. How can I help you?");
      System.out.println("You can ask about Chipotle's working hours, types of food, or locations.");
      System.out.println("Type 'bye' to exit the chat");


     
      while (true) {
          String userInput = scanner.nextLine().toLowerCase();
          int count = 0;
          if (userInput.equals("bye")) {
              System.out.println(chatBot.getThanks());
              break;
          }
          if (userInput.contains("drink") || userInput.contains("drinks")
          || userInput.contains("beverage") || userInput.contains("cup")
          || userInput.contains("cups") || userInput.contains("beverages")
          || userInput.contains("water") || userInput.contains("sprite")
          || userInput.contains("soda") || userInput.contains("coke")){
           System.out.println(chatBot.getDrinks());
           count ++;
          }


          if (userInput.contains("hour") || userInput.contains("open")
                  || userInput.contains("close") || userInput.contains("hours")
                  || userInput.contains("day") || userInput.contains("time")
                  || userInput.contains("times") || userInput.contains("monday")
                  || userInput.contains("tuesday") || userInput.contains("wednesday")
                  || userInput.contains("thursday") || userInput.contains("friday")
                  || userInput.contains("saturday") || userInput.contains("sunday")
                  || userInput.contains("weekend") || userInput.contains("weekday")) {
              System.out.println(chatBot.getTimes());
              count ++;
          }




          if (userInput.contains("menu") || userInput.contains("food") || userInput.contains("food options")
              || userInput.contains("salad") || userInput.contains("hungry") || userInput.contains("meal")
              || userInput.contains("burrito") || userInput.contains("taco") || userInput.contains("bowl")
              || userInput.contains("quesadilla") || userInput.contains("vegetarian")
              || userInput.contains("veggies")) {
              System.out.println(chatBot.getFood());
              count ++;
          }
          if(userInput.contains("type") || userInput.contains("meat") || userInput.contains("steak") || userInput.contains("types") || userInput.contains("chicken")){
            System.out.println("For meat, we offer: steak, chicken, and brisket. ");
            count++;
          }
          if(userInput.contains("parmesean") || userInput.contains("cheese")|| userInput.contains("mozzarella")|| userInput.contains("cheddar")|| userInput.contains("gouda")|| userInput.contains("swiss")){
            System.out.println("We only offer our finest parmesean, exported right from italy.");
          }


          if (userInput.contains("locations") || userInput.contains("location") ||(userInput.contains("where") && !userInput.contains("order"))
              || userInput.contains("store locations") || userInput.contains("place") || userInput.contains("map") || userInput.contains("store")) {
              System.out.println(chatBot.getLocation());
              count++;
          }




          if (userInput.contains("order") || userInput.contains("take-out") || userInput.contains("delivery")
              || userInput.contains("online")) {
              System.out.println("We do not offer online ordering. You may only order in person at our stores.");
              count ++;
          }
          if(count < 1){
           System.out.println(chatBot.getConfused());
          }
         
            
         
      }
     
     
  




      scanner.close();
  }
}


