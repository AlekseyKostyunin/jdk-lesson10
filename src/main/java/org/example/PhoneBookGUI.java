package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhoneBookGUI extends JFrame {
    private final JTextField nameField;
    private final JTextField phoneField;
    private JButton addButton;
    private JButton searchButton;
    private JTextArea resultArea;

    public PhoneBookGUI() {
        super("Телефонный справочник");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        nameField = new JTextField(15);
        phoneField = new JTextField(15);

        addButton = new JButton("Добавить контакт");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addContact();
            }
        });

        searchButton = new JButton("Найти контакт");
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchContact();
            }
        });

        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);

        panel.add(new JLabel("Имя:"));
        panel.add(nameField);
        panel.add(new JLabel("Телефон:"));
        panel.add(phoneField);
        panel.add(addButton);
        panel.add(searchButton);
        panel.add(new JScrollPane(resultArea));

        add(panel);
        setVisible(true);
    }

    private void addContact() {
        String name = nameField.getText();
        String phone = phoneField.getText();
    }

    private void searchContact() {
        String name = nameField.getText();
    }

    public static void main(String[] args) {
        new PhoneBookGUI();
    }
}
