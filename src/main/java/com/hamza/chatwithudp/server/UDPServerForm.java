/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hamza.chatwithudp.server;

import com.hamza.chatwithudp.client.ClientForm;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

public class UDPServerForm extends javax.swing.JFrame {

    private DatagramSocket server;
    private DatagramPacket receivePacket;
    private int serverPort;

    public UDPServerForm() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serberLabel = new javax.swing.JLabel();
        serverPortLable = new javax.swing.JLabel();
        txtServerPort = new javax.swing.JTextField();
        logLable = new javax.swing.JLabel();
        btnNewClient = new javax.swing.JButton();
        btnStartServer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        sendToServer = new javax.swing.JLabel();
        txtSendMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ServerFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 700));

        serberLabel.setBackground(new java.awt.Color(102, 102, 102));
        serberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serberLabel.setText("Server");

        serverPortLable.setText("Server Port : ");

        txtServerPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerPortActionPerformed(evt);
            }
        });

        logLable.setText("Log: ");

        btnNewClient.setText("New Client");
        btnNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewClientActionPerformed(evt);
            }
        });

        btnStartServer.setText("Start Server");
        btnStartServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartServerActionPerformed(evt);
            }
        });

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        sendToServer.setText("Send Message to Client : ");

        txtSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSendMessageActionPerformed(evt);
            }
        });

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(serberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnNewClient)
                        .addGap(26, 26, 26)
                        .addComponent(btnStartServer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sendToServer)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSend))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logLable)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(serverPortLable)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(4, 4, 4))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serberLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverPortLable)
                    .addComponent(txtServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewClient)
                    .addComponent(btnStartServer))
                .addGap(18, 18, 18)
                .addComponent(sendToServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Server");

        setSize(new java.awt.Dimension(510, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtServerPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServerPortActionPerformed

    private void btnNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewClientActionPerformed
        // TODO add your handling code here:
        new ClientForm().setVisible(true);
    }//GEN-LAST:event_btnNewClientActionPerformed

    private void btnStartServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartServerActionPerformed
        startServer();
    }//GEN-LAST:event_btnStartServerActionPerformed

    private void txtSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendMessageActionPerformed

    }//GEN-LAST:event_txtSendMessageActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
          // TODO add your handling code here:
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() {
                send();
                return null;
            }
        };
        worker.execute();
txtSendMessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void startServer() {
        try {
            serverPort = Integer.parseInt(txtServerPort.getText());
            server = new DatagramSocket(serverPort);
            txtLog.append("Server Started........\n");
            receivePacket = new DatagramPacket(new byte[1024], 1024);
            startListening();
            btnStartServer.setEnabled(false);
        } catch (IOException e) {
            txtLog.append("Error starting the server: " + e.getMessage() + "\n");
        }
    }

    private void send() {
        try {
            String message = txtSendMessage.getText();
            byte[] buffer = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, receivePacket.getAddress(), receivePacket.getPort());
            server.send(sendPacket);
            txtLog.append("Server sent: " + message + "\n");
        } catch (IOException e) {
            txtLog.append("Error sending message: " + e.getMessage() + "\n");
        }
    }
 private void startListening() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    server.receive(receivePacket);
                    String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    txtLog.append("Received from client: " + receivedMessage + "\n");
                } catch (IOException e) {
                    txtLog.append("Error receiving message: " + e.getMessage() + "\n");
                }
            }
        });
        thread.start();
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new UDPServerForm().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewClient;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnStartServer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logLable;
    private javax.swing.JLabel sendToServer;
    private javax.swing.JLabel serberLabel;
    private javax.swing.JLabel serverPortLable;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtSendMessage;
    private javax.swing.JTextField txtServerPort;
    // End of variables declaration//GEN-END:variables
}
