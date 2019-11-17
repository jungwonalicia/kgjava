package 윈도우프로그램;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;

public class 첫윈도우 {

	public static void main(String[] args) {
		//한 화면에 띄울 수 있는 커다란 프레임이 필요.
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(191, 84, 152, 37);
		f.getContentPane().add(btnNewButton);
		f.setSize(500, 500);
		f.setVisible(true);
		
	}
}
