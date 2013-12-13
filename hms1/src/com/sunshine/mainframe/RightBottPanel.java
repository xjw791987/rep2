/**
 *##############################################################################
 *
 *	[ ��Ŀ��      ]  : ��ңң�Ƶ����ϵͳ
 *	[ ģ����      ]  : �������ұ��²����
 *	[ �ļ���      ]  : RightBottPanel.java
 *	[ ����ļ�    ]  : 
 *	[ �ļ�ʵ�ֹ���]  : ��ͷ��йص���Ϣ�б�
 *	[ ����        ]  : ��ңң
 *	##--------------------------------------------------------------------------
 *	--------------------------------------------------------------------------##
 *	
 *	[ ����˵��    ]  :	
 *	
 *	[## public RightBottPanel() {} ]:
 *		����: ������幹�캯��
 *
 *	[## public static void listRightBottDTM(String sqlCode, boolean flag) {} ]: 
 *		����: ΪDTM�������ݣ�������ʱ��ʾ����
 *##############################################################################
 */
package com.sunshine.mainframe;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.awt.*;
import com.sunshine.sunsdk.sql.*;				//������


public class RightBottPanel extends JPanel {
	
	public static DefaultTableModel rbDTM;
	private JTable tb;
	private JScrollPane sp;
	

	/**=======================================================================**
	 *		[## public RightBottPanel() {} ]: 				���캯��
	 *			����   ����
	 *			����ֵ ����
	 *			���η� ��public
	 *			����   ��������幹�캯��
	 **=======================================================================**
	 */
	public RightBottPanel() {
		super (new BorderLayout());
		//�������
		rbDTM = new DefaultTableModel ();
		tb	  = new JTable (rbDTM);
		sp	  = new JScrollPane (tb);
		
		//��ʼ�����ѱ�==����
		listRightBottDTM("", false);
		
		tb.setRowHeight (18);			//�����и߶�
		tb.setEnabled(false);
		tb.setMinimumSize(new Dimension(600, 90));
		sp.setBorder(new LineBorder(new Color(199, 183, 143)));
		//�����������
		this.add("Center", sp);
	}
	
	/**=======================================================================**
	 *		[## public static void listRightBottDTM(String sqlCode, boolean flag) {} ]: 
	 *			����   ����
	 *			����ֵ ����
	 *			���η� ��public
	 *			����   ��ΪDTM�������ݣ�������ʱ��ʾ����
	 **=======================================================================**
	 */
	public static void listRightBottDTM(String sqlCode, boolean flag) {
		String code[] = new String[6];
		code[0] = "delete from expense_temp";
		
		if(flag) {
			code[1] = "insert into expense_temp(in_no,r_no,price,c_name," +
		"discount,money,in_time,userid) (" + sqlCode + ")";
		}else {
			code[1] = "insert into expense_temp(pk) values('')";
		}//Endif
		
		for (int i = 2; i < 6; i++) {
			code[i] = "insert into expense_temp(pk) values('')";
	    }//Endif
	    
	    sunsql.runTransaction(code);		//ִ������
	    
	    sunsql.initDTM(rbDTM, "select in_no ��ס����,r_no �������,price ��׼����," +
		"c_name ��������,discount �����ۿ�,money ���ѽ��,in_time ����ʱ��," + 
		"userid ������ from expense_temp");
	}
}
















