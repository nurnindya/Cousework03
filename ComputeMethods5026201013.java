import java.util.Random;

public class ComputeMethods5026201013 {

public double fToC (double degreesF){
        return (5.0/9)*(degreesF - 32);
	}
public double hypotenuse (int a, int b){
        return Math.sqrt((a*a) + (b*b));
	}
public int roll () {
Random rand = new Random();
int roll = rand.nextInt(6) + 1;
int roll2 = rand.nextInt(6) + 1;
return (roll + roll2);

	}
}

