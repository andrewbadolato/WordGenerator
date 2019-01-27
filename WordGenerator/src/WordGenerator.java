

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.io.FilenameUtils;


public class WordGenerator extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;

	private JButton btnGenerate;
	private JMenu mnFile;
	private JMenuBar menuBar;
	private JMenuItem mnNew;
	private JMenuItem mnSave;
	private JMenuItem mnOpen;
	private JMenuItem mnExit;
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

	private int defaultResults = 1;
	private String title = "WordGenerator";
	private String filename = "file.val";
	private String wgExtension = ".val";
	Values val = new Values(defaultResults);
	
	public WordGenerator() {
		initComponents();
	}

	private void initComponents() {

		this.setTitle(title);

	    try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    }catch(Exception ex) {
	        ex.printStackTrace();
	    }
	    
		jPanel1 = new JPanel();
		jScrollPane1 = new JScrollPane();
		txtOne = new JTextArea();
		lblOne = new JLabel();
		lblThree = new JLabel();
		jScrollPane2 = new JScrollPane();
		txtThree = new JTextArea();
		jScrollPane3 = new JScrollPane();
		txtFive = new JTextArea();
		lblFive = new JLabel();
		lblTwo = new JLabel();
		jScrollPane4 = new JScrollPane();
		txtTwo = new JTextArea();
		jScrollPane5 = new JScrollPane();
		txtPatterns = new JTextArea();
		lblPatterns = new JLabel();
		jScrollPane6 = new JScrollPane();
		txtSix = new JTextArea();
		lblSix = new JLabel();
		jScrollPane8 = new JScrollPane();
		txtFour = new JTextArea();
		lblFour = new JLabel();
		jPanel2 = new JPanel();
		lblNumResults = new JLabel();
		txtNumResults = new JTextField();
		jScrollPane7 = new JScrollPane();
		txtResults = new JTextArea();
		btnGenerate = new JButton();
		lblResults = new JLabel();
		menuBar = new JMenuBar();
		mnFile = new JMenu();
		mnNew = new JMenuItem();
		mnOpen = new JMenuItem();
		mnSave = new JMenuItem();
		mnExit = new JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		txtOne.setColumns(15);
		txtOne.setRows(5);
		jScrollPane1.setViewportView(txtOne);

		lblOne.setText("Beginning Consonants (1):");

		lblThree.setText("Mid-word Consonants (3):");

		txtThree.setColumns(15);
		txtThree.setRows(5);
		jScrollPane2.setViewportView(txtThree);

		txtFive.setColumns(15);
		txtFive.setRows(5);
		jScrollPane3.setViewportView(txtFive);

		lblFive.setText("Ending Consonants (5):");

		lblTwo.setText("Beginning Vowels (2):");

		txtTwo.setColumns(15);
		txtTwo.setRows(5);
		jScrollPane4.setViewportView(txtTwo);

		txtPatterns.setColumns(10);
		txtPatterns.setRows(5);
		jScrollPane5.setViewportView(txtPatterns);

		lblPatterns.setText("Possible Patterns:");

		txtSix.setColumns(15);
		txtSix.setRows(5);
		jScrollPane6.setViewportView(txtSix);

		lblSix.setText("Ending Vowels (6):");

		txtFour.setColumns(15);
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

		txtResults.setColumns(5);
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
										.addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 387,
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

		txtNumResults.setText(Integer.toString(defaultResults));

		mnFile.setText("File");


		mnNew.setText("New"); mnNew.setPreferredSize(new Dimension(100, mnFile.getPreferredSize().height));
		mnNew.addActionListener(new
				java.awt.event.ActionListener() {

			@Override public void actionPerformed(java.awt.event.ActionEvent evt) {
				mnNewActionPerformed(evt); } });


		mnOpen.setText("Open...");
		mnOpen.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					mnOpenActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		mnSave.setText("Save...");
		mnSave.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mnSaveActionPerformed(evt);
			}
		});


		mnExit.setText("Exit");
		mnExit.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.exit(0);
			}
		});

		mnFile.add(mnNew);
		mnFile.add(mnOpen);	
		mnFile.add(mnSave);
		mnFile.add(mnExit);

		menuBar.add(mnFile);

		setJMenuBar(menuBar);

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
	}

	//File menu item actions
	private void mnNewActionPerformed(ActionEvent evt) {
		//Note: add prompt to save when any text areas (not number of results) contain values
		resetValues();
	}

	private void mnOpenActionPerformed(ActionEvent evt) throws ClassNotFoundException, IOException {
		ReadFile(val);
	}

	private void mnSaveActionPerformed(ActionEvent evt)  {
		try {
			WriteObjectToFile(val);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void btnGenerateMouseClicked(java.awt.event.MouseEvent evt) {
		fillArrays();
		genResults();
	}

	//Save all values to file
	public void WriteObjectToFile(Object serObj) throws IOException {

	    JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "WordGenerator Files (.val)", "val", "txt");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showSaveDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	filename = chooser.getSelectedFile().getCanonicalPath();
	    	String fileExt = FilenameUtils.getExtension(filename);
	    	if (fileExt.isBlank()) {
	    		filename = filename + wgExtension;
	    	}
	    }

		FileOutputStream fileOutputStream
		= new FileOutputStream(filename);
		ObjectOutputStream objectOutputStream 
		= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(val);
		objectOutputStream.flush();
		objectOutputStream.close();
	}

	//Open and read selected file
	public void ReadFile(Object serObj) throws IOException, ClassNotFoundException {

	    JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "WordGenerator Files (.val)", "val", "txt");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	    	filename = chooser.getSelectedFile().getCanonicalPath();
	    }

		FileInputStream fileInputStream = new FileInputStream(filename);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Values val = (Values) objectInputStream.readObject();
		objectInputStream.close(); 

		String txtOneString = val.getListOne().toString();
		txtOneString = txtOneString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtTwoString = val.getListTwo().toString();
		txtTwoString = txtTwoString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtThreeString = val.getListThree().toString();
		txtThreeString = txtThreeString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtFourString = val.getListFour().toString();
		txtFourString = txtFourString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtFiveString = val.getListFive().toString();
		txtFiveString = txtFiveString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtSixString = val.getListSix().toString();
		txtSixString = txtSixString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtResultsString = val.getLstResults().toString();
		txtResultsString = txtResultsString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		String txtPatternsString = val.getPatternList().toString();
		txtPatternsString = txtPatternsString.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");

		//Reset all values in form
		txtOne.setText(txtOneString);
		txtTwo.setText(txtTwoString);
		txtThree.setText(txtThreeString);
		txtFour.setText(txtFourString);
		txtFive.setText(txtFiveString);
		txtSix.setText(txtSixString);
		txtResults.setText(txtResultsString);
		txtNumResults.setText(Integer.toString(val.getNumResults()));
		txtPatterns.setText(txtPatternsString);
	}

	//Generate letter combinations in results panel
	private void genResults() {
		txtResults.setText("");
		val.generateWords(val.getNumResults(), val.getListOne(), val.getListTwo(), val.getListThree(), val.getListFour(), val.getListFive(), val.getListSix(), val.getPatternList());
		String results = val.getLstResults().toString();
		results = results.replaceAll(", ", "\n").replaceAll("\\[|\\]", "");
		txtResults.append(results);
	}

	//Fill arrays with values entered into generator
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

	}

	//Reset all values to blank/null/default
	private void resetValues() {

		//Reset all values in form to default
		txtOne.setText("");
		txtTwo.setText("");
		txtThree.setText("");
		txtFour.setText("");
		txtFive.setText("");
		txtSix.setText("");
		txtResults.setText("");
		txtNumResults.setText(Integer.toString(defaultResults));
		txtPatterns.setText("");

		//Clear values object
		val.setFilename("");
		val.setListOne(null);
		val.setListTwo(null);
		val.setListThree(null);
		val.setListFour(null);
		val.setListFive(null);
		val.setListSix(null);
		val.setPatternList(null);
		val.setLstResults(null);
		val.setNumResults(defaultResults);
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
