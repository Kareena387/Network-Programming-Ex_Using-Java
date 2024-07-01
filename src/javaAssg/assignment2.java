package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import javax.swing.JFrame;

public class assignment2 extends JFrame {
	//initialize count
	
	private int ScoreA = 0;
	private int ScoreB = 0;
	
	private JLabel scoreALabel;
	private JLabel scoreBLabel;

	
	public assignment2() {
		JFrame f = new JFrame("Example");
		JLabel scoreALabel = new JLabel("score A:" + ScoreA);
		JLabel scoreBLabel = new JLabel("score B:" + ScoreB);

		
		
		//display count 
		JButton upButtonA = new JButton("Up");
		JButton DownButtonA = new JButton("Down");
		JButton upButtonB = new JButton("Up");
		JButton DownButtonB = new JButton("Down");

		
		//setting layout to FlowLayout with horizontal gap(space between)
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));	//adjusting gap
		
		//adding component
		//Row for score A
		f.add(scoreALabel);
		f.add(upButtonA);
		f.add(DownButtonA);
		
		
//for row_score B
		f.add(scoreBLabel);
		f.add(upButtonB);
		f.add(DownButtonB);
		
		//Button actions for Score A
        upButtonA.addActionListener(e -> updateScoreA(1));
        
        DownButtonA.addActionListener(e -> updateScoreA(-1));
        
        
        //for score B
        
        upButtonB.addActionListener(e -> updateScoreB(1));
        DownButtonB.addActionListener(e -> updateScoreB(-1));
        
	
		f.setTitle("GUI Assignment 2");
		f.setSize(500, 300); //can adjust height as need
		
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		
		private void updateScoreA(int delta) {
	        scoreA += delta;
	        scoreALabel.setText("Score A: " + scoreA);
	    }
		
		private void updateScoreA(int delta) {
	        scoreB += delta;
	        scoreBLabel.setText("Score B: " + scoreB);
	    }
		
		
		
	}
	
	public static void main(String[] args) {
		assignment2 e1 = new assignment2(); 
	}
}
