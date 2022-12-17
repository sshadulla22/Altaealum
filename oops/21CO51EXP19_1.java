/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                                EXPERIMENT NO. 19

AIM :- PROGRAM TO DEMONSTRATE THE USE OF DESIGNING GRAPHICS USING AWT.

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
import java.awt.*;  

public class AwtApp extends Frame {  
AwtApp(){  
Label firstName = new Label("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
Label lastName = new Label("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  
Label dob = new Label("Date of Birth");  
dob.setBounds(20, 110, 80, 20);  
  
TextField firstNameTF = new TextField();  
firstNameTF.setBounds(120, 50, 100, 20);  
  
TextField lastNameTF = new TextField();  
lastNameTF.setBounds(120, 80, 100, 20);  
  
TextField dobTF = new TextField();  
dobTF.setBounds(120, 110, 100, 20);  
  
Button sbmt = new Button("Submit");  
sbmt.setBounds(20, 160, 100, 30);  
  
Button reset = new Button("Reset");  
reset.setBounds(120,160,100,30);  
  
add(firstName);  
add(lastName);  
add(dob);  
add(firstNameTF);  
add(lastNameTF);  
add(dobTF);  
add(sbmt);  
add(reset);  
  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtApp awt = new AwtApp();  
  
}

}
