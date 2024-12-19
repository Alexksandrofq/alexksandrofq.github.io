import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrimeiraTela extends JFrame {
    private final JLabel lblFelizNatal;
    private final JLabel lblLista;
    private final JButton btnClicaAqui;


    public PrimeiraTela() {
        super("Tela Para lista");
        setLayout(new GridLayout(3, 2,2,2));

        lblFelizNatal = new JLabel("Feliz Natal");
        add(lblFelizNatal);

        lblLista = new JLabel("Lista do que me presentear");
        add(lblLista);

        btnClicaAqui = new JButton("Clica Aqui");
        add(btnClicaAqui);



        setSize(250,250);
        setVisible(true);



    }




    public static void main (String[] args) {
        PrimeiraTela appPrimeiraTela = new PrimeiraTela();
        appPrimeiraTela.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

