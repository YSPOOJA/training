class Calender {
    public static void main(String[] args) {
        String month[]= new String[13];
        month[0]="invalid month";
        month[1]="January has 31 Days";
        month[2]="February has 28 Days";
        month[3]="March has 31 Days";
        month[4]="April has 30 Days";
        month[5]="May has 31 Days";
        month[6]="June has 30 Days";
        month[7]="July has 31 Days";
        month[8]="August has 31 Days";
        month[9]="September has 30 Days";
        month[10]="October has 31 Days";
        month[11]="November has 30 Days";
        month[12]="December has 31 Days";
        
        for (int i=0; i < month.length;i++) {
            System.out.println(month[i]);
        }
    }
}