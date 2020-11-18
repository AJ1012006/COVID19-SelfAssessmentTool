import java.util.Scanner;
public class ScreeningTool{

	int a;
	Scanner ab=new Scanner(System.in);

	public static void main(String[] args){
		ScreeningTool st=new ScreeningTool();

		System.out.println("\033[1mThis is a Covid-19 Self Assessment and Tackling tool.\033[0m\n"+
				"\033[3mThis tool can help you understand what to do next about Covid-19.\033[0m\n"+
				"\nPlease enter the serial number following the tool you want to access.\n");
		System.out.println("\n\033[1m 1>Start Self Assessment\n"+
	                	" 2>About COVID-19\n" +
                                " 3>Helpline Numbers for different States and Union Territories\n\033[0m");
		Scanner ab=new Scanner(System.in);
		int b=ab.nextInt();

		switch(b){
			case 1:

				st.StartScreening();
				break;
			case 2:

				System.out.println("\033[1mWhat is COVID‑19?\n"+
						"COVID‑19\033[0m \033[3mis the new respiratory disease spreading around the world and it is caused by the \033[1mcoronavirus.\033[0m\033[0m"+
						"COVID‑19 is short for \033[1m\"coronavirus disease 2019\".\033[0m\n"+
						"\n\033[3mThe virus is thought to spread mainly between people who are in close contact with one another (about 6 feet)"+
						" and through respiratory droplets produced when an infected person coughs or sneezes.\n"+
						"\nPeople are most contagious when they are the sickest. "+
						"But those who don’t have a lot of symptoms can still pass the virus on to others.\n"+
						"There is currently no vaccine or cure for COVID‑19 but researchers are working to find one.\033[0m\n"+
						"\n\033[1mWhat are COVID‑19’s symptoms?\033[0m\n"+
						"The most common symptoms are very similar to other viruses: fever, cough, and difficulty breathing.\n"+
						"\nCommon symptoms of \033[1mCOVID‑19\033[0m are changing as more is learned about the disease. "+
						"For the most up to date symptom list, visit the government’s website.\n"+
						"\nSymptoms may appear \033[1m2 to 14 days\033[0m after exposure and range from mild to severe illness.\n"+
						"If you or someone you know has symptoms, this Screening Tool will recommend the next steps.\n"+
						"\n\033[1mWho is at high risk for COVID‑19?\033[0m\n"+
						"Everyone is at risk of getting \033[1mCOVID‑19\033[0m, but some people are at a higher risk of serious illness.\n"+
						"\nGenerally speaking, adults aged 65 and older and people of any age who have "+
						"underlying medical conditions may be at higher risk for serious illness from \033[1mCOVID‑19\033[0m.\n"+
						"\nThe most up-to-date way to assess your risk is to complete our Screening Tool.\n"+
						"\n\033[1mWhat about COVID‑19, pregnancy, and newborns?\033[0m\n"+
                                                "At this time, pregnant women reportedly have the same \033[1mCOVID‑19\033[0m risk as adults who are not pregnant. "+
                       			        "\nThere is also no clear evidence that a fetus can be infected with COVID‑19 in the womb.\n"+
                       			        "\nPregnant women are known to have a higher risk of severe illness when infected with viruses from the same family as COVID‑19 "+
                        			"and other viral respiratory infections.\n This is why pregnant women should take extra precautions to not get COVID‑19. "+
                        			"Avoid those who have or who have been exposed to COVID‑19. Wash your hands often. Practice physical distancing. "+
                        			"\nClean and disinfect frequently touched surfaces daily\n"+
                        			"\nDuring this time, it’s normal for care providers to change some prenatal visits to telemedicine.\n"+
                        			"Ask if your delivering hospital has changed any rules, like if you’ll be asked to wear a face covering "+
                        			"while giving birth or if there is a new visitor policy.\n"+
						"Most babies born to people with \033[1mCOVID‑19\033[0m are not affected. \nHowever, once the baby is born, it is at risk for infection. "+
                        			"New parents should take the same precautions to protect themselves from illness as pregnant women.\n"+
                        			"So far, \033[1mCOVID‑19\033[0m has not been detected in breast milk.\nIf you are sick, including with COVID‑19, wear a cloth face "+
                        			"covering and wash your hands before each feeding.\nIf pumping milk, do not share your pump with anyone else. "+
                        			"\nWash your hands before expressing milk or before touching the pump or bottle parts."+
                        			"\nFollow recommendations for cleaning the pump and parts after each use.\nIf possible, have someone who is not sick feed the baby.\n"+
                        			"Stay in touch with your care team if you feel sick or develop COVID‑19 symptoms.\n"+
                        			"Pregnancy and postpartum can be stressful, and \033[1mCOVID‑19\033[0m can add to feelings of uncertainty, stress, anxiety, or depression.\n"+
                        			"Talk with your care provider if you are feeling overwhelmed. Seek help if you "+
                        			"are in crisis and feel like you may harm yourself or your baby.\n"+
                        			"\n\033[1mWhen should I see a doctor?\033[0m\n"+
                        			"Knowing when to see a doctor can keep medical care available for those who need it most.\n"+
                        			"Most mild symptoms can be treated at home. The most up-to-date way to assess your best next steps is to complete our Screening Tool.\n"+
                        			"If you need to see your doctor, call the office before you go. Many physicians’ offices are offering virtual visits.\n"+
                        			"They will tell you what to do based on your location.\n"+
                        			"Testing is limited-availability across the country and is currently being prioritized for \033[1mhealthcare workers,\n"+
                        			"emergency medical service providers,\npolice,\nand other essential workers\033[0m, so please consult your doctor "+
                        			"for availability in your local area.\n"+
                        			"If you develop emergency warning signs, call emergency services.\n\033[1mEmergency warning signs include:\033[0m"+
                        			"severe, constant chest pain or pressure\nextreme difficulty breathing\nsevere, constant lightheadedness\n"+
                        			"or serious disorientation or unresponsiveness.\n\n");
				System.out.println("In case you feel that something is not right, enter 1 to start the Self Assessment. Enter any other keyword to end.\n\n");
				b=ab.nextInt();

				if(b==1){

					st.StartScreening();
				}

				else{
					System.out.println("Thank You for using this tool.");
				}

				break;
			case 3:

				HelplineNumbers();
				break;
			default:
				System.out.println("Invalid Input\nTo be redirected to the beggining, \033[1mpress 1\033[0m. Enter anything else to exit.");
				b=ab.nextInt();
				if(b==1){
					System.out.println("\033[1m\n\n______________________________________________\n\n\033[0m");
					main(null);
				}
				else{
					System.out.println("\033[1mThank You for using this tool\033[0m");
					System.out.println("\033[1m\n\n______________________________________________\n\n\033[0m");
				}

				break;
		}
	}

