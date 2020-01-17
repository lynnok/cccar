package cn.caliuyang.cccar;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import cn.caliuyang.cccar.constand.PropertiesUtil;

public class Demo extends JFrame {

	// 定义组件
	JTextField text3 = new JTextField(10), text4= new JTextField(10) ,text5= new JTextField(10) ,text8 = new JTextField(10),text9 = new JTextField(10),text10 = new JTextField(10);
	JRadioButton button1_1, button1_2 , button1_3, button1_4;
	JRadioButton button2_1, button2_2 ;
	JRadioButton button6_1, button6_2, button6_3, button6_4;
	JRadioButton button7_1, button7_2, button7_3;
	JRadioButton button11_1, button11_2, button11_3;
	JRadioButton button12_1, button12_2, button12_3, button12_4, button12_5, button12_6, button12_7, button12_8, button12_9, button12_10, button12_11;
	JButton button1, button2;
	double biansu = 0;
	double fadong = 0;
	double anquan = 0;
	double shache = 0;
	double chedeng = 0;
	double peizhi = 0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
	}

	private void addAllButton(JPanel jPanel, JRadioButton[] button1s) {
		for (int i = 0; i < button1s.length; i++) {
			jPanel.add(button1s[i]);
		}
	}

	// 构造函数
	private Demo() {
		this.setLayout(new GridLayout(25, 5));
		//=======变速箱========
		JPanel select1 = new JPanel();
		JLabel label1 = new JLabel("变速箱：");
		button1_1 = new JRadioButton("干式双离合");
		button1_1.setSelected(true);
		button1_2 = new JRadioButton("湿式双离合");
		button1_3 = new JRadioButton("AT");
		button1_4 = new JRadioButton("CVT");
		button1_1.addActionListener(new ButtonListener("1_1"));
		button1_2.addActionListener(new ButtonListener("1_2"));
		button1_3.addActionListener(new ButtonListener("1_3"));
		button1_4.addActionListener(new ButtonListener("1_4"));
		JRadioButton button1s[] = new JRadioButton[] {button1_1, button1_2, button1_3, button1_4};
		select1.add(label1);
		addAllButton(select1, button1s);
		this.add(select1);
		//=======变速箱========
		JPanel select2 = new JPanel();
		JLabel label2 = new JLabel("发动机：");
		button2_1 = new JRadioButton("L3");
		button2_1.setSelected(true);
		button2_2 = new JRadioButton("L4");
		button2_1.addActionListener(new ButtonListener("2_1"));
		button2_2.addActionListener(new ButtonListener("2_2"));
		JRadioButton button2s[] = new JRadioButton[] {button2_1, button2_2};
		select2.add(label2);
		addAllButton(select2, button2s);
		this.add(select2);
		//=======动力10-X零百加速时间 ========
		JPanel jp3 = new JPanel();
		JLabel label3 = new JLabel("0-100加速s：");
		jp3.add(label3);
		jp3.add(text3);
		this.add(jp3);
		
		//=======#燃油经济性 10-X油耗 ========
		JPanel jp4 = new JPanel();
		JLabel label4 = new JLabel("油耗：");
		jp4.add(label4);
		jp4.add(text4);
		this.add(jp4);
		
		// #车身结构 - 结合已公布测评数据 或 车身架构评分 满分10
		JPanel jp5 = new JPanel();
		JLabel label5 = new JLabel("车身结构 - 结合已公布测评或车身架构, 满分10：");
		jp5.add(label5);
		jp5.add(text5);
		this.add(jp5);
		
		// #轮胎分值=价格/100
		JPanel jp8 = new JPanel();
		JLabel label8 = new JLabel("单条轮胎价格：");
		jp8.add(label8);
		jp8.add(text8);
		this.add(jp8);
		// 外观评分 满分10 
		JPanel jp9 = new JPanel();
		JLabel label9 = new JLabel("外观评分 满分10 ：");
		jp9.add(label9);
		jp9.add(text9);
		this.add(jp9);
		
		//内饰评分 满分5 
		JPanel jp10 = new JPanel();
		JLabel label10 = new JLabel("内饰评分 满分5：");
		jp10.add(label10);
		jp10.add(text10);
		this.add(jp10);
		
		//=======安全配置========
		JPanel select6 = new JPanel();
		JLabel label6 = new JLabel("安全配置：");
		button6_1 = new JRadioButton("侧气帘");
		button6_2 = new JRadioButton("后排气囊");
		button6_3 = new JRadioButton("ISOFIX");
		button6_4 = new JRadioButton("主动刹车系统");
		button6_1.addActionListener(new ButtonListener("6_1"));
		button6_2.addActionListener(new ButtonListener("6_2"));
		button6_3.addActionListener(new ButtonListener("6_3"));
		button6_4.addActionListener(new ButtonListener("6_4"));
		JRadioButton button6s[] = new JRadioButton[] {button6_1, button6_2, button6_3, button6_4};
		select6.add(label6);
		addAllButton(select6, button6s);
		this.add(select6);
		
		
		//=======刹车制动========
		JPanel select7 = new JPanel();
		JLabel label7 = new JLabel("刹车制动：");
		button7_1 = new JRadioButton("普通盘式");
		button7_2 = new JRadioButton("通风盘式");
		button7_3 = new JRadioButton("鼓式");
		button7_1.addActionListener(new ButtonListener("7_1"));
		button7_2.addActionListener(new ButtonListener("7_2"));
		button7_3.addActionListener(new ButtonListener("7_3"));
		JRadioButton button7s[] = new JRadioButton[] {button7_1, button7_2, button7_3};
		select7.add(label7);
		addAllButton(select7, button7s);
		this.add(select7);
		
		//=======车灯========
		JPanel select11 = new JPanel();
		JLabel label11 = new JLabel("刹车制动：");
		button11_1 = new JRadioButton("LED");
		button11_2 = new JRadioButton("氙气");
		button11_3 = new JRadioButton("其它");
		button11_1.addActionListener(new ButtonListener("11_1"));
		button11_2.addActionListener(new ButtonListener("11_2"));
		button11_3.addActionListener(new ButtonListener("11_3"));
		JRadioButton button11s[] = new JRadioButton[] {button11_1, button11_2, button11_3};
		select11.add(label11);
		addAllButton(select11, button11s);
		this.add(select11);
		
		
		//=======其它配置========
		JLabel label12 = new JLabel("其它配置：");
		button12_1 = new JRadioButton("车联网");
		button12_2 = new JRadioButton("主动泊车");
		button12_3 = new JRadioButton("360全息");
		button12_4 = new JRadioButton("行车记录仪");
		button12_5 = new JRadioButton("电动后备箱");
		button12_6 = new JRadioButton("方向盘加热");
		button12_7 = new JRadioButton("座椅加热");
		button12_8 = new JRadioButton("座椅调节");
		button12_9 = new JRadioButton("座椅真皮");
		button12_10 = new JRadioButton("空气净化");
		button12_1.addActionListener(new ButtonListener("12_1"));
		button12_2.addActionListener(new ButtonListener("12_2"));
		button12_3.addActionListener(new ButtonListener("12_3"));
		button12_4.addActionListener(new ButtonListener("12_4"));
		button12_5.addActionListener(new ButtonListener("12_5"));
		button12_6.addActionListener(new ButtonListener("12_6"));
		button12_7.addActionListener(new ButtonListener("12_7"));
		button12_8.addActionListener(new ButtonListener("12_8"));
		button12_9.addActionListener(new ButtonListener("12_9"));
		button12_10.addActionListener(new ButtonListener("12_10"));
		JRadioButton button12s1[] = new JRadioButton[] {button12_1, button12_2, button12_3, button12_4, button12_5};
		JRadioButton button12s2[] = new JRadioButton[] {button12_6, button12_7, button12_8, button12_9, button12_10};
		JPanel select12_1 = new JPanel();
		JPanel select12_2 = new JPanel();
		select12_1.add(label12);
		addAllButton(select12_1, button12s1);
		addAllButton(select12_2, button12s2);
		this.add(select12_1);
		this.add(select12_2);
		//=======confirm========
		JPanel jpconfirm = new JPanel();
		button1 = new JButton("确定");
		jpconfirm.add(button1);
		this.add(jpconfirm);

		// 确认按下去获取
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String t3 = text3.getText();
					double dongli = (10- Double.valueOf(t3)) * Double.valueOf(PropertiesUtil.getProperty("dongli.Per"));
					
					String t4 = text4.getText();
					double youhao = (10- Double.valueOf(t4)) * Double.valueOf(PropertiesUtil.getProperty("youhao.Per"));
					
					String t5 = text5.getText();
					double jiegou = (Double.valueOf(t5)) * Double.valueOf(PropertiesUtil.getProperty("jiegou.Per"));
					
					String t8 = text8.getText();
					double luntai = (Double.valueOf(t8)) * Double.valueOf(PropertiesUtil.getProperty("luntai.jiage.Per")) / 100;
					
					String t9 = text9.getText();
					double waiguan = (Double.valueOf(t9)) * Double.valueOf(PropertiesUtil.getProperty("waiguan.Per"));
					
					String t10 = text10.getText();
					double neishi = (Double.valueOf(t10)) * Double.valueOf(PropertiesUtil.getProperty("neishi.Per"));
					
					double zongfen = biansu + fadong + dongli + youhao + jiegou + anquan + shache + luntai
							+ waiguan + neishi + chedeng + peizhi ;
					JOptionPane.showMessageDialog(null, "总分=" + zongfen);
				} catch (Exception exception) {
					JOptionPane.showMessageDialog(null, exception.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		this.setSize(500, 1000);
		this.setTitle("车车打分小程序");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/**
	* @description: desc
	* @author: xianglin.xie
	* @createTime: 2020年1月17日 下午4:48:54
	*
	* @param select12
	* @param button1s 
	* void
	*/
	

	class ButtonListener implements ActionListener{
		String sel;
		ButtonListener(String select){
			sel = select;
		}
		@Override
		public void actionPerformed(ActionEvent e){
		if("1_1".equals(sel)){
			biansu = Integer.valueOf(PropertiesUtil.getProperty("gearbox.DSG.dry"));
			button1_2.setSelected(false);
			button1_3.setSelected(false);
			button1_4.setSelected(false);
		}
		if("1_2".equals(sel)){
			biansu = Integer.valueOf(PropertiesUtil.getProperty("gearbox.DSG.wet"));
			button1_1.setSelected(false);
			button1_3.setSelected(false);
			button1_4.setSelected(false);
		}
		if("1_3".equals(sel)){
			biansu = Integer.valueOf(PropertiesUtil.getProperty("gearbox.AT"));	
			button1_2.setSelected(false);
			button1_1.setSelected(false);
			button1_4.setSelected(false);
		}
		if("1_4".equals(sel)){
			biansu = Integer.valueOf(PropertiesUtil.getProperty("gearbox.CVT"));	
			button1_2.setSelected(false);
			button1_3.setSelected(false);
			button1_1.setSelected(false);
		}
		
		if("2_1".equals(sel)){
			fadong = Integer.valueOf(PropertiesUtil.getProperty("fadongji.L3"));	
			button2_2.setSelected(false);
		}

		if("2_2".equals(sel)){
			fadong = Integer.valueOf(PropertiesUtil.getProperty("fadongji.L4"));	
			button2_1.setSelected(false);
		}
		
		if("6_1".equals(sel)){
			anquan = anquan + Integer.valueOf(PropertiesUtil.getProperty("qinang.ceqilian"));	
		}
		if("6_2".equals(sel)){
			anquan = anquan + Integer.valueOf(PropertiesUtil.getProperty("qinang.houpai"));	
		}
		if("6_3".equals(sel)){
			anquan = anquan + Integer.valueOf(PropertiesUtil.getProperty("isofix"));	
		}
		if("6_4".equals(sel)){
			anquan = anquan + Integer.valueOf(PropertiesUtil.getProperty("zhudong"));	
		}
		
		if("7_1".equals(sel)){
			shache = Integer.valueOf(PropertiesUtil.getProperty("zhidong.pan"));	
			button7_2.setSelected(false);
			button7_3.setSelected(false);
		}
		if("7_2".equals(sel)){
			shache = Integer.valueOf(PropertiesUtil.getProperty("zhidong.tongfengpan"));	
			button7_3.setSelected(false);
			button7_1.setSelected(false);
		}
		if("7_3".equals(sel)){
			shache = Integer.valueOf(PropertiesUtil.getProperty("zhidong.gu"));	
			button7_2.setSelected(false);
			button7_1.setSelected(false);
		}
		
		if("11_1".equals(sel)){
			chedeng = Integer.valueOf(PropertiesUtil.getProperty("chedeng.led"));	
			button11_2.setSelected(false);
			button11_3.setSelected(false);
		}
		if("11_2".equals(sel)){
			chedeng = Integer.valueOf(PropertiesUtil.getProperty("chedeng.xianqi"));	
			button11_3.setSelected(false);
			button11_1.setSelected(false);
		}
		if("11_3".equals(sel)){
			chedeng = 0;	
			button11_2.setSelected(false);
			button11_1.setSelected(false);
		}
//		peizhi.chelianwang=5.0
//				peizhi.zidongboche=1.0
//				peizhi.360quanxi=1.0
//				peizhi.xingchejiluyi=1.0
//				peizhi.diandonghoubeixiang=1.0
//				peizhi.fangxiangpanjiare=1.0
//				peizhi.zuoyi.jiare=1.0
//				peizhi.zuoyi.tiaojie=1.0
//				peizhi.zuoyi.zhenpi=1.0
		
		if("12_1".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.chelianwang"));	
		}
		if("12_2".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.zidongboche"));	
		}
		if("12_3".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.360quanxi"));	
		}
		if("12_4".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.xingchejiluyi"));	
		}
		if("12_5".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.diandonghoubeixiang"));	
		}
		if("12_6".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.fangxiangpanjiare"));	
		}
		if("12_7".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.zuoyi.jiare"));	
		}
		if("12_8".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.zuoyi.tiaojie"));	
		}
		if("12_9".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.zuoyi.zhenpi"));	
		}
		if("12_10".equals(sel)){
			anquan = anquan + Double.valueOf(PropertiesUtil.getProperty("peizhi.kongqi"));	
		}
	 
	}
 }


}