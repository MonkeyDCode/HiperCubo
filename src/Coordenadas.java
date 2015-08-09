/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALBERTO
 */
public class Coordenadas {
    public static final int x0=40;
    public static final int x1=200;
    public static final int x2=100;
    public static final int x3=260;
    public static final int x4=40;
    public static final int x5=200;
    public static final int x6=100;
    public static final int x7=260;
    public static final int x8=340;
    public static final int x9=500;
    public static final int x10=400;
    public static final int x11=560;
    public static final int x12=340;
    public static final int x13=500;
    public static final int x14=400;
    public static final int x15=560;
    
    public static final int y0=140;
    public static final int y1=140;
    public static final int y2=200;
    public static final int y3=200;
    public static final int y4=300;
    public static final int y5=300;
    public static final int y6=360;
    public static final int y7=360;
    public static final int y8=140;
    public static final int y9=140;
    public static final int y10=200;
    public static final int y11=200;
    public static final int y12=300;
    public static final int y13=300;
    public static final int y14=360;
    public static final int y15=360;
    static String x;
    
    
    public static String decimalABinario(int x)
    {
        int exp=0;
        int binario=0;
        int numero=x;
        int digito;
        while(numero!=0){
                digito = numero % 2;            
                binario = (int) (binario + digito * Math.pow(10, exp));   
                exp++;
                numero = numero/2;
        }
        String b = String.valueOf(binario);
        while(b.length()<4)
        {
            b="0"+b;
        }
        return b;
    }
    
    public static int getX(int n)
    {
        if(n==0)
        {
             return x0;      
        }
        else if(n==1)
        {
            return x1;
        }
        else if(n==2)
        {
            return x2;
        }
        else if(n==3)
        {
            return x3;
        }
        else if(n==4)
        {
            return x4;
        }
        else if(n==5)
        {
            return x5;
        }
        else if(n==6)
        {
            return x6;
        }
        else if(n==7)
        {
            return x7;
        }
        else if(n==8)
        {
            return x8;
        }
        else if(n==9)
        {
            return x9;
        }
        else if(n==10)
        {
            return x10;
        }
        else if(n==11)
        {
            return x11;
        }
        else if(n==12)
        {
            return x12;
        }
        else if(n==13)
        {
            return x13;
        }
        else if(n==14)
        {
            return x14;
        }
        else if(n==15)
        {
            return x15;
        }
        return 0;
                
    }
     public static int getY(int n)
    {
        if(n==0)
        {
             return y0;       
        }
        else if(n==1)
        {
            return y1;
        }
        else if(n==2)
        {
            return y2;
        }
        else if(n==3)
        {
            return y3;
        }
        else if(n==4)
        {
            return y4;
        }
        else if(n==5)
        {
            return y5;
        }
        else if(n==6)
        {
            return y6;
        }
        else if(n==7)
        {
            return y7;
        }
        else if(n==8)
        {
            return y8;
        }
        else if(n==9)
        {
            return y9;
        }
        else if(n==10)
        {
            return y10;
        }
        else if(n==11)
        {
            return y11;
        }
        else if(n==12)
        {
            return y12;
        }
        else if(n==13)
        {
            return y13;
        }
        else if(n==14)
        {
            return y14;
        }
        else if(n==15)
        {
            return y15;
        }
        return 0;
                
    }
     
