/*******************************************************************************
* AUTHOR     : AJAO HAZZAN                                                     *
* ============================================================================ *
* PROFESSION : Software Engineer and Hardware Engineer.                        *
*                                                                              *
* PROJECT    : Modeling the design and development of At89s52 Microcontroller  *
*              Evaluation Boards ( THT and SMT Boards ).                       *
*                                                                              *
* DESCRIPTION: This Board was developed for IoT Applications and is Arduino    *
*              compatible.You can contact me for your project or contract      *
********************************************************************************/

import java.util.Scanner;

public class BoardMain {
 public static void main(String[] args) {

  AT89S52MicroController firstInfo = new AT89S52MicroController();
  Scanner ConsoleInput = new Scanner(System.in);
  System.out.println("CHOOSE YOUR OPTION FROM THE LIST BELOW  !:");
  System.out.println("====================================================");
  System.out.println("Designer information press ........................1");
  System.out.println("Product Developed and Manufactured Date ...........2");
  System.out.println("Simulation Stage press                  ...........3");
  System.out.println("Component Selection Stage press         ...........4");
  System.out.println("Layout Design Stage press               ...........5");
  System.out.println("Footprint Selection press               ...........6");
  System.out.println("Wiring Stage press                      ...........7");
  System.out.println("Design Rule Check press                 ...........8");
  System.out.println("Copper pouring press                    ...........9");
  System.out.println("Layout Design Final Stage, press        ..........10");
  System.out.println("Fabrication process, press:             ..........11");
  System.out.println("Next Thing To Do, Press                 ..........12");
  System.out.println("To Access Design Stages, press ...................13");
  System.out.println("");
  System.out.println("Enter Your Any of The Numbers.");

  int input1 = ConsoleInput.nextInt();
  int input2 = 1;
  int input3 = 2;
  int input4 = 3;
  int input5 = 4;
  int input6 = 5;
  int input7 = 6;
  int input8 = 7;
  int input9 = 8;
  int input10 = 9;
  int input11 = 10;
  int input12 = 11;
  int input13 = 12;
  int input14 = 13;

  if (input1 == input2) {
   System.out.println("DESIGNER INFORMATION:");
   System.out.println("====================:");
   firstInfo.showDeveloperDetails();
   System.out.println(" ");
  } else if (input1 == input3) {
   System.out.println("PRODUCT DESIGN AND DEVELOPMENT DATE ");
   System.out.println("========================================");
   firstInfo.showBoardType();
   System.out.println(" ");
  } else if (input1 == input4) {
   System.out.println("PRODUCT DESIGN AND DEVELOPMENT DESCRIPTION");
   System.out.println("=========================================:");
   firstInfo.explainCircuitDesignStage();
   System.out.println(" ");
  } else if (input1 == input5) {
   System.out.println("SIMULATION STAGE");
   System.out.println("====================:");
   firstInfo.explainSimulationStage();
   System.out.println(" ");
  } else if (input1 == input6) {
   System.out.println("COMPONENT FOOTPRINT SELECTION STAGE");
   System.out.println("===================================:");
   firstInfo.explainSelectionStage();
   System.out.println(" ");
  } else if (input1 == input7) {
   System.out.println("BOARD LAYOUT DESIGN STAGE");
   System.out.println("================================:");
   firstInfo.explainLayoutDesignStage();
   System.out.println(" ");
  } else if (input1 == input8) {
   System.out.println("BOARD FOOTPRINT DESIGN STAGE");
   System.out.println("===========================:");
   firstInfo.explainFootprintDesignStage();
   System.out.println(" ");
  } else if (input1 == input9) {
   System.out.println("WIRING & ROUTING STAGE");
   System.out.println("===========================:");
   firstInfo.explainWiringStage();
   System.out.println(" ");
  } else if (input1 == input10) {
   System.out.println("WIRING & ROUTING DESIGN CHECK");
   System.out.println("====================:");
   firstInfo.explainDesignRoutingCheckStage();
   System.out.println(" ");
  } else if (input1 == input11) {
   System.out.println("COPPER POURING STAGE");
   System.out.println("====================:");
   firstInfo.explainCopperPouringStage();
   System.out.println(" ");
  } else if (input1 == input12) {
   System.out.println("LAYOUT FINAL STAGE");
   System.out.println("====================:");
   firstInfo.explainLayoutFinalStage();
   System.out.println(" ");
  } else if (input1 == input13) {
   System.out.println(" THE FINAL THING TO DO NEXT ");
   System.out.println("===========================:");
   firstInfo.explainNextThingToDo();
  } else if (input1 == input14) {
    System.out.println(" THE DESIGN STAGES");
    System.out.println("===========================:");
    firstInfo.explainDesignStages();
   } else {
    System.out.println("Oops! Wrong Pin Number, Try Again !!");}
  }
}
/* Kiss
 * Dry
 */

