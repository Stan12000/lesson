package tw.org.iii.lesson_1;

import java.util.Arrays;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//洗牌
		long begin = System.currentTimeMillis();
		
		boolean isOK;
		int rand;
		int[] poker = new int[52]; //0,0,0.....
		
		for (int i=0; i<poker.length;i++){
			
			//檢查機制
			
			do{
			    rand =(int)(Math.random()*poker.length);
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
		System.out.println("-------");
		//發牌 =>四個玩家
		int[][] player = new int[4][13];
		 for(int i=0;i<poker.length;i++){
			 player[i%4][i/4] = poker[i];
		 }
		 
		for(int v : player[0]){
			System.out.println(v);
		}
		System.out.println("--------------");
		//理排=>攤牌
		String[] suit ={"黑桃","紅心","方塊","梅花"};
		String[] value={"A","1","2","3","4","5","6","7","8","9","10","J","Q","k"};
		
		for(int[] cards :player){
			Arrays.sort(cards);
		 for(int card : cards){
			System.out.print(suit[card/13]+ value[card%13] + " ");
		/*    switch(card / 4){
			case 0:
				System.out.print("黑桃");
				break;
			case 1:
				System.out.print("紅心");
				break;
			case 2:	
				System.out.print("方塊");
				break;
			case 3 :
				System.out.print("梅花");
				break;
				}
		*/	
		 }
		 System.out.println();
		}
	}

}
