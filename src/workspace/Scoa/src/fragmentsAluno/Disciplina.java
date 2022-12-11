package fragmentsAluno;

import java.awt.Color;

@SuppressWarnings("serial")
public class Disciplina extends javax.swing.JInternalFrame {
	
	private javax.swing.JLabel jLabel1;
	
	public Disciplina(String nomeDisciplina) {
        initComponents(nomeDisciplina);
    }
	
	private void initComponents(String nomeDisciplina) {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Vai mostrar aqui os dados da disciplina "+nomeDisciplina);

        setPreferredSize(new java.awt.Dimension(1000, 538));
        setBackground(Color.WHITE);
        
        // tirando os padrões de efeito que já vem no JInternalFrame
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setBorder(null);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }
}