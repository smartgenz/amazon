import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SimpleStamper extends Applet implements MouseListener {


   public void init() {
          // When the applet is created, set its background color
          // to black, and register the applet to listen to mouse
          // events on itself.
      setBackground(Color.black);
      addMouseListener(this);
   }
   

   public void mousePressed(MouseEvent evt) {
          // This method will be called when the user clicks the
          // mouse on the applet.

       if ( evt.isShiftDown() ) {
             // The user was holding down the Shift key.  Just
             // repaint the applet, which will fill it with its
             // background color, black.
          repaint();
          return;
       }
       
       int x = evt.getX();  // x-coordinate where user clicked.
       int y = evt.getY();  // y-coordinate where user clicked.
       
       Graphics g = getGraphics();  // Graphics context for drawing on applet.
       
       if ( evt.isMetaDown() ) {
              // User right-clicked at the point (x,y).
              // Draw a blue oval centered at the point (x,y).
              // A black outline around the oval will make it more
              // distinct when ovals and rects overlap.
           g.setColor(Color.blue);
           g.fillOval( x - 30, y - 15, 60, 30 );
           g.setColor(Color.black);
           g.drawOval( x - 30, y - 15, 60, 30 );
       }
       else {
              // Draw a red rectangle centered at the point (x,y).
           g.setColor(Color.red);
           g.fillRect( x - 30, y - 15, 60, 30 );
           g.setColor(Color.black);
           g.drawRect( x - 30, y - 15, 60, 30 );
       }
       
       g.dispose();  // We are finished with the graphics context,
                     //   so dispose of it.
       
   }  // end mousePressed()
   

   public void mouseEntered(MouseEvent evt) { }   // These empty routines
   public void mouseExited(MouseEvent evt) { }    //   are required by the
   public void mouseClicked(MouseEvent evt) { }   //   MouseListener interface.
   public void mouseReleased(MouseEvent evt) { }


}
