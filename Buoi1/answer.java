
import java.util.Scanner;

public class answer {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choise = 0;
        while (true) {
            System.out.println("Nhap so bai ban muon thuc hien(0-17 0 de thoat chuong trinh): ");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("----------BAI 1 (So 0)---------");
                    answer.Bai1_AmDuong();
                    break;
                case 2:
                    System.out.println("----------BAI 2 (ax2 + bx + c = 0)---------");
                    answer.Bai2_PTB2();
                    break;
                case 3:
                    System.out.println("----------BAI 3 (Thang trong nam)---------");
                    answer.Bai3_Month();
                    break;
                case 4:
                    System.out.println("----------BAI 4 (Ve hinh)---------");
                    answer.Bai4_DrawShape();
                    break;
                case 5:
                    System.out.println("----------BAI 5 (UCLN BCNN)---------");
                    answer.Bai5_UCLN_BCNN();
                    break;
                case 6:
                    System.out.println("----------BAI 6 (Uoc so)---------");
                    answer.Bai6_UocSo();
                    break;
                case 7:
                    System.out.println("----------BAI 7 (Thua so)---------");
                    answer.Bai7_ThuaSo();
                    break;
                case 8:
                    System.out.println("----------BAI 8 (Chieu dai cua so nguyen)---------");
                    answer.Bai8_Length();
                    break;
                case 9:
                    System.out.println("----------BAI 9 (n trong Fibonacci)---------");
                    answer.Bai9_Fibonacci();
                    break;
                case 10:
                    System.out.println("----------BAI 10 (Dem tu)---------");
                    answer.Bai10_DemTu();
                    break;
                case 11:
                    System.out.println("----------BAI 11 (Dem tu 2)---------");
                    answer.Bai11_DemTu2();
                    break;
                case 12:
                    System.out.println("----------BAI 12 (Dem tong chu so)---------");
                    System.out.println("Nhap so n: ");
                    int n = sc.nextInt();
                    System.out.println("Tong cac chu so trong " + n + " la: " + answer.Bai12_sumDigits(n));
                    break;
                case 13:
                    System.out.println("----------BAI 13 (So dao nguoc)---------");
                    System.out.println("Nhap so n: ");
                    int n13 = sc.nextInt();
                    System.out.println("So dao nguoc cua " + n13 + " la: " + answer.Bai13_Reverse(n13));
                    break;
                case 14:
                    System.out.println("----------BAI 14 (So trung lap)---------");
                    answer.Bai14_SoTrungLap();
                    break;
                case 15:
                    System.out.println("----------BAI 15 (So duong nho nhat)---------");
                    System.out.println("Nhap kich thuoc cua mang: ");
                    int n15 = sc.nextInt();
                    int[] arr = new int[n15];
                    for (int i = 0; i < n15; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("So nguyen duong nho nhat trong mang la: " + answer.Bai15_SoMin(arr));
                    break;
                case 16:
                    System.out.println("----------BAI 16 (Tong cot cua mang)---------");
                    System.out.println("Nhap kich thuoc ma tran dong x cot: ");
                    int m = sc.nextInt();
                    int n16 = sc.nextInt();
                    System.out.println("Nhap phan tu cho ma tran: ");
                    int[][] arr16 = answer.NhapMaTrix(m, n16);
                    System.out.println("Ma tran vua nhap la: ");
                    answer.XuatMaTrix(arr16, m, n16);
                    System.out.println();
                    int col;
                    do {
                        System.out.println("Nhap so cot can tinh tong(0 <= col < n): ");
                        col = sc.nextInt();
                        if (col > n16 || col < 0) {
                            System.out.println("Vui long nhap lai (0 <= col < n): ");
                        }
                    } while (col >= n16 || col < 0);
                    System.out.println("Tong cua cot " + col + " la: " + answer.Bai16_TongCot_Matrix(arr16, col));
                    break;
                case 17:
                    System.out.println("----------BAI 17 (Ma tran xuan oc)---------");
                    answer.Bai17_Matrix_XoanOc();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Vui long chon lai lua chon cua ban: ");
                    break;
            }
        }
    }
