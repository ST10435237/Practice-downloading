/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AveragePropertyTypes;

/**
 *
 * @author User
 */
public class PropertyPrice {
    
    public static void main(String[] args) {
        
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        
        double[][] prices = {{800000, 1500000, 2000000}, 
                             {700000, 1200000, 1600000}, 
                             {750000, 1300000, 1800000}};
        
        System.out.println("PROVINCES\tFLAT\t\tTOWN HOUSE\tHOUSE");
        System.out.println("******************************************************************************");
        
        for (int i = 0; i < provinces.length; i++) {
            System.out.print(provinces[i] + "\t\t");
            
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print("R " + prices[i][j] + "\t");
            }
            
            System.out.println();
        }
        
        System.out.print("\n");
        
        
        for (int i = 0; i < provinces.length; i++) {
            double totalPrices = 0;
            double average = 0;
            
            for (int j = 0; j < prices[i].length; j++) {
                totalPrices += prices[i][j];
                average = totalPrices / provinces.length;
            }
            
        System.out.print("Average property price in " + provinces[i] + " = R" + average + "\n");

        }
        System.out.println();
    }
}
