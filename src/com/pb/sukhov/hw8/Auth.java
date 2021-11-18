package com.pb.sukhov.hw8;

//Создать класс Auth, который содержит поля login и password и методы:
//
//- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
//Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен
// содержать только латинские буквы и цифры. Если логин не соответствует требованиям
// нужно выбросить WrongLoginException.
//Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак
// подчеркивания. Также password и confirmPassword должны совпадать. Если password
// не соответствует требованиям нужно выбросить WrongPasswordException.
//Если проверки все пройдены успешно записать в свои поля значение login и password.
// Так сохраняем пользователя :)
//
//- signIn (вход на сайт) принимающий login и password.
//Проверяет что login и password соответствуют значениям из полей класса.
//Если нет - выбрасывает исключение WrongLoginException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения
// с двумя конструкторами – один по умолчанию, второй принимает сообщение
// и передает его в конструктор класса Exception

//import com.pb.sukhov.hw8.WrongLoginException;
//import com.pb.sukhov.hw8.WrongPasswordException;


import java.util.Scanner;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
import java.util.regex.*;

class Auth {// extends JFrame implements ActionListener {

    static void print(String text){                                                  //Метод void вывод на экран
        System.out.println(text);
    }


    public  String scanString(){                                                     //Метод ввод текста
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return	string;
    }


    static boolean matches(String input, String regex) {                             //Метод void сравнение строки
        boolean result = input.matches(regex);                                       //с шаблоном
                 return result;
        }

       public Boolean SignUp(String log, String pass, String confPass){             //Метод проверка логина и паролей
                boolean check=false;                                                //и их сравневние (регул. выражение)
            boolean loginCheck = matches(log, "^[A-Za-z0-9]\\w{5,20}");
            boolean passwordCheck = matches(pass, "\\w{5,}");
            boolean confirmPasswordCheck = matches(confPass, "\\w{5,}");
                if ((loginCheck & passwordCheck & confirmPasswordCheck)&(pass.equals(confPass)) )
                    return true;                                                    //если все проверки пройдены - истина
                 else return false;                                                 //иначе ложь
        }



    public Auth() {
        String login;
        String password;
        String confirmPassword;
            print("Введите ЛОГИН (a-z A-Z 5-20): ");
                login = scanString();
            print("Введите ПАРОЛЬ (a-z A-Z _ 5+): ");
                password = scanString();
            print("Введите ПАРОЛЬ повторно (a-z A-Z _ 5+): ");
                confirmPassword = scanString();

           boolean scanCheck =  SignUp(login, password, confirmPassword);


        if (scanCheck) {
            System.out.println("It is a phone number");
        } else {
            System.out.println("It is not a phone number!");
        }



    }


}


/**




 //createLabels();
 //  createTextFields();
 createButton();
 createPanel();
 add(rootPanel, BorderLayout.CENTER);
 add(submit, BorderLayout.SOUTH);
 submit.addActionListener(this);
 createFrame();
 }

 private void createFrame() {
 setTitle("LOGIN FORM");
 setSize(300, 130);
 setLocationRelativeTo(null);
 setResizable(false);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }



 // private void createLabels() {
 loginLabel = new JLabel("  Login:");
 passwordLabel = new JLabel("  Password:");
 confirmPasswordLabel = new JLabel("  Confirm password:");
 }

 // private void createTextFields() {
 //     login = new JTextField(15);
 //     password = new JPasswordField(15);
 //     confirmPassword = new JPasswordField(15);
 //     textFieldsAlignment(CENTER_ALIGNMENT, login, password, confirmPassword);
 // }

 private void textFieldsAlignment(final float alignment, JTextField... fields) {
 for (JTextField field : fields) {
 field.setHorizontalAlignment((int) alignment);
 }
 }

 private void createButton() {
 submit = new JButton("submit");
 }

 private void createPanel() {
 rootPanel = new JPanel(new GridLayout(3, 1));
 rootPanel.add(loginLabel);
 rootPanel.add(login);
 rootPanel.add(passwordLabel);
 rootPanel.add(password);
 rootPanel.add(confirmPasswordLabel);
 rootPanel.add(confirmPassword);
 }

 public void actionPerformed(ActionEvent ae) {
 try {
 checkLogInInfo(login.getText(), password.getText(), confirmPassword.getText(), "[\\w]{1,20}");
 JOptionPane.showMessageDialog(this, "Login and password are correct!",
 "User login&password confirmation", JOptionPane.PLAIN_MESSAGE);
 } catch (WrongLoginException | WrongPasswordException e) {
 JOptionPane.showMessageDialog(this, e.getMessage(),
 "UserException", JOptionPane.ERROR_MESSAGE);
 }
 }

 private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
 throws WrongLoginException, WrongPasswordException {
 if (!login.matches(regex)) {
 throw new WrongLoginException("Incorrect login");
 } else if (!password.matches(regex) ||
 !confirmPassword.matches(regex) ||
 !password.equals(confirmPassword)) {
 throw new WrongPasswordException("Incorrect password");
 }
 return true;
 }
 }**/