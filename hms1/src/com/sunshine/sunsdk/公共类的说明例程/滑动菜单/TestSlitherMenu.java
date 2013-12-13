package com.sunshine.sunsdk.�������˵������.�����˵�;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestSlitherMenu 
extends JFrame 
implements ActionListener, MouseListener {
	
	JTextField tf;
	JButton bt;
	SlitherMenu sm1, sm2, sm3;
	
	JPanel panelMain, panelMenu;
	
	public TestSlitherMenu() {
		
		tf = new JTextField("�����Ƿ�QQ�Ļ����˵�����ʾ����");
		bt = new JButton("�˿�������ף��ǿ������Ϊ��yue han ka ma ke  *^_^*  ");
		panelMain = new JPanel(new BorderLayout(20, 20));
		panelMenu = new JPanel(new GridLayout(1, 3));
		
		sm1 = new SlitherMenu();
		sm2 = new SlitherMenu();
		sm3 = new SlitherMenu();
		
		//��һ���˵�////////////////////////////////
		sm1.setMenuLocation(30,10);		//��������
		sm1.setMenuDimension(160, 400);	//���ô�С
		sm1.addPanel("I��һ������ģ��", "", 0 , 5);
		sm1.addButton("pic/s01.gif", "��1-1�����ܼ�", "��һ����ʾ", 0);
		sm1.addButton("pic/s02.gif", "��1-2�����ܼ�", "�ڶ�����ʾ", 0);
		sm1.addButton("pic/s03.gif", "��1-3�����ܼ�", "��������ʾ", 0);
		sm1.addButton("pic/s04.gif", "��1-4�����ܼ�", "���ĸ���ʾ", 0);
		sm1.addButton("pic/s05.gif", "��1-5�����ܼ�", "�������ʾ", 0);
		sm1.addPanel("I�ڶ�������ģ��", "", 1 , 4);
		sm1.addButton("pic/s06.gif", "��2-1�����ܼ�", "��2-1����ʾ", 1);
		sm1.addButton("pic/s07.gif", "��2-2�����ܼ�", "��2-2����ʾ", 1);
		sm1.addPanel("I����������ģ��", "", 2 , 5);
		sm1.addButton("pic/s08.gif", "��3-1�����ܼ�", "��3-1����ʾ", 2);
		sm1.addButton("pic/s09.gif", "��3-2�����ܼ�", "��3-2����ʾ", 2);
		sm1.addButton("pic/s10.gif", "��3-3�����ܼ�", "��3-3����ʾ", 2);
		sm1.addPanel("I���������ģ��", "", 3 , 5);
		sm1.addButton("pic/s11.gif", "��4-1�����ܼ�", "��4-1����ʾ", 3);
		sm1.addPanel("Iû�е��ĸ�ģ��", "", 4 , 5);
		sm1.addButton("pic/s12.gif", "��5-1�����ܼ�", "��5-1����ʾ", 4);
		sm1.addButton("pic/s13.gif", "��5-2�����ܼ�", "��5-2����ʾ", 4);
		sm1.addButton("pic/s14.gif", "��5-3�����ܼ�", "��5-3����ʾ", 4);
		sm1.addButton("pic/s15.gif", "��5-4�����ܼ�", "��5-4����ʾ", 4);
		sm1.addPanel("I����", "", 5 , 5);
		sm1.addButton("pic/s16.gif", "ʲôҲû��", "ָ�Ҹ��", 5);
		sm1.setButtonPanelBackground(new Color(184, 207, 229));
		
		//�ڶ����˵�////////////////////////////////
		sm2.setMenuLocation(40,10);		//��������
		sm2.setMenuDimension(128, 400);	//���ô�С
		sm2.setTitleHeight(35);
		sm2.addPanel("II��һ������ģ��", "pic/titlebar021.gif", 0 , 5);
		sm2.addButton("pic/s01.gif", "��A-1�����ܼ�", "��һ����ʾ", 0);
		sm2.addButton("pic/s02.gif", "��A-2�����ܼ�", "�ڶ�����ʾ", 0);
		sm2.addButton("pic/s03.gif", "��A-3�����ܼ�", "��������ʾ", 0);
		sm2.addPanel("II�ڶ�������ģ��", "pic/titlebar021.gif", 1 , 4);
		sm2.addButton("pic/s04.gif", "��B-1�����ܼ�", "��2-1����ʾ", 1);
		sm2.addButton("pic/s05.gif", "��B-2�����ܼ�", "��2-2����ʾ", 1);
		sm2.addButton("pic/s06.gif", "��B-3�����ܼ�", "��2-3����ʾ", 1);
		sm2.addButton("pic/s07.gif", "��B-4�����ܼ�", "��2-4����ʾ", 1);
		sm2.addPanel("II����������ģ��", "pic/titlebar021.gif", 2 , 5);
		sm2.addButton("pic/s08.gif", "��C-1�����ܼ�", "��3-1����ʾ", 2);
		sm2.addButton("pic/s09.gif", "��C-2�����ܼ�", "��3-2����ʾ", 2);
		sm2.addButton("pic/s10.gif", "��C-3�����ܼ�", "��3-3����ʾ", 2);
		sm2.addPanel("II����", "pic/titlebar021.gif", 3 , 6);
		sm2.addButton("pic/s11.gif", "��D-1�����ܼ�", "��4-1����ʾ", 3);
		sm2.addButton("pic/s12.gif", "��D-1�����ܼ�", "��5-1����ʾ", 3);
		sm2.addButton("pic/s13.gif", "��D-2�����ܼ�", "��5-2����ʾ", 3);
		sm2.addButton("pic/s14.gif", "��D-3�����ܼ�", "��5-3����ʾ", 3);
		sm2.addButton("pic/s15.gif", "��D-4�����ܼ�", "��5-4����ʾ", 3);
		sm2.addButton("pic/s16.gif", "DʲôҲû��", "ָ�Ҹ��", 3);
		sm2.setButtonPanelBackground(new Color(222, 210, 252));
		
		
		//�������˵�////////////////////////////////
		sm3.setMenuLocation(30,10);		//��������
		sm3.setMenuDimension(123, 400);	//���ô�С
		sm3.setTitleHeight(32);
		sm3.addPanel("III��һ������ģ��", "pic/title.gif", 0 , 5);
		sm3.addButton("pic/s01.gif", "��A-1�����ܼ�", "��һ����ʾ", 0);
		sm3.addButton("pic/s02.gif", "��A-2�����ܼ�", "�ڶ�����ʾ", 0);
		sm3.addButton("pic/s03.gif", "��A-3�����ܼ�", "��������ʾ", 0);
		sm3.addPanel("III�ڶ�������ģ��", "pic/title.gif", 1 , 4);
		sm3.addButton("pic/s04.gif", "��B-1�����ܼ�", "��2-1����ʾ", 1);
		sm3.addButton("pic/s05.gif", "��B-2�����ܼ�", "��2-2����ʾ", 1);
		sm3.addButton("pic/s06.gif", "��B-3�����ܼ�", "��2-3����ʾ", 1);
		sm3.addButton("pic/s07.gif", "��B-4�����ܼ�", "��2-4����ʾ", 1);
		sm3.addPanel("III����������ģ��", "pic/title.gif", 2 , 5);
		sm3.addButton("pic/s08.gif", "��C-1�����ܼ�", "��3-1����ʾ", 2);
		sm3.addButton("pic/s09.gif", "��C-2�����ܼ�", "��3-2����ʾ", 2);
		sm3.addButton("pic/s10.gif", "��C-3�����ܼ�", "��3-3����ʾ", 2);
		sm3.addPanel("III���������ģ��", "pic/title.gif", 3 , 5);
		sm3.addButton("pic/s11.gif", "��D-1�����ܼ�", "��4-1����ʾ", 3);
		sm3.addPanel("IIIû�е��ĸ�ģ��", "pic/title.gif", 4 , 5);
		sm3.addButton("pic/s12.gif", "��D-1�����ܼ�", "��5-1����ʾ", 4);
		sm3.addButton("pic/s13.gif", "��D-2�����ܼ�", "��5-2����ʾ", 4);
		sm3.addButton("pic/s14.gif", "��D-3�����ܼ�", "��5-3����ʾ", 4);
		sm3.addButton("pic/s15.gif", "��D-4�����ܼ�", "��5-4����ʾ", 4);
		sm3.addPanel("III����", "pic/title.gif", 5 , 5);
		sm3.addButton("pic/s16.gif", "EʲôҲû��", "ָ�Ҹ��", 5);
		sm3.setButtonPanelBackground(Color.WHITE);
		
		
		////////////////////////////////////
		sm1.initButtonPanelDimension();
		sm2.initButtonPanelDimension();
		sm3.initButtonPanelDimension();
		
		sm1.addMouseListener(this);
		sm2.addMouseListener(this);
		sm3.addMouseListener(this);
		bt.addActionListener(this);
		
		panelMenu.add(sm1);
		panelMenu.add(sm2);
		panelMenu.add(sm3);
		
		panelMain.add("North", tf);
		panelMain.add("South", bt);
		panelMain.add("Center", panelMenu);
		
		tf.setHorizontalAlignment( JTextField.CENTER );
		tf.setEditable(false);
		
		this.setContentPane(panelMain);
		this.setBounds(100, 50, 650, 600);
		this.setVisible(true);
		
		sm1.setInitMenu();
		sm2.setInitMenu();
		sm3.setInitMenu();
	}
	
	
	public void actionPerformed (ActionEvent ae) {
		System.out.println (":)" + sm1.getSelectButtonName());
	}
	
	/**=======================================================================**
	 *			MouseListener ����
	 **=======================================================================**
	 */
	public void mouseClicked (MouseEvent me) {
		Object o = me.getSource();
	//	if(o == sm1) {
			System.out.println (sm1.getSelectButtonName());
	//	}
		if(o == sm2) {
			System.out.println (sm2.getSelectButtonName());
		}
		if(o == sm3) {
			System.out.println (sm3.getSelectButtonName());
		}
	}

	public void mousePressed (MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseEntered (MouseEvent me) {
	}
	
	public void mouseExited (MouseEvent me) {
	}
	
	
	
	public static void main (String sd[]) {
		new TestSlitherMenu();
	}
	
	
}
