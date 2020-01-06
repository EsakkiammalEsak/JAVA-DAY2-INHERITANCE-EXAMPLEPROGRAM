package day3casestudy04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("1.Delux Room /n 2.Delux AC Room /n 3.Luxury Suit");
		System.out.println("Choose Room: ");
		int n = s.nextInt();
		switch(n)
		{
		case 1:
				System.out.println("Enter hotel name:");
				String name=s.next();
				System.out.println("Enter room area:");
				int noofsqclaw=s.nextInt();
				System.out.println("Enter rate/sq claw:");
				int ratepersqclaw=s.nextInt();
				System.out.println("Hotel has wifi?");
				boolean haswifi=s.hasNext();
				DeluxeRoom dr=new DeluxeRoom(name,noofsqclaw,ratepersqclaw,haswifi);
				dr.calculatetariff();
		break;
		case 2:
				System.out.println("Enter hotel name:");
				String name1=s.next();
				System.out.println("Enter room area:");
				int noofsqclaw1=s.nextInt();
				System.out.println("Enter rate/sq claw:");
				int ratepersqclaw1=s.nextInt();
				System.out.println("Hotel has Ac?");
				boolean hasac=s.hasNext();
				DeluxeAcRoom dar=new DeluxeAcRoom(name1,ratepersqclaw1,noofsqclaw1,hasac);
				dar.calculatetariff();
		break;
		case 3:
				System.out.println("Enter hotel name:");
				String name2=s.next();
				System.out.println("Enter room area:");
				int noofsqclaw2=s.nextInt();
				System.out.println("Enter rate/sq claw:");
				int ratepersqclaw2=s.nextInt();
				System.out.println("Hotel has wifi?");
				boolean haswifi2=s.hasNext();
				System.out.println("Hotel has Ac?");
				boolean hasac2=s.hasNext();
				SuiteAcRoom sar=new SuiteAcRoom(name2,ratepersqclaw2,noofsqclaw2,haswifi2,hasac2);
				sar.calculatetariff();
		break;
		default :
			System.out.println("Invalid Input");
			break;

		}

	}

}
