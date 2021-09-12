/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class paint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double length, width, area,constant = 350.0;
        int gallons;
        System.out.println("What is the length of the room in feet that you would like to paint?");
        length = sc.nextInt();
        System.out.println("What is the width of the room in feet that you would like to paint?");
        width = sc.nextInt();
        area = length * width;
        if(area % constant != 0)
            gallons = (int)(area/constant) + 1;
        else
            gallons = (int)(area/constant);
        System.out.println(String.format("You will need to purchase %d gallons of paint to cover %.0f square feet.", gallons, area));
        
    }
}
