class Widening{
    public static void main(String[] args) {
        // 1.  Convert  int  to  double  using implicit casting. 
        int a= 10;
        double aa= (int)a;

        //2.  Store a  byte  value into an  int  variable. 
        byte b = 10;
        int  bb = (byte)b;

    //3.  Convert  char 'A'  into  int  and print ASCII value. 
    char c = 'A';
    int cc = (char)c;
    System.err.println(c+" ASCII is "+cc);

    // 4.  Assign a  short  value to a  long  variable. 
    short d= 10;
    long dd = (short)d;


    // 5.  Convert  int  to  float  and print result. 
    int e = 10;
    float ee= (int)e;
    System.out.println(ee);

    // 6.  Store  char  into  double  .
    char f = 10;
    double ff = (char)f;

    // 7.  Assign  byte  to  float  . 
    byte g = 10;
    float gg = (byte)g;

    // 8.  Convert  int  to  long  and print. 
    int h = 10;
    long hh = (int)h;
    System.out.println(hh);

    // 9.  Store  char 'a'  into  int  .
    char i = 'a';
    int ii = (char)i;
    System.out.println(ii);

    // 10.  Convert  int  to  double  and perform addition. 
    int j = 10;
    double jj = (int)j+10;
    System.out.println(jj);


    }
}