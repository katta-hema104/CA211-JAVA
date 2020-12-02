package mypack;
public class Balance{
string name;
double bal;
       public Balance(string n, double b){
name=n;
bal=b;
}
public void show(){
if (bal<0)
system.out.print("-->");
system.out.println(name+";$"+bal);
 }
}