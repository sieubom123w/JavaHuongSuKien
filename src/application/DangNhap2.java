package application;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DangNhap2 extends JFrame {

	private JTextField txtTen;
	private JTextField txtMatKhau;
	private JPanel pnMain;
	private JButton btnDangNhap;
	private JButton btnThoat;

	public DangNhap2() {
		setTitle("Mẫu Đăng Nhập");
		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		pnMain = new JPanel();
		pnMain.setLayout(null);
		pnMain.setBounds(100, 100, 450, 300);

		getContentPane().add(pnMain);

		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(135, 24, 155, 51);
		lblNewLabel.setForeground(Color.BLUE);
		pnMain.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(47, 99, 102, 28);
		pnMain.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Mật khẩu:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(47, 138, 102, 34);
		pnMain.add(lblNewLabel_2);
		
		txtTen = new JTextField();
		txtTen.setBounds(169, 101, 185, 29);
		pnMain.add(txtTen);
		txtTen.setColumns(10);

		txtMatKhau = new JTextField();
		txtMatKhau.setBounds(169, 143, 185, 28);
		pnMain.add(txtMatKhau);
		txtMatKhau.setColumns(10);

		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setBounds(71, 195, 112, 34);
		pnMain.add(btnDangNhap);

		btnThoat = new JButton("Thoát");
		btnThoat.setBounds(242, 195, 112, 34);
		pnMain.add(btnThoat);
	}


	public static void main(String[] args) {
		new DangNhap2().setVisible(true);
	}
}
