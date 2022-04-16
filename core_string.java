public class core_string {
    public static void main() {   
        String str = "studytonight";
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.substring(4));
        System.out.println(str.substring(4,7));   
        System.out.println(str.toUpperCase()); 
        int num = 35;
        String s1 = String.valueOf(num);    //converting int to String
        System.out.println(s1);
        System.out.println("type of num is: "+s1.getClass().getName());
        String a1 = String.format("%d", 125);            
        String a2 = String.format("%s", "studytonight");  
        String a3 = String.format("%f", 125.00);        
        String a4 = String.format("%x", 125);            
        String a5 = String.format("%c", 'a');  
        System.out.println("Integer Value: "+a1);  
        System.out.println("String Value: "+a2);  
        System.out.println("Float Value: "+a3);  
        System.out.println("Hexadecimal Value: "+a4);  
        System.out.println("Char Value: "+a5);  
        String a= new String("Hello Welcome to studytonight.com");  
        char[] ch = new char[16];  
        try
        {  
            a.getChars(6, 12, ch, 0);  
            System.out.println(ch);  
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        } 
        
        // String Buffer
        
        
        StringBuffer sb = new StringBuffer("study");
		System.out.println(sb);
		// modifying object
		sb.append("tonight");
		System.out.println(sb);    // Output: studytonight
		
		
		//Difference between string and string buffer
		
        String str2 = "study";
        str.concat("tonight");
        System.out.println(str2);      // Output: study
        
        StringBuffer strB = new StringBuffer("study");
        strB.append("tonight");
        System.out.println(strB);    // Output: studytonight
        
        /* Output is such because String objects are immutable objects. Hence, if we concatenate on the 
         * same String object, 
         * it won't be altered But StringBuffer creates mutable objects. Hence, it can be altered.
         */
        
        
    }
}