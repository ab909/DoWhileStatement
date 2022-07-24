package com.company;

public class Main {

    public static void main(String[] args) {
//	int count = 6;
//	while (count != 6){
//        System.out.println("Count value is " + count);
//        count ++;
//    }
//	count=1;
//	do{
//        System.out.println("Count value is " + count);
//        count++;
//    } while (count!=6);
//	count = 1;
//	while(true){
//	    if (count==6){
//	        break;
//        }
//        System.out.println("Count value is " + count);
//	    count ++;
//    }
//     int number =4;
//     int finishNumber = 20;
//
//     while (number <= finishNumber){
//         number++;
//         if(!isEvenNumber(number)){
//             continue;
//         }
//         System.out.println("Even Number " + number);

        int number =4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number " + number);

            evenNumbersFound++;
            if(evenNumbersFound>=5){
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);


    }
    public static boolean isEvenNumber (int number){
        if ((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }

}
