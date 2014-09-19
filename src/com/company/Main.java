package com.company; //represents folder hierarchy

public class Main {

    public static double GetAverage(int[] inputArray) {
        //Worksheet: Review What We Learned: 3d
        //Something to hold the array
        double sum = 0; //the bucket that we are adding to

        for (int i = 0; i < inputArray.length; i++) //loop
        {
            //this is where we add to the bucket
            sum = sum + inputArray[i]; //added all the variables to the "sum"
        }

        return sum / inputArray.length; //does not need other variable to store data
        //might want to check that the length is greater than 0 because if divided by 0, the program will crash
    }

    public static double GetAverageOfEven(int[] inputArray) {
        //Something to hold the array
        double sum = 0; //the bucket that we are adding to

        int numEvenNumbers = 0;

        for (int i = 0; i < inputArray.length; i++) //loop
        {

            //this checks for the variable's remainder compare to zero
            if (inputArray[i] % 2 == 0)

                //this is where we add to the bucket
                sum = sum + inputArray[i]; //added all the variables to the "sum"

            numEvenNumbers++;
        }

        return sum / numEvenNumbers; //does not need other variable to store data
        //might want to check that the length is greater than 0 because if divided by 0, the program will crash
    }

    public static int[] CreateIntArray(String[] stringNums) {
        int[] convertedInts = new int[stringNums.length];

        //String numAsString = "1";
        //int numAsInt = Integer.parseInt(numAsString);
        for (int i = 0; i < stringNums.length; i++) {
            int numAsInt = Integer.parseInt(stringNums[i]);
            {
                convertedInts[i] = Integer.parseInt(stringNums[i]);
            }

            return convertedInts;
        }


    public static void main(String[] args) {
        int[] numbersToAverage = {1, 2, 3, 4, 5, 6};

        System.out.println(GetAverage(numbersToAverage));
        System.out.println(GetAverageOfEven(numbersToAverage));

        int[] convertedInts = CreateIntArray(args);
        {
            System.out.println("AVG:" + GetAverage(convertedInts));
            System.out.println("EAVG:" + GetAverageOfEven(convertedInts));
        }
    }
}
//try using the bug thing