package tw.org.iii.lesson_1;

public class brad820_brad7_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
	  
	   for(j=0;j<10;j++){	
		for(i=1;i<=10;i++){
			int v = j*10 + i;
			//判斷是否為質數
			boolean isOK = true;
			for(int k=2; k<v;k++){
			 if(v % k == 0){
				 // 不是質數
				 isOK = false; 
				 break;
			 }	
			}
			System.out.print(v+(isOK?"*":" ")+"  ");
		}
		System.out.println();
	   }
		
		
		
		System.out.println();
		
		
		for(i=1;i<=100;i++){
			boolean OK = true;
				 for(int h=2 ;h<i;h++){
					 if(i % h == 0){
						 OK = false;
						 break;
					 }
				 }
			
			System.out.print(i+(OK?"*":" ")+" ");
			   if(i%10 == 0){
		       System.out.println();
				
				 
			}
		}
    
	}

}
