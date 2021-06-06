package exercises.ex19;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex19 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex19 example19 = new ex19();

        String heightInput = example19.heightInput();
        String weightInput = example19.weightInput();

        //Str->Int
        int heightInt =example19.heightInt(heightInput);
        int weightInt =example19.weightInt(weightInput);

        //BMI
        double bmiCal = example19.bmiCal(heightInt,weightInt);

        //Output
        String outputString = example19.outputString(bmiCal);

        example19.printOutput(outputString);
    }

    private void printOutput(String outputString) {System.out.println(outputString);
    }

    private String outputString(double bmiCal) {
        if(bmiCal > 18.5 && bmiCal < 25)
        {
            return ("Your BMI is " + String.format("%.2f",bmiCal) + ".\n" +
                    "You are within the ideal weight range.");
        }
        else if(bmiCal > 25)
        {
            return ("Your BMI is "+ String.format("%.2f",bmiCal) + ".\n" +
                    "You are overweight. You should see your doctor.");
        }
        else if (bmiCal < 18)
        {
            return ("Your BMI is "+ String.format("%.2f",bmiCal) + ".\n" +
                    "You are underweight. You should see your doctor.");
        }
        return "error";
    }

    private double bmiCal(int heightInt, int weightInt) {
        double bmi;
        double heightSq = (heightInt*heightInt);
        bmi = (weightInt/heightSq) *703;

        return bmi;
    }

    private int weightInt(String weightInput) {
        return Integer.parseInt(weightInput);
    }

    private int heightInt(String heightInput) {
        return Integer.parseInt(heightInput);
    }

    private String weightInput() {
        int counter =0;
        do{
            System.out.print("What is your weight in pounds? ");
            String weight = in.nextLine();
            for(int x = 0; x < weight.length();x++) {
                if (weight.charAt(x) >= '0' && weight.charAt(x) <= '9') {
                    counter = 0;
                }
                else
                    counter++;
            }
            if(counter == 0 )
            {
                return weight;
            }
        }while(counter != 0);
        return "error";
    }

    private String heightInput() {
        int counter =0;
        do{
            System.out.print("What is your height in inches? ");
            String height = in.nextLine();
            for(int x = 0; x < height.length();x++) {
                if (height.charAt(x) >= '0' && height.charAt(x) <= '9') {
                    counter = 0;
                }
                else
                    counter++;
            }
            if(counter == 0 )
            {
                return height;
            }
        }while(counter != 0);
        return "error";
    }

}

