package org.example;

import javax.swing.JOptionPane;

public class HelloDialog {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
        if (result == JOptionPane.YES_OPTION){
            System.out.println("Okay!");
            String name=JOptionPane.showInputDialog("Enter your name:");
            JOptionPane.showMessageDialog(null,"Hello "+name);
        }else{
            JOptionPane.showMessageDialog(null,"Goodbye!");
        }

//        JOptionPane.showMessageDialog(null, "Hi Phethi!");
//        JOptionPane.showMessageDialog(null, "Your first dialog!");
    }
}
