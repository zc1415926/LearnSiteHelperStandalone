import java.sql.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import dialogs.DatabaseSyncDialogs;



public class MainLearnSiteMssqlReader {

	public static void main(String[] args)
	{
		MainLearnSiteMssqlReader mainReader = new MainLearnSiteMssqlReader();
		
		
		/*
		// Create a variable for the connection string.
				String connectionUrl = "jdbc:sqlserver://www.rhjxx.com:1433;" +
					"databaseName=LearnSite;user=sa;password=Hp123456";

				// Declare the JDBC objects.
				Connection con = null;
				Statement stmt = null;
				ResultSet rs = null;
				
		try
		{
			// Establish the connection.
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        		con = DriverManager.getConnection(connectionUrl);
        
        		// Create and execute an SQL statement that returns some data.
        		String SQL = "SELECT COUNT(*) FROM Students WHERE Sgrade=5 AND Sclass=7";
        		stmt = con.createStatement();
        		rs = stmt.executeQuery(SQL);
        
        		// Iterate through the data in the result set and display it.
        		while (rs.next()) {
        			System.out.println(rs.getString(1));
        		}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (rs != null) try { rs.close(); } catch(Exception e) {}
    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
		
		System.out.println("java!");*/
	}
	
	public MainLearnSiteMssqlReader()
	{
		initGUI();
	}
	
	private void initGUI()
	{
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("人和街小学信息技术学科网辅助工具-单机版");
		shell.setSize(400, 600);
		FillLayout flMainWindow = new FillLayout(SWT.VERTICAL);
		flMainWindow.marginWidth = 5;
		flMainWindow.marginHeight = 5;
		shell.setLayout(flMainWindow);
		
		FontData fdMainWindowButton = new FontData();
		fdMainWindowButton.setHeight(28);
		fdMainWindowButton.setStyle(SWT.BOLD);
		Font ftMainWindowButton = new Font(display, fdMainWindowButton);
		
		Menu appMenuBar = display.getMenuBar();
		if (appMenuBar == null) {
			appMenuBar = new Menu(shell, SWT.BAR);
			shell.setMenuBar(appMenuBar);
		}
		MenuItem file = new MenuItem(appMenuBar, SWT.CASCADE);
		file.setText("文件");
		Menu dropdown = new Menu(appMenuBar);
		file.setMenu(dropdown);
		MenuItem exit = new MenuItem(dropdown, SWT.PUSH);
		exit.setText("退出");
		exit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				display.dispose();
			}
		});
		
		
		
		Button btnSyncDatabase = new Button (shell, SWT.PUSH);
		btnSyncDatabase.setText ("同步数据库");
		btnSyncDatabase.setFont(ftMainWindowButton);
		
		Button btnHomeworkGenerator = new Button (shell, SWT.PUSH);
		btnHomeworkGenerator.setText ("生成学生作业合集");
		btnHomeworkGenerator.setFont(ftMainWindowButton);

		
		btnSyncDatabase.addSelectionListener(new SelectionAdapter() 
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DatabaseSyncDialogs dbsDialogs = new DatabaseSyncDialogs();
				dbsDialogs.show01WelcomeDialog(display);
			}
		});
		
		
		shell.open();
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}
}