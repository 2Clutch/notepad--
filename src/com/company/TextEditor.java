package com.company;
//package texteditor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class TextEditor extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new TextEditor();
    }

    private JMenu file; //define file menu

    private JMenu edit; //define edit menu

    private JMenuItem newFile; //define new file

    private JMenuItem open; //define open file

    private JMenuItem save; //define save file

    private JMenuItem saveAs; //define save file as

    private JMenuItem delete; //define delete file

    private JMenuItem selectAll; //define select all text

    private JMenuItem cut; //define cut text

    private JMenuItem copy; //define copy text

    private JMenuItem paste; //define paste text

    private JFrame editorWindow; //define text editor window

    private Border textBorder; //define text border

    private JScrollPane scroll; //define scroll

    private JTextArea textArea; //define text area

    private Font textFont; //define text font

    private JFrame window; //define window to open or save file

    private boolean opened = false; //is file opened

    private boolean saved = false; //is file saved

    private File openedFile;

    public JTextArea getTextArea() {
        return textArea;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    

