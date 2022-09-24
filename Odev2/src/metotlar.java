import java.util.Iterator;

public class metotlar {

	public static void main(String[] args) {
		//metotlar
		messageShow();
		addCustomer("salih");
		System.out.println(carpma(5,4));  
		System.out.println(topla(5,2,7,9));  
		
		//Class
		
		School person= new School("salih","atmacalar", "231");
		
		Teacher person1 = new Teacher();
		
		person1.setName("Sema");
		person1.setSurname("dursun");
		person1.setPhone("4325");
		person1.setBranch("Math");
		
		
		SchoolManager schoolmanager = new SchoolManager();
		schoolmanager.add(person1);
		schoolmanager.add(person);
		

	}
	
	//parametresiz
	public static void messageShow()
	{
		System.out.println("welcome");
		
		
	}
	
	//void tipi parametreli
	public static void addCustomer(String name)
	{
		
		 System.out.println(name + " eklendi");
		
	}

	 //recursive
     public static int carpma(int x, int y)
     {
    	 int toplam=0;
    	 if(x==0)
    	 return 0;
    	 
    	 else
    	 {
    		 toplam = y + carpma(x-1,y);
    		 return toplam;
    		 
    	 }
    		 
    	 
     }
	
     //variable argumants
	public static int topla(int...sayilar)
	{
	   int toplam=0;
	   
	   for(int sayi:sayilar )
		   toplam+=sayi;
	   
	   return toplam;
		
	}
	
	
	
}
