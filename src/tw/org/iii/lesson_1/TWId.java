package tw.org.iii.lesson_1;

public class TWId {
	private String id;

static	String check ="ABCDEFGHIJKLMNPQRSTUVWXYZIO";
	
	
	TWId(){
		this((int)(Math.random()*2)==0,(int)(Math.random()*26));
	}
	
	TWId(boolean gender){
		this(gender,(int)(Math.random()*26));
	}
    TWId(int area){
    	 this((int)(Math.random()*2)==0,area);
     }	
	TWId(boolean gender,int area){
		
		String c0 = check.substring(area, area+1);
		String c1 = gender?"1":"2";
		//String c2 = ""+(int)(Math.random()*10);
		
		StringBuffer temp =new StringBuffer();
		temp.append(c0+c1);
		
	//	id = check.substring(area,area+1);
	//	id += gender?"1":"2";
		for(int i = 0 ;i<7;i++){
			//id +=(int)(Math.random()*10);
			temp.append((int)(Math.random()*10));
           	}
		for(int i =0; i<10; i++){
			if(isRight(temp.toString() + i)){
				id =temp.append(i).toString();
	 		break;
			}
		}
	}
	
	
	//«Øºc¦¡
	TWId(String id2){
		this.id =id2;
	}
	

	
	String getId(){
		return id;
	}
    boolean getGender(){
     	
     		return id.charAt(1)=='1';
     	
    }
    String getArea(){
    	
    	
    	return "";
    }
    static boolean isRight(String testId){
    	boolean ret =false;
    	if(testId.matches("^[A-Z][12][0-9]{8}$")){
    	
    		String check ="ABCDEFGHIJKLMNPQRSTUVWXYZIO";
    		int n12 =check.indexOf(testId.charAt(0))+10;
    		//System.out.println(n12);
    	    int n1 = n12/10;
    	    int n2 = n12%10;
    	    
    	    int n3 = Integer.parseInt(testId.substring(1,2));
    	    int n4 = Integer.parseInt(testId.substring(2,3));
    	    int n5 = Integer.parseInt(testId.substring(3,4));
    	    int n6 = Integer.parseInt(testId.substring(4,5));
    	    int n7 = Integer.parseInt(testId.substring(5,6));
    	    int n8 = Integer.parseInt(testId.substring(6,7));
    	    int n9 = Integer.parseInt(testId.substring(7,8));
    	    int n10 = Integer.parseInt(testId.substring(8,9));
    	    int n11 = Integer.parseInt(testId.substring(9,10));
    	    
    	    int total = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 +n6*5 
    	    		+n7*4+ n8*3+n9*2+ n10*1+n11*1;
    	    ret = total % 10==0;
    		
    		ret =true;
    	}else{
    		ret =false;
    	}
    	
    	
    	return ret;
    }
    
    static boolean preCheck(String testId){
    	boolean isOK =false;
    	
     	
    	
    	
 //   	if(testId.length()==10){
 //   		if(testId.charAt(0)=="ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(testId)){
 //   			if(testId.charAt(1)=='1'||testId.charAt(1)=='2'){
  //  				
  //  			}
  //  		}
    //	}
    	
    	
    	return isOK;
    	
    }
    
}
