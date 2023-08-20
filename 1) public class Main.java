1) public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++){
		    for(int j = 0;j<n;j++){
		        System.out.print("* ");
		    }System.out.println();
		}
	}
}

2) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<=i;j++){
	            System.out.print("* ");
	        }System.out.println();
	    }
	}
}

3) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<n-i;j++){
	            System.out.print("* ");
	        }System.out.println();
	    }
	}
}
4) 	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<n-i-1;j++){
	            System.out.print("\t");
	        }
	        for(int k = 0;k<=i;k++){
	            System.out.print("*\t");
	        }System.out.println();
	    }
	}

5) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int k = 0;k<i;k++){
	            System.out.print("\t");
	        }
	        for(int j = 0;j<=n-i-1;j++){
	            System.out.print("*\t");
	        }
              System.out.println();
	    }
	}
}
6) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<(i)*2;j++){
	            System.out.print("\t");
	        }
	        for(int k = 0;k<n-i;k++){
	            System.out.print("*\t");
	        }System.out.println();
	    }
	}
}
7) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i= 0;i<n;i++){
	        for(int j = 0;j<n;j++){
	            if(i==0 || j==0 || i==(n-1)||j==(n-1)){
	                System.out.print("* ");
	            }else{
	                System.out.print("  ");
	            }
	        }System.out.println();
	    }
	}
}
8) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<n;j++){
	            if(i==j || i+j==(n-1)){
	                System.out.print("* ");
	            }else{
	                System.out.print("  ");
	            }
	        }System.out.println();
	    }
	}
}
9) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = (n/2)+1;
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<=m-i;j++){
	            System.out.print("  ");
	        }
	        for(int k =0;k<(2*i+1);k++){
	            System.out.print("* ");
	        }System.out.println();
	    }
	}
}
10) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<i;j++){
	            System.out.print("  ");
	        }for(int k = 0;k<((n-i-1)*2)+1;k++){
	            System.out.print("* ");
	        }System.out.println();
	    }
	}
}
11) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<(n-i-1);j++){
	            System.out.print("  ");
	        }for(int k = 0;k<((i*2)+1);k++){
	            if(k%2==0){
	                System.out.print("* ");
	            }else{
	                System.out.print("  ");
	            }
	        }System.out.println();
	    }
	}
}
12) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        for(int j = 0;j<(n-i-1);j++){
	            System.out.print("  ");
	        }for(int k = 0;k<((i*2)+1);k++){
	            if(k%2==0){
	                System.out.print("* ");
	            }else{
	                System.out.print("! ");
	            }
	        }System.out.println();
	    }
	}
}
13) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<(n*2)-1;i++){
	        if(i<(n)){
	            for(int j = 0;j<(i+1);j++){
	                System.out.print("* ");
	            }
	        }else{
	            int x = (2*n)-1;
	            for(int j = 0;j<(x-i);j++){
	                System.out.print("* ");
	            }
	        }System.out.println();
	    }
	}
}
14) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<(n*2)-1;i++){
	        if(i<(n)){
	            for(int k = 0;k<(n-i-1);k++){
	                System.out.print("  ");
	            }
	            for(int j = 0;j<(i+1);j++){
	                System.out.print("* ");
	            }
	        }else{
	            for(int k = 0;k<(i-n+1);k++){
	                System.out.print("  ");
	            }
	            int x = (2*n)-1;
	            for(int j = 0;j<(x-i);j++){
	                System.out.print("* ");
	            }
	        }System.out.println();
	    }
	}
}
15) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<(2*n)-1;i++){
	        if(i<n){
	        for(int j = 0;j<i*2;j++){
	            System.out.print("  ");
	        }for(int k = 0;k<n-i;k++){
	            System.out.print("* ");
	        }
	        }else{
	            int m = (2*n)-1;
	            for(int j = 0;j<(m-i-1)*2;j++){
	                System.out.print("  ");
	            }for(int k = 0;k<(i-n+2);k++){
	                System.out.print("* ");
	            }
	        }System.out.println();
	    }
	}
}
16) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<(2*n)-1;i++){
	        if(i<n){
	        for(int j = 0;j<(n-i-1);j++){
	            System.out.print("  ");
	        }for(int k = 0;k<n-i;k++){
	            System.out.print("* ");
	        }
	        }else{
	            int m = (2*n)-1;
	            for(int j = 0;j<(i-n+1);j++){
	                System.out.print("  ");
	            }for(int k = 0;k<(i-n+2);k++){
	                System.out.print("* ");
	            }
	        }System.out.println();
	    }
	}
}

18) public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
	        if(i<=(n/2)){
	        for(int j = 0;j<(n/2)-i;j++){
	            System.out.print("  ");
	        }
	        for(int k = 0;k<(i*2)+1;k++){
	            System.out.print("* ");
	        }
	    }else{
	        for(int j = 0;j<(i-(n/2));j++){
	            System.out.print("  ");
	        }int x = i-(n/2);
	        for(int k = 0;k<n-(2*x);k++){
	            System.out.print("* ");
	        }
	    }System.out.println();
	    }
	    }
	}