package registrationform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class MyFrame2 extends JFrame implements ActionListener
{
    JLabel label7,label8,msg1;
    JTextField t4;
    JPasswordField pass;       
    JButton submit1;
    MyFrame2(){
           
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(700, 500, 1000, 500);
            setTitle("DEHRADUN INSTITUE OF TECHNOLOGY UNIVERSITY ");
            ImageIcon obj=new ImageIcon("C:\\Users\\user\\Desktop\\dit img.jpg");
            setIconImage(obj.getImage());
            setLayout(null);
            setContentPane(new JLabel(new ImageIcon("C:\\Users\\user\\Desktop\\02-01.jpg")));      
            
            label7=new JLabel("LOGIN ID");
            label7.setBounds(50,80,100,20);
            add(label7);
    
            t4=new JTextField();
            t4.setBounds(170,80,100,20);
            add(t4);
            
            
            
            label8=new JLabel("PASSWORD");
            label8.setBounds(50,130,100,20);
            add(label8);
    
            pass=new JPasswordField();
            pass.setBounds(170,130,100,20);
            add(pass);
            
            submit1=new JButton("SUBMIT");
            submit1.setBounds(170,200,80,20);
            add(submit1);
            submit1.addActionListener(this);
           
            msg1=new JLabel("");
            msg1.setBounds(50,300,250,20);
            add(msg1);
            
            setVisible(true); 
           
    }
    public void actionPerformed(ActionEvent f)
    {
             if(((t4.getText()).equals("adminID")) && ((pass.getText()).equals("adminPass"))){
                
//                f1.dispose();
                admin ad = new admin();
                ad.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "INVALID");
            }
    }
    
}
 
