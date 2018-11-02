/**************************************************************************************************
/
/ *
/ * Group D Project: Clear Skies Charter Company
/ *
/ * Implement a computerized record keeping system for "Clear Skies aircraft charter company"
/ * that meets specific requirements.
/ *
/ * Bugs: none known
/ *
/ * Authors      John Berean, names, names, names, names, names (20018)
/ * Version      1.0
/ * See also     N/A
/ *
/
/**************************************************************************************************
/
/ Group D Project: Clear Skies Charter Company
/
/ Clear Skies is an aircraft charter company that supplies charter flights suing a fleet of aircraft and a staff of pilots.  
/ Because of FAA requirements some aircraft require a copilot and sometime a customer requests a copilot for insurance reasons.
/
/ Recently a fire destroyed most of the company’s paper records.  
/ To be allowed to operate it must implement a computerized record keeping system that meets specific requirements.
/
/**************************************************************************************************
/
/ Airplanes
/
/     - Service Records (Inspection, repair/maintenance hours flown, fuel capacity, number of lives it can fit on board, number of pilots needed to fly, etc)
     - Regulations of which pilots can fly which planes based on their license.
/     - Employee information (i.e. payrolls, names , licenses, hours flown, etc).
/     - Departure/arrival times
/     - Destination
/     - Passenger records for each flight
/
/ Flight planning involves a safety-critical aspect: fuel calculation, to ensure that the aircraft can safely reach the destination.
/
/ I.e. an algorithm(s) that calculates the minimal flight cost through the appropriate choice of route, height, speed and by loading the minimum necessary fuel on board.
/
/***************************************************************************************************/

import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;
public class euclids{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        boolean quitOperation = false;
        int c1; int c2; int c3; int c4; int c5;
        
        // Customer
        String name;
        String address;
        String emailAddress;
        int phoneNumber;
        Flight f;

        // Flights
        Plane p;
        List<Customer> c = new Arraylist<>();
        List<Pilot> pilots = new Arraylist<>();
        int arrivalime;
        int arrivalDate;
        int departureTime;
        int departureDate;
        String destination;
        int flightNumber;
        int numOfPassengers;
        
