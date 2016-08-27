package tw.org.iii.lesson_1;

public class Brad32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	//	Brad321 obj11 = new Brad321();
	//	Brad321 obj12 = new Brad321();
	//	Brad322 obj2 = new Brad322();
		
		Brad323 obj3 = new Brad323();
		
		
	}	
	}
		class Brad321{
			int  a = 12;
			static {
			System.out.println("Brad:{}:");
			}
			{
				System.out.println("brad{}"+a);
			}
			Brad321(){
				System.out.println("brad321()");
			     }
			static void m1(){
				System.out.println("Brad321(:m1()");
			}
		   } 
		class Brad322 extends Brad321{
			Brad322(){
				System.out.println("brad322()");
			}
		}
	
        class Brad323 extends Brad322{
        	Brad323(){
        		System.out.println("brad323()");
        	}
        }

