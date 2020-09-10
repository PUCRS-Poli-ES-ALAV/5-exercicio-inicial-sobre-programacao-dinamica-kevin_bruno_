import java.util.ArrayList;

public class Main{

    public static int iterations;
    public static void main(String[] args) {
        

        // System.out.println("+------------------------------------+");
        // System.out.println("|               fibo_rec             |");
        // System.out.println("+------------------------------------+");
        // System.out.println("| nth number | time(ms) | iterations |");
        // System.out.println("+------------------------------------+");
        
        // var start = System.currentTimeMillis();
        // fibo_rec(4);
        // var end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 4, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo_rec(8);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 8, end, iterations));
        
        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo_rec(16);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 16, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo_rec(32);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 32, end, iterations));
        // System.out.println("+------------------------------------+\n");

        // System.out.println("+------------------------------------+");
        // System.out.println("|                 fibo               |");
        // System.out.println("+------------------------------------+");
        // System.out.println("| nth number | time(ms) | iterations |");
        // System.out.println("+------------------------------------+");
        
        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(4);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 4, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(8);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 8, end, iterations));
        
        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(16);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 16, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(32);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 32, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(128);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 128, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(1000);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 1000, end, iterations));

        // iterations = 0;
        // start = System.currentTimeMillis();
        // fibo(10000);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 10000, end, iterations));
        // System.out.println("+------------------------------------+\n");

    
        // System.out.println("+------------------------------------+");
        // System.out.println("|            memoized_fibo           |");
        // System.out.println("+------------------------------------+");
        // System.out.println("| nth number | time(ms) | iterations |");
        // System.out.println("+------------------------------------+");

        // int[] vec = new int[5];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 4);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 4, end, iterations));

        // vec = new int[9];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 8);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 8, end, iterations));

        // vec = new int[17];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 16);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 16, end, iterations));

        // vec = new int[33];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 32);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 32, end, iterations));

        // vec = new int[129];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 128);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 128, end, iterations));

        // vec = new int[1001];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 1000);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 1000, end, iterations));

        // vec = new int[10001];
        // iterations = 0;
        // start = System.currentTimeMillis();
        // memoized_fibo(vec, 10000);
        // end = System.currentTimeMillis() - start;
        // System.out.println(String.format("|%12d|%10d|%12d|", 10000, end, iterations));
        // System.out.println("+------------------------------------+");
        
        var itens1 = new ArrayList<itens>() {{
            add(new itens(23, 92));
            add(new itens(31, 57));
            add(new itens(29, 49));
            add(new itens(44, 68));
            add(new itens(53, 60));
            add(new itens(38, 43));
            add(new itens(63, 67));
            add(new itens(85, 84));
            add(new itens(89, 87));
            add(new itens(82, 72));
        }};

        var response = maxTab(165, 10, itens1);
        //Blocos selecionados: 1, 2, 3, 4, 6

        System.out.println("Response 1: " + response);

        var itens2 = new ArrayList<itens>() {{
            add(new itens(56, 50));
            add(new itens(59, 50));
            add(new itens(80, 64));
            add(new itens(64, 46));
            add(new itens(75, 50));
            add(new itens(17, 05));
        }};

        response = maxTab(190, 6, itens2);
        //Blocos selecionados: 1, 2 e 5

        System.out.println("Response 2: " + response);
    }

    public static int fibo_rec(int n) {
        iterations++;
        if(n <= 1)
            return n;
        
        return  fibo_rec(n - 1) + fibo_rec(n - 2);
    }

    public static int fibo(int n) {
        int[] f = new int[n + 1];

        f[0] = 0;
        f[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            iterations++;
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n];
    }
    
    public static int memoized_fibo(int[] f, int n) {
        for (int i = 0; i <= n; i++)
            f[i] = -1;

        return lookup_fibo(f, n);
    }
    
    public static int lookup_fibo(int[] f, int  n) {
        iterations++;
        
        if (f[n] >= 0)
            return f[n];

        if (n <= 1)
            f[n] = n;
        
        else
            f[n] = lookup_fibo(f, n - 1) + lookup_fibo(f, n - 2);
        
        return f[n];
    }

    public static class itens {
        public int peso;
        public int valor;

        public itens(int peso,int valor){
            this.valor = valor;
            this.peso = peso;
        }
    }
   // N = número de produtos;
   // C = capacidade real da mochila
    public static int maxTab(int C, int N, ArrayList<itens> itens) {
        
        int[][] maxtab = new int[N + 1][C + 1];

        for(int i = 1; i < N; i++) {
            for(int j = 1; j < C; j++) {
                if(itens.get(i).peso <= j) {
                    maxtab[i][j] = max(maxtab[i - 1][j], itens.get(i).valor + maxtab[i - 1][j - itens.get(i).peso]);
                
                } else {
                    maxtab[i][j] = maxtab[i - 1][j];
                } 
            }
        }

        return maxtab[N][C];
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}