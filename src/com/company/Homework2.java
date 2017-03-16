
package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) throws IOException {
        String fileName= "car_data.csv";
        File file= new File(fileName);

        ArrayList<Car> car = new ArrayList<Car>();


        Scanner inputStream;
        Car car1;


        try{
            inputStream = new Scanner(file);
            String headerLine = inputStream.nextLine();

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] carData = line.split(",");

                car1 = null;
                car1 = new Car();



                car1.setMake(carData[0]);
                car1.setModel(carData[1]);
                car1.setCurrentSpeed(Integer.parseInt(carData[2]));
                car1.setFuel(Double.parseDouble(carData[3]));
                car1.setBaseMpg(Double.parseDouble(carData[4]));
                car1.setScaleFactor(Double.parseDouble(carData[5]));
                car1.updateMpg();
                car1.updateFuelRemaining(Double.parseDouble(carData[6]));





                FileWriter fwriter = new FileWriter ("processed_cars.txt", true);
                PrintWriter fileOut = new PrintWriter (fwriter);
                fileOut.printf("%5s%4s%10s%10s%15s%4s%10s%20s%10s%20s\n" , "Make: " , car1.getMake()
                        , "    Model: " , car1.getModel()
                        , "    Current Speed: " , car1.getCurrentSpeed()
                        , "    Mpg: " , car1.getMpg()
                        , "    Fuel: " , car1.getUpdateFuel());
                fileOut.close();



            }

            inputStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        for (Car temp : car) {
            System.out.println(temp);
        }

    }

}