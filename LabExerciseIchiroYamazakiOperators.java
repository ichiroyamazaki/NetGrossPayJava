public class LabExerciseIchiroYamazakiOperators {
public static void main(String args[]) {
  double G1 = 25000.0;
  String EmN = "Ichiro Yamazaki";
  double PgC = 100.0;
  double PercWT = .15;
  double PercSC = .0363;
  double PercMc = 0.0125;
  double DeDucWtTt = G1*PercWT;
  double DeDucScTt = G1*PercSC;
  double DeDucMcTt = G1*PercMc;
System.out.println("Employee Name:                  "+EmN);
System.out.println("Gross Pay:                      PHP "+G1);
System.out.println("________________________________________________");
System.out.println("Deductions                      Amount");
System.out.println("Withholding Tax                 PHP "+DeDucWtTt);
System.out.println("SSS Contribution:               PHP "+DeDucScTt);
System.out.println("Medicare:                       PHP "+DeDucMcTt);
System.out.println("Pag-IBIG Contribution:          PHP "+PgC);
System.out.println("________________________________________________");
System.out.println("Net Pay:                        PHP "+((G1)-(DeDucWtTt+DeDucScTt+DeDucMcTt+PgC)));
  }
}
