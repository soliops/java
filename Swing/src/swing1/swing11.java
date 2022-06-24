package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing11 extends JFrame {
//ImageIcon : �̹��� ������ �ε� �� �� ����մϴ�.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("�̹��� �ε�");
		btn.setFont(new Font("����ü", Font.PLAIN, 12));
		btn.setBounds(10, 10, 109, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.PINK));
		lb.setBounds(10, 43, 418, 212);
		contentPane.add(lb);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\apink2.jpg");
				Image reimg = img.getImage(); //�̹��� ���� ��θ� �ε�
				//getScaledInstance(����ũ��, ����ũ��, ��ȯ���)
				//SCALE_SMOOTH : �ε巴�� ����
				//SCALE_FAST : ������ ����(pix�� ����)
				//SCALE_DEFALUT : �̹����� ������ �ִ� �ػ󵵿� ���缭 ����
				//SCALE_AREA_AVERAGING : ����� �ػ� ��հ����� ����
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_SMOOTH);
				ImageIcon rimg = new ImageIcon(resize);
				lb.setIcon(rimg);
			}
		});
	}
}