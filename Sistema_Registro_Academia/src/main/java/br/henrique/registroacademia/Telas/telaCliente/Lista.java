//Nome: Henrique Cesar Nogarini de Carvalho   RA: 2102374
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.henrique.registroacademia.Telas.telaCliente;

import br.henrique.registroacademia.Academia;
import br.henrique.registroacademia.Cliente;
import br.henrique.registroacademia.GenCliente;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nchen
 */
public class Lista extends javax.swing.JFrame {

    /**
     * Creates new form Lista
     */
    public Lista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Lista Cliente");
        attLista();
        fechar();
    }
    
    private void attLista(){
        DefaultTableModel modelo = (DefaultTableModel)ListaTable.getModel();
        GenCliente clienteGen = Academia.gerenciaC;
        for(int i=0;i<clienteGen.getListaCliente().size();i++){
            Cliente clientao = clienteGen.getListaCliente().get(i);
            modelo.addRow(new Object[]{clientao.getNome(),clientao.getRG(),clientao.getTelefone(),clientao.getTipodeplano(),clientao.getMeta().getObjetivo(),
            clientao.getMeta().getTempodetreino(),clientao.getDadosCorporais().getAltura(),clientao.getDadosCorporais().getPeso(),clientao.getDadosCorporais().getGordura()
            ,clientao.getMeta().isPersonal()?"Sim":"Não",clientao.getDadosCorporais().getTipodeteste(),clientao.getEndereco().getCidade(),clientao.getEndereco().getRua()
            ,clientao.getEndereco().getBairro(),clientao.getEndereco().getNumero()});
        }
    }
    
    private void fechar(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                new FormCliente().setVisible(true);
                dispose();
            }
            
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "Telefone", "Tipo de Plano", "Objetivo", "Tempo de Treino", "Altura", "Peso", "Gordura", "Personal", "Tipo de Teste", "Cidade", "Rua", "Bairro", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ListaTable);
        if (ListaTable.getColumnModel().getColumnCount() > 0) {
            ListaTable.getColumnModel().getColumn(0).setResizable(false);
            ListaTable.getColumnModel().getColumn(1).setResizable(false);
            ListaTable.getColumnModel().getColumn(2).setResizable(false);
            ListaTable.getColumnModel().getColumn(3).setResizable(false);
            ListaTable.getColumnModel().getColumn(4).setResizable(false);
            ListaTable.getColumnModel().getColumn(5).setResizable(false);
            ListaTable.getColumnModel().getColumn(6).setResizable(false);
            ListaTable.getColumnModel().getColumn(7).setResizable(false);
            ListaTable.getColumnModel().getColumn(8).setResizable(false);
            ListaTable.getColumnModel().getColumn(9).setResizable(false);
            ListaTable.getColumnModel().getColumn(10).setResizable(false);
            ListaTable.getColumnModel().getColumn(11).setResizable(false);
            ListaTable.getColumnModel().getColumn(12).setResizable(false);
            ListaTable.getColumnModel().getColumn(13).setResizable(false);
            ListaTable.getColumnModel().getColumn(14).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes Cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
