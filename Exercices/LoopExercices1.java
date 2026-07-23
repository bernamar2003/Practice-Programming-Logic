package Exercices;

public class LoopExercices1{

public static void main(String [] args){

int [] numbers = {
	1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
	11, 12, 13, 14, 15, 16, 17, 18, 19, 20
};

for (int number : numbers){
if ( number % 2 != 0) {
		continue;
}
 System.out.println("integer number = " + number);

}
        System.out.println("Loop finished.");

}
}