class MyFrame extends JFrame implements ActionListener
{
    JLabel label1,label2,label3,label4,label5,label,label6;    
    JTextField t1,t2,t3;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea ta1,screen;
    JCheckBox terms;
    JButton submit,login;
    JLabel msg;
    MyFrame()
    {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(700, 500, 1000, 500);
    setTitle("DEHRADUN INSTITUE OF TECHNOLOGY UNIVERSITY ");
    ImageIcon ob=new ImageIcon("C:\\Users\\user\\Desktop\\dit img.jpg");
    setIconImage(ob.getImage());
    setLayout(new BorderLayout());
   
   //for background
    setContentPane(new JLabel(new ImageIcon("C:\\Users\\user\\Desktop\\02-01.jpg")));
    
    
    label=new JLabel("Registration Form");
    add(label);
    label.setBounds(400,0,800,100);
    Font font=new Font("Chiller",Font.BOLD,60);
    label.setFont(font);
   label.setForeground(Color.black);
   
        

    
    label1=new JLabel("NAME");
    label1.setBounds(20,80,100,20);
    add(label1);
    
    t1=new JTextField();
    t1.setBounds(130,80,100,20);
    add(t1);
    
     label6=new JLabel("STUDENT ID");
    label6.setBounds(20,130,100,20);
    add(label6);
    
    t3=new JTextField();
    t3.setBounds(130,130,100,20);
    add(t3);
    
    label2=new JLabel("MOBILE");
    label2.setBounds(20,180,100,20);
    add(label2);
    
    t2=new JTextField();
    t2.setBounds(130,180,100,20);
    add(t2);
     
    label3=new JLabel("Gender");
    label3.setBounds(20,230,100,20);
    add(label3);
    
    male=new JRadioButton("male");
    female=new JRadioButton("female");
    male.setBounds(140,230,80,20);
    add(male);
    female.setBounds(220,230,80,20);
    add(female);
    male.setSelected(true);
   
    ButtonGroup gen=new ButtonGroup();
    gen.add(male);
    gen.add(female);
    
    label4=new JLabel("DOB");
    label4.setBounds(20,280,100,20);
    add(label4);
    
    String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String months[]={"JAN","FEB","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    String  years[]={"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995"};   
    
    day=new JComboBox(days);
    month=new JComboBox(months);
    year=new JComboBox(years);
    
    day.setBounds(130,280,50,20);
    add(day);
    month.setBounds(190,280,90,20);
    add(month);
    year.setBounds(290,280,70,20);
    add(year);
    
    label5=new JLabel("Address");
    label5.setBounds(20,330,100,20);
    add(label5);
    
    ta1=new JTextArea();
    ta1.setBounds(130,330,200,50);
    add(ta1);
    
    terms=new JCheckBox("Please Accept terms and Condition");
    terms.setBounds(50,400,300,20);
    add(terms);    
    
    submit=new JButton("SUBMIT");
    submit.setBounds(150,430,80,20);
    add(submit);
    submit.addActionListener(this);
    
    
    login=new JButton("LOGIN");
    login.setBounds(250,430,80,20);
    add(login);
    login.addActionListener(this);
    
    screen=new JTextArea();
    screen.setBounds(500,180,300,300);
    add(screen);
    screen.setEditable(false);
    
    msg=new JLabel("");
    msg.setBounds(20,480,250,20);
    add(msg);
    
    setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submit) // IT REGISTER STUDENT IF WE CLICK SUBMIT BUTTON
        {
                if(terms.isSelected())
                {
                
                    String name=t1.getText();
                    int len1 = name.length();
                    String id=t3.getText();
                    int len3=id.length();
                    String mobile=t2.getText();
                    int len = mobile.length();
                    String gender="male";
                    if(female.isSelected()){
                    gender="female";}
                    String dob=day.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
                    String address=ta1.getText();
                    int len2 = address.length();
                    if(len!=10){msg.setText("ENTER CORRECT MOBILE NUMBER");}
                    else if(len1==0){msg.setText("ENTER NAME");}
                    else if(len2==0){msg.setText("ENTER ADDRESS");}
                    else if(len3!=10){msg.setText("ENTER CORRECT STUDENT ID");}
                    else {
                            if(mobile.matches("\\d+") && onlyLettersSpaces(name) && id.matches("\\d+"))//THIS CHECK IF NUMBER ,NAME AND STUDENT ID HAS CORRECT VALUE
                            {   
                                 try{
                                        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb", "root", "prateek@123");
                                        String sql = "insert into info(ID,Name,number, gender, dob, address) values(?,?,?,?,?,?)";
                                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        
                                        pstmt.setString(1, id);
                                        pstmt.setString(2, name);
                                        pstmt.setString(3, mobile);
                                        pstmt.setString(4, gender);
                                        pstmt.setString(5, dob);
                                        pstmt.setString(6, address);
                        
                                        int i = pstmt.executeUpdate();
                                        if(i == 1){
                                        JOptionPane.showMessageDialog(null, "Successfull");
                                        msg.setText("Registration Successfull");
                                        }else{
                                        JOptionPane.showMessageDialog(null, "Error Connecting... ");}
                                    }
                                    catch(Exception q){
                                     JOptionPane.showMessageDialog(null, "Error Connecting... " + q);}
                                 
                             screen.setText("name: "+name+"\n"+"Student ID: "+id+"\n"+"Mobile: " +mobile+"\n"+"gender: "+gender+"\n"+"DOB: "+dob+"\n"+"address: "+address);
                            }
                            else{msg.setText("ENTER CORRECT VALUE IN FIELDS ");}
                        }
                }
                else{
                   msg.setText("Accept Terms and Conditoin");
                   screen.setText("");}
             
        }
        else if(e.getSource()==login) // WERE CREATING ANOTHER FRAME FOR VIEW BUTTON
        {
           MyFrame2 f2= new MyFrame2();
            
        }
        
    }
        //THIS FUNC IS FOR CHECK NAME HAS ONLY ALPHABET AND SPACES
        public static boolean onlyLettersSpaces(String name)
        {
            for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if (Character.isLetter(ch) || ch == ' ') {
            continue;}
            return false;}
            return true;
        }
}
public class RegistrationForm{
    public static void main(String args[]){
        MyFrame f=new MyFrame();  
    
    }
}

