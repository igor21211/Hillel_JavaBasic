package HomeWork_8;

public  enum month {

    January(31,1),
    February(28,2),
    March(31,3),
    April(30,4),
    May(31,5),
    June(30,6),
    July(31,7),
    August(31,8),
    September(30,9),
    October(31,10),
    November(30,11),
    December(31,12);

    public int month;
    public  int dayInTheMounth;

    month(int dayInTheMounth, int month) {
        this.month = month;
        this.dayInTheMounth = dayInTheMounth;
    }
}
