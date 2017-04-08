package cn.antiy.weiqing.auth;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Main {

    static final String[] MENU_NAME = {"总览", "角色", "资源", "权限"};

    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());

        CTabFolder tabFolder = new CTabFolder(shell, SWT.BORDER);
        for (int i = 0; i < MENU_NAME.length; i ++) {
            CTabItem item = new CTabItem(tabFolder, SWT.NONE);
            item.setText(MENU_NAME[i]);
            Text text = new Text(tabFolder, SWT.MULTI);
            text.setText("Content for Item " + i);
            item.setControl(text);
        }

        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
