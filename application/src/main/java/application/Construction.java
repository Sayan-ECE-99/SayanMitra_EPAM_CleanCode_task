package application;
import java.io.*;
import java.util.*;
public class Construction
{
	void estimation() throws IOException
    {
        String standard,automation ;
        double area,estimate;
        
        String type1="standard material",type2="above standard material",type3="highly standard material",automation1="no",automation2="yes";
        Scanner sc = new Scanner (System.in);
        System.out.write("enter the material of the house : \n".getBytes());
        standard = sc.nextLine();
        System.out.write("enter whether the house is fully automated : \n".getBytes());
        automation=sc.nextLine();
        System.out.write("enter the area of the house : \n".getBytes());
        area=sc.nextDouble();
        if(standard.compareTo(type1)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1200;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type2)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1500;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type3)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1800;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type3)==0 && automation.compareTo(automation2)==0)
        {
            estimate=area*2500;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else
            {
                System.out.printf("wrong input : ");
            }
    }

}
