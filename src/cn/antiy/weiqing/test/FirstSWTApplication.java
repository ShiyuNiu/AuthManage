package cn.antiy.weiqing.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.*;

/**
 * Created by Shiyu on 2017/4/8.
 */
public class FirstSWTApplication {
    public static void main(String args[]) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());

        Label label = new Label(shell, SWT.NONE);
        Font font = new Font(label.getDisplay(), new FontData("Mono", 10, SWT.ITALIC)); // 设置Label文字的字体/大小/样式
        label.setFont(font);
        label.setText("This is a label:");
        label.setToolTipText("This is the tool tip of this label");

        Text text = new Text(shell, SWT.NONE);
        text.setText("This is text in the text widget");
        text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
        text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

        Button button = new Button(shell, SWT.SELECTED);
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent selectionEvent) {
                System.out.println("Called!");
            }
        });

        label.pack();
        text.pack();
        button.pack();

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
