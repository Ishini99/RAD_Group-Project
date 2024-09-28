/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.internal;

import controller.CustomerController;
import controller.Tools;
import controller.ItemController;
import controller.OrderController;
import controller.OrderItemController;
import controller.Validator;
import java.awt.List;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Item;
import model.Order;
import model.OrderItem;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author sandakelum
 */
public class AddOrder extends javax.swing.JInternalFrame {

    ArrayList<Customer> customers;
    ArrayList<Item> items;
    DefaultTableModel model;

    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
        initComponents();
        customers = new ArrayList<Customer>();
        items = new ArrayList<Item>();
        AutoCompleteDecorator.decorate(comboCustomer);
        AutoCompleteDecorator.decorate(comboItem);
        loadData();
//        txtQuantity.setText("1");
        dpicDate.setDateFormatString("yyyy/MM/dd");
        dpicDate.setDate(new Date());

    }

    private void loadData() {
        CustomerController cc = new CustomerController();
        ItemController ic = new ItemController();
        customers = cc.loadCustomersAsArray();
        items = ic.loadItemsAsArray();

        for (Customer c : customers) {
            comboCustomer.addItem(c.name);
        }
        for (Item i : items) {
            comboItem.addItem(i.itemCode + " - " + i.itemName);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the For Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboCustomer = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        btnAddto = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        dpicDate = new com.toedter.calendar.JDateChooser();
        lblError = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 161, 240), 1, true));
        setClosable(true);
        setIconifiable(true);
        setTitle("Add new order");

        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInvoiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInvoice);

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVOICE");

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL = ");

        lblTotal.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monaco", 1, 13)); // NOI18N
        jLabel4.setText("Customer");

        jLabel5.setFont(new java.awt.Font("Monaco", 1, 13)); // NOI18N
        jLabel5.setText("Date");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Monaco", 1, 13)); // NOI18N
        jLabel6.setText("Item");

        jLabel7.setFont(new java.awt.Font("Monaco", 1, 13)); // NOI18N
        jLabel7.setText("Quantity");

        txtQuantity.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });

        btnAddto.setText("Add to invoice >>");
        btnAddto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(218, 57, 57));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear invoice");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(1, 84, 254));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save invoice");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        dpicDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dpicDatePropertyChange(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(238, 13, 13));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dpicDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(101, 101, 101))
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantity))
                            .addComponent(lblError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpicDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(lblError)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnSave))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dpicDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dpicDatePropertyChange
        if (dpicDate.getDate() != null) {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

//            System.out.println(dpicDate.getDate());
            lblDate.setText(df.format(dpicDate.getDate()).toString());
        }

    }//GEN-LAST:event_dpicDatePropertyChange

    private void btnAddtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoActionPerformed
        float total = 0;
        int i = comboItem.getSelectedIndex();
        int q = Integer.parseInt(txtQuantity.getText());
        model = (DefaultTableModel) tblInvoice.getModel();
        Vector v = new Vector();
        v.add(items.get(i).itemCode);
        v.add(items.get(i).itemName);
        v.add(q);
        v.add(items.get(i).price * q);
        model.addRow(v);

        for (int j = 0; j < model.getRowCount(); j++) {
            total = total + Float.parseFloat(model.getValueAt(j, 3).toString());
        }
        lblTotal.setText(Float.toString(total));
        txtQuantity.setText("");

//        System.out.println(items.get(i).itemCode);
    }//GEN-LAST:event_btnAddtoActionPerformed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        Validator vali = new Validator();
        ItemController ic = new ItemController();

        JTextField txts[] = {txtQuantity};
        JButton btns[] = {btnAddto, btnSave};
        vali.txtBoxIsEmpty(txts, btns);
        vali.txtMax(txtQuantity, 10);
        try {
            if (ic.checkItemQuantity(items.get(comboItem.getSelectedIndex()).itemCode, Integer.parseInt(txtQuantity.getText()))) {
                lblError.setText("");
                btnAddto.setEnabled(true);
            } else {
                lblError.setText("Item quantiry is not available");
                btnAddto.setEnabled(false);

            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_txtQuantityKeyReleased

    private void tblInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInvoiceMouseClicked
        float total = 0;
        int row = tblInvoice.getSelectedRow();
        model.removeRow(row);

        for (int j = 0; j < model.getRowCount(); j++) {
            total = total + Float.parseFloat(model.getValueAt(j, 3).toString());
        }
        lblTotal.setText(Float.toString(total));
    }//GEN-LAST:event_tblInvoiceMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        model.setRowCount(0);
        lblTotal.setText("0.0");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        ItemController ic = new ItemController();
        Tools t = new Tools();
        //update item quantity
        for (int i = 0; i < model.getRowCount(); i++) {
            ic.updateItemQuantity(model.getValueAt(i, 0).toString(), Integer.parseInt(model.getValueAt(i, 2).toString()));
        }
        //add order
        String oid = t.randomString(10);
        Order order = new Order(oid, customers.get(comboCustomer.getSelectedIndex()).id, lblDate.getText(), Float.parseFloat(lblTotal.getText()));
        OrderController oc = new OrderController(order);
        oc.orderSave();

        //add order items
        for (int i = 0; i < model.getRowCount(); i++) {
            OrderItem orderItem = new OrderItem(model.getValueAt(i, 0).toString(), oid, Integer.parseInt(model.getValueAt(i, 2).toString()));
            OrderItemController oic = new OrderItemController(orderItem);
            oic.orderItemSave();
        }

        model.setRowCount(0);
        lblTotal.setText("0.0");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddto;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboCustomer;
    private javax.swing.JComboBox<String> comboItem;
    private com.toedter.calendar.JDateChooser dpicDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

}