	public static void HelplineNumbers(){

		System.out.println("\033[1mCentral Helpline Number for Covid-19:-+91-11-23978046\n");
		System.out.println("\nList of the helpline numbers of State in alphabetical order:\nAndhra Pradesh\033[0m-0866-2410978\n\033[1mArunachal Pradesh\033[0m-9436055743\n"+
				"\033[1mAssam\033[0m-6913347770\n\033[1mBihar\033[0m-104\n\033[1mChhattisgarh\033[0m-104\n\033[1mGoa\033[0m-104\n\033[1mGujarat\033[0m-104\n"+
				"\033[1mHaryana\033[0m-8558893911\n\033[1m\033[0mHimachal Pradesh-104\n\033[1mJharkhand\033[0m-104\n\033[1mKarnataka\033[0m-104\n\033[1mKerala\033[0m-04712552056\n"+
				"\033[1mMadhya Pradesh\033[0m-104\n\033[1mMaharashtra\033[0m-02026127394\n\033[1mManipur\033[0m-3852411668\n\033[1mMeghalaya\033[0m-108\n\033[1mMizoram\033[0m-102\n"+
				"\033[1mNagaland\033[0m-7005539653\n\033[1mOdisha\033[0m-9439994859\n\033[1mPunjab\033[0m-104\n\033[1mRajasthan\033[0m-01412225624\n\033[1mSikkim\033[0m-104\n"+
				"\033[1mTamil Nadu\033[0m-04429510500\n\033[1mTelangana\033[0m-104\n\033[1mTripura\033[0m-03812315879\n\033[1mUttarakhand\033[0m-104\n"+
				"\033[1mUttar Pradesh\033[0m-18001805145\n\033[1mWest Bengal\033[0m-03323412600\n\n");
		System.out.println("\033[1mList of the helpline numbers of Union Territories:\nAndaman and Nicobar Islands\033[0m-03192232102\n\033[1mChandigarh\033[0m-9779558282"+
				"\n\033[1mDadra and Nagar Haveli\033[0m-104\n\033[1mDaman and Diu\033[0m-104\n\033[1mDelhi\033[0m-01122307145\n\033[1mJammu and Kashmir\033[0m-01912520982"+
				"\n\033[1mLadakh\033[0m-01982256462\n\033[1mLakshadweep\033[0m-104\n\033[1mPuducherry\033[0m-104");

	}

