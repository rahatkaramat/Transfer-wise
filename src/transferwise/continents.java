/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferwise;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


/**
 *
 * @author Administrator
 */
public class continents extends JFrame implements Runnable {
    JProgressBar jpb1;
    JProgressBar jpb2;
    JProgressBar jpb3;
    JProgressBar jpb4;
    JProgressBar jpb5;
    JProgressBar jpb6;
    JProgressBar jpb7;
    JLabel j1;
    JLabel j2;
    JLabel j3;
    JLabel j4;
    JLabel j5;
    JLabel j6;
    JLabel j7;
    int width,height;
    int amount=3;
    public static int Asia=45;
    public  static int Europe=56;
    public static int North_America=34;
    public  static int South_America=45;
    public static int Africa=48;
    public static int Oceania=49;
    public static int Antarctica =54;
    public continents(){
        j1=new JLabel("Asia stack",JLabel.CENTER);
        j1.setFont(new java.awt.Font("Dialog", 1, 15));
        j1.setForeground(Color.darkGray);
        j2=new JLabel("Europe stack",JLabel.CENTER);
        j2.setFont(new java.awt.Font("Dialog", 1, 15));
        j2.setForeground(Color.orange);
        j3=new JLabel("North_America stack",JLabel.CENTER);
        j3.setFont(new java.awt.Font("Dialog", 1, 15));
        j3.setForeground(Color.BLUE);
        j4=new JLabel("South_America stack",JLabel.CENTER);
        j4.setFont(new java.awt.Font("Dialog", 1, 15));
        j4.setForeground(Color.GREEN);
        j5=new JLabel("Africa stack",JLabel.CENTER);
        j5.setFont(new java.awt.Font("Dialog", 1, 15));
        j5.setForeground(Color.CYAN);
        j6=new JLabel("Oceania stack",JLabel.CENTER);
        j6.setFont(new java.awt.Font("Dialog", 1, 15));
        j6.setForeground(Color.PINK);
        j7=new JLabel("Antarctia stack",JLabel.CENTER);
        j7.setFont(new java.awt.Font("Dialog", 1, 15));
        j7.setForeground(Color.MAGENTA);
        jpb1=new JProgressBar();
        jpb1.setStringPainted(true);
        jpb1.setIndeterminate(false);
        jpb1.setBorderPainted(true);
        jpb1.setBackground(Color.darkGray);
        jpb2=new JProgressBar();
        jpb2.setStringPainted(true);
        jpb2.setIndeterminate(false);
        jpb2.setBorderPainted(true);
        jpb2.setBackground(Color.orange);
        jpb3=new JProgressBar();
        jpb3.setStringPainted(true);
        jpb3.setIndeterminate(false);
        jpb3.setBorderPainted(true);
        jpb3.setBackground(Color.BLUE);
        jpb4=new JProgressBar();
        jpb4.setStringPainted(true);
        jpb4.setIndeterminate(false);
        jpb4.setBorderPainted(true);
        jpb4.setBackground(Color.GREEN);
        jpb5=new JProgressBar();
        jpb5.setStringPainted(true);
        jpb5.setIndeterminate(false);
        jpb5.setBorderPainted(true);
        jpb5.setBackground(Color.cyan);
        jpb6=new JProgressBar();
        jpb6.setStringPainted(true);
        jpb6.setIndeterminate(false);
        jpb6.setBorderPainted(true);
        jpb6.setBackground(Color.PINK);
        jpb7=new JProgressBar();
        jpb7.setStringPainted(true);
        jpb7.setIndeterminate(false);
        jpb7.setBorderPainted(true);
        jpb7.setBackground(Color.MAGENTA);
        this.setLayout(new GridLayout(7,2));
        this.add(j1);
        this.add(jpb1);
        this.add(j2);
        this.add(jpb2);
        this.add(j3);
        this.add(jpb3);
        this.add(j4);
        this.add(jpb4);
        this.add(j5);
        this.add(jpb5);
        this.add(j6);
        this.add(jpb6);
        this.add(j7);
        this.add(jpb7);
        this.setSize(525,356);
        width=Toolkit.getDefaultToolkit().getScreenSize().width;
        height=Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setTitle("Track of stack!");
        this.setLocation(width/2-200,height/2-150);
        this.setVisible(true);
        
      }
     @Override
    public void run() {
        while(true){
        int num=(int) (Math.random()*15);
        if (num==1){
            Asia+=amount;
            Antarctica-=amount;
         }
        else if(num==2){
            Asia-=amount;
            Europe+=amount;
        }
        else if (num==3){
            Europe+=amount;
             North_America-=amount;
        }
        else if (num==4){
            Europe-=amount;
            Africa+=amount;
        }
        else if(num==5){
            North_America+=amount;
            South_America-=amount;
        }
        else if(num==6){
            North_America-=amount;
            Africa+=amount;
            Oceania-=amount;
        }
        else if(num==7){
            South_America+=amount;
            Oceania-=amount;
        }
        else if(num==8){
            South_America-=amount;
        }
        else if(num==9){
            Africa+=amount;
        }
        else if(num==10){
             Africa-=amount;
        }
        else if(num==11){
            Oceania+=amount;
        }
        else if(num==12){
             Oceania-=amount;
              Antarctica+=amount;
               Antarctica+=amount;
        }
        else if(num==13){
            Antarctica+=amount;
        }
        else{
            Antarctica-=amount;
        }
         try {
               Thread.sleep(1000);
            } catch (InterruptedException ex) { }
            jpb1.setValue(Europe);
            jpb2.setValue(Asia);
            jpb3.setValue(Antarctica);
            jpb4.setValue(Oceania);
            jpb5.setValue(Africa);
            jpb6.setValue(North_America);
            jpb7.setValue(South_America);
           
        }
}}
  
