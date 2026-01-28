public class MyFirstProgram {
    public static void main(String[] args) {
        int a =5;
        int b= 10;
        char mychar = '\\';
        Boolean x = false;
        String name = "santosh";
        System.out.println("Hello! " + name);

        System.out.println(a);
        System.out.println(a+b);
        System.out.println(mychar);
        PrintName(name);

        System.out.println("Hello! " + getName(name));

        System.out.println(sum(a,b));
    }


  public static void PrintName(String name)
  {
      String fullname = "My name is "+name + " poudel.";
      System.out.println(fullname);
  }

    public static String getName(String name)
    {
        String res = "My name is "+name + " poudel. This is with return";
        return res;
    }

    public static int sum (int a ,int b){
        return a + b;
    }
}
