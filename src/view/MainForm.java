package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm extends JFrame{

	private JFrame frame;
	private JLabel user;
	private JLabel NVname;
	private JLabel NVposition;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1218, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 195, 707);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		user = new JLabel("New label");
		user.setIcon(new ImageIcon(MainForm.class.getResource("/icon/user.png")));
		user.setBounds(62, 10, 72, 87);
		panel.add(user);
		
		NVname = new JLabel("Tên nhân viên");
		NVname.setForeground(new Color(0, 255, 64));
		NVname.setBackground(new Color(0, 255, 64));
		NVname.setFont(new Font("Tahoma", Font.BOLD, 13));
		NVname.setBounds(51, 94, 106, 36);
		panel.add(NVname);
		
		NVposition = new JLabel("Chức vụ");
		NVposition.setForeground(new Color(255, 255, 255));
		NVposition.setFont(new Font("Tahoma", Font.BOLD, 13));
		NVposition.setBackground(new Color(0, 255, 64));
		NVposition.setBounds(62, 126, 72, 36);
		panel.add(NVposition);
		
		panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(23, 163, 146, 36);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Xem Thông Tin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 146, 36);
		panel_1.add(lblNewLabel);
		
		JPanel controllP = new JPanel();
		
		controllP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		controllP.setBackground(new Color(0, 0, 0));
		controllP.setBounds(0, 226, 195, 76);
		panel.add(controllP);
		controllP.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bảng điều khiển");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(43, 44, 120, 28);
		controllP.add(lblNewLabel_1);
		
		JLabel lapimg = new JLabel("");
		lapimg.setHorizontalAlignment(SwingConstants.CENTER);
		lapimg.setBounds(0, 10, 195, 37);
		controllP.add(lapimg);
		lapimg.setIcon(new ImageIcon(MainForm.class.getResource("/icon/dashboard.png")));
		
		JPanel NhanVienP = new JPanel();
		
		NhanVienP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		NhanVienP.setLayout(null);
		NhanVienP.setBackground(Color.BLACK);
		NhanVienP.setBounds(0, 299, 195, 76);
		panel.add(NhanVienP);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhân viên");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(62, 50, 73, 16);
		NhanVienP.add(lblNewLabel_1_1);
		
		JLabel lapimg_1 = new JLabel("");
		lapimg_1.setIcon(new ImageIcon(MainForm.class.getResource("/icon/employee.png")));
		lapimg_1.setHorizontalAlignment(SwingConstants.CENTER);
		lapimg_1.setBounds(0, 10, 195, 37);
		NhanVienP.add(lapimg_1);
		
		JPanel LuongP = new JPanel();
		LuongP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		LuongP.setLayout(null);
		LuongP.setBackground(Color.BLACK);
		LuongP.setBounds(0, 375, 195, 76);
		panel.add(LuongP);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lương");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(77, 50, 52, 16);
		LuongP.add(lblNewLabel_1_2);
		
		JLabel lapimg_2 = new JLabel("");
	
		
		lapimg_2.setIcon(new ImageIcon(MainForm.class.getResource("/icon/salary.png")));
		lapimg_2.setHorizontalAlignment(SwingConstants.CENTER);
		lapimg_2.setBounds(0, 10, 195, 37);
		LuongP.add(lapimg_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(Color.BLACK);
		panel_2_3.setBounds(0, 451, 195, 76);
		panel.add(panel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Bảng điều khiển");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(43, 44, 120, 28);
		panel_2_3.add(lblNewLabel_1_3);
		
		JLabel lapimg_3 = new JLabel("");
		lapimg_3.setHorizontalAlignment(SwingConstants.CENTER);
		lapimg_3.setBounds(0, 10, 195, 37);
		panel_2_3.add(lapimg_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.WHITE);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(51, 612, 98, 36);
		panel.add(panel_1_1);
		
		JLabel lblLogOut = new JLabel("Log out");
		lblLogOut.setBounds(0, 0, 98, 36);
		panel_1_1.add(lblLogOut);
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setForeground(Color.WHITE);
		lblLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel CenterPanel = new JPanel();
		CenterPanel.setBounds(195, 0, 1009, 707);
		frame.getContentPane().add(CenterPanel);
		CenterPanel.setLayout(new CardLayout(0, 0));
		
		JPanel cp1 = new JPanel();
		cp1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		cp1.setBackground(new Color(225, 255, 255));
		CenterPanel.add(cp1, "name_88282446278000");
		cp1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_2.setBounds(166, 23, 548, 66);
		cp1.add(lblNewLabel_2);
		
		JPanel addP = new JPanel();
		addP.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
		addP.setBackground(new Color(255, 255, 255));
		addP.setBounds(63, 199, 196, 135);
		cp1.add(addP);
		addP.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(MainForm.class.getResource("/icon/add.png")));
		lblNewLabel_3.setBounds(0, 10, 196, 84);
		addP.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Thêm nhân viên");
		lblNewLabel_4.setForeground(new Color(0, 255, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(30, 96, 137, 39);
		addP.add(lblNewLabel_4);
		
		JPanel updateP = new JPanel();
		updateP.setLayout(null);
		updateP.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
		updateP.setBackground(Color.WHITE);
		updateP.setBounds(290, 199, 196, 135);
		cp1.add(updateP);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(MainForm.class.getResource("/icon/update.png")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(0, 10, 196, 84);
		updateP.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Cập nhật thông tin");
		lblNewLabel_4_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(20, 96, 157, 39);
		updateP.add(lblNewLabel_4_1);
		
		JPanel deleteP = new JPanel();
		deleteP.setLayout(null);
		deleteP.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
		deleteP.setBackground(Color.WHITE);
		deleteP.setBounds(514, 199, 196, 135);
		cp1.add(deleteP);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(MainForm.class.getResource("/icon/delete.png")));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(0, 10, 196, 84);
		deleteP.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Xóa nhân viên");
		lblNewLabel_4_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(40, 96, 137, 39);
		deleteP.add(lblNewLabel_4_2);
		
		JPanel addP_3 = new JPanel();
		addP_3.setLayout(null);
		addP_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 128, 128)));
		addP_3.setBackground(Color.WHITE);
		addP_3.setBounds(745, 199, 196, 135);
		cp1.add(addP_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(0, 10, 196, 84);
		addP_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Thêm nhân viên");
		lblNewLabel_4_3.setForeground(Color.GREEN);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_3.setBounds(30, 96, 137, 39);
		addP_3.add(lblNewLabel_4_3);
		
		JPanel cp2 = new JPanel();
		CenterPanel.add(cp2, "name_88290729116700");
		cp2.setLayout(null);
	}
}
