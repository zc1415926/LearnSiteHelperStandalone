package dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DatabaseSyncDialogs 
{
	public DatabaseSyncDialogs()
	{
		
	}
	
	public void show01WelcomeDialog(Display display)
	{
		Shell shell = new Shell(display, SWT.DIALOG_TRIM|SWT.APPLICATION_MODAL);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		shell.setLayout(gridLayout);
		shell.setText("信息技术学科网SQLServer数据库读取器");
		shell.setSize(1024, 576);
		
		GridData gdLeft = new GridData();
		gdLeft.verticalAlignment = GridData.FILL;
		
		Composite cpsLeft = new Composite(shell, SWT.NONE);
		cpsLeft.setLayout(new GridLayout(1, false));
		cpsLeft.setLayoutData(gdLeft);
		//cpsLeft.sets
		
		Button btnReadLearnSiteDatabase = new Button(cpsLeft, SWT.PUSH);
		btnReadLearnSiteDatabase.setText("从学科网读取数据");
		//btnReadLearnSiteDatabase.setLayoutData(new GridData(SWT.FILL));
		Button btnCancel = new Button(cpsLeft, SWT.PUSH);
		btnCancel.setText("取消");
		btnCancel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		
		GridData gdRight = new GridData();
		gdRight.horizontalAlignment = GridData.FILL;
		gdRight.verticalAlignment = GridData.FILL;
		gdRight.grabExcessVerticalSpace = true;
		gdRight.grabExcessHorizontalSpace = true;
		//Composite cpsRight = new Composite(shell, SWT.BORDER);
		//cpsRight.setLayoutData(gdRight);
		
		
		//cpsRight.setLayout(new GridLayout(1, false));
		//cpsRight.setLayoutData(new RowData(500,1000));
		//cpsRight.setLayout (fillLayout);
		
		Text txtInfo = new Text(shell, SWT.BORDER | SWT.MULTI);
		txtInfo.setText("This is a text");
		txtInfo.setLayoutData(gdRight);
		shell.open();
	}
}
