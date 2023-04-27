class Looping_Practice2
{
public static void main(String[] args)
{
Looping_Practice2 lp = new Looping_Practice2();
int power = lp.find_power(3,5); 
System.out.println(power);
}
int find_power(int base, int power)
{
int box = 1; 
while(power>0)
{
box = box * base;
power = power - 1; 
}
//System.out.println(box); 

return box;
} 
}
