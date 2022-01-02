public class dec30 {
    public static void main(String[] args)
     {
        System.out.print(fun2(a,b));
        // fun(x,y);
        fun2(10,8);
    
    // public static int fun(int x,int y)
    // {
    //     if(y==0)
    //     {
    //         return 0;
    //     }
    //     else{
    //         return (x+fun(x,y-1));
    //     }
        public static int fun2(int a,int b)
        {
            if(b==0)
            {
                return 1;
            }
            else{
                return fun2(a,fun2(a,b-1));
            }
        }
    
}

 }  
    

