package com.company;
//package texteditor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


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

    public void setTextArea(JTextArea text) {
        textArea = text;
    }

    public TextEditor() {
        super("TextEditor");
        fileMenu();
        editMenu();
        createTextArea();
        createEditorWindow();
    }

    // creating main menu
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        return menuBar;
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

    //adding items to edit menu
    private void editMenu() {

        edit = new JMenu("Edit");

        edit.setPreferredSize(new Dimension(55, 30));

        edit.setFont(new Font("Edit", Font.PLAIN, 25));

        selectAll = new JMenuItem("Select All");

        selectAll.addActionListener(this);

        selectAll.setPreferredSize(new Dimension(150, 30));

        selectAll.setEnabled(true);

        selectAll.setFont(new Font("Select All", Font.PLAIN, 25));

        copy = new JMenuItem("Copy");

        copy.addActionListener(this);

        copy.setPreferredSize(new Dimension(150, 30));

        copy.setEnabled(true);

        copy.setFont(new Font("Copy", Font.PLAIN, 25));

        paste = new JMenuItem("Paste");

        paste.addActionListener(this);

        paste.setPreferredSize(new Dimension(150, 30));

        paste.setEnabled(true);

        paste.setFont(new Font("Paste", Font.PLAIN, 25));

        cut = new JMenuItem("Cut");

        cut.addActionListener(this);

        cut.setPreferredSize(new Dimension(150, 30));

        cut.setEnabled(true);

        cut.setFont(new Font("Cut", Font.PLAIN, 25));

        //Adding items to menu
        edit.add(selectAll);
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
    }

    private JTextArea createTextArea() {

        textBorder = BorderFactory.createBevelBorder(0, Color.WHITE, Color.WHITE);

        textArea = new JTextArea(40, 60);

        textArea.setEditable(true);

        textArea.setBorder(BorderFactory.createCompoundBorder(textBorder, BorderFactory.createEmptyBorder(2, 5, 0, 0)));

        textFont = new Font("Times New Roman", 15, 20);

        textArea.setFont(textFont);

        scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        return textArea;
    }

    private  JFrame createEditorWindow() {
        editorWindow = new JFrame("TextEditor");
        editorWindow.setVisible(true);
        editorWindow.setExtendedState(Frame.MAXIMIZED_BOTH);
        editorWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create menu bar
        editorWindow.setJMenuBar(createMenuBar());
        editorWindow.add(scroll, BorderLayout.CENTER);
        editorWindow.pack();

        //application on center of screen
        editorWindow.setLocationRelativeTo(null);
        return editorWindow;
    }

    //method for saving files
    private void saveFile(File filename) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(textArea.getText());
            writer.close();
            saved = true;
            window.setTitle("JavaText - " + filename.getName());
        }

        catch(IOException err) {
            err.printStackTrace();
        }
    }

    //method for opening files
    private void openFile(File filename) {

        try {
            openedFile = filename;
            FileReader reader = new FileReader(filename);
            textArea.read(reader, null);
            opened = true;
            window.setTitle("JavaEdit - " + filename.getName());
        }

        catch(IOException err) {
            err.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
}    

