/**
 *##############################################################################
 *
 *	[ ��Ŀ��      ]  : �Ƶ����ϵͳ
 *	[ ģ����      ]  : ���ڴ���
 *	[ �ļ���      ]  : About.java
 *	[ ����ļ�    ]  : 
 *	[ �ļ�ʵ�ֹ���]  : ���ڴ���
 *	[ ����        ]  : ��ңң
 *	##--------------------------------------------------------------------------
 *	--------------------------------------------------------------------------##
 *	
 *	[ ����˵��    ]  :
 *
 *	[## public About (JFrame frame) {} ]:
 *		����: ���캯��  �齨���ڴ���
 *
 *  [ ��������    ]  : 
 *
 *##############################################################################
 */
package com.sunshine.about;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import com.sunshine.sunsdk.swing.*;
import com.sunshine.sunsdk.system.*;


public class About
extends JDialog
implements ActionListener {
	
	JLabel top, li, fee, tit, ver, user, co, boss, temp;
	JPanel pm, info, i1, i2, bott, bp;
	JButton bt1;
	
	
	/**=======================================================================**
	 *		[## public About (JFrame frame) {} ]: 	���캯��
	 *			����   ��JFrame�����ǶԻ���ĸ�����
	 *			����ֵ ����
	 *			���η� ��public
	 *			����   ���齨���ڴ���
	 **=======================================================================**
	 */
	public About (JFrame frame) {
		super (frame, "��������", true);
		
		top = new JLabel (new ImageIcon("pic/about.gif"));
		li	= new JLabel (new ImageIcon("pic/line1.gif"));
		fee = new JLabel ("...");
		tit = new JLabel ("        �� ӭ ʹ �� �� �� �� �� ϵ ͳ");
		ver = new JLabel ("...");
		user= new JLabel ("����û�:  " + sunini.getIniKey("UserName"));
		co	= new JLabel ("                         ������˾:  " + sunini.getIniKey("CompName"));
		boss= new JLabel ("       �����");
		temp= new JLabel ("       ");
		bt1 = new TJButton ("pic/choose.gif", "ȷ  ��", "");
		
		pm	= new JPanel (new BorderLayout ());
		info = new JPanel (new GridLayout (4, 1, 0, 0));
		bott = new JPanel (new BorderLayout ());
		i1	 = new JPanel ();
		i2	 = new JPanel (new FlowLayout (FlowLayout.RIGHT));
		bp	 = new JPanel (new FlowLayout (FlowLayout.RIGHT, 10 ,8));
		
		//������Ϣ���
		i1.add (user);
		i1.add (co);
		i2.add (ver);
		info.add (tit);
		info.add (i2);
		info.add (i1);
		info.add (boss);
		
		//�����±����
		bp.add (bt1);
		bott.add ("North", li);
		bott.add ("West", temp);
		bott.add ("East", bp);
		bott.add ("Center", fee);
		
		//���������
		pm.add ("North", top);
		pm.add ("South", bott);
		pm.add ("Center", info);
		
		bt1.addActionListener (this);
		
		this.setContentPane (pm);
		this.setResizable (false);
		pack();
		sunswing.setWindowCenter(this);
	}
	
	/**=======================================================================**
	 *			ActionListener ����
	 **=======================================================================**
	 */
	public void actionPerformed (ActionEvent ae) {
		this.setVisible (false);
	}
	
}