//----Methods------
    public static void Bai1_AmDuong() {
        System.out.println("Nhap vao so ngau nhien N: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("N la so Khong (0)");
        } else if (n > 0) {
            System.out.println("N la so lon hon khong( n > 0 )");
        } else {
            System.out.println("N la so be hon khong ( n < 0 )");
        }
    }

    public static void Bai2_PTB2() {
        int a;
        do {
            System.out.println("Nhap so a: ");
            a = sc.nextInt();
            if (a == 0) {
                System.out.println("Nhap a != 0");
                a = sc.nextInt();
            }
        } while (a == 0);
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println("Nhap so c: ");
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co nghiem phan biet \nx1 = " + x1 + "\nx2 = " + x2);
        }

    }

    public static void Bai3_Month() {
        int month;
        do {
            System.out.println("Nhap thang theo dang so (1-12): ");
            month = sc.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Vui long nhap trong khoang (1-12): ");
            }
        } while (month < 1 || month > 12);
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Fbruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;
        }
    }

    public static void Bai4_DrawShape() {
        System.out.println("Nhap kich thuoc hinh can ve (so le): ");
        int n = sc.nextInt();
        // Hinh vuong rong
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
        // tam giac vuong goc tren-phai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
        // Hai hinh tam giac doi dinh
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= n / 2) {
                    if (j >= i && j < n - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j >= n - i - 1 && j <= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void Bai5_UCLN_BCNN() {
        // tim UCLN
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();
        int a1 = a, b1 = b;

        int UCLN = 0;
        if (a == 0 || b == 0) {
            UCLN = a + b;
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            UCLN = a;
        }
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN);
        // tim boi chung nho nhat.
        int BCNN = a1 * b1 / UCLN;
        System.out.println("Boi chung nho nhat cua " + a1 + " va " + b1 + " la: " + BCNN);
    }

    public static void Bai6_UocSo() {
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        System.out.println("Cac uoc so cua " + n + " la: ");
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean SNT(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Bai7_ThuaSo() {
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        while (n > 0) {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n /= i;
                    if (answer.SNT(n)) {
                        System.out.println(n);
                        return;
                    }
                    break;
                }
            }
        }
    }

    public static void Bai8_Length() {
        System.out.println("Nhap so nguyen n: ");
        long n = sc.nextLong();
        long m = n;
        int count = 0;
        while (m > 0) {
            m /= 10;
            count++;
        }
        System.out.println("So " + n + " co " + count + " chu so.");
    }

    public static void Bai9_Fibonacci() {
        int n;
        do {
            System.out.println("Nhap n (n>1): ");
            n = sc.nextInt();
        } while (n < 2);
        int f0 = 1, f1 = 1, fNext = 0;
        for (int i = 0; i < n; i++) {
            fNext = f0 + f1;
            f0 = f1;
            f1 = fNext;

        }
        System.out.println("fn la: " + fNext);
    }

    public static void Bai10_DemTu() {
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        String[] strArr = str.trim().split("\\s+");
        System.out.println(str + " co " + strArr.length + " tu");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(i + strArr[i]);
        }
    }

    public static void Bai11_DemTu2() {
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        String[] strArr1 = str.split(" ");
        String[] exist = strArr;
        int count = 1;

        l: for (int i = 1; i < strArr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (strArr[i].equalsIgnoreCase(strArr[j])) {
                    continue l;
                }
            }
            exist[count] = strArr[i];
            count++;
        }

        for (int i = 0; i < count; i++) {
            int dem = 0;
            for (int j = 0; j < strArr1.length; j++) {
                if (exist[i].equalsIgnoreCase(strArr1[j])) {
                    dem++;
                }
            }
            System.out.println(exist[i] + ": " + dem);
        }
    }

    public static int Bai12_sumDigits(int n) {
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    public static int Bai13_Reverse(int n) {
        int num = 0;
        while (n > 0) {
            num = num * 10 + (n % 10);
            n /= 10;
        }
        return num;
    }

    public static void Bai14_SoTrungLap() {
        System.out.println("Nhap 10 so nguyen: ");
        int[] arr = new int[10];
        int[] existArr = new int[10];
        int count = 0;
        l: for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            for (int j = i; j >= 0; j--) {
                if (arr[i] == existArr[j]) {
                    continue l;
                }
            }
            existArr[count] = arr[i];
            count++;
        }
        System.out.println("So luong phan tu khac nhau: " + count);
        System.out.println("Cac phan tu: ");
        for (int i = 0; i < count; i++) {
            System.out.print(existArr[i] + " ");
        }
    }

    public static int Bai15_SoMin(int[] arr) {
        int numMin = arr[0];
        for (int i : arr) {
            if ((i >= 0) && (i < numMin)) {
                numMin = i;
            }
        }
        return numMin;
    }

    public static int[][] NhapMaTrix(int m, int n) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void XuatMaTrix(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                String symbol = "";
                if (arr[i][j] < 10) {
                    symbol = "     ";
                } else if (arr[i][j] < 100) {
                    symbol = "    ";
                } else if (arr[i][j] < 1000) {
                    symbol = "   ";
                } else if (arr[i][j] < 10000) {
                    symbol = "  ";
                } else if (arr[i][j] < 100000) {
                    symbol = " ";
                }
                System.out.print(arr[i][j] + symbol);
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static int Bai16_TongCot_Matrix(int[][] arr, int col) {
        int m = arr.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i][col];
        }
        return sum;
    }

    public static void Bai17_Matrix_XoanOc() {
        System.out.println("Nhap kich thuoc ma tran vuong n: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        // chieu trai-phai
        int begin = 0, end = n, count = 1;
        while (count <= n * n) {
            // trai-phai
            for (int i = 0; i < n; i++) {
                if (arr[begin][i] == 0) {
                    arr[begin][i] = count;
                    count++;
                }
            }
            // tren-duoi
            for (int i = 0; i < n; i++) {
                if (arr[i][end - 1] == 0) {
                    arr[i][end - 1] = count;
                    count++;
                }
            }
            // phai-trai
            for (int i = n - 1; i >= 0; i--) {
                if (arr[end - 1][i] == 0) {
                    arr[end - 1][i] = count;
                    count++;
                }
            }
            // duoi-len
            for (int i = end - 1; i >= 0; i--) {
                if (arr[i][begin] == 0) {
                    arr[i][begin] = count;
                    count++;
                }
            }
            begin++;
            end--;
        }
        answer.XuatMaTrix(arr, n, n);
    }
}