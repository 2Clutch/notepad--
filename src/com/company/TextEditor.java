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

    public void setTextArea(JTextArea text){
        textArea = text;
    }
    public TextEditor(){
        super("TextEditor");
        fileMenu();
        editMenu();
        createTextArea();
        createEditorWindow();
    }

    private void fileMenu() {

        //Create File Menu
        file = new JMenu("File");
        file.setPreferredSize(new Dimension(55, 30));
        file.setFont(new Font("File", Font.PLAIN, 25));

        //Add file menu items
        newFile = new JMenuItem("New");

        newFile.addActionListener(this);

        newFile.setPreferredSize(new Dimension(150, 30));

        newFile.setEnabled(true);

        newFile.setFont(new Font("New", Font.PLAIN, 25));

        open = new JMenuItem("Open");

        open.addActionListener(this);

        open.setPreferredSize(new Dimension(150, 30));

        open.setEnabled(true);

        open.setFont(new Font("Open", Font.PLAIN, 25));

        save = new JMenuItem("Save");

        save.addActionListener(this);

        save.setPreferredSize(new Dimension(150, 30));

        save.setEnabled(true);

        save.setFont(new Font("Save", Font.PLAIN, 25));

        saveAs = new JMenuItem("Save As");

        saveAs.addActionListener(this);

        saveAs.setPreferredSize(new Dimension(150, 30));

        saveAs.setEnabled(true);

        saveAs.setFont(new Font("Save As", Font.PLAIN, 25));

        delete = new JMenuItem("Delete");

        delete.addActionListener(this);

        delete.setPreferredSize(new Dimension(150, 30));

        delete.setEnabled(true);

        delete.setFont(new Font("Delete", Font.PLAIN, 25));

        //Adding items to menu
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(delete);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    

