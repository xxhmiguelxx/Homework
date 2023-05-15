import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {


    private JLabel lblid;
    private JLabel lblnombre;
    private JLabel lblgenero;
    private JLabel lblpeso;
    private JLabel lblplataforma;
    private JLabel lbldesarrollador;
    private JTextField txtid;
    private JTextField txtnombre;
    private JTextField txtgenero;
    private JTextField txtpeso;
    private JTextField txtplataforma;
    private JTextField txtdesarrollador;
    private JButton btnagregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTableJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout=new GridLayout(2,1);

        this.setLayout(layout);

        //panel1
        panel1=new JPanel(new FlowLayout());
        panel1.setBackground(new Color(188,227,166));
        lblid=new JLabel("Id.");
        txtid=new JTextField(4);


        panel1.add(lblid);
        panel1.add(txtid);

        lblnombre=new JLabel("Nombre: ");
        txtnombre=new JTextField(30);
        panel1.add(lblnombre);
        panel1.add(txtnombre);

        lblgenero=new JLabel("Genero: ");
        txtgenero=new JTextField(15);
        panel1.add(lblgenero);
        panel1.add(txtgenero);

        lblpeso=new JLabel("Peso: ");
        txtpeso=new JTextField(5);
        panel1.add(lblpeso);
        panel1.add(txtpeso);

        lblplataforma=new JLabel("Plataforma: ");
        txtplataforma=new JTextField(15);
        panel1.add(lblplataforma);
        panel1.add(txtplataforma);

        lbldesarrollador=new JLabel("Desarrollador: ");
        txtdesarrollador=new JTextField(25);
        panel1.add(lbldesarrollador);
        panel1.add(txtdesarrollador);

        btnagregar=new JButton("Agregar juego");
        panel1.add(btnagregar);

        this.getContentPane().add(panel1,0);

        //panel2
        panel2=new JPanel(new FlowLayout());
        panel2.setBackground(new Color(201,195,241));

        info=new ArrayList<>();
        info.add(new Videojuego(1,"League Of Legends","MOBA",4.5,"Windows y MAC","Riot"));

        modelo=new ModeloTableJuego(info);
        tblTabla=new JTable(modelo);
        scroll=new JScrollPane(tblTabla);
        panel2.add(scroll);

        this.getContentPane().add(panel2,1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnagregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Videojuego nuevo=new Videojuego();
                nuevo.setId(Integer.parseInt(txtid.getText()));
                nuevo.setNombre(txtnombre.getText());
                nuevo.setGenero(txtgenero.getText());
                nuevo.setPesoEnGB(Double.parseDouble(txtpeso.getText()));
                nuevo.setPlataforma(txtplataforma.getText());
                nuevo.setDesarrollador(txtdesarrollador.getText());

                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });

        this.setVisible(true);


    }
}

