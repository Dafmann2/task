package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] users=new String[100];
        int id=0;
        user users1 = new user();
        while (true){
            System.out.println("Новый пользователь-1," +
                    "Список пользователей-2," +
                    "Удаление пользователей-3," +
                    "Изменение данных-4," +
                    "Выход-5");
            String str =  in.nextLine();
            if(str.equals("1")){
                System.out.println("Новый пользователь");
                users1.setId(id);
                id++;
                System.out.println("Введите имя:");
                users1.setName(in.nextLine());
                System.out.println("Введите емайл:");
                String email=in.nextLine();
                users1.setEmail(email);
                System.out.println("Введите пароль:");
                String password=in.nextLine();
                users1.setPassword(password);
                users[users1.getId()]= users1.getName()+" "+ users1.getEmail()+" "+ users1.getPassword();
                System.out.println(users[users1.getId()]);
            }

            else if(str.equals("2")){
                System.out.println("Cписок пользователей:");
                for(int i=0;i< users1.getId()+1;i++){
                    System.out.println(i+" "+users[i]);
                }
            }

            else if(str.equals("3")){
                System.out.println("Удаление пользователей");
                System.out.println("Укажите номер пользователя:");
                int number=in.nextInt();
                users[number]=null;
            }

            else if(str.equals("4")){
                System.out.println("Изменение данных");
                System.out.println("Укажите номер пользователя:");
                int number=in.nextInt();
                String [] arr = new String[3];
                arr=users[number].split(" ");
                System.out.println(users[number]);
                System.out.println("Изменить 1-Name 2-email 3-password");
                int izm=in.nextInt();
                if(izm==1){
                    System.out.println();
                    arr[0]=in.nextLine();

                }
                else if (izm==2){

                }
                else if(izm==3){

                }
                else{
                    System.out.println("Error");
                }
            }

            else if (str.equals("5")){
                System.out.println("Exit");
            break;
            }

            else {
            System.out.println("Error");
            }
        }
    }
    public static class user{
        private String name;
        private String email;
        private String password;
        private int id;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}//name email password menu: new user, info spisok users,max 100 users, users==null, izmenenie dan , exit

