 class Narrowing {
    public static void main (String [] args){
    // Narrowing programming questions:- 
    // 1.  Convert  double  to  int  and print result. 
        double a = 10;
        int aa = (int)a;
        System.out.println(aa);

    // 2.  Convert  float  to  int  and observe decimal loss. 
        float  b = 10.0f;
        int bb = (int)b;
        System.out.println(bb);

    // 3.  Convert  int  to  byte 
        int c = 10;
        byte cc= (byte)c;
        System.out.println(cc);

    // 4.  Convert  long  to  int  . 
        long d = 10;
        int dd = (int)d;
        System.out.println(dd);

    // 5.  Convert  double  to  float  . 
        double e = 10;
        float ee = (float)e;
        System.out.println(ee);

    // 6.  Convert  char  to  byte  . 
        char f = 10;
        byte ff = (byte)f;
        System.out.println(ff);

    // 7.  Convert  int  to  short  .
        int g = 20;
        short gg = (short)g;
        System.out.println(gg);

    // 8.  Convert  double 99.99  to  int  . 
        double h = 99.99;
        int hh = (int)h;
        System.out.println(hh);

    // 9.  Convert negative  int  to  byte  .
        int i = -12;
        byte ii = (byte)i;
        System.out.println(ii);

    // 10.  Add  int  and  double  and store in  int  . 
        int j = 10;
        double jj = 10;
        int jjj = j+(int)jj;
        System.out.println(jjj);

    // 11. Multiply  float  and  int  and store in  double  .
        float k = 10.30f;
        int kk = 10;
        double kkk = k *(double)kk;
        System.out.println(kkk);

    // 12.  Divide two integers and store result in  double  . 
        int l = 10;
        int ll = 5;
        double lll = l/(double)ll;

    // 13.  Add  char  and  int  and print result. 
        char m = 'A';
        int mm = 10;
        System.out.println(m+mm);

    // 14.  Convert result of  (5 + 2.5)  into  int  . 
        float n = 5+2.5f;
        int nn = (int)n;
        System.out.println(nn);
    // 15.  Multiply  double  and  float  , store in  int  .
        double o = 10.50;
        float oo = 10.50f;
        int ooo = (int)o * (int)oo;
        System.out.println(ooo);

    // 16.  Add  byte + byte  and store in  byte  .
        byte p = 10;
        byte pp = 10;
        //byte ppp = (byte)p + (byte)pp;
        //System.out.println(ppp);

    // 17.  Convert  (int)(5.9 + 2.1)  and print. 
        float q = 5.9f;
        float qq = 2.1f;
        int qqq = (int)q + (int)qq;
        System.out.println(qqq);

    // 18.  Add  char 'A' + 1  and print result. 
        char  r = 'A';
        int rr = (int)r+1;

    // 19.  Store  (10 / 3)  into  double
        double s = (10/3);
        System.out.println(s);
        
    }
    
}
