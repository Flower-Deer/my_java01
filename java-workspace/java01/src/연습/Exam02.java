package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("당신의 키를 입력하세요.");
		double height2 = Double.parseDouble(height);
		double weight = (height2 - 100) * 0.9;
		
		JOptionPane.showMessageDialog(null, "당신의 적정 몸무게는 " + weight);
	}

}
