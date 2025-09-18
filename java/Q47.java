class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    void setdata(int rn, String rt, double ra, boolean ac) {
        roomno = rn; roomtype = rt; roomarea = ra; ACmachine = ac;
    }
    void displaydata() {
        System.out.println("Room No: " + roomno);
        System.out.println("Type: " + roomtype);
        System.out.println("Area: " + roomarea);
        System.out.println("AC Available: " + ACmachine);
    }
    public static void main(String[] args) {
        Room r = new Room();
        r.setdata(101, "Deluxe", 350.5, true);
        r.displaydata();
    }
}
