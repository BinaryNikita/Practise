package InnerClasses;

class Hotel {
    public int bookings;

    public void book() {
        bookings++;

    }
}

class SuperHotel extends Hotel {
    public void book(){
        System.out.println("Child method");
    }

    public int book(int size) {
        book();
        super.book();
        bookings += size;
        return 1;
    }

    public static void main(String[] args) {
        Hotel hotel = new SuperHotel();
        hotel.book();
        System.out.println(hotel.bookings);
    }
}