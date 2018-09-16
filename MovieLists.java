/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielists;

/**
 *
 * @author tsini
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovieLists extends JFrame implements ActionListener {

        String[] movieList = {"Choose Movies/TV Show","Marvel Cinematic Universe","Harry Potter","Star Wars","Avatar","Lord of the Rings","Twilight"};
        JComboBox cmbMovieList = new JComboBox(movieList);
        JLabel lblText = new JLabel();

    public static void main(String[] args) {
        MovieLists fr = new MovieLists();
            
            
        ///CenteredFrame(fr);
        //center Frame(fr);
        // maximiseFrame(fr);
        fr.setVisible(true);

    } // end main

    public MovieLists() {
        setLayout(new FlowLayout());
        setSize(400,300);
        setTitle("Select a movie to binge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cmbMovieList.setSelectedIndex(0);
        cmbMovieList.addActionListener(this);
        add (cmbMovieList);
        add(lblText);

    }
     public void actionPerformed(ActionEvent e) {
         int time = 0;
        if (e.getSource() == cmbMovieList) {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String) cb.getSelectedItem();
            switch (msg) {
                case "Choose Movies/TV Show": lblText.setText("Select options below");
                break;
                case "Marvel Cinematic Universe": lblText.setText("36 hrs 02 mins");
                time = 37;
                    break;
                case "Harry Potter": lblText.setText("21 hrs 52 mins");
                time=22;
                    break;
                case "Star Wars": lblText.setText("15 hrs 27 mins");
                time=16;
                    break;
                case "Avatar: The Last Airbender": lblText.setText("30 hrs 30 mins");
                time=31;
                    break;
                case "Lord of the Rings": lblText.setText("19 hrs 39 mins");
                time = 20;
                    break;
                case "Twilight": lblText.setText("10 hrs 6 mins");
                time=11;
                    break;
                default: lblText.setText("Select a movie from the list");
            } // end switch
        } // end if
    }


    } // end MovieList

   
 // end public class MovieLIst
