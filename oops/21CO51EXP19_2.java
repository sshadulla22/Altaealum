/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 19

AIM :- PROGRAM TO DEMONSTRATE THE USE OF DESIGNING GRAPHICS USING SWINGS.

Theory :-
The Graphics class is the abstract super class for all graphics contexts which allow an application to draw onto 
components that can be realized on various devices, or onto off-screen images as well.
A Graphics object encapsulates all state information required for the basic rendering operations that Java supports. 
State information includes the following properties.
The Component object on which to draw.
A translation origin for rendering and clipping coordinates.
The current clip.
The current color.
The current font.
The current logical pixel operation function.
The current XOR alternation color
*/ 

import javax.swing.*;  

public class SwingApp {  

SwingApp(){  
//create object of JFrame class
JFrame f = new JFrame();  
  
JLabel firstName = new JLabel("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
JLabel lastName = new JLabel("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  
JLabel dob = new JLabel("Date of Birth");  
dob.setBounds(20, 110, 110, 20);  
  
JTextField firstNameTF = new JTextField();  
firstNameTF.setBounds(120, 50, 100, 20);  
  
JTextField lastNameTF = new JTextField();  
lastNameTF.setBounds(120, 80, 100, 20);  
  
JTextField dobTF = new JTextField();  
dobTF.setBounds(150, 110, 100, 20);  
  
JButton sbmt = new JButton("Submit");  
sbmt.setBounds(20, 160, 100, 30);  
  
JButton reset = new JButton("Reset");  
reset.setBounds(120,160,100,30);  
  
f.add(firstName);  
f.add(lastName);  
f.add(dob);  
f.add(firstNameTF);  
f.add(lastNameTF);  
f.add(dobTF);  
f.add(sbmt);  
f.add(reset);  
  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
SwingApp s = new SwingApp();  
}  
}  
