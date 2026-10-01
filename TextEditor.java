import javax.swing.*;

public class TextEditor {

    public static void main(String[] args) {

        JFrame f = new JFrame("Simple Text Editor");

        JTextArea area = new JTextArea();

        JScrollPane scroll =
            new JScrollPane(area);

        f.add(scroll);

        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem newFile =
            new JMenuItem("New");

        JMenuItem clear =
            new JMenuItem("Clear");

        JMenuItem exit =
            new JMenuItem("Exit");

        JMenuItem copy =
            new JMenuItem("Copy");

        JMenuItem paste =
            new JMenuItem("Paste");

        file.add(newFile);
        file.add(clear);
        file.add(exit);

        edit.add(copy);
        edit.add(paste);

        bar.add(file);
        bar.add(edit);

        f.setJMenuBar(bar);

        newFile.addActionListener(e ->
            area.setText(""));

        clear.addActionListener(e ->
            area.setText(""));

        copy.addActionListener(e ->
            area.copy());

        paste.addActionListener(e ->
            area.paste());

        exit.addActionListener(e ->
            System.exit(0));

        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
