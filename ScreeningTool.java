import java.util.Scanner;
public class ScreeningTool{
	public static void main(String[] args){
		ScreeningTool st=new ScreeningTool();

		System.out.println("\033[1mThis is a Covid-19 Screening and Tackling tool.\033[0m\n"+
				"\033[3mThis tool can help you understand what to do next about Covid-19.\033[0m\n"+
				"\nPlease enter the serial number following the tool you want to access.\n");
		System.out.println("\n\033[1m 1>Start Screening\n"+
	                	" 2>About COVID-19\n" +
                                " 3>Helpline Numbers for different States and Union Territories\n\033[0m");
		Scanner ab=new Scanner(System.in);
		int b=ab.nextInt();

		switch(b){
			case 1:

				//st.StartScreening();
				break;
			case 2:
				break;
			case 3:

				//HelplineNumbers();
				break;
			default:
				System.out.println("Invalid Input\nTo be redirected to the beggining, \033[1mpress 1\033[0m.");
				b=ab.nextInt();
				if(b==1)
					main(null);
				else{
					System.out.println("\033[1mThank You for using this tool\033[0m");
				}
				System.out.println("\033[1m\n\n______________________________________________\n\n\033[0m");

				break;
		}
	}
}
