class Calender {
    public static void main(String[] args) {
        String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i=0; i <12;i++) {
            System.out.println(month[i] + "has"+ days[i] + "days");
        }
    }
}