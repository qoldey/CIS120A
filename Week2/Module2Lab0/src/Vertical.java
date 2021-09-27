import java.util.Scanner;

public class Vertical {
    public static void main(String[] args) {

        String A = """

                        **
                       ****
                      ******
                     ***  ***
                    **********
                   ************
                  ***        ***
                 ***          ***
                ***            ***
                """;
        String B = """

                **********
                **      ***
                **      ***
                ***********
                ***********
                **      ***
                **      ***
                **********
                *********
                """;
        String C = """

                  **********
                 ****    ****
                ***
                **
                **
                ***
                 ****    ****
                  **********
                     ****
                     """;
        String D = """

                ***********
                **      ****
                **        ***
                **         **
                **         **
                **         **
                **      ****
                ***********
                ***********
                """;
        String E = """

                ***********
                **
                **
                *******
                *******
                **
                **
                ***********
                ***********
                """;
        String F = """

                ***********
                **
                **
                *******
                *******
                **
                **
                **
                **
                """;
        String G = """

                  **********
                 ****    ****
                ***
                **
                **      *****
                ***        **
                 ****    ****
                  **********
                     ****
                      """;
        String H = """

                **        **
                **        **
                **        **
                ************
                ************
                **        **
                **        **
                **        **
                **        **
                """;
        String I = """

                **
                **
                **
                **
                **
                **
                **
                **
                **
                 """;
        String J = """

                        **
                        **
                        **
                        **
                        **
                        **
                        **
                ***   ****
                 ********
                  """;
        String K = """

                **      ***
                **    ****
                **  ****
                *******
                ********
                ***   ***
                **     ****
                **       ***
                **        ***
                """;
        String L = """

                **
                **
                **
                **
                **
                **
                **
                **
                ***********
                  """;
        String M = """

                ***           ***
                ****         ****
                *****       *****
                ** ***     *** **
                **  ***   ***  **
                **   *** ***   **
                **    *****    **
                **     ***     **
                **      *      **
                 """;
        String N = """

                ****      **
                *****     **
                ** ***    **
                **  ***   **
                **   ***  **
                **    *** **
                **     *****
                **      ****
                **       ***
                """;
        String O = """

                  **********
                 ****    ****
                ***        ***
                **          **
                **          **
                ***        ***
                 ****    ****
                  **********
                     ****
                     """;
        String P = """

                **********
                **      ***
                **      ***
                ***********
                *********
                **
                **
                **
                **
                """;
        String Q = """

                 **********
                 ****    ****
                ***        ***
                **          **
                **          **
                ***    *******
                 ****    ****
                  ************
                    ***********
                    """;
        String R = """

                **********
                **      ***
                **      ***
                ***********
                *********
                **    ***
                **     ***
                **      ***
                **       ***
                """;
        String S = """

                *********
                ***     ***
                ***
                *********
                  *********
                        ***
                ***     ***
                 *********
                   *****
                    """;
        String T = """

                ************
                     **
                     **
                     **
                     **
                     **
                     **
                     **
                     **
                     """;
        String U = """

                **        **
                **        **
                **        **
                **        **
                **        **
                **        **
                ****    ****
                 **********
                   ******
                   """;
        String V = """

                **           **
                ***         ***
                 ***       ***
                  ***     ***
                   ***   ***
                    *** ***
                     *****
                      ***
                       *

                """;
        String W = """

                ***        *        ***
                ***       ***       ***
                 ***     *****     ***
                  **     ** **     **
                  ***   *** ***   ***
                   *** ***   *** ***
                    *****     *****
                     ***       ***
                      *         *
                      """;
        String X = """

                 **        **
                  ***    ***
                   ***  ***
                     ****
                     ****
                   ***  ***
                  ***    ***
                 **        **
                **          **
                """;
        String Y = """

                **        **
                 ***    ***
                  ***  ***
                   ******
                    ****
                     **
                     **
                     **
                     **
                      """;
        String Z = """

                ************
                         ***
                       ****
                     ****
                   ****
                 ****
                ***
                ************
                ************
                """;
        String BRG = """

                **********   **********     **********
                **      ***  **      ***   ****    ****
                **      ***  **      ***  ***
                ***********  ***********  **
                ***********  *********    **      *****
                **      ***  **    ***    ***        **
                **      ***  **     ***    ****    ****
                **********   **      ***    **********
                *********    **       ***      ****
                                """;

        // String[] alphabet = { A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R,
        // S, T, U, V, W, X, Y, Z };
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";
        String g = "G";
        String h = "H";
        String i = "I";
        String j = "J";
        String k = "K";
        String l = "L";
        String m = "M";
        String n = "N";
        String o = "O";
        String p = "P";
        String q = "Q";
        String r = "R";
        String s = "S";
        String t = "T";
        String u = "U";
        String v = "V";
        String w = "W";
        String x = "X";
        String y = "Y";
        String z = "Z";

        System.out.println("Please Enter Your Initials: "); // prompt user
        System.out.println("First Initial: ");
        Scanner input = new Scanner(System.in); // get input
        String initials = input.next(); // set input

        System.out.println("Second Initial: ");
        String initials2 = input.next();

        System.out.println("Third Initial: ");
        String initials3 = input.next();
        input.close();

        System.out.println("Initials as Stars: ");

        if (initials.equalsIgnoreCase(a)) {
            System.out.println(A);
        }
        if (initials.equalsIgnoreCase(b)) {
            System.out.println(B);
        }
        if (initials.equalsIgnoreCase(c)) {
            System.out.println(C);
        }
        if (initials.equalsIgnoreCase(d)) {
            System.out.println(D);
        }
        if (initials.equalsIgnoreCase(e)) {
            System.out.println(E);
        }
        if (initials.equalsIgnoreCase(f)) {
            System.out.println(F);
        }
        if (initials.equalsIgnoreCase(g)) {
            System.out.println(G);
        }
        if (initials.equalsIgnoreCase(h)) {
            System.out.println(H);
        }
        if (initials.equalsIgnoreCase(i)) {
            System.out.println(I);
        }
        if (initials.equalsIgnoreCase(j)) {
            System.out.println(J);
        }
        if (initials.equalsIgnoreCase(k)) {
            System.out.println(K);
        }
        if (initials.equalsIgnoreCase(l)) {
            System.out.println(L);
        }
        if (initials.equalsIgnoreCase(m)) {
            System.out.println(M);
        }
        if (initials.equalsIgnoreCase(n)) {
            System.out.println(N);
        }
        if (initials.equalsIgnoreCase(o)) {
            System.out.println(O);
        }
        if (initials.equalsIgnoreCase(p)) {
            System.out.println(P);
        }
        if (initials.equalsIgnoreCase(q)) {
            System.out.println(Q);
        }
        if (initials.equalsIgnoreCase(r)) {
            System.out.println(R);
        }
        if (initials.equalsIgnoreCase(s)) {
            System.out.println(S);
        }
        if (initials.equalsIgnoreCase(t)) {
            System.out.println(T);
        }
        if (initials.equalsIgnoreCase(u)) {
            System.out.println(U);
        }
        if (initials.equalsIgnoreCase(v)) {
            System.out.println(V);
        }
        if (initials.equalsIgnoreCase(w)) {
            System.out.println(W);
        }
        if (initials.equalsIgnoreCase(x)) {
            System.out.println(X);
        }
        if (initials.equalsIgnoreCase(y)) {
            System.out.println(Y);
        }
        if (initials.equalsIgnoreCase(z)) {
            System.out.println(Z);
        }

        //
        if (initials2.equalsIgnoreCase(a)) {
            System.out.println(A);
        }
        if (initials2.equalsIgnoreCase(b)) {
            System.out.println(B);
        }
        if (initials2.equalsIgnoreCase(c)) {
            System.out.println(C);
        }
        if (initials2.equalsIgnoreCase(d)) {
            System.out.println(D);
        }
        if (initials2.equalsIgnoreCase(e)) {
            System.out.println(E);
        }
        if (initials2.equalsIgnoreCase(f)) {
            System.out.println(F);
        }
        if (initials2.equalsIgnoreCase(g)) {
            System.out.println(G);
        }
        if (initials2.equalsIgnoreCase(h)) {
            System.out.println(H);
        }
        if (initials2.equalsIgnoreCase(i)) {
            System.out.println(I);
        }
        if (initials2.equalsIgnoreCase(j)) {
            System.out.println(J);
        }
        if (initials2.equalsIgnoreCase(k)) {
            System.out.println(K);
        }
        if (initials2.equalsIgnoreCase(l)) {
            System.out.println(L);
        }
        if (initials2.equalsIgnoreCase(m)) {
            System.out.println(M);
        }
        if (initials2.equalsIgnoreCase(n)) {
            System.out.println(N);
        }
        if (initials2.equalsIgnoreCase(o)) {
            System.out.println(O);
        }
        if (initials2.equalsIgnoreCase(p)) {
            System.out.println(P);
        }
        if (initials2.equalsIgnoreCase(q)) {
            System.out.println(Q);
        }
        if (initials2.equalsIgnoreCase(r)) {
            System.out.println(R);
        }
        if (initials2.equalsIgnoreCase(s)) {
            System.out.println(S);
        }
        if (initials2.equalsIgnoreCase(t)) {
            System.out.println(T);
        }
        if (initials2.equalsIgnoreCase(u)) {
            System.out.println(U);
        }
        if (initials2.equalsIgnoreCase(v)) {
            System.out.println(V);
        }
        if (initials2.equalsIgnoreCase(w)) {
            System.out.println(W);
        }
        if (initials2.equalsIgnoreCase(x)) {
            System.out.println(X);
        }
        if (initials2.equalsIgnoreCase(y)) {
            System.out.println(Y);
        }
        if (initials2.equalsIgnoreCase(z)) {
            System.out.println(Z);
        }

        //
        if (initials3.equalsIgnoreCase(a)) {
            System.out.println(A);
        }
        if (initials3.equalsIgnoreCase(b)) {
            System.out.println(B);
        }
        if (initials3.equalsIgnoreCase(c)) {
            System.out.println(C);
        }
        if (initials3.equalsIgnoreCase(d)) {
            System.out.println(D);
        }
        if (initials3.equalsIgnoreCase(e)) {
            System.out.println(E);
        }
        if (initials3.equalsIgnoreCase(f)) {
            System.out.println(F);
        }
        if (initials3.equalsIgnoreCase(g)) {
            System.out.println(G);
        }
        if (initials3.equalsIgnoreCase(h)) {
            System.out.println(H);
        }
        if (initials3.equalsIgnoreCase(i)) {
            System.out.println(I);
        }
        if (initials3.equalsIgnoreCase(j)) {
            System.out.println(J);
        }
        if (initials3.equalsIgnoreCase(k)) {
            System.out.println(K);
        }
        if (initials3.equalsIgnoreCase(l)) {
            System.out.println(L);
        }
        if (initials3.equalsIgnoreCase(m)) {
            System.out.println(M);
        }
        if (initials3.equalsIgnoreCase(n)) {
            System.out.println(N);
        }
        if (initials3.equalsIgnoreCase(o)) {
            System.out.println(O);
        }
        if (initials3.equalsIgnoreCase(p)) {
            System.out.println(P);
        }
        if (initials3.equalsIgnoreCase(q)) {
            System.out.println(Q);
        }
        if (initials3.equalsIgnoreCase(r)) {
            System.out.println(R);
        }
        if (initials3.equalsIgnoreCase(s)) {
            System.out.println(S);
        }
        if (initials3.equalsIgnoreCase(t)) {
            System.out.println(T);
        }
        if (initials3.equalsIgnoreCase(u)) {
            System.out.println(U);
        }
        if (initials3.equalsIgnoreCase(v)) {
            System.out.println(V);
        }
        if (initials3.equalsIgnoreCase(w)) {
            System.out.println(W);
        }
        if (initials3.equalsIgnoreCase(x)) {
            System.out.println(X);
        }
        if (initials3.equalsIgnoreCase(y)) {
            System.out.println(Y);
        }
        if (initials3.equalsIgnoreCase(z)) {
            System.out.println(Z);
        }
    }
}
