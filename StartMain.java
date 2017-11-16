import java.util.Scanner;

public class StartMain {

	public static void main(String[] args){
	  // TODO Auto-generated method stub 
	  //
		System.out.println("欢迎来"+dianYingYuan.nameYingYuan+"观看电影,以下是目前正在上映的电影信息：");
		dianYingYuan.showInfo();
		System.out.println("请购买要选择的电影:   ");
		Scanner scanner = new Scanner(System.in);
		String filmName = scanner.nextLine();
		switch (filmName) {
		case "功守道":
			System.out.println("请选择座位: ");
			
			int row = scanner.nextInt();
			int column =scanner.nextInt();
			// 判断
			
			dianYingYuan.dealTicket();
			break;
        case "三合会":
			
			break;
        case "战狼":
			
			break;
        case "江湖救急":
			
			break;
        case "功夫":
			
			break;
		default:
			System.out.println("暂时没有此影片，请您选择目前影院可以播放的影片");
			break;
		 }
	   }
}
