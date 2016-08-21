package tw.org.iii.lesson_1;

import javax.swing.JOptionPane;

public class GussNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//產生謎底
		
		String answer = createAnswer();
		
		for(int i=0;i<10;i++){
			String guess =JOptionPane.showInputDialog("猜吧"+answer);
			
		//開始猜
			
		//比對
			if(guess.equals(answer)){
				JOptionPane.showMessageDialog(null, "水唷");
				break;
				}else{
					String result = checkAB(answer,guess);
				JOptionPane.showMessageDialog(null, guess +":" +result);
				}
			}
		
		//錯了 =>題是
		//對了 =>水唷

	}
	
	static String createAnswer(){
		boolean isOK;
		int rand;
		int[] poker = new int[3]; //0,0,0.....
		
		for (int i=0; i<poker.length;i++){
			
			//檢查機制
			
			do{
			    rand =(int)(Math.random()*10);
				isOK = true;
			for (int j=0;j<i;j++){
				if(poker[j] == rand){
					isOK = false;
					break;
				}
			}
			}while(!isOK);
			poker [i] = rand;
			System.out.println(poker[i]);
		}
		String ret = "";
		for(int v:poker) ret +=v;
		return ret;
	}


    static String checkAB(String a,String g){
	int A, B; A = B = 0;
	for(int i=0;i<g.length();i++){
		if(g.charAt(i) == a.charAt(i)){
			A++;
		}else if(a.indexOf(g.charAt(i)) != -1){
			B++;
		}
	}
			return A + "A" +B+"B";	
	
	}
    
}
