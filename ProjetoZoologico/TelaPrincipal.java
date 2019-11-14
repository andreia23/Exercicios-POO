 
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
public class TelaPrincipal {
 
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JButton button;
    private JButton button_1;
    private JTextArea textArea;
    private JButton button_2;
    private JLabel label;
    private JLabel label_1;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JScrollPane scrollPane;
    private JButton button_6;
    private JButton button_7;
    private JTextField textField_2;
    private JButton button_8;
    private JLabel label_2;
    private Zoologico zoo;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaPrincipal window = new TelaPrincipal();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the application.
     */
    public TelaPrincipal() {
        initialize();
    }
 
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent arg0) {
                zoo = new Zoologico();
                Animal a1,a2,a3,a4;
                a1 = new Animal("fifi", 3.0) ;
                a2 = new Animal("rex", 12.0) ;
                a3 = new Animal("felix", 5.0) ;
                a4 = new Animal("toto", 15.0) ;
                zoo.adicionar(a1);
                zoo.adicionar(a2);
                zoo.adicionar(a3);
                zoo.adicionar(a4);
                JOptionPane.showMessageDialog(null,"zoologico criado");
            }
        });
        frame.setTitle("Controle de Animais do Zoologico");
        frame.setBounds(100, 100, 493, 303);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
 
        textField = new JTextField();
        textField.setBounds(66, 32, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
 
        textField_1 = new JTextField();
        textField_1.setBounds(66, 63, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
 
        button = new JButton("adicionar");
        button.setToolTipText("adicionar um animal no zoologico");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty())
                    label_2.setText("campo vazio");
                else {
                    Animal a = zoo.localizar(textField.getText());
                    if (a==null) {
                        //criar objeto Animal e adiciona-lo ao Zoologico
                        String nome = textField.getText();
                        double peso = Double.parseDouble(textField_1.getText());
 
                        zoo.adicionar( new Animal(nome,peso) );
                        label_2.setText("animal adicionado");
                    }
                    else {
                        label_2.setText("animal ja existe no zoologico");
                    }
 
                }
            }
        });
        button.setBounds(162, 31, 89, 23);
        frame.getContentPane().add(button);
 
        button_1 = new JButton("localizar");
        button_1.setToolTipText("localizar pelo nome");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty())
                    label_2.setText("campo vazio");
                else {
                    Animal a = zoo.localizar(textField.getText());
                    if (a!= null) {
                        textField_1.setText( a.getPeso() +"");
                        label_2.setText("animal localizado");
                    }
                    else {
                        label_2.setText("animal inexistene");
                    }
                }
            }
        });
        button_1.setBounds(261, 31, 89, 23);
        frame.getContentPane().add(button_1);
 
        scrollPane = new JScrollPane();
        scrollPane.setBounds(27, 131, 258, 95);
        frame.getContentPane().add(scrollPane);
 
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
 
        button_2 = new JButton("listar");
        button_2.setToolTipText("todos os animais do zoologico");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for(Animal  a : zoo.getAnimais())
                    textArea.append(a + "\n");
 
            }
        });
        button_2.setBounds(295, 131, 113, 23);
        frame.getContentPane().add(button_2);
 
        label = new JLabel("nome");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setBounds(10, 35, 46, 14);
        frame.getContentPane().add(label);
 
        label_1 = new JLabel("peso");
        label_1.setHorizontalAlignment(SwingConstants.RIGHT);
        label_1.setBounds(10, 66, 46, 14);
        frame.getContentPane().add(label_1);
 
        button_3 = new JButton("alterar");
        button_3.setToolTipText("alterar peso");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (textField.getText().isEmpty() || textField_1.getText().isEmpty())
                    label_2.setText("campo vazio");
                else {
                    Animal a = zoo.localizar(textField.getText());
                    if (a!= null) {
                        a.setPeso(Double.parseDouble(textField_1.getText()));
                        label_2.setText("peso alterado");
                    }
                    else {
                        label_2.setText("animal inexistente");
                    }
 
                }
            }
        });
        button_3.setBounds(162, 62, 89, 23);
        frame.getContentPane().add(button_3);
 
        button_4 = new JButton("remover");
        button_4.setToolTipText("remover animal do zoologico");
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().isEmpty())
                    label_2.setText("campo vazio");
                else {
                    Animal a = zoo.localizar(textField.getText());
                    if (a!= null) {
                        zoo.remover(a);
                        label_2.setText("animal removido");
                    }
                    else {
                        label_2.setText("animal inexistente");
                    }
 
                    button_5.doClick();
                }
            }
        });
        button_4.setBounds(261, 62, 89, 23);
        frame.getContentPane().add(button_4);
 
        button_5 = new JButton("limpar");
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
                textArea.setText("");
                label_2.setText("");
            }
        });
        button_5.setToolTipText("remover animal do zoologico");
        button_5.setBounds(360, 46, 89, 23);
        frame.getContentPane().add(button_5);
 
        button_6 = new JButton("peso medio");
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textArea.setText("");
                ///textArea.append("peso medio="+zoo.getPesoMedio());
            }
        });
        button_6.setBounds(295, 154, 114, 23);
        frame.getContentPane().add(button_6);
 
        button_7 = new JButton("peso <");
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                double peso = Double.parseDouble(textField_2.getText());
                //for(Animal  a : zoo.consultarAnimaisAbaixoPeso(peso))
                        //textArea.append(a + "\n");
            }
        });
                button_7.setBounds(295, 202, 86, 23);
                frame.getContentPane().add(button_7);
 
                textField_2 = new JTextField();
                textField_2.setBounds(383, 202, 25, 24);
                frame.getContentPane().add(textField_2);
                textField_2.setColumns(10);
 
                button_8 = new JButton("grandinhos");
                button_8.setToolTipText("com peso acima da m\u00E9dia");
                button_8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textArea.setText("");
                        /*if(zoo.consultarGrandinhos().isEmpty())
                            textArea.append( "sem resultados");
                        else
                            for(Animal  a : zoo.consultarGrandinhos())
                                textArea.append(a + "\n");*/
                    }
                });
                button_8.setBounds(295, 178, 113, 23);
                frame.getContentPane().add(button_8);
 
                label_2 = new JLabel("mensagem:");
                label_2.setBounds(29, 94, 352, 14);
                frame.getContentPane().add(label_2);
    }
}