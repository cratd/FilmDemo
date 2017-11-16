   /*
   * 
             影厅类:
                    属性: 编号 排数 列数.
                    行为: 显示座位表、占座.         
  */
public class yingTing {
    private int num;                  // 影厅编号
    private int row;                 
    private int column;
    private dianYing dy;
    public void showInfoSeat(){
    	System.out.println("该厅为影院的"+num+"号厅。");
    	dy.showInfo();	
    }
	public yingTing(int num, int row, int column,dianYing dy) {
		super();
		this.num = num;
		this.row = row;
		this.column = column;
		this.dy = dy;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	} 
	

}
