package tw.org.iii.lesson_1;

import java.util.Arrays;

public class Poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�~�P
		long begin = System.currentTimeMillis();
		
		boolean isOK;
		int rand;
		int[] poker = new int[52]; //0,0,0.....
		
		for (int i=0; i<poker.length;i++){
			
			//�ˬd����
			
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
		//�o�P =>�|�Ӫ��a
		int[][] player = new int[4][13];
		 for(int i=0;i<poker.length;i++){
			 player[i%4][i/4] = poker[i];
		 }
		 
		for(int v : player[0]){
			System.out.println(v);
		}
		System.out.println("--------------");
		//�z��=>�u�P
		String[] suit ={"�®�","����","���","����"};
		String[] value={"A","1","2","3","4","5","6","7","8","9","10","J","Q","k"};
		
		for(int[] cards :player){
			Arrays.sort(cards);
		 for(int card : cards){
			System.out.print(suit[card/13]+ value[card%13] + " ");
		/*    switch(card / 4){
			case 0:
				System.out.print("�®�");
				break;
			case 1:
				System.out.print("����");
				break;
			case 2:	
				System.out.print("���");
				break;
			case 3 :
				System.out.print("����");
				break;
				}
		*/	
		 }
		 System.out.println();
		}
	}

}
