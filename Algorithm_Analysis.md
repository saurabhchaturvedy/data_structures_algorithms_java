Time Complexity - Time taken by an algorithm to run . Input processed by
an algorithm helps in determining time complexity .

Sum of N natural numbers :

(i.) First Approach public int findSum(int n) { return n\*(n+1)/2; }

(ii.) Second Approach public int findSum(int n) { int sum = 0; for(int
i=1; i\<=n; i++) { sum = sum+i; } return sum; }

Space Complexity - It is the amount of memory taken by an algorithm to
run .

Asymptotic Analysis - helps in evaluating performance of an algorithm in
terms of input size (N) and its increase .

Asymptotic Notation - mathematical tools used to describe the running
time of an algorithm in terms of its input size .

Example - Performance of car in 1 litre petrol .

(i.) Highway (low traffic) - 25 km/hr (Best) (ii.) City (high traffic) -
15 km/hr (Worst) (iii.) City + Highway (medium traffic) - 20 km/hr
(Average)

Types of Asymptotic Notations :

(i.) Omega (Ω) notation (lower bound): best amount of time an algorithm
can take to complete . (Best case - least used) (ii.) Big (O) notation
(upper bound) : longest amount of time an algorithm can take . (Worst
case - mostly used) (iii.) Theta (Θ) notation (upper + lower bound) :
for any given input size , determines the average time .(Average case -
least used)

Analysis and Rules of calculating Big O notation :

Given a machine :

(i) Its a single processor . (ii.) Executing the algorithm sequentially
    . (iii.) Assignment operation (=) - takes 1 unit of time . (iv.)
    Return statement - takes 1 unit of time . (v.) Arithmetic operation
    - takes 1 unit of time . (vi.) Logical operation - takes 1 unit of
    time . (vii.) Other small/single operations - takes 1 unit of time .
    (viii.) Drop lower order terms - 4x2 + 9x + 7 =\> O(n2) (ix.) Drop
    constant multipliers - 4x2 + 9x + 7 drop 4,9 .

1.  Calculating Time complexity of Constant Algorithm :

public int sum(int x, int y) { int result = x+y ; return return result ;
}

public int get(int[]arr,int i) { return arr[i]; }

Time Complexity : O(1)

2.  Calculating Time complexity of a Linear Algorithm :

public void findSum(int n) { int sum = 0;

for(int i=1; i\<=n; i++) { sum = sum+i; }

return sum ; }

Time Complexity : O(n)

3.  Calculating Time complexity of a Polynomial Algorithm :

public void print(int n) { for(int i=1; i\<=n; i++) { for(int j=1;
j\<=n; j++) { System.out.println("i= "+i+"j= "+j); }
System.out.println("End of inner loop"); } System.out.println("End of
outer loop"); }

Time Complexity : O(n2)
