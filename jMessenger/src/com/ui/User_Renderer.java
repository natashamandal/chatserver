package com.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import java.lang.*;

 
/**
 * Custom renderer to display a country's flag alongside its name
 *
 * @author wwww.codejava.net
 */
public class User_Renderer extends DefaultListCellRenderer{
	
	JTextArea j;
	
	public User_Renderer(JTextArea j)
	{
		this.j = j;
	}
 
	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		Component listCellRendererComponent = super.getListCellRendererComponent(list, value, index, isSelected,cellHasFocus);
		String userlin = value.toString()+" is logged in.";
		String userlout = value.toString()+" has signed out";
		String confail = "[Application > Me] : Connection Failure";
		if(((j.getText().contains(userlin))&&(!j.getText().contains(userlout)))&&((j.getText().contains(userlin))&&(!j.getText().contains(confail))))
		{
		// TODO Auto-generated method stub			
		listCellRendererComponent.setBackground(new Color(153, 255, 51));
		}
		else if((j.getText().contains(userlin))&&(j.getText().contains(userlout))&&(j.getText().lastIndexOf(userlin)>j.getText().lastIndexOf(userlout)))
			
		{
			listCellRendererComponent.setBackground(new Color(153, 255, 51));
		}
		else if((j.getText().contains(userlin))&&(j.getText().contains(confail))&&(j.getText().lastIndexOf(userlin)>j.getText().lastIndexOf(confail)))
		{
			listCellRendererComponent.setBackground(new Color(153, 255, 51));
		}
		else
		{
			listCellRendererComponent.setBackground(Color.RED);
		}
		return this;
	}
     
}