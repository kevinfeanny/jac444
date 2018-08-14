package Address;
import java.io.*;
import java.lang.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.FileChannel;
import  java.util.Scanner;
import java.nio.file.Files;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.nio.file.StandardOpenOption;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.*;

public class Address extends JPanel  {
    private static final String FILENAME = "addressbook.dat";
    private JTextField tName, tAddress, tPhone, tEmail;
    private JButton bSave, bFirst, bNext, bPrevious, bLast,bUpdate, bClear;
    private String name, address, email, phone;
    private int gxb = 0, gyb = 0;
    private int gxt = 1, gyt = 0;
    static  int index;
    private ArrayList<person> personList;
    private  person xi;
    public Address() {

        name = "";
        address = "";
        email = "";
        phone = "0";
        personList = new ArrayList<person>();
        setBackground(Color.gray);
        setBorder(new EmptyBorder(30, 10, 30, 10));
        setLayout(new GridBagLayout());
        addComponents();
        index = 0;
        initialize();

    }

    private void createButton(String s) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gxb;
        gbc.gridy = gyb;
        gbc.insets = new Insets(5, 5, 5, 5);
        JButton b = new JButton(s);
        add(b, gbc);
        gyb++;
    }

    private JTextField createText() {
        JTextField t = new JTextField(20);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gxt;
        gbc.gridy = gyt;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(t, gbc);
        gyt++;
        return t;

    }

    private void addComponents() {
        createButton("Name");
        tName = createText();

        createButton("Address");
        tAddress = createText();

        createButton("Telephone");
        tPhone = createText();

        createButton("Email");
        tEmail = createText();

        bSave = new JButton("Save");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = ++gyb;
        gbc.gridx = 0;
        add(bSave, gbc);

        bFirst = new JButton("First");
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridy = gyb;
        gbc2.gridx = 1;
        add(bFirst, gbc2);

        bNext = new JButton("Next");
        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridy = gyb;
        gbc3.gridx = 2;
        add(bNext, gbc3);

        bPrevious = new JButton("Previous");
        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridy = gyb;
        gbc4.gridx = 3;
        add(bPrevious, gbc4);

        bLast = new JButton("Last");
        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc4.gridy = gyb;
        gbc4.gridx = 3;
        add(bLast, gbc5);

        bClear = new JButton("Clear");
        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc5.gridy = ++gyb;
        gbc5.gridx = 1;
        gbc5.gridwidth = 2;
        add(bClear, gbc6);

        bUpdate = new JButton("Update");
        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc5.gridy = ++gyb;
        gbc5.gridx = 1;
        gbc5.gridwidth = 2;
        add(bUpdate, gbc7);

        // add functionality for buttons:
        bSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });
        bFirst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first();
            }
        });
        bNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Next();
            }
        });

        bPrevious.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Previous();
            }
        });
        bLast.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Last();
            }
        });

        bClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        bUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Update();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

    }
    public void initialize(){


        try {
            RandomAccessFile file = new RandomAccessFile(FILENAME, "rw");



        int i = 0;
        while(file.read() != -1) {


            if(file.read() != -1) {
                if(i == 0){
                    file.seek(0);
                    i++;
                }
                byte[] buffer = new byte[14];
                file.read(buffer);
                String s1 = new String(buffer);

                //String s1 = file.readLine();
                System.out.println(s1.trim());
                xi = new person("", "", "", "");
                xi.setName(s1.trim());
                byte[] buffer2 = new byte[21];
                file.read(buffer2);
                String s2 = new String(buffer2);
                //String s1 = file.readLine();
                System.out.println(s2.trim());
                xi.setAddress(s2.trim());
                byte[] buffer3 = new byte[20];
                file.read(buffer3);
                String s3 = new String(buffer3);
                //String s1 = file.readLine();
                System.out.println(s3.trim());
                xi.setEmail(s3.trim());
                byte[] buffer4 = new byte[18];
                file.read(buffer4);
                String s4 = new String(buffer4);
                //String s1 = file.readLine();
                System.out.println(s4.trim());
                xi.setPhone(s4.trim());

            }
           if(file.read() == -1){

            }else{
                personList.add(xi);
                index++;
            }




        }
            file.seek(0);
            file.close();


        }catch(IOException e){
            System.out.println("error");
        }



    }

    public void save() {

        index++;
        boolean w = true;

        if (w) {
            RandomAccessFile file = null;

            try {


                xi = new person("", "", "", "");
                name = tName.getText().trim();
                email = tEmail.getText().trim();
                address = tAddress.getText().trim();
                phone = tPhone.getText().trim();
                if (name != "") {
                    xi.setName(name);

                    xi.setAddress(address);


                    xi.setEmail(email);

                    xi.setPhone(phone);


                    name = padString(name, 16);
                    System.out.println(name);

                    address = padString(address, 21);

                    email = padString(email, 19);

                    phone = padString(phone, 20);
                    File f = new File(FILENAME);
                    long fileLength = f.length();
                    file = new RandomAccessFile(f, "rw");
                    System.out.println(index);
                    if (index == 1) {
                        file.seek(0);
                        personList.add(xi);
                    } else {
                        file.seek(fileLength);
                        personList.add(xi);
                    }

                    byte[] b = name.getBytes();
                    if (name != "") {
                        file.write(b);
                    }
                    byte[] b1 = address.getBytes();
                    if (address != "") {
                        file.write(b1);
                    }
                    byte[] b2 = email.getBytes();
                    if (email != "") {
                        file.write(b2);
                    }
                    byte[] b3 = phone.getBytes();
                    if (phone != "") {
                        file.write(b3);
                    }
                    file.write(0x0d);//New Line
                    file.write(0x0a);//Carriage return
                    clear();
                    file.close();
                }


            } catch (IOException e) {
                System.out.println("blahhh");
            }
        }}
    public  void Next(){



        if(index < personList.size()-1 ) {
            try {
                index++;
                System.out.println(personList.size());
                System.out.println(index);
                System.out.println(personList.get(index).getName());
                tName.setText(personList.get(index).getName());
                tAddress.setText(personList.get(index).getAddress());
                tPhone.setText(personList.get(index).getPhone());
                tEmail.setText(personList.get(index).getEmail());
            }catch (Exception e){

            }
        }

    }
    public void Previous(){
        if(index > 0) {
            try {
                index--;
                System.out.println(personList.size());
                System.out.println(index);
                System.out.println(personList.get(index).getName());
                tName.setText(personList.get(index).getName());
                tAddress.setText(personList.get(index).getAddress());
                tPhone.setText(personList.get(index).getPhone());
                tEmail.setText(personList.get(index).getEmail());
            }catch (Exception e){

            }
        }

    }
    public void clear(){
        tName.setText("");
        tAddress.setText("");
        tPhone.setText("");
        tEmail.setText("");

    }
    public void first(){



        System.out.println(personList.get(personList.size()-1).getName());
        tName.setText(personList.get(0).getName());
        tAddress.setText(personList.get(0).getAddress());
        tPhone.setText(personList.get(0).getPhone());
        tEmail.setText(personList.get(0).getEmail());
        index = 0;
    }
    public  void Last(){
        System.out.println(personList.get(personList.size()-1).getName());
        tName.setText(personList.get(personList.size()-1).getName());
        tAddress.setText(personList.get(personList.size()-1).getAddress());
        tPhone.setText(personList.get(personList.size()-1).getPhone());
        tEmail.setText(personList.get(personList.size()-1).getEmail());
        index = personList.size()-1;


    }
    public void Update() throws IOException {

        boolean w = true;

        if (w) {
            RandomAccessFile file = null;
            BufferedWriter bw = null;
            FileWriter fw = null;
            try {


                xi = new  person("","","","");
                name = tName.getText().trim();
                email = tEmail.getText().trim();
                address = tAddress.getText().trim();
                phone = tPhone.getText().trim();
                if(name != ""){
                    xi.setName(name);

                    xi.setAddress(address);


                    xi.setEmail(email);

                    xi.setPhone(phone);



                    name = padString(name, 16);
                    System.out.println(name);

                    address = padString(address,21);

                    email = padString(email,19);

                    phone =  padString(phone, 20);
                    File f = new File(FILENAME);
                    long fileLength = f.length();
                    file = new RandomAccessFile(f, "rw");
                    System.out.println(index);
                    file.seek(0);
                    int hi = 0 ;
                    for(int i = 0; i < index; i++){
                          hi = hi + 76;


                    }


                    System.out.println(hi);
                    System.out.println(index);



                        personList.set(index, xi);
                    file.seek(hi);
                    if(hi == 0){


                    }else{

                    file.write(0x0d);
                        file.write(0x0a);
                    }

                    byte[] b = name.getBytes();
                    if(name != ""){
                        file.write(b);}
                    byte[] b1 = address.getBytes();
                    if(address != ""){
                        file.write(b1);}
                    byte[] b2 = email.getBytes();
                    if(email != ""){
                        file.write(b2);}
                    byte[] b3 = phone.getBytes();
                    if(phone != ""){
                        file.write(b3);}




                    file.write(0x0d);//New Line
                    file.write(0x0a);//Carriage return


                   clear();
                    file.close();}



            }catch(IOException e){
                System.out.println("blahhh");
            }


            }}
    public static String padString(String str, int leng) {
        for (int i = str.length(); i <= leng; i++)
            str += " ";
        return str;
    }

}
