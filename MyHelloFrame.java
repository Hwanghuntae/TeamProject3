import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * 패널과 레이블을 생성하여 기능을 보여주는 틀을 만드는 클래스
 * 
 * @author (2018315009 황훈태, 2018315026 정대기) 
 * @version (2019-11-11)
 */
public class MyHelloFrame extends JFrame
{

    private JLabel jl = new JLabel("HELLO");
    public MyHelloFrame(){
        setTitle("실습#3(2018315009 황훈태, 2018315026 정대기"); // 타이틀 생성

        JPanel jp = new JPanel(); // 패널 생성
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.addMouseListener(new MyHelloFrameListener(jp,jl));
        jp.addKeyListener(new MyHelloFrameListener(jp,jl));
        jp.add(jl);  //패널에 레이블 삽입

        add(jp);

        setSize(300,300);   // 패널 사이즈 300,300
        setVisible(true);  

        jp.setFocusable(true);

    }
}
