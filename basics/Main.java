public class ExampleSyntax {
  // Pluralize
  public static String pluralize(int count, String singular);
{
   return pluralize(count, singular, singular.concat('s'));
}

public static String pluralize(int count, String singular, String plural)
{
  return (count == 1 ? singular : plural);
}

// Flipping Coins

private int result;
private int heads = 0;
private int tails = 1;
Coin coinFlip;

public void flip(){
    result = randomNum.nextInt(2);
    if(result == 0){
        coinFlip = Coin.Heads;
        System.out.println("You flipped Heads!");
    }else{
        coinFlip = Coin.Tails;
        System.out.println("You flipped Tails!");
    }
  }

// Command Line Clock
Date date = new Date();





}

