package com.mycompany.app;

import openweatherapi.GetWeatherData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        // logger.info( "Version 1.0!" );
        logger.info("Version 1.0!");
        // studentList();
        // dynamicStudentList();
        GetWeatherData.getWeatherData();
    }

    public static int add(int a, int b){
        return a + b ;
    }

    public static void studentList(){
        // Declare an array variable
        // Static array means an array whose length is fixed. or need to be fixed
        // while creating array variable
        int[] studentList = new int[5];
        // insert value/element in the array based on index
        studentList[0] = 101;
        studentList[1] = 102;
        studentList[2] = 103;
        studentList[3] = 104;
        studentList[4] = 105;

        // Get array element value by index number

        int a = studentList[0];
        logger.info(a);

        for(int i = 0; i < studentList.length; i++ ){
            logger.info(studentList[i]);
        }

    }

    public static void dynamicStudentList(){
        // Declare and create ArrayList object
        ArrayList<String> studentList = new ArrayList<>();
        // Insert value into the studentList

        studentList.add("John");
        studentList.add("Dohn");
        studentList.add("Chris");
        // Get The value form the arrayList object

        logger.info(studentList.get(0));

        for (int i = 0; i < studentList.size(); i++ ){
            logger.info(studentList.get(i)); // get(0), get(1), get(2)
        }

    }
}
