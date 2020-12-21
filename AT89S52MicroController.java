import java.util.Hashtable;

public class AT89S52MicroController extends
        MicroControllerBoard implements DesignStages {

    public final String MANUFACTURED_DATE = "10:08:2020";
    public final String DESIGNER_NAME = "AJAO HAZZAN";
    public final String PROFESSION = "Software & Hardware Co-Developer";
    public final String LOCATION = "Finland";

    void showBoardType() {
        System.out.println("AT89S52 THT MICROCONTROLLER EVALUATION BOARD ");
        System.out.println("Manufactured Date:" + MANUFACTURED_DATE);
    }

    void showDeveloperDetails() {
        System.out.println(DESIGNER_NAME);
        System.out.println(PROFESSION);
        System.out.println(LOCATION);
    }

    @Override
    void explainDesignStages() {
        Hashtable<Integer, String> stages = new Hashtable<Integer, String>();
        for (int i = 1; i <= 12; i++) ;

        stages.put(1, "Stage  1 : FOR DESIGN INFORMATION");
        stages.put(2, "Stage  2 : FOR PRODUCT DESIGN AND DEVELOPMENT DATE");
        stages.put(3, "Stage  3 : FOR PRODUCT DESIGN AND DEVELOPMENT DESCRIPTION");
        stages.put(4, "Stage  4 : FOR SIMULATION STAGE");
        stages.put(5, "Stage  5 : FOR COMPONENT FOOTPRINT SELECTION STAGE");
        stages.put(6, "Stage  6 : FOR BOARD LAYOUT DESIGN STAGE");
        stages.put(7, "Stage  7 : BOARD FOOTPRINT DESIGN STAGE");
        stages.put(8, "Stage  8 : WIRING & ROUTING STAGE");
        stages.put(9, "Stage  9 : WIRING & ROUTING DESIGN CHECK");
        stages.put(10, "Stage 10: COPPER POURING STAGE");
        stages.put(11, "Stage 11: LAYOUT FINAL STAGE");

        System.out.println(stages.get(1));
        System.out.println(stages.get(2));
        System.out.println(stages.get(3));
        System.out.println(stages.get(4));
        System.out.println(stages.get(5));
        System.out.println(stages.get(6));
        System.out.println(stages.get(7));
        System.out.println(stages.get(8));
        System.out.println(stages.get(9));
        System.out.println(stages.get(10));
        System.out.println(stages.get(11));
    }

    @Override
    public void explainCircuitDesignStage() {
        System.out.println(
                "2 Power Supply : The board can be powered with either AC Power or by 5V DC Power. \n" +
                "1 Microcontroller IC : The board contains one Microcontroller IC (At89s52).\n " +
                "1 Crystal Oscillator : The Circuit contains 16khz crystal oscillator\n" +
                "2 Disc Capacitors : The used disc capacitor is 22pf\n" +
                "1 Liquid Crystal Display : The board contains one display unit to display computed data\n" +
                "12 Resistors : The used resistors are 10k ohm\n" +
                "3 Push Buttons: The Board contains 3 push buttons one as power-switch and two as reset buttons\n" +
                "1 Led : This used to show the state of the power supply.\n" +
                "2 Electrolytic capacitors: To smoothens the AC power supply\n" +
                "1 Voltage Regulator:It uses LM7805 voltage regulator,to reduce the voltage to required the level.\n" +
                "1 AVR Connector : This is used for programing the Microcontroller IC\n" +
                "2 Pin Headers & 3 Pin Socket : This is used for interfacing with external devices.");
    }

    @Override
    public void explainSimulationStage() {
        System.out.println("The next thing to do after careful design,that based on specification\n" +
                "is to perform symbol annotation,component value assignment and finally circuit simulation");
    }

    @Override
    public void explainSelectionStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainLayoutDesignStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainFootprintDesignStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainWiringStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainDesignRoutingCheckStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainCopperPouringStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainLayoutFinalStage() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainFabricationProcess() {
        System.out.println("Please contact me for contract work, thank you !");
    }

    @Override
    public void explainNextThingToDo() {
        System.out.println("Please contact me for contract work, thank you !");
    }
}
/* Kiss
 * Dry
 */