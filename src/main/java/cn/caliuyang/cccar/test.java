package cn.caliuyang.cccar;

public class test {

	public static void main(String[] args) {
		try {
			
			double a = Math.toRadians(90);//把数字90 转换成 90度

	        System.out.println("1=" + Math.sin(a));//计算sin 90度

	        double b = Math.toRadians(30);

	        System.out.println("2=" + Math.sin(b));


	        double c = Math.toRadians(45);

	        System.out.println("3=" + Math.cos(c));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



}