     public static int getDiagonalX(int x)
     {
         if(x==0)
         {
             return x2;
         }
         else if(x==1)
         {
             return x3;
         }
         else if(x==4)
         {
             return x6;
         }
         else if(x==6)
         {
             return x4;
         }
         else if(x==5)
         {
             return x7;
         }
         else if(x==2)
         {
             return x0;
         }
         else if(x==3)
         {
             return x1;
         }
         else if(x==7)
         {
             return x5;
         }
         else if(x==8)
         {
             return x10;
         }
         else if(x==10)
         {
             return x8;
         }
         else if(x==9)
         {
             return x11;
         }
         else if(x==11)
         {
             return x9;
         }
         else if(x==12)
         {
             return x14;
         }
         else if(x==14)
         {
             return x12;
         }
         else if(x==13)
         {
             return x15;
         }
         else if(x==15)
         {
             return x13;
         }
         else return 0;
     }
     public static int getDiagonalY(int x)
     {
         if(x==0)
         {
             return y2;
         }
         else if(x==1)
         {
             return y3;
         }
         else if(x==4)
         {
             return y6;
         }
         else if(x==6)
         {
             return y4;
         }
         else if(x==5)
         {
             return y7;
         }
         else  if(x==2)
         {
             return y0;
         }
         else if(x==3)
         {
             return y1;
         }
         else if(x==7)
         {
             return y5;
         }
         else if(x==8)
         {
             return y10;
         }
         else if(x==10)
         {
             return y8;
         }
         else if(x==9)
         {
             return y11;
         }
         else if(x==11)
         {
             return y9;
         }
         else if(x==12)
         {
             return y14;
         }
         else if(x==14)
         {
             return y12;
         }
         else if(x==13)
         {
             return y15;
         }
         else if(x==15)
         {
             return y13;
         }
         return 0;
     }
     
     public static int getHorizontalX(int x)
     {
         if(x==0)
         {
             return x1;
         }
         else if(x==1)
         {
             return x0;
         }
         else if(x==4)
         {
             return x5;
         }
         else if(x==6)
         {
             return x7;
         }
         else if(x==5)
         {
             return x4;
         }
         else if(x==2)
         {
             return x3;
         }
         else if(x==3)
         {
             return x2;
         }
         else if(x==7)
         {
             return x6;
         }
         else if(x==8)
         {
             return x9;
         }
         else if(x==10)
         {
             return x11;
         }
         else if(x==9)
         {
             return x8;
         }
         else if(x==11)
         {
             return x10;
         }
         else if(x==12)
         {
             return x13;
         }
         else if(x==14)
         {
             return x15;
         }
         else if(x==13)
         {
             return x12;
         }
         else if(x==15)
         {
             return x14;
         }
         else return 0;
     }
      public static int getHorizontalY(int x)
     {
         if(x==0)
         {
             return y1;
         }
         else if(x==1)
         {
             return y0;
         }
         else if(x==4)
         {
             return y5;
         }
         else if(x==6)
         {
             return y7;
         }
         else if(x==5)
         {
             return y4;
         }
         else if(x==2)
         {
             return y3;
         }
         else if(x==3)
         {
             return y2;
         }
         else if(x==7)
         {
             return y6;
         }
         else if(x==8)
         {
             return y9;
         }
         else if(x==10)
         {
             return y11;
         }
         else if(x==9)
         {
             return y8;
         }
         else if(x==11)
         {
             return y10;
         }
         else if(x==12)
         {
             return y13;
         }
         else if(x==14)
         {
             return y15;
         }
         else if(x==13)
         {
             return y12;
         }
         else if(x==15)
         {
             return y14;
         }
         else return 0;
         
     }

     public static int getVerticalX(int x)
     {
         if(x==0)
         {
             return x4;
         }
         else if(x==1)
         {
             return x5;
         }
         else if(x==4)
         {
             return x0;
         }
         else if(x==6)
         {
             return x2;
         }
         else if(x==5)
         {
             return x1;
         }
         else if(x==2)
         {
             return x6;
         }
         else if(x==3)
         {
             return x7;
         }
         else if(x==7)
         {
             return x3;
         }
         else if(x==8)
         {
             return x12;
         }
         else if(x==10)
         {
             return x14;
         }
         else if(x==9)
         {
             return x13;
         }
         else if(x==11)
         {
             return x15;
         }
         else if(x==12)
         {
             return x8;
         }
         else if(x==14)
         {
             return x10;
         }
         else if(x==13)
         {
             return x9;
         }
         else if(x==15)
         {
             return x11;
         }
         else return 0;
     }
     public static int getVerticalY(int x)
     {
         if(x==0)
         {
             return y4;
         }
         else if(x==1)
         {
             return y5;
         }
         else if(x==4)
         {
             return y0;
         }
         else if(x==6)
         {
             return y2;
         }
         else if(x==5)
         {
             return y1;
         }
         else if(x==2)
         {
             return y6;
         }
         else if(x==3)
         {
             return y7;
         }
         else if(x==7)
         {
             return y3;
         }
         else if(x==8)
         {
             return y12;
         }
         else if(x==10)
         {
             return y14;
         }
         else if(x==9)
         {
             return y13;
         }
         else if(x==11)
         {
             return y15;
         }
         else if(x==12)
         {
             return y8;
         }
         else if(x==14)
         {
             return y10;
         }
         else if(x==13)
         {
             return y9;
         }
         else if(x==15)
         {
             return y11;
         }
         else return 0;
     }
     
