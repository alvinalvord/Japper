import org.fife.ui.autocomplete.*
import java.awt.*
import java.awt.event.*
import javax.swing.*

import org.fife.ui.rtextarea.*
import org.fife.ui.rsyntaxtextarea.*
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory
import java.io.*
import javax.swing.JFileChooser
import javax.swing.JOptionPane
import java.io.File
import javax.swing.JFrame
import javax.swing.UIManager

class SyntaxSchemeDemo : JFrame(), ActionListener {

    private val textArea: RSyntaxTextArea
    private var file: String = ""

    init {

        val cp = JPanel(BorderLayout())

        textArea = RSyntaxTextArea(20, 60)
//        textArea.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JAVA
        textArea.isCodeFoldingEnabled = true
        textArea.antiAliasingEnabled = true
        val sp = RTextScrollPane(textArea)
        cp.add(sp)

        val atmf = TokenMakerFactory.getDefaultInstance() as AbstractTokenMakerFactory
        atmf.putMapping("text/japper", "TokenMaker")
        textArea.syntaxEditingStyle = "text/japper"

        val mb = JMenuBar()
        val menu = JMenu("File")
        mb.add(menu)
        val openItem = JMenuItem("Open Japper file...")
        openItem.actionCommand = "Open"
        openItem.addActionListener(this)
        menu.add(openItem)

        val saveItem = JMenuItem("Save file...")
        saveItem.actionCommand = "Save"
        saveItem.addActionListener(this)
        menu.add(saveItem)
        jMenuBar = mb

        contentPane = cp
        title = "Syntax Scheme Demo"
        defaultCloseOperation = EXIT_ON_CLOSE
        pack()
        setLocationRelativeTo(null)

        var provider = createCompletionProvider()
        var ac = AutoCompletion(provider)
        ac.install(textArea)

    }

    /**
     * Listens for the selection of a menu item and performs an action
     * accordingly.
     */
    override fun actionPerformed(e: ActionEvent) {
        val command = e.actionCommand
        if (command == "Open") {
            openJapperFile()
        }
        else if (command == "Save"){
            saveCurrent()
        }
    }

    private fun openJapperFile (){
        val fileChooser = JFileChooser()
//        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY)
//        fileChooser.isAcceptAllFileFilterUsed = false

        val rVal = fileChooser.showOpenDialog(null)
        if (rVal == JFileChooser.APPROVE_OPTION) {
            try {
                file = fileChooser.getSelectedFile().absolutePath
                val reader = FileReader(file)
                val br = BufferedReader(reader)
                textArea.read(br, null)
                br.close()
                textArea.requestFocus()
            } catch (e: Exception) {
                JOptionPane.showMessageDialog(null, e)
            }

        }
    }

