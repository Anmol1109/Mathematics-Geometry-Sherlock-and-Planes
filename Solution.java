import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Solution {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        SherlockAndPlanes solver = new SherlockAndPlanes();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }
}

class SherlockAndPlanes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = 4;
        in.readLine();
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        boolean isPos[] = {false, false, false};
        for (int i = 0;i < n - 1;i++) {
            int a[] = in.parseInt1D(3);
            if(a[0] != x) isPos[0] = true;
            if(a[1] != y) isPos[1] = true;
            if(a[2] != z) isPos[2] = true;
        }
        if(!isPos[0] || !isPos[1] || !isPos[2]) out.println("YES");
        else out.println("NO");
    }
}

class InputReader {
    private BufferedReader br;
    private StringTokenizer st;
    public InputReader(InputStream in) {
        br=new BufferedReader(new InputStreamReader(in));
        try {
            st=new StringTokenizer(br.readLine());
        } catch (IOException ignored) {

        }
    }

    public boolean readLine() {
        try {
            st=new StringTokenizer(br.readLine());
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    public int nextInt(){
        return Integer.parseInt(st.nextToken());
    }

    public String next(){
        return st.nextToken();
    }

    /**
     * Parse 1D array from current StringTokenizer
     */
    public int[] parseInt1D(int n){
        readLine();
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[i]=nextInt();
        }
        return r;
    }


}
