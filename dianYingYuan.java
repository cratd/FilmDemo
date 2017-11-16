  public class dianYingYuan {
    final static String nameYingYuan ="万达国际影城";
    public static void dealTicket() {
		
	}
      private static dianYing dy1 = null;
      private static dianYing dy2 = null;
      private static dianYing dy3 = null;
      private static dianYing dy4 = null;
      private static dianYing dy5 = null;
      private static  yingTing yingTing1 = null;
      private static  yingTing yingTing2 = null;
      private static  yingTing yingTing3 = null;
      private static  yingTing yingTing4 = null;
      private static  yingTing yingTing5 = null;
    public static void showInfo() {
      dy1 = new dianYing("1号影厅", "三合会", "王晶", 110, 90, 20.99f);
      dy2 = new dianYing("2号影厅", "功夫", "张艺谋", 130, 115, 18.99f);
      dy3 = new dianYing("3号影厅", "功守道", "文章", 110, 100, 19.99f);
      dy4 = new dianYing("4号影厅", "江湖救急", "冯小刚", 100, 90, 28.99f);
      dy5 = new dianYing("5号影厅", "战狼2", "吴京", 130, 120, 38.99f);
      
      yingTing1 = new yingTing(1, 6, 10, dy1);
      yingTing2 = new yingTing(2, 6, 10, dy2);
      yingTing3 = new yingTing(3, 6, 10, dy3);
      yingTing4 = new yingTing(4, 6, 10, dy4);
      yingTing5 = new yingTing(5, 6, 10, dy5);
      System.out.println("----------------------------1号影厅---------------------");
      yingTing1.showInfoSeat();
      System.out.println("----------------------------1号影厅---------------------");
      System.out.println();
      System.out.println("----------------------------2号影厅---------------------");
      yingTing2.showInfoSeat();
      System.out.println("----------------------------2号影厅---------------------");
      System.out.println();
      System.out.println("----------------------------3号影厅---------------------");
      yingTing3.showInfoSeat();
      System.out.println("----------------------------3号影厅---------------------");
      System.out.println();
      System.out.println("----------------------------4号影厅---------------------");
      yingTing4.showInfoSeat();
      System.out.println("----------------------------4号影厅---------------------");
      System.out.println();
      System.out.println("----------------------------5号影厅---------------------");
      yingTing5.showInfoSeat();
      System.out.println("----------------------------5号影厅---------------------");
	}
    private dianYingYuan() {
	// TODO Auto-generated constructor stub
    }          
}
