package BasicJavaConstructsImproved;

import java.util.Scanner;

    class Student {
        public static void main(String[] args) {
            CreateArr();
            ShowArr();
            ShowFaculty();
            ShowFacultyCourse();
            ShowBirthdate();
            ShowGroup();
       }
        private int id;
        private String surname;
        private String name;
        private int birthdate;
        private String adress;
        private int tel;
        private String faculty;
        private int course;
        private int group;
        static int size;
        static Student arr[];
        public int GetId() {
            return id;
        }

        ;

        public String GetSurname() {
            return surname;

        }
        ;
        public String GetName() {
            return name;
        }

        ;

        public int GetBirthdate() {
            return birthdate;
        }

        ;

        public String GetAdress() {
            return adress;
        }

        ;

        public int GetTel() {
            return tel;
        }

        ;

        public String GetFaculty() {
            return faculty;
        }

        ;

        public int GetCourse() {
            return course;
        }

        ;

        public int GetGroup() {
            return group;
        }

        ;


        public void SetId() {
            System.out.println("введите значение id - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                id = sc.nextInt();
            }
        }

        ;

        public void SetSurname() {
            System.out.println("введите значение surname- ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                surname = sc.nextLine();
            }
        }
        ;

        public void SetName() {
            System.out.println("введите значение name - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                name = sc.nextLine();
            }
        }
        ;
        public void SetBirthdate() {
            System.out.println("введите значение birthdate - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                birthdate = sc.nextInt();
            }
        }
        ;
        public void SetAdress() {
            System.out.println("введите значение adress - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                adress = sc.nextLine();
            }
        }
        ;
        public void SetFaculty() {
            System.out.println("введите значение faculty - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                faculty = sc.nextLine();
            }
        }

        ;
        public void SetCourse() {
            System.out.println("введите значение course - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                course = sc.nextInt();
            }
        }

        ;
        public void SetTel() {
            System.out.println("введите значение tel - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                tel = sc.nextInt();
            }
        }

        ;
        public void SetGroup() {
            System.out.println("введите значение group- ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                group = sc.nextInt();
            }
        }

        ;
        public static void CreateStudent(Student st) {
            st.SetId();
            st.SetSurname();
            st.SetName();
            st.SetBirthdate();
            st.SetAdress();
            st.SetTel();
            st.SetFaculty();
            st.SetCourse();
            st.SetGroup();
        }
        public static void ShowStudent(Student st) {
            System.out.println("id - " + st.GetId());
            System.out.println("surname - " + st.GetSurname());
            System.out.println("name - " + st.GetName());
            System.out.println("birthdate - " + st.GetBirthdate());
            System.out.println("adress - " + st.GetAdress());
            System.out.println("tel - " + st.GetTel());
            System.out.println("faculty - " + st.GetFaculty());
            System.out.println("course - " + st.GetCourse());
            System.out.println("group - " + st.GetGroup());
        }
        ;
        public static void ShowFaculty() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите нужный факультет - ");
            String a = sc.nextLine();
            for (int i = 0; i < arr.length; i++) {
                if (a.equalsIgnoreCase(arr[i].faculty ) ) {
                    System.out.println(arr[i].GetName());
                    System.out.println(arr[i].GetSurname());
                }
            }
        }    ;
        public static void ShowFacultyCourse() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите нужный факультет - ");
            System.out.println("Введите нужный курс - ");

            String a = sc.nextLine();
            int b = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (a.equalsIgnoreCase(arr[i].faculty ) && b == arr[i].course) {
                    System.out.println(arr[i].GetName());
                    System.out.println(arr[i].GetSurname());
                }
            }
        }    ;
        public static void ShowBirthdate() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите нужный год рождения - ");
            int a = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].birthdate > a ) {
                    System.out.println(arr[i].GetName());
                    System.out.println(arr[i].GetSurname());
                }
            }
        }    ;

        public static void ShowGroup() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите нужную группу - ");
            int a = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].group == a ) {
                    System.out.println(arr[i].GetName());
                    System.out.println(arr[i].GetSurname());
                }
            }
        }    ;
            public static Student[] CreateArr() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол во студентов - ");
            size = sc.nextInt();
            arr = new Student[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Student();
                CreateStudent(arr[i]);

            }
            return arr;
        }

        ;
        public static void ShowArr() {
            for (int i = 0; i < arr.length; i++) {
                ShowStudent(arr[i]);
                System.out.println("-------------------------");

            }
        }

    }






