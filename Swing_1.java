package xxx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_1 {
	private JFrame frame;
	private JLabel lab;
	private JLabel lab2;
	private JLabel lab3;
	private JButton bot;
	private JButton bot1;
	private JButton bot2;
	private JCheckBox ch;
	private JTextField te;
	
	public Swing_1() {
		frame = new JFrame("猜數字遊戲");
		frame.setLayout(null);
		
		lab = new JLabel("請輸入0~100的數字:");
		lab.setBounds(5, 5, 200, 20);
		frame.add(lab);
		
		te = new JTextField();
		te.setBounds(120, 5, 100, 20);
		frame.add(te);
		
		bot = new JButton("送出");
		bot.setBounds(5, 37, 100, 20);
		frame.add(bot);
			
        lab2 = new JLabel("");
        lab2.setBounds(220, 5, 200, 40); 
        frame.add(lab2); 
        
        lab3 = new JLabel("");
        lab3.setBounds(5, 100, 200, 40); 
        frame.add(lab3); 
        
        int i =0;
		int answer = (int) (Math.random()*100);
        
    	bot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					try {
						
						if(Integer.parseInt(te.getText())==answer) {
							lab2.setText("答對了!太強了吧");
						}else {
							lab2.setText("猜錯囉!加油好嗎");
						}
						
						
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "請輸入數字","輸入錯誤", JOptionPane.ERROR_MESSAGE);
					}
				}		
		});
        
        bot1= new JButton("清除");
		bot1.setBounds(107, 37, 100, 20);
		frame.add(bot1);
		
		bot1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				te.setText("");
				lab2.setText("");
			}		
		});
		
		bot2 = new JButton("好啦!點我看答案");
		bot2.setBounds(5, 70, 150, 20);
		frame.add(bot2);
		
		bot2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lab3.setText("答案是:"+answer);
			}		
		});

		
		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
