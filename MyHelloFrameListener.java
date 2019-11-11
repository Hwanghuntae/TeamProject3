import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * 여기에 MyHelloFrameListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrameListener extends KeyAdapter implements MouseListener

{
    private final int FLYING_UNIT = 10;
    JPanel jp;    
    JLabel jl;
    public MyHelloFrameListener(JPanel jp, JLabel jl)
    {
        this.jp = jp;
        this.jl = jl;
    }

    public void mouseClicked(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        jl.setLocation(x, y);
    }

    public void mouseReleased(MouseEvent e){

    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();  // 입력된 키의 키코드를 알아낸다.
        // 키 코드 값(keyCode)에 상,하,좌,우 키를 판별하고 la의 위치를 이동시킨다.
        switch(keyCode) {
            case KeyEvent.VK_UP:
                jl.setLocation(jl.getX(), jl.getY()-FLYING_UNIT);
                
            case KeyEvent.VK_DOWN:
                jl.setLocation(jl.getX(), jl.getY()+FLYING_UNIT); 
              
            case KeyEvent.VK_LEFT:
                jl.setLocation(jl.getX()-FLYING_UNIT, jl.getY());
            
            case KeyEvent.VK_RIGHT:
                jl.setLocation(jl.getX()+FLYING_UNIT, jl.getY()); 
           
        }
    }
}

