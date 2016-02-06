import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class InterfacciaCiao {

	protected Shell shell;
	private Text txtCiao;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InterfacciaCiao window = new InterfacciaCiao();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(371, 256);
		shell.setText("SWT Application");
		
		Button btnSaluta = new Button(shell, SWT.NONE);
		btnSaluta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtCiao.setText("Ciao");
			}
		});
		btnSaluta.setBounds(84, 47, 197, 36);
		btnSaluta.setText("Saluta");
		
		txtCiao = new Text(shell, SWT.BORDER);
		txtCiao.setBounds(84, 112, 197, 36);

	}
}
