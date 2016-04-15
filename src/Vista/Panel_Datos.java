/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jaki
 */
public class Panel_Datos extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Datos
     */
    public Panel_Datos() {
        initComponents();
    }
    
    public String[] agregarUsuario()
    {
        String array[]= new String [4];
        array[0]=this.jTextNumeroPrestamo.getText();
        array[1]=this.jTextNombreUsuario.getText();
        array[2]=this.jTextCedulaUsuario.getText();
        array[3]=this.jTextISBLibro.getText();
        return array;
        
    }
    public void generarCdigo()
    {
        for(int contador=000;contador<1000;contador++)
        {
            
                    
        }
    }
    public int devolverNuero()
    {
        return Integer.parseInt(this.jTextNumeroPrestamo.getText());
    }
    public void limpiarCampo()
    {
        this.jTextCedulaUsuario.setText("");
        this.jTextISBLibro.setText("");
        this.jTextNombreUsuario.setText("");
        this.jTextNumeroPrestamo.setText("");
    }
    
    public void deshabilitarCamposAgregar()
    {
        this.jTextCedulaUsuario.setEnabled(true);
        this.jTextISBLibro.setEnabled(true);
        this.jTextNombreUsuario.setEnabled(true);
  
    }
    
    public void deshablitarcampoBucar()
    {
        this.jTextCedulaUsuario.setEnabled(false);
        this.jTextISBLibro.setEnabled(false);
        this.jTextNombreUsuario.setEnabled(false);
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.jTextNombreUsuario.setText(arreglo[1]);
        this.jTextCedulaUsuario.setText(arreglo[2]);
        this.jTextISBLibro.setText(arreglo[3]);
    }
    
    public void modificarDatos ()
    {
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNumeroPrestamo = new javax.swing.JTextField();
        jTextNombreUsuario = new javax.swing.JTextField();
        jTextCedulaUsuario = new javax.swing.JTextField();
        jTextISBLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Número de Préstamo");

        jLabel2.setText("Nombre del Usuario");

        jLabel3.setText("Cédula del Ususario");

        jLabel4.setText("ISBN del Libro ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextISBLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextISBLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextCedulaUsuario;
    private javax.swing.JTextField jTextISBLibro;
    private javax.swing.JTextField jTextNombreUsuario;
    private javax.swing.JTextField jTextNumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
