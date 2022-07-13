import java.util.*;


class LargestForwardDiagonal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> M = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer>temp = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            M.add(temp);
        }
        int result = largestForwardDiagonal(M);
        System.out.println(result);
        sc.close();
    }

    static int largestForwardDiagonal(ArrayList<ArrayList<Integer>>M){
        int maxSum = 0;
        for(int i = 0; i < M.size(); i++){
            int r = 0; int c = i;
            int sum1 = 0, sum2 = 0;
            while (c <= M.size() && r < M.size())
            {
                sum1 += M.get(r).get(c);
                if(c < r)
                {
                    sum2 += M.get(c).get(r);
                }

                r++;
                c++;
            }

            maxSum = Math.max(maxSum, Math.max(sum1, sum2));
        }
        return maxSum;
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/