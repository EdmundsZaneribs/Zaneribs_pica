import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasutijumaSaraksts extends JFrame {
    public PasutijumaSaraksts() {
        setTitle("Pasūtījumu Saraksts");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(0, 2, 10, 5));

        JLabel vardsLabel = new JLabel("Vārds:");
        JTextField vardsField = new JTextField(20);
        JLabel uzvardsLabel = new JLabel("Uzvārds:");
        JTextField uzvardsField = new JTextField(20);
        JLabel talrunisLabel = new JLabel("Tālrunis:");
        JTextField talrunisField = new JTextField(20);
        JLabel adreseLabel = new JLabel("Adrese:");
        JTextField adreseField = new JTextField(20);

        JPanel sanemsanasPanelis = new JPanel(new GridLayout(2, 1));
        sanemsanasPanelis.setBorder(BorderFactory.createTitledBorder("Saņemšanas veids"));
        JRadioButton uzVietaRadio = new JRadioButton("Saņemt uz vietas");
        JRadioButton majasRadio = new JRadioButton("Saņemt mājās");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(uzVietaRadio);
        buttonGroup.add(majasRadio);
        uzVietaRadio.setSelected(true);
        sanemsanasPanelis.add(uzVietaRadio);
        sanemsanasPanelis.add(majasRadio);

        adreseLabel.setVisible(false);
        adreseField.setVisible(false);
        uzVietaRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adreseLabel.setVisible(false);
                adreseField.setVisible(false);
            }
        });
        majasRadio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adreseLabel.setVisible(true);
                adreseField.setVisible(true);
            }
        });

        JLabel miklasVeidsLabel = new JLabel("Mīklas veids:");
        String[] miklasVarianti = {"Klasiskā", "Plānā", "Pilngraudu"};
        JComboBox<String> miklasComboBox = new JComboBox<>(miklasVarianti);

        JLabel sieraVeidsLabel = new JLabel("Siera veids:");
        String[] sieraVarianti = {"Klasiskais siers", "Vegāniskais siers"};
        JComboBox<String> sieraComboBox = new JComboBox<>(sieraVarianti);

        JLabel picaLabel = new JLabel("Izvēlies picu:");
        String[] picas = {"Pepperoni", "Margarita", "Veģetāriešu"};
        JComboBox<String> picaComboBox = new JComboBox<>(picas);

        JLabel piedevasLabel = new JLabel("Piedevas:");
        JPanel piedevasPanel = new JPanel(new GridLayout(0, 1));
        piedevasPanel.setBorder(BorderFactory.createEtchedBorder());

        JCheckBox mocarellaCheckBox = new JCheckBox("Mocarella siers - 2.99 €");
        JCheckBox zilaisCheckBox = new JCheckBox("Zilais siers - 3.59 €");
        JCheckBox parmesanCheckBox = new JCheckBox("Parmesan siers - 5.59 €");
        JCheckBox fetaCheckBox = new JCheckBox("Feta siers - 3.59 €");
        JCheckBox tomātiCheckBox = new JCheckBox("Tomāti - 2.39 €");
        JCheckBox sarkanieSipoliCheckBox = new JCheckBox("Sarkanie sīpoli - 0.99 €");
        JCheckBox paprikaCheckBox = new JCheckBox("Paprika - 2.39 €");
        JCheckBox extraVeganiskaisSiersCheckBox = new JCheckBox("Extra vegāniskais siers");
        JCheckBox oreganoCheckBox = new JCheckBox("Oregano - 0.00 €");
        JCheckBox melniePipariCheckBox = new JCheckBox("Melnie pipari - 0.00 €");
        JCheckBox bbqMercesCheckBox = new JCheckBox("BBQ mērce - 1.89 €");
        JCheckBox zalieLociniCheckBox = new JCheckBox("Zaļie lociņi - 0.99 €");
        JCheckBox dillesCheckBox = new JCheckBox("Dilles - 0.69 €");
        JCheckBox salamiCheckBox = new JCheckBox("Salami desa 4.19 €");
        JCheckBox bekonsCheckBox = new JCheckBox("Bekons 4.39 €");
        JCheckBox skinkisCheckBox = new JCheckBox("Šķiņķis 4.39 €");
        JCheckBox vistasFilejaCheckBox = new JCheckBox("Vistas fileja 4.79 €");
        JCheckBox konservetiAnanasiCheckBox = new JCheckBox("Konservēti ananāsi 2.39 €");
        JCheckBox zalasOlīvasCheckBox = new JCheckBox("Zaļās olīvas 2.39 €");
        JCheckBox petersiljiCheckBox = new JCheckBox("Pētersīļi 0.69 €");
        JCheckBox svaigiSpinatiCheckBox = new JCheckBox("Svaigi spināti 1.89 €");
        JCheckBox mazsalitsLasisCheckBox = new JCheckBox("Mazsālīts lasis 6.19 €");
        JCheckBox marineitiGurkiCheckBox = new JCheckBox("Marinēti gurķi 2.39 €");
        JCheckBox jaunlopaMaltaGalaCheckBox = new JCheckBox("Jaunlopa maltā gaļa 5.69 €");
        JCheckBox liellopaSkinkisCheckBox = new JCheckBox("Liellopa šķiņķis 5.69 €");
        JCheckBox kukuruzaCheckBox = new JCheckBox("Kukurūza 1.89 €");
        JCheckBox kirsuTomatiCheckBox = new JCheckBox("Ķiršu tomāti 2.69 €");

        piedevasPanel.add(mocarellaCheckBox);
        piedevasPanel.add(zilaisCheckBox);
        piedevasPanel.add(parmesanCheckBox);
        piedevasPanel.add(fetaCheckBox);
        piedevasPanel.add(tomātiCheckBox);
        piedevasPanel.add(sarkanieSipoliCheckBox);
        piedevasPanel.add(paprikaCheckBox);
        piedevasPanel.add(extraVeganiskaisSiersCheckBox);
        piedevasPanel.add(oreganoCheckBox);
        piedevasPanel.add(melniePipariCheckBox);
        piedevasPanel.add(bbqMercesCheckBox);
        piedevasPanel.add(zalieLociniCheckBox);
        piedevasPanel.add(dillesCheckBox);
        piedevasPanel.add(salamiCheckBox);
        piedevasPanel.add(bekonsCheckBox);
        piedevasPanel.add(skinkisCheckBox);
        piedevasPanel.add(vistasFilejaCheckBox);
        piedevasPanel.add(konservetiAnanasiCheckBox);
        piedevasPanel.add(zalasOlīvasCheckBox);
        piedevasPanel.add(petersiljiCheckBox);
        piedevasPanel.add(svaigiSpinatiCheckBox);
        piedevasPanel.add(mazsalitsLasisCheckBox);
        piedevasPanel.add(marineitiGurkiCheckBox);
        piedevasPanel.add(jaunlopaMaltaGalaCheckBox);
        piedevasPanel.add(liellopaSkinkisCheckBox);
        piedevasPanel.add(kukuruzaCheckBox);
        piedevasPanel.add(kirsuTomatiCheckBox);

        JScrollPane piedevasScrollPane = new JScrollPane(piedevasPanel);

        JButton pasutitButton = new JButton("Pasūtīt picu");
        pasutitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double summa = 0.0;
                summa += mocarellaCheckBox.isSelected() ? 2.99 : 0.0;
                summa += zilaisCheckBox.isSelected() ? 3.59 : 0.0;
                summa += parmesanCheckBox.isSelected() ? 5.59 : 0.0;
                summa += fetaCheckBox.isSelected() ? 3.59 : 0.0;
                summa += tomātiCheckBox.isSelected() ? 2.39 : 0.0;
                summa += sarkanieSipoliCheckBox.isSelected() ? 0.99 : 0.0;
                summa += paprikaCheckBox.isSelected() ? 2.39 : 0.0;
                summa += bbqMercesCheckBox.isSelected() ? 1.89 : 0.0;
                summa += zalieLociniCheckBox.isSelected() ? 0.99 : 0.0;
                summa += dillesCheckBox.isSelected() ? 0.69 : 0.0;
                summa += salamiCheckBox.isSelected() ? 4.19 : 0.0;
                summa += bekonsCheckBox.isSelected() ? 4.39 : 0.0;
                summa += skinkisCheckBox.isSelected() ? 4.39 : 0.0;
                summa += vistasFilejaCheckBox.isSelected() ? 4.79 : 0.0;
                summa += konservetiAnanasiCheckBox.isSelected() ? 2.39 : 0.0;
                summa += zalasOlīvasCheckBox.isSelected() ? 2.39 : 0.0;
                summa += petersiljiCheckBox.isSelected() ? 0.69 : 0.0;
                summa += svaigiSpinatiCheckBox.isSelected() ? 1.89 : 0.0;
                summa += mazsalitsLasisCheckBox.isSelected() ? 6.19 : 0.0;
                summa += marineitiGurkiCheckBox.isSelected() ? 2.39 : 0.0;
                summa += jaunlopaMaltaGalaCheckBox.isSelected() ? 5.69 : 0.0;
                summa += liellopaSkinkisCheckBox.isSelected() ? 5.69 : 0.0;
                summa += kukuruzaCheckBox.isSelected() ? 1.89 : 0.0;
                summa += kirsuTomatiCheckBox.isSelected() ? 2.69 : 0.0;

                summa = Math.round(summa * 100.0) / 100.0;

                JOptionPane.showMessageDialog(PasutijumaSaraksts.this, "Pica pasūtīta!\nSumma: " + summa + " €");

                vardsField.setText("");
                uzvardsField.setText("");
                adreseField.setText("");
                talrunisField.setText("");
            }
        });

        JLabel izmersLabel = new JLabel("Izvēlies izmēru (cm):");
        String[] izmēri = {"30", "45", "60"};
        JComboBox<String> izmersComboBox = new JComboBox<>(izmēri);

        inputPanel.add(vardsLabel);
        inputPanel.add(vardsField);
        inputPanel.add(uzvardsLabel);
        inputPanel.add(uzvardsField);
        inputPanel.add(talrunisLabel);
        inputPanel.add(talrunisField);
        inputPanel.add(adreseLabel);
        inputPanel.add(adreseField);
        inputPanel.add(new JLabel());
        inputPanel.add(sanemsanasPanelis);
        inputPanel.add(miklasVeidsLabel);
        inputPanel.add(miklasComboBox);
        inputPanel.add(sieraVeidsLabel);
        inputPanel.add(sieraComboBox);
        inputPanel.add(picaLabel);
        inputPanel.add(picaComboBox);
        inputPanel.add(piedevasLabel);
        inputPanel.add(piedevasScrollPane);
        inputPanel.add(izmersLabel);
        inputPanel.add(izmersComboBox);
        inputPanel.add(new JLabel());
        inputPanel.add(pasutitButton);
        
        pasutitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pasutijumaLaiks = java.time.LocalDateTime.now().toString();

                String vards = vardsField.getText();
                String uzvards = uzvardsField.getText();
                String adrese = adreseField.getText();
                String sanemsanasVeids = uzVietaRadio.isSelected() ? "Saņemt uz vietas" : "Saņemt mājās";
                String miklasVeids = (String) miklasComboBox.getSelectedItem();
                String sieraVeids = (String) sieraComboBox.getSelectedItem();
                String izveletaPica = (String) picaComboBox.getSelectedItem();
                String izmers = (String) izmersComboBox.getSelectedItem();

                StringBuilder chekaTeksts = new StringBuilder();
                chekaTeksts.append("Pasūtīšanas laiks: ").append(pasutijumaLaiks).append("\n");
                chekaTeksts.append("Vārds: ").append(vards).append("\n");
                chekaTeksts.append("Uzvārds: ").append(uzvards).append("\n");
                chekaTeksts.append("Adrese: ").append(adrese).append("\n");
                chekaTeksts.append("Saņemšanas veids: ").append(sanemsanasVeids).append("\n");
                chekaTeksts.append("Mīklas veids: ").append(miklasVeids).append("\n");
                chekaTeksts.append("Siera veids: ").append(sieraVeids).append("\n");
                chekaTeksts.append("Izvēlētā pica: ").append(izveletaPica).append("\n");
                chekaTeksts.append("Izmērs: ").append(izmers).append(" cm").append("\n");

                JOptionPane.showMessageDialog(PasutijumaSaraksts.this, chekaTeksts.toString(), "Pasūtījuma čeks", JOptionPane.INFORMATION_MESSAGE);

                vardsField.setText("");
                uzvardsField.setText("");
                adreseField.setText("");
                talrunisField.setText("");
            }
        });

        JButton notiritButton = new JButton("Notīrīt");
        notiritButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vardsField.setText("");
                uzvardsField.setText("");
                adreseField.setText("");
                talrunisField.setText("");
                Component[] components = piedevasPanel.getComponents();
                for (Component component : components) {
                    if (component instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) component;
                        checkBox.setSelected(false);
                    }
                }
            }
        });
        inputPanel.add(notiritButton);

        JButton aizvertButton = new JButton("Aizvērt");
        aizvertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        inputPanel.add(aizvertButton);
        panel.add(inputPanel, BorderLayout.CENTER);
        add(panel);
        
        ImageIcon picaIcon = new ImageIcon("pica.png");
        JLabel picaLabelTop = new JLabel(picaIcon);
        add(picaLabelTop, BorderLayout.NORTH);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	PasutijumaSaraksts frame = new PasutijumaSaraksts();
                frame.setVisible(true);
            }
        });
    }
}