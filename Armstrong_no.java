class  Armstrong_no
{
public static void main (String[] args)
{
Armstrong_no an = new Armstrong_no();
an.find_armstrong(153);

}
void find_armstrong(int no)
{

int no2= no;
int arm = 0;
while(no>0)
{
int rem = no%10;
arm = arm + (rem*rem*rem);
no =no/10;
}
if (no2== arm)
{
System.out.println(arm);
}
}
}
