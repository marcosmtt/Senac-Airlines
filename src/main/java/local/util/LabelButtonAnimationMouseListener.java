package local.util;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class LabelButtonAnimationMouseListener implements java.awt.event.MouseListener {

    private final JLabel jLabel;
    private final Color COLOR_BACKGROUND_DEFAULT;
    private final Color COLOR_FONT_DEFAULT;
    private final Color COLOR_BACKGROUND_NEW = new Color(55, 130, 190);
    private final Color COLOR_FONT_NEW = new Color(255, 255, 255);
    private boolean isMouseOver;

    public LabelButtonAnimationMouseListener(JLabel label) {
        this.jLabel = label;
        this.COLOR_BACKGROUND_DEFAULT = label.getBackground();
        this.COLOR_FONT_DEFAULT = label.getForeground();
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        this.jLabel.setBackground(COLOR_BACKGROUND_DEFAULT);
        this.jLabel.setForeground(COLOR_FONT_DEFAULT);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (isMouseOver) {
            this.jLabel.setBackground(COLOR_BACKGROUND_NEW);
            this.jLabel.setForeground(COLOR_FONT_NEW);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.isMouseOver = true;
        this.jLabel.setBackground(COLOR_BACKGROUND_NEW);
        this.jLabel.setForeground(COLOR_FONT_NEW);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.isMouseOver = false;
        this.jLabel.setBackground(COLOR_BACKGROUND_DEFAULT);
        this.jLabel.setForeground(COLOR_FONT_DEFAULT);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.jLabel.setBackground(COLOR_BACKGROUND_NEW);
        this.jLabel.setForeground(COLOR_FONT_NEW);
    }

}
