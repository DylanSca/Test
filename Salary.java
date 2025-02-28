
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
 /**
  * 1) set hours worked
  * 2) set hourly wage
  * 3) number of hours worked*hourly wage= total salary
  * 4) total salary*0.30(tax)=Total salary after taxes 
  * 5) print total salary after taxes
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  * 
  */
 private double hours;
  private double salary;
  private double workedhours;
  private double hourlywage;
  private double netpay;
  public void getNetPay(double workedhours,double hourlywage)
  {
      salary= workedhours*hourlywage;
      netpay = salary*0.3;
    System.out.println(netpay);
  }
}
