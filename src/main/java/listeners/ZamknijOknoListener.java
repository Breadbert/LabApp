package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ZamknijOknoListener implements ActionListener {
    private JFrame okno;

    public JFrame getOkno() {
        return okno;
    }

    public void setOkno(JFrame okno) {
        this.okno = okno;
    }

    public ZamknijOknoListener(JFrame okno) {
        this.okno = okno;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getOkno().dispose();
    }
}
