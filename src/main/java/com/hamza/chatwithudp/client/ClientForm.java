 
package com.hamza.chatwithudp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import javax.swing.JFrame;
import javax.swing.SwingWorker;

/**
 *
 * @author hamza
 */
public class ClientForm extends JFrame {

    DatagramSocket client;
    InetAddress serverAddress;
    int serverPort;
    int clientPort;

    public ClientForm() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientlable = new javax.swing.JLabel();
        serverPortLable = new javax.swing.JLabel();
        txtServerPort = new javax.swing.JTextField();
        clientPortlable = new javax.swing.JLabel();
        txtClientPort = new javax.swing.JTextField();
        hostNamelable = new javax.swing.JLabel();
        txtHostName = new javax.swing.JTextField();
        logLable = new javax.swing.JLabel();
        sendToServer = new javax.swing.JLabel();
        txtSendMessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("ClientFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(471, 413));

        clientlable.setBackground(new java.awt.Color(255, 204, 0));
        clientlable.setForeground(new java.awt.Color(51, 0, 255));
        clientlable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientlable.setText("Client");

        serverPortLable.setText("Server Port : ");

        txtServerPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServerPortActionPerformed(evt);
            }
        });

        clientPortlable.setText("Client Port : ");

        txtClientPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientPortActionPerformed(evt);
            }
        });

        hostNamelable.setText("Host Name");

        txtHostName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHostNameActionPerformed(evt);
            }
        });

        logLable.setText("Log: ");

        sendToServer.setText("Send Message to Server : ");

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

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clientlable, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(serverPortLable)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(clientPortlable)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtClientPort, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hostNamelable)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHostName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSend)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(logLable)
                                            .addComponent(sendToServer)
                                            .addComponent(txtSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientlable)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverPortLable)
                    .addComponent(txtServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientPortlable)
                    .addComponent(txtClientPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostNamelable)
                    .addComponent(txtHostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendToServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSend)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Client");

        setSize(new java.awt.Dimension(510, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtServerPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServerPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServerPortActionPerformed

    private void txtClientPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientPortActionPerformed

    private void txtHostNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHostNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHostNameActionPerformed

    private void txtSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSendMessageActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            @Override
            protected Void doInBackground() {
                sendMessageToServer();
                return null;
            }
        };
        worker.execute();
    recievedMessage();
    txtSendMessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void sendMessageToServer() {
        initPort();
        try {
            String message = txtSendMessage.getText();
            String messageToSend = clientPort + "." + txtHostName.getText() + "." + message;
            byte[] buffer = messageToSend.getBytes(StandardCharsets.UTF_8);
        
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, serverPort);
            client.send(packet);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void recievedMessage() {
        try {
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            client.receive(receivePacket);

            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);

            txtLog.append("Server said: " + receivedMessage + System.lineSeparator());
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    private void initPort() {
        try {
            clientPort = Integer.parseInt(txtClientPort.getText());
            client = new DatagramSocket(clientPort);
        } catch (NumberFormatException | SocketException ex) {
            ex.printStackTrace();
        }
        serverPort = Integer.parseInt(txtServerPort.getText());

        try {
            serverAddress = InetAddress.getByName(txtHostName.getText());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ClientForm().setVisible(true);

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel clientPortlable;
    private javax.swing.JLabel clientlable;
    private javax.swing.JLabel hostNamelable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logLable;
    private javax.swing.JLabel sendToServer;
    private javax.swing.JLabel serverPortLable;
    private javax.swing.JTextField txtClientPort;
    private javax.swing.JTextField txtHostName;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtSendMessage;
    private javax.swing.JTextField txtServerPort;
    // End of variables declaration//GEN-END:variables
}
