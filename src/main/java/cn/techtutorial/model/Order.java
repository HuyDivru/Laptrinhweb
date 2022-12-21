package cn.techtutorial.model;

public class Order extends Product{
	private int orderId;
	private int uid;
	private int quanlity;
	private String date;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, int uid, int quanlity, String date) {
		super();
		this.orderId = orderId;
		this.uid = uid;
		this.quanlity = quanlity;
		this.date = date;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getQuanlity() {
		return quanlity;
	}
	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", uid=" + uid + ", quanlity=" + quanlity + ", date=" + date + "]";
	}
	
	
}
