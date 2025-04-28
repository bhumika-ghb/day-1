public class Game{
	public static void showGameTitle(){
		System.out.println("Print this in showGameTitle() :");
		System.out.println("Welcome to Adventure Quest!");
	}
	public static void showGameRules(){
		System.out.println("Print this in showGameRules() :");

		System.out.println("Rules:\n1.Collect coins\n2.Avoid obstarcles\n3.Reach the goal");
	}
	public static  void showLoadingScreen(){
		System.out.println("Loading game...Please Wait");
	}
	public static void main(String[] args){
		showGameTitle();
		showGameRules();
		showLoadingScreen();
	}
}
		
