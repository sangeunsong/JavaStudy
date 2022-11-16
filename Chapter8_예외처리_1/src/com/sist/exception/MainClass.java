package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass extends JFrame implements ActionListener{
	//                 --------------클래스       ---------------인터페이스(다중상속)
private JTextArea ta; //포함
private JTextField tf;
private JButton b1,b2;

//시작과 동시에 배치
public MainClass()
{
	ta=new JTextArea();
	JScrollPane js=new JScrollPane(ta);
	tf=new JTextField(10);
	b1=new JButton("Start");
	b2=new JButton("Exit");
	add("Center",js);
	JPanel p=new JPanel();
	p.add(tf);
	p.add(b1);
	p.add(b2);
	add("South",p);
	
	//크기
	setSize(450,420);
	setVisible(true);
	
	//이벤트 등록
	b1.addActionListener(this); //클릭 =>시스템에 의해서 자동 호출(Callback)
	tf.addActionListener(this); //엔터
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	}
