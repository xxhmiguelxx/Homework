package org.example.vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class VentanaGastronomia extends JFrame {

    //ETIQUETAS

    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblOrigen;
    private JLabel lblEtimologia;
    private JLabel lblAparicion;
    private JLabel lblUrl;

    //CAPTURA DE TEXTO

    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtOrigen;
    private JTextField txtEtimologia;
    private JTextField txtAparicion;
    private JTextField txtUrl;

    //PANELES
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    //TABLA Y CONTROLADOR
    private JTable tblGastronomia;
    private JScrollPane scrollPane;

    //BOTONES
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnEliminar;

    //LAYOUT
    private GridLayout layout;

    //IMAGEN
    private JLabel imagenGastronomia; //PANEL 3

    //INFO PANEL 4


    public VentanaGastronomia(String title) throws HeadlessException {
        super(title);

        this.setSize(800,800);

        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //PANEL 1 - INGRESAR DATOS
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(169, 255, 245));

        lblId = new JLabel("ID:");
        lblNombre = new JLabel("Nombre:");
        lblOrigen = new JLabel("Lugar de origen:");
        lblEtimologia = new JLabel("Etimologia:");
        lblAparicion = new JLabel("Fecha o siglo de aparicion:");
        lblUrl = new JLabel("URL de imagen:");

        txtId = new JTextField(1);
        txtId.setText("0");
        txtId.setEnabled(false); //NO RECIBE DATOS
        txtNombre = new JTextField(20);
        txtOrigen = new JTextField(20);
        txtEtimologia = new JTextField(20);
        txtAparicion = new JTextField(20);
        txtUrl = new JTextField(20);


        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblOrigen);
        panel1.add(txtOrigen);
        panel1.add(lblEtimologia);
        panel1.add(txtEtimologia);
        panel1.add(lblAparicion);
        panel1.add(txtAparicion);
        panel1.add(lblUrl);
        panel1.add(txtUrl);

        panel1.add(btnAgregar);


        //PANEL 2 - TABLA CON DATOS
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(169, 255, 177));

        tblGastronomia = new JTable(); //TABLA
        scrollPane = new JScrollPane(tblGastronomia);
        btnCargar = new JButton("Cargar");

        panel2.add(scrollPane);
        panel2.add(btnCargar);

        //PANEL 3 - IMAGEN


        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(242, 255, 169));
        imagenGastronomia=new JLabel("");


        panel3.add(imagenGastronomia);
        //IMAGEN

        String urlPanel3 = txtUrl.getText();
        try {

            URL url= new URL(urlPanel3);
            Image image = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(image);

            imagenGastronomia = new JLabel(imageIcon);

            panel3.add(imagenGastronomia);

        }catch (MalformedURLException mue){
            System.out.println("URL no valida");
        }catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }



        //PANEL 4 - ACTUALIZAR TABLA CON DATOS
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(255, 221, 169));



        btnActualizar = new JButton("Actualizar");
        panel4.add(btnActualizar);
        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);





        //ADD

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        //CIERRE

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //METODOS DE ACCESO


    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblOrigen() {
        return lblOrigen;
    }

    public void setLblOrigen(JLabel lblOrigen) {
        this.lblOrigen = lblOrigen;
    }

    public JLabel getLblEtimologia() {
        return lblEtimologia;
    }

    public void setLblEtimologia(JLabel lblEtimologia) {
        this.lblEtimologia = lblEtimologia;
    }

    public JLabel getLblAparicion() {
        return lblAparicion;
    }

    public void setLblAparicion(JLabel lblAparicion) {
        this.lblAparicion = lblAparicion;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtOrigen() {
        return txtOrigen;
    }

    public void setTxtOrigen(JTextField txtOrigen) {
        this.txtOrigen = txtOrigen;
    }

    public JTextField getTxtEtimologia() {
        return txtEtimologia;
    }

    public void setTxtEtimologia(JTextField txtEtimologia) {
        this.txtEtimologia = txtEtimologia;
    }

    public JTextField getTxtAparicion() {
        return txtAparicion;
    }

    public void setTxtAparicion(JTextField txtAparicion) {
        this.txtAparicion = txtAparicion;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JTable getTblGastronomia() {
        return tblGastronomia;
    }

    public void setTblGastronomia(JTable tblGastronomia) {
        this.tblGastronomia = tblGastronomia;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getImagenGastronomia() {
        return imagenGastronomia;
    }

    public void setImagenGastronomia(JLabel imagenGastronomia) {
        this.imagenGastronomia = imagenGastronomia;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }


    //LIMPIAR
    public void limpiar(){
        txtNombre.setText("");
        txtOrigen.setText("");
        txtEtimologia.setText("");
        txtAparicion.setText("");
        txtUrl.setText("");
    }
}
