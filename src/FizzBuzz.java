/**
 * Created by josh on 3/9/17.
 */
public class FizzBuzz {

	public void doIt(int start, int end){
		for(int i =start;i <= end; i++){

			if((i%3)==0 && (i%5)==0){
				System.out.println("FizzBuzz");
			}
			else if((i%3)==0){
				System.out.println("Fizz");
				continue;
			}
			else if((i%5)==0){
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);

		}

	}
}
