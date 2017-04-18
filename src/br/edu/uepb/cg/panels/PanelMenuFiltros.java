package br.edu.uepb.cg.panels;

import br.edu.uepb.cg.enums.FiltrosEnum;
import javax.swing.JRadioButton;

/**
 * Representa o menu para manipulação da circunferência
 *
 * @author Douglas Rafael
 */
public class PanelMenuFiltros extends javax.swing.JPanel {

    private static PanelMenuFiltros instance;
    private FiltrosEnum tipoAlgoritimo;

    public static synchronized PanelMenuFiltros getInstance() {
        if (instance == null) {
            instance = new PanelMenuFiltros();
        }
        return instance;
    }

    /**
     * Construtor
     */
    private PanelMenuFiltros() {
        initComponents();
    }

    public FiltrosEnum getTipoAlgoritimo() {
        if (rbMedia.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.MEDIA);
        } else if (rbMediana.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.MEDIANA);
        } else if (rbAltoReforco.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.ALTO_REFORCO);
        } else if (rbPassaAlta.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.PASSA_ALTA_BASICO);
        } else if (rbPrewitt.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.OPERADOR_PEWITT);
        } else if (rbRoberts.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.OPERADOR_ROBERTS);
        } else if (rbSobel.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.OPERADOR_SOBEL);
        } else if (rbRobertsCruzado.isSelected()) {
            setTipoAlgoritimo(FiltrosEnum.OPERADOR_ROBERTS_CRUZADO);
        }

        return tipoAlgoritimo;
    }

    public void setTipoAlgoritimo(FiltrosEnum tipoAlgoritimo) {
        this.tipoAlgoritimo = tipoAlgoritimo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFiltros = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbMedia = new javax.swing.JRadioButton();
        rbMediana = new javax.swing.JRadioButton();
        rbPassaAlta = new javax.swing.JRadioButton();
        rbRoberts = new javax.swing.JRadioButton();
        rbPrewitt = new javax.swing.JRadioButton();
        rbAltoReforco = new javax.swing.JRadioButton();
        rbSobel = new javax.swing.JRadioButton();
        rbRobertsCruzado = new javax.swing.JRadioButton();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        buttonGroupFiltros.add(rbMedia);
        rbMedia.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbMedia.setSelected(true);
        rbMedia.setText("Média");
        rbMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbMediana);
        rbMediana.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbMediana.setText("Mediana");
        rbMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbPassaAlta);
        rbPassaAlta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbPassaAlta.setText("Passa alta básico");
        rbPassaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbRoberts);
        rbRoberts.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbRoberts.setText("Operador de Robert’s");
        rbRoberts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbPrewitt);
        rbPrewitt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbPrewitt.setText("Operador de Prewitt");
        rbPrewitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbAltoReforco);
        rbAltoReforco.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbAltoReforco.setText("Alto Reforço (Hight-Boost)");
        rbAltoReforco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbSobel);
        rbSobel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbSobel.setText("Operador de Sobel");
        rbSobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrosSelect(evt);
            }
        });

        buttonGroupFiltros.add(rbRobertsCruzado);
        rbRobertsCruzado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rbRobertsCruzado.setText("Operador de Robert’s Cruzado");
        rbRobertsCruzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRobertsCruzadofiltrosSelect(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMedia)
                    .addComponent(rbMediana)
                    .addComponent(rbPassaAlta)
                    .addComponent(rbRoberts)
                    .addComponent(rbPrewitt)
                    .addComponent(rbAltoReforco)
                    .addComponent(rbSobel)
                    .addComponent(rbRobertsCruzado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPassaAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRoberts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbRobertsCruzado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPrewitt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAltoReforco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbSobel)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void filtrosSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosSelect
        JRadioButton radio = (JRadioButton) evt.getSource();
        PanelFiltros.getInstance().setTitle("Filtro de " + radio.getText());
    }//GEN-LAST:event_filtrosSelect

    private void rbRobertsCruzadofiltrosSelect(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRobertsCruzadofiltrosSelect
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRobertsCruzadofiltrosSelect


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFiltros;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton rbAltoReforco;
    private javax.swing.JRadioButton rbMedia;
    private javax.swing.JRadioButton rbMediana;
    private javax.swing.JRadioButton rbPassaAlta;
    private javax.swing.JRadioButton rbPrewitt;
    private javax.swing.JRadioButton rbRoberts;
    private javax.swing.JRadioButton rbRobertsCruzado;
    private javax.swing.JRadioButton rbSobel;
    // End of variables declaration//GEN-END:variables
}