	void StartScreening(){

		System.out.println("\033[1mCOVID-19 SELF ASSESSMENT TOOL\033[0m\n"+
				"\nYou have to answer a few questions about symptoms, travel and contact you have had with others.\n"+
				"You can use this tool for yourself or anyone else who won't be able to use this tool for any reason.\n\n");
		System.out.println("\033[1mIs there an emergency?\033[0m\n\n\033[3mAre you experiencing:\033[0m\n-Severe, constant chest pain or pressure."+
				"\n-Extreme difficulty in breathing\n-Severe, constant lightheadedness\n-Serious disorientation or unresponsiveness\n");
		System.out.println("1>I am experiencing at least one of these.\n2>I am not experiencing any of these.");

		a=ab.nextInt();
		if(a==1){
			
			Affected();
		}

		else if(a==2){
			System.out.println("Have you recently started experiencing any of the following symptoms:\n\n"+
					"1>Fever or chills\n2>New or worsening cough\n3>Tiredness\n4>More than one of the above\n5>None of the above");

			a=ab.nextInt();

			if(a==5){

				System.out.println("Are you experiencing any of the following symptoms:\n\n"+
						"1>Sore throat\n2>Sustained loss of smell, taste or appetite\n3>Mild or moderate difficulty in breathing"+
						"\n4>Aching throughout the body\n5>Vomiting or diarrhoea\n6>Rashes on skin or discolouration of finger or toes"+
						"\n7>Conjunctivitis\n8>More than one of the above\n9>None of the above");
				a=ab.nextInt();

				if(a==9){
					System.out.println("It seems that you aren't affected by \033[1mCOVID-19\033[0m because you don't have any symptoms.\n"+
							"If you aren't aware, then please know that \"symptoms\" can take anywhere from 2 to 14 days to show up.\n"+
							"In a few cases, there are no \"symptoms\" visible at all even though the person is diagnosed with \033[1mCOVID-19\033[0m.\n\n"+
							"If you think you are fit and fine and don't need to take the test further, press any thing apart from 1, 2 and 3 to exit.\n"+
							"Press 1 if you suspect you are affected by the virus and want to screen further.\n"+
							"Press 2 to start screening again."+
							"Press 3 to start this tool from the very beginning.");
					a=ab.nextInt();

					if(a==1){
						//TestFurther();
					}
					else if(a==2){
						StartScreening();
					}
					else if(a==3){
						main(null);
					}
					else{
						System.out.println("\n\n______________________________________________\n\n");
					}
				}
			}
			else if(a==1||a==2||a==3||a==4){

				TestFurther();
			}
			else{
				System.out.println("Thank You for using this Self Assessment Tool");
			}
		}

		else{
			System.out.println("Invalid Input. Redirecting you to the beginning.");
			System.out.println("\n\n______________________________________________\n\n");

			StartScreening();
		}
	}

	void TestFurther(){
		
		System.out.println("\033[1mAre you diagonised/suffering from any of these:\033[0m\n1>Moderate to severe asthama or chronic lung diseases."+
				"2>HIV or inherited immune deficiency\n3>Cancers or medicine causing immune deficiency\n4>Diabetes with complication\n"+
				"5>Serious heart conditions, such as heart failure or prior heart attacks\n6>Extreme obesity\n7>Cirrhosis of the liver\n"+
				"8>Kidney failure that needs dialysis\n9>Pregnancy\n10>More than one of the above\n11>None of the above");
		a=ab.nextInt();

		if(a==11){
			//Travel();
		}
		else if(a==1||a==2||a==3||a==4||a==5||a==6||a==7||a==8||a==9||a==10){

			System.out.println("You have a higher risk of getting COVID-19.\n\n");
			//Travel();
		}
		else{
			System.out.println("Invalid Input. Redirecting you to the beginning.");
			System.out.println("\n\n______________________________________________\n\n");

			StartScreening();
		}
	}

	void Affected(){
		System.out.println("\n\n\n\033[1mISOLATE YOURSELF FROM OTHERS\n\n\n\n");
		System.out.println("1>Avoid contact with others except to get medical care\033[0m\n\n"+
				"If you can, have a separate room and bathroom.\n"+
				"You should avoid public transportation and ride sharing.\n\n");
		System.out.println("\033[1m	WHEN TO END ISOLATION\033[0m\n\n"+
				"You should stay away from others for at least 14 days from when symptoms first appeared.\n"+
				"Isolating yourself can be hard when you’re not feeling well, but it will protect those around you.\n\n\n");
		System.out.println("\033[1m2>WATCH FOR SIGNS\033[0m"+
				"Call the helpline numbers if you develop any emergency warning signs such as:\n"+
				"\033[1msevere, constant chest pain or pressure\nextreme difficulty breathing\nsevere, constant lightheadedness\n"+
				"serious disorientation or unresponsiveness\nblue-tinted face or lips.\033[0m\n\n\n");
		System.out.println("\033[1m3>WEAR A MASK AROUND OTHERS\033[0m\n\n"+
				"You should wear a mask or cloth covering over your nose and mouth if you are around other people in home or outside of the home.\n\n\n");
		System.out.println("\033[1m4>WASH HANDS FREQUENTLY\033[0m\n\n"+
				"Wash hands with soap and water for at least 20 seconds.\n"+
				"You should avoid touching your eyes, nose, and mouth with unwashed hands.\n"+
				"If soap and water are not available, use hand sanitizer that contains at least 70% alcohol.\n\n\n");
		System.out.println("\033[1m5>REST AND TAKE CARE\033[0m\n\n"+
				"You should eat well, drink fluids, and get plenty of rest.");
	}
}
