import java.io.EOFException;
import java.util.Scanner;
import bank.bank;
import java.lang.*;
import java.io.File;
import java.io.FileNotFoundException;

public class bankloan {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.println("Number of banks: ");
        try {
            int g = j.nextInt();

            Scanner k = new Scanner(System.in);
            System.out.println("Minimum asset limit");
            double lim = k.nextDouble();
            bank[] bnk = new bank[g];


            File textFile = new File("instruct.txt");
            if (!textFile.exists()) {
                System.out.println(textFile.getAbsolutePath());
                System.out.println(textFile + " does not exist.");
                System.exit(1);
            }
            int o = 0;
            double a = 0;
            int y = 0;
            double a1 = 0;
            int r = 0;
            double a2 = 0;
            int z = 0;
            double a3 = 0;
            int h = 0;
            double a4 = 0;
            double a5 = 0;
            int re = 0;
            int er = 0;
            double a6 = 0;
            double a7 = 0;
            int x = 0;
            int he = 0;
            int yu = 0;
            double a8 = 0;
            double a9 = 0;

            try {
                Scanner input = new Scanner(textFile);
                //bank 0
                int bank = input.nextInt();
                double bal = input.nextDouble();
                double many = input.nextDouble();
                bnk[bank] = new bank(bank, bal, lim);
                if (many == 1) {
                    o = input.nextInt();
                    a = input.nextDouble();
                    if(o > g || o == bank){
                        System.out.println("Error Bank not found or Bank cannot borrow from itself");
                    }else{

                    bnk[bank].lend(a);}
                } else if (many == 2) {
                    o = input.nextInt();
                    a = input.nextDouble();
                    if(o > g || o == bank){
                        System.out.println("Error Bank not found or Bank cannot borrow from itself");;
                    }else{

                        bnk[bank].lend(a);}


                    y = input.nextInt();
                    a1 = input.nextDouble();
                    if(y > g || y == bank){
                        System.out.println("Error Bank not found or Bank cannot borrow from itself");
                    }else{

                        bnk[bank].lend(a);}



                }
                if ((g - 1) >= 1) {
                    //bank 1
                    int hs = input.nextInt();
                    double yp = input.nextDouble();
                    double man = input.nextDouble();
                    bnk[hs] = new bank(hs,bal, lim);
                    if (man == 1) {
                        r = input.nextInt();
                        a2 = input.nextDouble();
                        if(r > g || r == hs){
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        }else{


                        bnk[hs].lend(a2);}
                    } else if (man == 2) {
                        r = input.nextInt();

                        a2 = input.nextDouble();
                        if(r > g || r == hs){
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        }else{


                            bnk[hs].lend(a2);}


                        z = input.nextInt();
                        a3 = input.nextDouble();


                        if(z > g || z == hs){
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        }else{


                            bnk[hs].lend(a2);}

                    }
                }
                //bank 2
                if ((g - 1) >= 2) {
                    int l = input.nextInt();
                    double al = input.nextDouble();
                    double any = input.nextDouble();
                    bnk[l] = new bank(l,al, lim);
                    if (any == 1) {
                        h = input.nextInt();
                        a4 = input.nextDouble();
                        if(h > g || h == l){
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        }else{

                        bnk[l].lend(a4);}
                    } else if (any == 2) {
                        h = input.nextInt();

                        a4 = input.nextDouble();


                        if(h > g || h == l){
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        }else{

                            bnk[l].lend(a4);}
                        x = input.nextInt();
                        a5 = input.nextDouble();


                        if(x > g || x == l){
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        }else{

                            bnk[l].lend(a4);}

                    }
                }
                //bank3
                if ((g - 1) >= 3) {
                    int nk = input.nextInt();
                    double ba = input.nextDouble();
                    double may = input.nextDouble();
                    bnk[nk] = new bank(nk, ba, lim);
                    if (may == 1) {
                        re = input.nextInt();
                        a6 = input.nextDouble();
                        if (re > g && re == nk) {
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        } else {
                            bnk[nk].lend(a6);
                        }
                    } else if (may == 2) {
                        re = input.nextInt();

                        a6 = input.nextDouble();


                        if (re > g && re == nk) {
                            System.out.println("Error Bank not found or Bank cannot borrow from itself");
                        } else {
                            bnk[nk].lend(a6);
                            er = input.nextInt();
                            a7 = input.nextDouble();


                            if (er > g && er == nk) {
                                System.out.println("Error Bank not found or Bank cannot borrow from itself");
                            } else {
                                bnk[nk].lend(a6);

                            }
                        }}}
                        //bank 4
                        if ((g - 1) >= 4) {
                            int we = input.nextInt();
                            double iu = input.nextDouble();
                            double my = input.nextDouble();
                            bnk[we] = new bank(we, iu, lim);
                            if (my == 1) {
                                he = input.nextInt();

                                a8 = input.nextDouble();
                                if (he > g && he == we) {
                                    System.out.println("Error Bank not found or Bank cannot borrow from itself");
                                } else {


                                    bnk[we].lend(a8);
                                }
                            } else if (my == 2) {
                                he = input.nextInt();

                                a8 = input.nextDouble();

                                if (he > g && he == we) {
                                    System.out.println("Error Bank not found or Bank cannot borrow from itself");
                                } else {


                                    bnk[we].lend(a8);
                                }
                                yu = input.nextInt();
                                a9 = input.nextDouble();


                                if (yu > g && yu == we) {
                                    System.out.println("Error Bank not found or Bank cannot borrow from itself");
                                } else {


                                    bnk[we].lend(a8);
                                }

                            }

                        }}catch(FileNotFoundException ex){
                        ex.printStackTrace();}



                for(int i = 0; i <= 4; i++) {
                if (bnk[0].isunsafe == true) {
                    if (z == 0) {
                        bnk[1].borrow(a3);
                    }
                    if (o == 0) {
                        bnk[1].borrow(a);
                    }
                    if (y == 0) {
                        bnk[1].borrow(a1);
                    }
                    if (r == 0) {
                        bnk[1].borrow(a2);
                    }
                    if (h == 0) {
                        bnk[1].borrow(a4);
                    }
                    if (x == 0) {
                        bnk[1].borrow(a5);
                    }
                    if (re == 0) {
                        bnk[1].borrow(a6);
                    }
                    if (er == 0) {
                        bnk[1].borrow(a7);
                    }
                    if (he == 0) {
                        bnk[1].borrow(a8);
                    }
                    if (yu == 0) {
                        bnk[1].borrow(a9);
                    }

                }
                if ((g - 1) >= 1) {
                    if (bnk[1].isunsafe == true) {
                        if (z == 1) {
                            bnk[1].borrow(a3);
                        }
                        if (o == 1) {
                            bnk[1].borrow(a);
                        }
                        if (y == 1) {
                            bnk[1].borrow(a1);
                        }
                        if (r == 1) {
                            bnk[1].borrow(a2);
                        }
                        if (h == 1) {
                            bnk[1].borrow(a4);
                        }
                        if (x == 1) {
                            bnk[1].borrow(a5);
                        }
                        if (re == 1) {
                            bnk[1].borrow(a6);
                        }
                        if (er == 1) {
                            bnk[1].borrow(a7);
                        }
                        if (he == 1) {
                            bnk[1].borrow(a8);
                        }
                        if (yu == 1) {
                            bnk[1].borrow(a9);
                        }

                    }
                }
                if ((g - 1) >= 2) {
                    if (bnk[2].isunsafe == true) {
                        if (z == 2) {
                            bnk[1].borrow(a3);
                        }
                        if (o == 2) {
                            bnk[1].borrow(a);
                        }
                        if (y == 2) {
                            bnk[1].borrow(a1);
                        }
                        if (r == 2) {
                            bnk[1].borrow(a2);
                        }
                        if (h == 2) {
                            bnk[1].borrow(a4);
                        }
                        if (x == 2) {
                            bnk[1].borrow(a5);
                        }
                        if (re == 2) {
                            bnk[1].borrow(a6);
                        }
                        if (er == 2) {
                            bnk[1].borrow(a7);
                        }
                        if (he == 2) {
                            bnk[1].borrow(a8);
                        }
                        if (yu == 2) {
                            bnk[1].borrow(a9);
                        }

                    }
                }
                if ((g - 1) >= 3) {
                    if (bnk[3].isunsafe == true) {
                        if (z == 3) {
                            bnk[1].borrow(a3);
                        }
                        if (o == 3) {
                            bnk[1].borrow(a);
                        }
                        if (y == 3) {
                            bnk[1].borrow(a1);
                        }
                        if (r == 3) {
                            bnk[1].borrow(a2);
                        }
                        if (h == 3) {
                            bnk[1].borrow(a4);
                        }
                        if (x == 3) {
                            bnk[1].borrow(a5);
                        }
                        if (re == 3) {
                            bnk[1].borrow(a6);
                        }
                        if (er == 3) {
                            bnk[1].borrow(a7);
                        }
                        if (he == 3) {
                            bnk[1].borrow(a8);
                        }
                        if (yu == 3) {
                            bnk[1].borrow(a9);
                        }

                    }
                }
                if ((g - 1) >= 4) {
                    if (bnk[4].isunsafe == true) {
                        if (z == 4) {
                            bnk[1].borrow(a3);
                        }
                        if (o == 4) {
                            bnk[1].borrow(a);
                        }
                        if (y == 4) {
                            bnk[1].borrow(a1);
                        }
                        if (r == 4) {
                            bnk[1].borrow(a2);
                        }
                        if (h == 4) {
                            bnk[1].borrow(a4);
                        }
                        if (x == 4) {
                            bnk[1].borrow(a5);
                        }
                        if (re == 4) {
                            bnk[1].borrow(a6);
                        }
                        if (er == 4) {
                            bnk[1].borrow(a7);
                        }
                        if (he == 4) {
                            bnk[1].borrow(a8);
                        }
                        if (yu == 4) {
                            bnk[1].borrow(a9);
                        }

                    }
                }
            }
            for (int i = 0; i < g; i++) {
                if (bnk[i].isunsafe == true) {
                    System.out.println("bank " + i + " is unsafe");
                }

            }
        } catch (Exception e) {
            System.out.println("Please enter numbers");
        }
    }
}
