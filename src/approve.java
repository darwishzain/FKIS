public class MVCApproveBooking {

    public static void main(String[] args) {

        ApproveBookingView theView = new ApproveBookingView();

        ApproveBookingModel theModel = new ApproveBookingModel();

        ApproveBookingController theController = new ApproveBookingController(theView,theModel);

        theView.setVisible(true);

    }

}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApproveBookingController {

    private ApproveBookingView theView;
    private ApproveBookingModel theModel;
    
    public ApproveBookingController(ApproveBookingView theView, ApproveBookingModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addApproveBookingListener(new ApproveBookingListener());
    }
    
    class ApproveBookingListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             

         
        }

    }

}
import java.awt.event.ActionListener;
import javax.swing.*;

public class ApproveBookingView extends JFrame{

    private final JButton approveButton = new JButton("Approve");

    ApproveBookingView(){

        JPanel approvePanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        
        approvePanel.add(approveButton);
        this.add(approvePanel);
    }

    void addApproveBookingListener(ActionListener listenForCalcButton){

        approveButton.addActionListener(listenForCalcButton);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}


public class ApproveBookingModel {

 
    private int approvalValue;

     

  

    public int getApprovalValue(){
    return approvalValue;
    }
}

