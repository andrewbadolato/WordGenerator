
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;


public class WordGenerator extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	
	//GUI elements
	private JButton btnGenerate;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JScrollPane jScrollPane5;
	private JScrollPane jScrollPane6;
	private JScrollPane jScrollPane7;
	private JScrollPane jScrollPane8;
	private JLabel lblFive;
	private JLabel lblFour;
	private JLabel lblNumResults;
	private JLabel lblOne;
	private JLabel lblPatterns;
	private JLabel lblResults;
	private JLabel lblSix;
	private JLabel lblThree;
	private JLabel lblTwo;
	private JTextArea txtFive;
	private JTextArea txtFour;
	private JTextField txtNumResults;
	private JTextArea txtOne;
	private JTextArea txtPatterns;
	private JTextArea txtResults;
	private JTextArea txtSix;
	private JTextArea txtThree;
	private JTextArea txtTwo;

	//New Values object
	private int defNumResults = 1;
	Values val = new Values(defNumResults);

	public WordGenerator() {
		initComponents();
	}

	private void initComponents() {

		jMenuItem1 = new javax.swing.JMenuItem();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		txtOne = new javax.swing.JTextArea();
		lblOne = new javax.swing.JLabel();
		lblThree = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		txtThree = new javax.swing.JTextArea();
		jScrollPane3 = new javax.swing.JScrollPane();
		txtFive = new javax.swing.JTextArea();
		lblFive = new javax.swing.JLabel();
		lblTwo = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		txtTwo = new javax.swing.JTextArea();
		jScrollPane5 = new javax.swing.JScrollPane();
		txtPatterns = new javax.swing.JTextArea();
		lblPatterns = new javax.swing.JLabel();
		jScrollPane6 = new javax.swing.JScrollPane();
		txtSix = new javax.swing.JTextArea();
		lblSix = new javax.swing.JLabel();
		jScrollPane8 = new javax.swing.JScrollPane();
		txtFour = new javax.swing.JTextArea();
		lblFour = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		lblNumResults = new javax.swing.JLabel();
		txtNumResults = new javax.swing.JTextField();
		jScrollPane7 = new javax.swing.JScrollPane();
		txtResults = new javax.swing.JTextArea();
		btnGenerate = new javax.swing.JButton();
		lblResults = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();

		jMenuItem1.setText("jMenuItem1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		txtOne.setColumns(20);
		txtOne.setRows(5);
		jScrollPane1.setViewportView(txtOne);

		lblOne.setText("Beginning Consonants (1):");

		lblThree.setText("Mid-word Consonants (3):");

		txtThree.setColumns(20);
		txtThree.setRows(5);
		jScrollPane2.setViewportView(txtThree);

		txtFive.setColumns(20);
		txtFive.setRows(5);
		jScrollPane3.setViewportView(txtFive);

		lblFive.setText("Ending Consonants (5):");

		lblTwo.setText("Beginning Vowels (2):");

		txtTwo.setColumns(20);
		txtTwo.setRows(5);
		jScrollPane4.setViewportView(txtTwo);

		txtPatterns.setColumns(20);
		txtPatterns.setRows(5);
		jScrollPane5.setViewportView(txtPatterns);

		lblPatterns.setText("Possible Patterns:");

		txtSix.setColumns(20);
		txtSix.setRows(5);
		jScrollPane6.setViewportView(txtSix);

		lblSix.setText("Ending Vowels (6):");

		txtFour.setColumns(20);
		txtFour.setRows(5);
		jScrollPane8.setViewportView(txtFour);

		lblFour.setText("Mid-word Vowels (4):");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOne)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFive))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblSix).addComponent(lblTwo)
								.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lblThree))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jScrollPane8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(lblFour)))
										.addComponent(jScrollPane5))
								.addComponent(lblPatterns))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblOne).addComponent(lblTwo).addComponent(lblThree).addComponent(lblFour))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup()
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPatterns)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblFive)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(12, 12, 12).addComponent(lblSix)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 0, Short.MAX_VALUE)));

		lblNumResults.setText("# of Results");
		lblNumResults.setToolTipText("");

		txtResults.setColumns(10);
		txtResults.setLineWrap(true);
		txtResults.setRows(5);
		jScrollPane7.setViewportView(txtResults);

		btnGenerate.setText("Generate");
		btnGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnGenerateMouseClicked(evt);
			}
		});

		lblResults.setText("Results:");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblNumResults)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(txtNumResults, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup().addComponent(btnGenerate).addGap(28, 28,
												28)))
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblResults)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel2Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 532,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()))));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblResults).addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(22, 22, 22)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblNumResults).addComponent(txtNumResults,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btnGenerate)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addGap(5, 5, 5)))));

		txtNumResults.setText(Integer.toString(defNumResults));

		jMenu1.setText("File");

		jMenuItem2.setText("Exit");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuBar1.add(jMenu1);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void btnGenerateMouseClicked(java.awt.event.MouseEvent evt) {
		fillArrays();
		System.out.println("Filled");
		genResults();
		System.out.println("Generated");		
	}
	
		
		public void WriteObjectToFile(Object serObj) {
	        try {
	            FileOutputStream fileOut = new FileOutputStream(val.getFilename());
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(serObj);
	            objectOut.close();
	            System.out.println("The Object  was succesfully written to a file");

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	    }
	

	private void genResults() {
		txtResults.setText("");
		System.out.println("Set text");
		val.generateWords(val.getNumResults(), val.getListOne(), val.getListTwo(), val.getListThree(), val.getListFour(), val.getListFive(), val.getListSix(), val.getPatternList());
		System.out.println("Generated results");
		String results = val.getLstResults().toString();
		results = results.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		txtResults.append(results);
		System.out.println("Appended list results");

		//		4. print val.lstResults as string to txtResults,
		//			removing brackets and inserting line breaks at commas
	}

	private void fillArrays() {
		val.setNumResults(Integer.parseInt(txtNumResults.getText()));

		//Create ArrayList for txtOne
		ArrayList<String> lstOne = new ArrayList<>();
		Scanner s1 = new Scanner(txtOne.getText());
		while (s1.hasNext()) {
			lstOne.add(s1.nextLine());
		}
		s1.close();
		val.setListOne(lstOne);

		//Create ArrayList for txtTwo
		ArrayList<String> lstTwo = new ArrayList<>();
		Scanner s2 = new Scanner(txtTwo.getText());
		while (s2.hasNext()) {
			lstTwo.add(s2.nextLine());
		}
		s2.close();
		val.setListTwo(lstTwo);

		//Create ArrayList for txtThree
		ArrayList<String> lstThree = new ArrayList<>();
		Scanner s3 = new Scanner(txtThree.getText());
		while (s3.hasNext()) {
			lstThree.add(s3.nextLine());
		}
		s3.close();
		val.setListThree(lstThree);

		//Create ArrayList for txtFour
		ArrayList<String> lstFour = new ArrayList<>();
		Scanner s4 = new Scanner(txtFour.getText());
		while (s4.hasNext()) {
			lstFour.add(s4.nextLine());
		}
		s4.close();
		val.setListFour(lstFour);

		//Create ArrayList for txtFive
		ArrayList<String> lstFive = new ArrayList<>();
		Scanner s5 = new Scanner(txtFive.getText());
		while (s5.hasNext()) {
			lstFive.add(s5.nextLine());
		}
		s5.close();
		val.setListFive(lstFive);

		//Create ArrayList for txtSix
		ArrayList<String> lstSix = new ArrayList<>();
		Scanner s6 = new Scanner(txtSix.getText());
		while (s6.hasNext()) {
			lstSix.add(s6.nextLine());
		}
		s6.close();
		val.setListSix(lstSix);

		//Create ArrayList for txtPatterns
		ArrayList<String> lstPatterns = new ArrayList<>();
		Scanner sPattern = new Scanner(txtPatterns.getText());
		while (sPattern.hasNext()) {
			lstPatterns.add(sPattern.nextLine());
		}
		sPattern.close();
		val.setPatternList(lstPatterns);
		System.out.println("Appended Pattern list");

	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new WordGenerator().setVisible(true);
			}
		});
	}

}