     public static int getCurvaX(int x)
     {
         if(x==0)
         {
             return x8;
         }
         else if(x==1)
         {
             return x9;
         }
         else if(x==4)
         {
             return x12;
         }
         else if(x==6)
         {
             return x14;
         }
         else if(x==5)
         {
             return x13;
         }
         else if(x==2)
         {
             return x10;
         }
         else if(x==3)
         {
             return x11;
         }
         else if(x==7)
         {
             return x15;
         }
         else if(x==8)
         {
             return x0;
         }
         else if(x==10)
         {
             return x2;
         }
         else if(x==9)
         {
             return x1;
         }
         else if(x==11)
         {
             return x3;
         }
         else if(x==12)
         {
             return x4;
         }
         else if(x==14)
         {
             return x6;
         }
         else if(x==13)
         {
             return x5;
         }
         else if(x==15)
         {
             return x7;
         }
         else return 0;
     }
     public static int getCurvaY(int x)
     {
         if(x==0)
         {
             return y8;
         }
         else if(x==1)
         {
             return y9;
         }
         else if(x==4)
         {
             return y12;
         }
         else if(x==6)
         {
             return y14;
         }
         else if(x==5)
         {
             return y13;
         }
         else if(x==2)
         {
             return y10;
         }
         else if(x==3)
         {
             return y11;
         }
         else if(x==7)
         {
             return y15;
         }
         else if(x==8)
         {
             return y0;
         }
         else if(x==10)
         {
             return y2;
         }
         else if(x==9)
         {
             return y1;
         }
         else if(x==11)
         {
             return y3;
         }
         else if(x==12)
         {
             return y4;
         }
         else if(x==14)
         {
             return y6;
         }
         else if(x==13)
         {
             return y5;
         }
         else if(x==15)
         {
             return y7;
         }
         else return 0;
     }
     
     public static int getNextDiagonal(int x)
     {
         int a=-1;
         if(x==0) a=2;
         if(x==1) a=3;
         if(x==2) a=0;
         if(x==3) a=1;
         if(x==4) a=6;
         if(x==5) a=7;
         if(x==6) a=4;
         if(x==7) a=5;
         if(x==8) a=10;
         if(x==9) a=11;
         if(x==10) a=8;
         if(x==11) a=9;
         if(x==12) a=14;
         if(x==13) a=15;
         if(x==14) a=12;
         if(x==15) a=13;
         return a;
     }
     public static int getNextVertical(int x)
     {
         int a=-1;
         if(x==0) a=4;
         if(x==1) a=5;
         if(x==2) a=6;
         if(x==3) a=7;
         if(x==4) a=0;
         if(x==5) a=1;
         if(x==6) a=2;
         if(x==7) a=3;
         if(x==8) a=12;
         if(x==9) a=13;
         if(x==10) a=14;
         if(x==11) a=15;
         if(x==12) a=8;
         if(x==13) a=9;
         if(x==14) a=10;
         if(x==15) a=11;
         return a;
     }
     public static int getNextHorizontal(int x)
     {
         int a=-1;
         if(x==0) a=1;
         if(x==1) a=0;
         if(x==2) a=3;
         if(x==3) a=2;
         if(x==4) a=5;
         if(x==5) a=4;
         if(x==6) a=7;
         if(x==7) a=6;
         if(x==8) a=9;
         if(x==9) a=8;
         if(x==10) a=11;
         if(x==11) a=10;
         if(x==12) a=13;
         if(x==13) a=12;
         if(x==14) a=15;
         if(x==15) a=14;
         return a;
     }
    
}
