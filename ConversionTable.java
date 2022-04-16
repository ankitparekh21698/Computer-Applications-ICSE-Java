
import java.util.*;
public class ConversionTable
{
 public static void main()
 {
     Scanner ac=new Scanner(System.in);
     int ch,flag=0;
     do{
     do{ flag=0;
         System.out.println("********************CONVERSION TABLES****************************************");
         System.out.println("1.Lenght and Distance\n2.Area\n3.Mass and Weight\n4.Volume and Capacity\n5.Temperature\n6.Back to MathBook menu");
         System.out.println("Enter your choice:");
         ch=ac.nextInt();
         if(ch>=1 && ch<=6)
         {
             flag=1;
             System.out.print("\f");
            }
         else
         System.out.print("Wrong choice.....retry.....");
        }while(flag!=1);
     switch(ch)
     {
         case 1:
         System.out.println("**************LENGTH AND DISTANCE****************************");
         System.out.println("                                                             ");
         System.out.println("              METRIC                              IMPERIAL   ");  
         System.out.println("      1 millimetre [mm]                           0.03937 in ");
         System.out.println("      1 centimetre [cm]      10 mm                0.3937 in  ");
         System.out.println("      1 metre [m]            100 cm               1.0936 yd  ");
         System.out.println("      1 kilometre [km]       1000 m               0.6214 mile");
         System.out.println("                                                             ");
         System.out.println("             IMPERIAL                             METRIC     ");
         System.out.println("      1 inch [in]                                 2.54 cm    ");
         System.out.println("      1 foot [ft]            12 in                0.3048 m   ");
         System.out.println("      1 yard [yd]            3 ft                 0.9144 m   ");
         System.out.println("      1 mile                 1760 yd              1.6093 km  ");
         System.out.println("      1 int nautical mile    2025.4 yd            1.853 km   ");
         break;
         case 2:
         System.out.println("**************AREA**********************************************");
         System.out.println("                                                                ");
         System.out.println("              METRIC                              IMPERIAL      ");  
         System.out.println("      1 sq cm                100 sq mm            0.1550 sq in    ");
         System.out.println("      1 sq m                 10,000 sq cm         1.1960 sq yd    ");                           
         System.out.println("      1 hectare [ha]         10,000 sq m          2.4711 acres    ");
         System.out.println("      1 sq km                100 ha               0.3861 sq mile  ");
         System.out.println("                                                                  ");
         System.out.println("             IMPERIAL                             METRIC          ");
         System.out.println("      1 sq inch                                   6.4516 sq cm    ");
         System.out.println("      1 sq foot [sq ft]      144 sq in            0.0929 sq m     ");
         System.out.println("      1 sq yd                9 sq ft              0.8361 sq m     ");
         System.out.println("      1 acre                 4840 sq yd           4046.9 sq m     ");
         System.out.println("      1 sq mile              640 acres            2.59   sq km    ");
         break;
         case 3:
         System.out.println("**************MASS AND WEIGHT**********************************");
         System.out.println("                                                               ");
         System.out.println("              METRIC                              IMPERIAL     ");  
         System.out.println("    1 milligram [mg]                              0.0154 grain ");
         System.out.println("    1 gram [g]           1,000 mg                 0.0353 oz    ");                           
         System.out.println("    1 kilogram [kg]      1,000 g                  2.2046 lb    ");
         System.out.println("    1 tonne [t]          1,000 kg                 0.9842 ton   ");
         System.out.println("                                                               ");
         System.out.println("             IMPERIAL                             METRIC       ");
         System.out.println("    1 ounce [oz]         437.5 grain              28.35 g      ");
         System.out.println("    1 pound [lb]         16 oz                    0.4536 kg    ");
         System.out.println("    1 stone              14 lb                    6.3503 kg    ");
         System.out.println("    1 hundredweight[cwt] 112 lb                   50.802 kg    ");
         System.out.println("    1 long ton (uk)      20 cwt                   1.016 t      ");
         break;
         case 4:
         System.out.println("**************VOLUME AND CAPACITY*******************************");
         System.out.println("                                                                ");
         System.out.println("              METRIC                              IMPERIAL      ");  
         System.out.println("         1 cu cm                                  0.0610 cu in  ");
         System.out.println("         1 cu decimetre        1,000 cu cm        0.0353 cu ft  ");                           
         System.out.println("         1 cu metre            1,000 cu dm        1.3080 cu yd  ");
         System.out.println("         1 litre [l]           1 cu dm            1.76pt        ");
         System.out.println("         1 hectolitre [hl]     100 l              21.997 gal    ");
         System.out.println("                                                                ");
         System.out.println("             IMPERIAL                             METRIC        ");
         System.out.println("         1 cu inch                                16.387 cu cm  ");
         System.out.println("         1 cu foot             1,728 cu in        0.0283 cu m   ");
         System.out.println("         1 fluid ounce[fl oz]                     28.413 ml     ");
         System.out.println("         1 pint [pt]           20 fl oz           0.5683 l      ");
         System.out.println("         1 gallon [gal]        8 pt               4.5461 l      ");
         System.out.println("                                                                ");
         System.out.println("         USA measure                              METRIC        ");
         System.out.println("         1 fluid ounce         1.0408 uk fl oz    29.574 ml     ");
         System.out.println("         1 pint (16 fl oz)     0.8327 uk pt       0.4731 l      ");
         System.out.println("         1 gallon              0.8327 uk gal      3.7854 l      ");
         break;
         case 5:
         System.out.println("***************TEMPERATURE CONVERSION FORMULAS***********************");
         System.out.println("                                                                     ");
         System.out.println("1. To convert from ¼C to ¼F, use the formula:  ¼F = ¼C x 1.8 + 32");
	     System.out.println("2. To convert from ¼F to ¼C, use the formula:  ¼C = (¼F-32) Ö 1.8    ");
	     System.out.println("3. To convert from K to ¼C, use the formula:  ¼C = K Ð 273           ");
	     System.out.println("4. To convert from ¼C to K, use the formula: K = ¼C + 273            ");
	     System.out.println("5. To convert from ¼F to K, use the formula: K = 5/9 (¼F Ð 32) + 273 ");
	     System.out.println("6. To convert from K to ¼F, use the formula:  ¼F = 1.8(K Ð 273) + 32 ");
	     break;
	     case 6:
	     break;
	   }}while(ch!=6);
}
}
