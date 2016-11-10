package com.company;
//package texteditor;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

    

public class TextEditor extends JFrame implements ActionListener {
            
    public static void main(String[] args) {
	 new TextEditor();
    }

            // menu
            private JMenu file;
            private JMenu edit;

            // defining menu items
            private JMenuItem new_file, open_file, save_file, saveas_file, delete_file;
            private JMenuItem selectAll, cut, copy, paste;

            private JFrame editorWindow;

            private JFrame window;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    