        while(quitOperation != true){
            
            System.out.println("Hello! Welcome to Clear Skies Charter Company!");
            System.out.println("PLEASE CHOOSE WHAT OPERATIONS YOUD LIKE TO PERFORM: ")
            System.out.println("Press 1 for Records");
            System.out.println("Press 2 for Booking A Flight");
            System.out.println("Press 3 to Quit the Program");
            
            if(c1 == 1){ // Records
                
                while(quitOperation2 != true){
                    System.out.println("Hello! Welcome to Clear Skies Charter Company Records!");
                    System.out.println("PLEASE CHOOSE WHAT OPERATIONS YOUD LIKE TO PERFORM: ")
                    System.out.println("Press 1 for Customer Records");
                    System.out.println("Press 2 for Pilot Records");
                    System.out.println("Press 3 for Airplane Records");
                    System.out.println("Press 4 for Flight Records");
                    System.out.println("Press 5 for Return to Home Page");
                    
                    if(c2 == 1){
                    }
                    else if(c2 == 2){
                    }
                    else if(c2 == 3){
                    }
                    else if(c2 == 4){
                    }
                    else if(c2 == 5){
                        quitOperation2 = true;
                    }
                    else{
                        System.out.println("Error! Please enter a valid hoice; either 1 (Customer Records), 2 (Pilot Records), 3 (Airplane Records), 4 (Flight Records) or 5 (Return to Home)");
                    }
                }
            }
            else if(choice1 == 2){  // Booking a Flight
                
                System.out.println("Hello! Welcome to Clear Skies Charter Company Booking!");
                
                System.out.println("Please enter the destination: ");
                    destination = sc.nextLine();
                System.out.println("Please enter the departure date: ");
                    departureDate = sc.nextInt();
                System.out.println("Please enter the departure time: ");
                    departureTime = sc.nextInt();
                System.out.println("Please enter the arrival date: ");
                    arrivalDate = sc.nextInt();
                System.out.println("Please enter the arrival time: ");
                    arrivalime = sc.nextInt();
                System.out.println("Please enter the number of passengers: ");
                    numOfPassengers = sc.nextInt();
                
                
                // System.out.println("Please enter yes or no for a request of a co-pilot, there might be one automatically involved due to the number of passengers thus plane size: ");
                
                // LOOP ALGORITHM THAT COMPARES PLANES AND PILOTS TO CREATE A FLIGHT
                /******/
                /*
                /*
                /*
                /*
                /******/
                
 
                f = new Flight(p,c,pilots, arrivalime,arrivalDate,departureTime,departureDate,destination,flightNumber,numOfPassengers);

                System.out.println("Now please enter each passengers information: ");
                
                while(n < numOfPassengers){
                    
                    System.out.println("Passenger " + n + ": ");
                    
                    System.out.println("Name: ");
                        name = sc.nextLine();
                    System.out.println("Address: ");
                        address = sc.nextLine();
                    System.out.println("Email Address: ");
                        emailAddress = sc.nextLine();
                    System.out.println("Phone Number: ");
                        phoneNumber = sc.nextLine();

                    c.add(new Customer(name,address,emailAddress,phoneNumber,f,f.toString());
                }
                
                          /*
                            USE COMPARATOR TO Sort and COMPARE PILOTS AND PLANES
                           
                            ArrayList<A> aL=new ArrayList<A>();
                            System.out.println("----- Sorting by first integer-------");
                          
                            Collection.sort(aL, new Comparator<A>(){
                            int compare(aL.get(0),aL.get(1)){
                            if(aL.get(0).i > aL.get(1).i){
                                return 1;
                            }
                            else if(aL.get(0).i == aL.get(1).i){
                                return 0;
                            }
                            else{
                                return 1;
                            }
                            }
                            });
                          */
            }
            else if(choice1 == 3){  // Quit Program
                quitOperation = true;
                break;
            }
            else{
                System.out.println("Error! Please enter a valid hoice, either 1 or 2.");
            }
        }
    }
}
// class name
class Crew{
    // class attributes
    int char_trip;
    int emp_num;
    String crew_job;
    // class constructor
    public Crew( int char_trip, int emp_num, String crew_job){
        this.char_trip = char_trip;
        this.emp_num = emp_num;
    }
    // class setters
    public void setChar_trip(int char_trip){
        this.char_trip = char_trip;
    }
    public void setEmp_num(int emp_num){
        this.emp_num = emp_num;
    }
    public void setCrew_job(String crew_job){
        this.crew_job = crew_job;
    }
    // class getters
    public int getChar_trip( ){
        return this.char_trip;
    }
    public int getEmp_num( ){
        return this.emp_num;
    }
    public String getCrew_job( ){
        return this.crew_job;
    }
    // toString()
    public String toString(){
        return ( "char_trip: " + this.char_trip  + "emp_num: " + this.emp_num  + "crew_job: " + this.crew_job );
    }
}
// class name
class Customer{
    // class attributes
    int cus_code;
    String cus_lname;
    String cus_fname;
    char cust_initial;
    int cus_areaCode;
    String cus_phone;
    double cus_balance;
    // class constructor
    public Customer( int cus_code, String cus_lname, String cus_fname, char cust_initial, int cus_areaCode, String cus_phone, double cus_balance){
        this.cus_code = cus_code;
        this.cus_lname = cus_lname;
        this.cus_fname = cus_fname;
        this.cust_initial = cust_initial;
        this.cus_areaCode = cus_areaCode;
        this.cus_phone = cus_phone;
    }
    // class setters
    public void setCus_code(int cus_code){
        this.cus_code = cus_code;
    }
    public void setCus_lname(String cus_lname){
        this.cus_lname = cus_lname;
    }
    public void setCus_fname(String cus_fname){
        this.cus_fname = cus_fname;
    }
    public void setCust_initial(char cust_initial){
        this.cust_initial = cust_initial;
    }
    public void setCus_areaCode(int cus_areaCode){
        this.cus_areaCode = cus_areaCode;
    }
    public void setCus_phone(String cus_phone){
        this.cus_phone = cus_phone;
    }
    public void setCus_balance(double cus_balance){
        this.cus_balance = cus_balance;
    }
    // class getters
    public int getCus_code( ){
        return this.cus_code;
    }
    public String getCus_lname( ){
        return this.cus_lname;
    }
    public String getCus_fname( ){
        return this.cus_fname;
    }
    public char getCust_initial( ){
        return this.cust_initial;
    }
    public int getCus_areaCode( ){
        return this.cus_areaCode;
    }
    public String getCus_phone( ){
        return this.cus_phone;
    }
    public double getCus_balance( ){
        return this.cus_balance;
    }
    // toString()
    public String toString(){
        return ( "cus_code: " + this.cus_code  + "cus_lname: " + this.cus_lname  + "cus_fname: " + this.cus_fname  + "cust_initial: " + this.cust_initial  + "cus_areaCode: " + this.cus_areaCode  + "cus_phone: " + this.cus_phone  + "cus_balance: " + this.cus_balance );
    }
}
class Pilot implements Comparable<Pilot>{
    // class attributes
    int emp_num;
    String pil_licence;
    String pil_ratings;
    int pil_med_type;
    String pil_med_date;
    String pil_pt135;
    String pil_pt135_date;
    // class constructor
    public Pilot( int emp_num, String pil_licence, String pil_ratings, int pil_med_type, String pil_med_date, String pil_pt135, String pil_pt135_date){
        this.emp_num = emp_num;
        this.pil_licence = pil_licence;
        this.pil_ratings = pil_ratings;
        this.pil_med_type = pil_med_type;
        this.pil_med_date = pil_med_date;
        this.pil_pt135 = pil_pt135;
    }
    // class setters
    public void setEmp_num(int emp_num){
        this.emp_num = emp_num;
    }
    public void setPil_licence(String pil_licence){
        this.pil_licence = pil_licence;
    }
    public void setPil_ratings(String pil_ratings){
        this.pil_ratings = pil_ratings;
    }
    public void setPil_med_type(int pil_med_type){
        this.pil_med_type = pil_med_type;
    }
    public void setPil_med_date(String pil_med_date){
        this.pil_med_date = pil_med_date;
    }
    public void setPil_pt135(String pil_pt135){
        this.pil_pt135 = pil_pt135;
    }
    public void setPil_pt135_date(String pil_pt135_date){
        this.pil_pt135_date = pil_pt135_date;
    }
    // class getters
    public int getEmp_num( ){
        return this.emp_num;
    }
    public String getPil_licence( ){
        return this.pil_licence;
    }
    public String getPil_ratings( ){
        return this.pil_ratings;
    }
    public int getPil_med_type( ){
        return this.pil_med_type;
    }
    public String getPil_med_date( ){
        return this.pil_med_date;
    }
    public String getPil_pt135( ){
        return this.pil_pt135;
    }
    public String getPil_pt135_date( ){
        return this.pil_pt135_date;
    }
    // toString()
    public String toString(){
        return ( "emp_num: " + this.emp_num  + "pil_licence: " + this.pil_licence  + "pil_ratings: " + this.pil_ratings  + "pil_med_type: " + this.pil_med_type  + "pil_med_date: " + this.pil_med_date  + "pil_pt135: " + this.pil_pt135  + "pil_pt135_date: " + this.pil_pt135_date );
    }
    public int compareTo(Pilot p){
        if((this.getOnDuty() == true && p.getOnDuty() == false) || (this.getLiscenceDegree() <= p.getLiscenceDegree())){
            return -1;
        }
        else{
            return 1;
        }
    }
}
// class name
class Model{
    // class attributes
    String mod_code;
    String mod_manufacturer;
    String mod_name;
    int mod_seats;
    double mod_chg_mile;
    // class constructor
    public Model( String mod_code, String mod_manufacturer, String mod_name, int mod_seats, double mod_chg_mile){
        this.mod_code = mod_code;
        this.mod_manufacturer = mod_manufacturer;
        this.mod_name = mod_name;
        this.mod_seats = mod_seats;
    }
    // class setters
    public void setMod_code(String mod_code){
        this.mod_code = mod_code;
    }
    public void setMod_manufacturer(String mod_manufacturer){
        this.mod_manufacturer = mod_manufacturer;
    }
    public void setMod_name(String mod_name){
        this.mod_name = mod_name;
    }
    public void setMod_seats(int mod_seats){
        this.mod_seats = mod_seats;
    }
    public void setMod_chg_mile(double mod_chg_mile){
        this.mod_chg_mile = mod_chg_mile;
    }
    // class getters
    public String getMod_code( ){
        return this.mod_code;
    }
    public String getMod_manufacturer( ){
        return this.mod_manufacturer;
    }
    public String getMod_name( ){
        return this.mod_name;
    }
    public int getMod_seats( ){
        return this.mod_seats;
    }
    public double getMod_chg_mile( ){
        return this.mod_chg_mile;
    }
    // toString()
    public String toString(){
        return ( "mod_code: " + this.mod_code  + "mod_manufacturer: " + this.mod_manufacturer  + "mod_name: " + this.mod_name  + "mod_seats: " + this.mod_seats  + "mod_chg_mile: " + this.mod_chg_mile );
    }
}
// class name
class Rating{
    // class attributes
    String rtg_code;
    String rtg_name;
    // class constructor
    public Rating( String rtg_code, String rtg_name){
        this.rtg_code = rtg_code;
    }
    // class setters
    public void setRtg_code(String rtg_code){
        this.rtg_code = rtg_code;
    }
    public void setRtg_name(String rtg_name){
        this.rtg_name = rtg_name;
    }
    // class getters
    public String getRtg_code( ){
        return this.rtg_code;
    }
    public String getRtg_name( ){
        return this.rtg_name;
    }
    // toString()
    public String toString(){
        return ( "rtg_code: " + this.rtg_code  + "rtg_name: " + this.rtg_name );
    }
}
class Aircraft implements Comparable<Aircraft>{
    // class attributes
    String ac_num;
    String mod_code;
    double ac_ttaf;
    double ac_ttel;
    double ac_tter;
    // class constructor
    public Aircraft( String ac_num, String mod_code, double ac_ttaf, double ac_ttel, double ac_tter){
        this.ac_num = ac_num;
        this.mod_code = mod_code;
        this.ac_ttaf = ac_ttaf;
        this.ac_ttel = ac_ttel;
    }
    // class setters
    public void setAc_num(String ac_num){
        this.ac_num = ac_num;
    }
    public void setMod_code(String mod_code){
        this.mod_code = mod_code;
    }
    public void setAc_ttaf(double ac_ttaf){
        this.ac_ttaf = ac_ttaf;
    }
    public void setAc_ttel(double ac_ttel){
        this.ac_ttel = ac_ttel;
    }
    public void setAc_tter(double ac_tter){
        this.ac_tter = ac_tter;
    }
    // class getters
    public String getAc_num( ){
        return this.ac_num;
    }
    public String getMod_code( ){
        return this.mod_code;
    }
    public double getAc_ttaf( ){
        return this.ac_ttaf;
    }
    public double getAc_ttel( ){
        return this.ac_ttel;
    }
    public double getAc_tter( ){
        return this.ac_tter;
    }
    // toString()
    public String toString(){
        return ( "ac_num: " + this.ac_num  + "mod_code: " + this.mod_code  + "ac_ttaf: " + this.ac_ttaf  + "ac_ttel: " + this.ac_ttel  + "ac_tter: " + this.ac_tter );
    }
    public int compareTo(Airplane p){
        if((this.getInspection() == false && p.getInspection() == true) || (this.getOutForFlight() == true && p.getOutForFlight() == false)){
            return -1;
        }
        else{
            return -1;
        }
    }
}
// class name
class Employee{
    // class attributes
    int emp_num;
    String emp_title;
    String emp_lname;
    String emp_fname;
    char emp_initial;
    String emp_dob;
    String emp_hire_date;
    // class constructor
    public Employee( int emp_num, String emp_title, String emp_lname, String emp_fname, char emp_initial, String emp_dob, String emp_hire_date){
        this.emp_num = emp_num;
        this.emp_title = emp_title;
        this.emp_lname = emp_lname;
        this.emp_fname = emp_fname;
        this.emp_initial = emp_initial;
        this.emp_dob = emp_dob;
    }
    // class setters
    public void setEmp_num(int emp_num){
        this.emp_num = emp_num;
    }
    public void setEmp_title(String emp_title){
        this.emp_title = emp_title;
    }
    public void setEmp_lname(String emp_lname){
        this.emp_lname = emp_lname;
    }
    public void setEmp_fname(String emp_fname){
        this.emp_fname = emp_fname;
    }
    public void setEmp_initial(char emp_initial){
        this.emp_initial = emp_initial;
    }
    public void setEmp_dob(String emp_dob){
        this.emp_dob = emp_dob;
    }
    public void setEmp_hire_date(String emp_hire_date){
        this.emp_hire_date = emp_hire_date;
    }
    // class getters
    public int getEmp_num( ){
        return this.emp_num;
    }
    public String getEmp_title( ){
        return this.emp_title;
    }
    public String getEmp_lname( ){
        return this.emp_lname;
    }
    public String getEmp_fname( ){
        return this.emp_fname;
    }
    public char getEmp_initial( ){
        return this.emp_initial;
    }
    public String getEmp_dob( ){
        return this.emp_dob;
    }
    public String getEmp_hire_date( ){
        return this.emp_hire_date;
    }
    // toString()
    public String toString(){
        return ( "emp_num: " + this.emp_num  + "emp_title: " + this.emp_title  + "emp_lname: " + this.emp_lname  + "emp_fname: " + this.emp_fname  + "emp_initial: " + this.emp_initial  + "emp_dob: " + this.emp_dob  + "emp_hire_date: " + this.emp_hire_date );
    }
}
// class name
class EarnedRating{
    // class attributes
    int emp_num;
    String rtg_code;
    String earnnrtg_date;
    // class constructor
    public EarnedRating( int emp_num, String rtg_code, String earnnrtg_date){
        this.emp_num = emp_num;
        this.rtg_code = rtg_code;
    }
    // class setters
    public void setEmp_num(int emp_num){
        this.emp_num = emp_num;
    }
    public void setRtg_code(String rtg_code){
        this.rtg_code = rtg_code;
    }
    public void setEarnnrtg_date(String earnnrtg_date){
        this.earnnrtg_date = earnnrtg_date;
    }
    // class getters
    public int getEmp_num( ){
        return this.emp_num;
    }
    public String getRtg_code( ){
        return this.rtg_code;
    }
    public String getEarnnrtg_date( ){
        return this.earnnrtg_date;
    }
    // toString()
    public String toString(){
        return ( "emp_num: " + this.emp_num  + "rtg_code: " + this.rtg_code  + "earnnrtg_date: " + this.earnnrtg_date );
    }
}
// class name
class Charter{
    // class attributes
    int char_trip;
    String char_date;
    String ac_number;
    String char_destination;
    int char_dist;
    double char_hours_flown;
    double char_hours_wait;
    double char_fuel_gallons;
    int char_oil_qts;
    int cus_code;
    // class constructor
    public Charter( int char_trip, String char_date, String ac_number, String char_destination, int char_dist, double char_hours_flown, double char_hours_wait, double char_fuel_gallons, int char_oil_qts, int cus_code){
        this.char_trip = char_trip;
        this.char_date = char_date;
        this.ac_number = ac_number;
        this.char_destination = char_destination;
        this.char_dist = char_dist;
        this.char_hours_flown = char_hours_flown;
        this.char_hours_wait = char_hours_wait;
        this.char_fuel_gallons = char_fuel_gallons;
        this.char_oil_qts = char_oil_qts;
    }
    // class setters
    public void setChar_trip(int char_trip){
        this.char_trip = char_trip;
    }
    public void setChar_date(String char_date){
        this.char_date = char_date;
    }
    public void setAc_number(String ac_number){
        this.ac_number = ac_number;
    }
    public void setChar_destination(String char_destination){
        this.char_destination = char_destination;
    }
    public void setChar_dist(int char_dist){
        this.char_dist = char_dist;
    }
    public void setChar_hours_flown(double char_hours_flown){
        this.char_hours_flown = char_hours_flown;
    }
    public void setChar_hours_wait(double char_hours_wait){
        this.char_hours_wait = char_hours_wait;
    }
    public void setChar_fuel_gallons(double char_fuel_gallons){
        this.char_fuel_gallons = char_fuel_gallons;
    }
    public void setChar_oil_qts(int char_oil_qts){
        this.char_oil_qts = char_oil_qts;
    }
    public void setCus_code(int cus_code){
        this.cus_code = cus_code;
    }
    // class getters
    public int getChar_trip( ){
        return this.char_trip;
    }
    public String getChar_date( ){
        return this.char_date;
    }
    public String getAc_number( ){
        return this.ac_number;
    }
    public String getChar_destination( ){
        return this.char_destination;
    }
    public int getChar_dist( ){
        return this.char_dist;
    }
    public double getChar_hours_flown( ){
        return this.char_hours_flown;
    }
    public double getChar_hours_wait( ){
        return this.char_hours_wait;
    }
    public double getChar_fuel_gallons( ){
        return this.char_fuel_gallons;
    }
    public int getChar_oil_qts( ){
        return this.char_oil_qts;
    }
    public int getCus_code( ){
        return this.cus_code;
    }
    // toString()
    public String toString(){
        return ( "char_trip: " + this.char_trip  + "char_date: " + this.char_date  + "ac_number: " + this.ac_number  + "char_destination: " + this.char_destination  + "char_dist: " + this.char_dist  + "char_hours_flown: " + this.char_hours_flown  + "char_hours_wait: " + this.char_hours_wait  + "char_fuel_gallons: " + this.char_fuel_gallons  + "char_oil_qts: " + this.char_oil_qts  + "cus_code: " + this.cus_code );
    }
}
