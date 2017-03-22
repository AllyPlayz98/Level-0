import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class ForLoops {
	public static void main(String[] args) {
		System.out.println();
		for (int i = 0; i<=100; i++){
			System.out.print(i+" ");
		}
		System.out.println();
		for (int j = 100; j>=0; j--){
			System.out.print(j+" ");
		}
		System.out.println();
		for (int k = 2; k<=100; k+=2){
			System.out.print(k+" ");
		}
		System.out.println();
		for (int l = 1; l<=99; l+=2){
			System.out.print(l+" ");
		}
		System.out.println();
		for (int h = 0; h<501; h++){
			if (h%2==0){
				System.out.println(h+" even");
				//even
			}
			if (h%2==1){
				System.out.println(h+" odd");
				//odd
			}
		}
		System.out.println();
		for (int s= 0; s <= 777; s+=7){
			System.out.println(s);
		}
		System.out.println();
		for (int o = 2005; o<=2017; o++){
			System.out.println("In" + o + "I was" + (o-2005));
		}
	}
}
