package application;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DateCombobox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateCombobox frame = new DateCombobox();
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
	public DateCombobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
		
		public void main() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);	
		
	}
		
		String[] days31 = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12",
		         "13",
		         "14",
		         "15",
		         "16",
		         "17",
		         "18",
		         "19",
		         "20",
		         "21",
		         "22",
		         "23",
		         "24",
		         "25",
		         "26",
		         "27",
		         "28",
		         "29",
		         "30",
		         "31"
		};
		
		String[] days30 = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12",
		         "13",
		         "14",
		         "15",
		         "16",
		         "17",
		         "18",
		         "19",
		         "20",
		         "21",
		         "22",
		         "23",
		         "24",
		         "25",
		         "26",
		         "27",
		         "28",
		         "29",
		         "30"
		};
		
		String[] days28 = {
		         "1",
		         "2",
		         "3",
		         "4",
		         "5",
		         "6",
		         "7",
		         "8",
		         "9",
		         "10",
		         "11",
		         "12",
		         "13",
		         "14",
		         "15",
		         "16",
		         "17",
		         "18",
		         "19",
		         "20",
		         "21",
		         "22",
		         "23",
		         "24",
		         "25",
		         "26",
		         "27",
		         "28"
		};
		
		public static int get_Month(){
			java.util.Date date = new java.util.Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			int month = cal.get(Calendar.MONTH);
			return month + 1;
		}
		
		public static int get_Day(){
			java.util.Date date = new java.util.Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			int day = cal.get(Calendar.DAY_OF_MONTH);
			return day;
		}
		
		public static int get_Year(){
			java.util.Date date = new java.util.Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			int year = cal.get(Calendar.YEAR);
			return year;
		}
		
	
}