    private fun saveCurrent (){
        if(file != ""){
            var tempF = File(file)
            var fw = FileWriter(tempF.absoluteFile, true)
            textArea.write(fw)
        }
        else{
            val parentFrame = JFrame()

            val fileChooser = JFileChooser()
            fileChooser.dialogTitle = "Specify a file to save"

            val userSelection = fileChooser.showSaveDialog(parentFrame)

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                val fileToSave = fileChooser.selectedFile
                println("Save as file: " + fileToSave.absolutePath)
                var fw = FileWriter(fileToSave.absoluteFile, true)
                textArea.write(fw)
            }
        }
    }

    /**
     * Changes the styles used by the editor via an XML file specification.
     */
    private fun changeStyleViaThemeXml() {
        try {
            val theme = Theme.load(javaClass.getResourceAsStream(
                    "../java/test.xml"))
            theme.apply(textArea)
        } catch (ioe: IOException) { // Never happens
            ioe.printStackTrace()
        }

    }

    companion object {

        private val serialVersionUID = 1L

        /**
         * Set the font for all token types.
         *
         * @param textArea The text area to modify.
         * @param font The font to use.
         */
        fun setFont(textArea: RSyntaxTextArea, font: Font?) {
            if (font != null) {
                var ss = textArea.syntaxScheme
                ss = ss.clone() as SyntaxScheme
                for (i in 0..ss.styleCount - 1) {
                    if (ss.getStyle(i) != null) {
                        ss.getStyle(i).font = font
                    }
                }
                textArea.syntaxScheme = ss
                textArea.font = font
            }
        }

        /** * Create a simple provider that adds some Java-related completions.  */
        private fun createCompletionProvider(): CompletionProvider {

            // A DefaultCompletionProvider is the simplest concrete implementation
            // of CompletionProvider. This provider has no understanding of
            // language semantics. It simply checks the text entered up to the
            // caret position for a match against known completions. This is all
            // that is needed in the majority of cases.
            val provider = DefaultCompletionProvider()

            // Add completions for all Java keywords. A BasicCompletion is just
            // a straightforward word completion.
            provider.addCompletion(BasicCompletion(provider, "yeet"))
            provider.addCompletion(BasicCompletion(provider, "oof"))
            provider.addCompletion(BasicCompletion(provider, "ree"))
            provider.addCompletion(BasicCompletion(provider, "brodie error"))
            // ... etc ...
            provider.addCompletion(BasicCompletion(provider, "bro err"))
            provider.addCompletion(BasicCompletion(provider, "broerr"))
            provider.addCompletion(BasicCompletion(provider, "pweds mag error"))
            provider.addCompletion(BasicCompletion(provider, "thonking"))
            provider.addCompletion(BasicCompletion(provider, "kung"))
            provider.addCompletion(BasicCompletion(provider, "censored"))
            provider.addCompletion(BasicCompletion(provider, "protecc"))
            provider.addCompletion(BasicCompletion(provider, "uncensored"))
            provider.addCompletion(BasicCompletion(provider, "last na"))
            provider.addCompletion(BasicCompletion(provider, "wala"))
            provider.addCompletion(BasicCompletion(provider, "yung kwan"))
            provider.addCompletion(BasicCompletion(provider, "take"))
            provider.addCompletion(BasicCompletion(provider, "bago"))
            provider.addCompletion(BasicCompletion(provider, "pinalitan"))
            provider.addCompletion(BasicCompletion(provider, "nothing"))
            provider.addCompletion(BasicCompletion(provider, "school"))
            provider.addCompletion(BasicCompletion(provider, "yes"))
            provider.addCompletion(BasicCompletion(provider, "no"))
            provider.addCompletion(BasicCompletion(provider, "bool"))
            provider.addCompletion(BasicCompletion(provider, "i1"))
            provider.addCompletion(BasicCompletion(provider, "i2"))
            provider.addCompletion(BasicCompletion(provider, "i8"))
            provider.addCompletion(BasicCompletion(provider, "i16"))
            provider.addCompletion(BasicCompletion(provider, "i32"))
            provider.addCompletion(BasicCompletion(provider, "i64"))
            provider.addCompletion(BasicCompletion(provider, "f32"))
            provider.addCompletion(BasicCompletion(provider, "f64"))
            provider.addCompletion(BasicCompletion(provider, "print"))
            provider.addCompletion(BasicCompletion(provider, "read"))
            provider.addCompletion(BasicCompletion(provider, "return"))
            provider.addCompletion(BasicCompletion(provider, "in"))
            provider.addCompletion(BasicCompletion(provider, "go on"))
            provider.addCompletion(BasicCompletion(provider, "bbb"))
            provider.addCompletion(BasicCompletion(provider, "yamete"))
            provider.addCompletion(BasicCompletion(provider, "gets"))
            provider.addCompletion(BasicCompletion(provider, "plus eq"))
            provider.addCompletion(BasicCompletion(provider, "minus eq"))
            provider.addCompletion(BasicCompletion(provider, "times eq"))
            provider.addCompletion(BasicCompletion(provider, "div eq"))
            provider.addCompletion(BasicCompletion(provider, "mod eq"))
            provider.addCompletion(BasicCompletion(provider, "and eq"))
            provider.addCompletion(BasicCompletion(provider, "xor eq"))
            provider.addCompletion(BasicCompletion(provider, "or eq"))
            provider.addCompletion(BasicCompletion(provider, "sll eq"))
            provider.addCompletion(BasicCompletion(provider, "srl eq"))
            provider.addCompletion(BasicCompletion(provider, "sra eq"))
            provider.addCompletion(BasicCompletion(provider, "not"))
            provider.addCompletion(BasicCompletion(provider, "wak"))
            provider.addCompletion(BasicCompletion(provider, "inc"))
            provider.addCompletion(BasicCompletion(provider, "dec"))
            provider.addCompletion(BasicCompletion(provider, "plus"))
            provider.addCompletion(BasicCompletion(provider, "minus"))
            provider.addCompletion(BasicCompletion(provider, "times"))
            provider.addCompletion(BasicCompletion(provider, "div"))
            provider.addCompletion(BasicCompletion(provider, "mod"))
            provider.addCompletion(BasicCompletion(provider, "gt"))
            provider.addCompletion(BasicCompletion(provider, "ge"))
            provider.addCompletion(BasicCompletion(provider, "lt"))
            provider.addCompletion(BasicCompletion(provider, "le"))
            provider.addCompletion(BasicCompletion(provider, "equals"))
            provider.addCompletion(BasicCompletion(provider, "eq"))
            provider.addCompletion(BasicCompletion(provider, "ne"))
            provider.addCompletion(BasicCompletion(provider, "and"))
            provider.addCompletion(BasicCompletion(provider, "or"))
            provider.addCompletion(BasicCompletion(provider, "bnot"))
            provider.addCompletion(BasicCompletion(provider, "band"))
            provider.addCompletion(BasicCompletion(provider, "bor"))
            provider.addCompletion(BasicCompletion(provider, "bxor"))
            provider.addCompletion(BasicCompletion(provider, "sll"))
            provider.addCompletion(BasicCompletion(provider, "sl"))
            provider.addCompletion(BasicCompletion(provider, "srl"))
            provider.addCompletion(BasicCompletion(provider, "sr"))
            provider.addCompletion(BasicCompletion(provider, "sra"))
            provider.addCompletion(BasicCompletion(provider, "main"))

            // Add a couple of "shorthand" completions. These completions don't
            // require the input text to be the same thing as the replacement text.
            provider.addCompletion(ShorthandCompletion(provider, "pln",
                    "print (\"\\n\");", "print new line"))
            provider.addCompletion(ShorthandCompletion(provider, "pl",
                    "print (", "print command"))

            return provider
        }

        @JvmStatic
        fun main(args: Array<String>) {
            // Start all Swing applications on the EDT.
            SwingUtilities.invokeLater {
                try {
                    val laf = UIManager.getSystemLookAndFeelClassName()
                    UIManager.setLookAndFeel(laf)
                } catch (e: Exception) { /* Never happens */
                }

                SyntaxSchemeDemo().isVisible = true
            }
        }
    }

}