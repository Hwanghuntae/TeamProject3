import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrame extends JFrame
{

    private JLabel jl = new JLabel("HELLO");
    public MyHelloFrame(){
        setTitle("실습#3(황훈태 2018315009, 정대기 2018315026");

        JPanel jp = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.addMouseListener(new MyHelloFrameListener(jp,jl));
        jp.addKeyListener(new MyHelloFrameListener(jp,jl));
        jp.add(jl);

        add(jp);

        setSize(300,300);
        setVisible(true);

        jp.setFocusable(true);

    }
}
