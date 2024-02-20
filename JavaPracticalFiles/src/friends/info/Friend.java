package friends.info;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Friend {
    private String friendName;
    private LocalDate dob;
    private boolean isBestFriend;
    private String age;
    private String timeUntilNextBirthday;


    public Friend(String friendName, LocalDate dob, boolean isBestFriend){
        this.friendName = friendName;
        this.dob = dob;
        this.isBestFriend = isBestFriend;
    }

    public String calculateAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        LocalDate nextBirthday = dob.plusYears(years + 1); // Next birthday
        Period untilNextBirthday = Period.between(currentDate, nextBirthday);
        timeUntilNextBirthday = untilNextBirthday.getMonths() + " months & " + untilNextBirthday.getDays() + " days.";
        age =  years + " years, " + months + " months, and " + days + " days" + ".";
        return age;
    }

    public String getName(){
        return friendName;
    }

    public LocalDate getDOB(){
        return dob;
    }

    public String getAge(){
        calculateAge();
        return age;
    }

    public String getTimeUntilNextBirthday(){
        calculateAge();
        return timeUntilNextBirthday;
    }

    public String getBestFriendStatus(){
        if(isBestFriend){
            return "Yes.";
        } else {
            return "No.";
        }
    }

    public void displayInfo() {
        calculateAge(); // Calculate age before displaying
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDob = dob.format(formatter);

        System.out.println("Friend's Name: " + friendName);
        System.out.println("Friend's Date of Birth: " + formattedDob);
        System.out.println("Friend's Age today: " + age);
        System.out.println("Time until next birthday: " + timeUntilNextBirthday);
        System.out.println("Is best friend? -> " + getBestFriendStatus());
    }

    /*public static void main(String[] args) {
        Friend Bhuvan = new Friend("Bhuvan Shailesh Bayas", LocalDate.of(2006, 04, 19), true);
        System.out.println(Bhuvan.getName());
        System.out.println(Bhuvan.getDOB());
        System.out.println(Bhuvan.getAge());
        System.out.println(Bhuvan.getTimeUntilNextBirthday());
        System.out.println(Bhuvan.getBestFriendStatus());

//        Bhuvan.displayInfo();
    }*/
}
