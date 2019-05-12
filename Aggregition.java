class Address
{
    int streetNumber;
    String streetName;
    
    String city;
    String state;
    String country;

    Address(int stretNum, String strtNam, String ct, String stat, String cnt)
    {
        this.streetNumber = stretNum;
        this.streetName = strtNam;
        this.city = ct;
        this.state = stat;
        this.country = cnt;
    }
}

class College
{
    String collegeName;
    Address collegeAddress;


    College(String clgName, Address clgAdrs)
    {
        this.collegeName = clgName;
        this.collegeAddress = clgAdrs;
    }

    
}

class Aggregition
{
    int studentRollnum;
    String studentName;
    Address studentAddr;

    Aggregition(int roll, String name, Address adr)
    {
        this.studentRollnum = roll;
        this.studentName = name;
        this.studentAddr = adr;
    }

    public static void main(String args[])
    {
        Address ar = new Address(1212, "Don Ave", "Santa Clara", "California", "USA");
        Aggregition ag = new Aggregition(10, "Nishu", ar);
        System.out.println("Student Roll number is " +ag.studentRollnum);
        System.out.println("Sudent Name is " +ag.studentName);
        System.out.println("Student address is below :");
        System.out.println(ag.studentAddr.streetNumber);
        System.out.println(ag.studentAddr.streetName);
        System.out.println(ag.studentAddr.city);
        System.out.println(ag.studentAddr.state);
        System.out.println(ag.studentAddr.country);

        Address adr = new Address(1213, "Reed", "Santa Clara", "California", "USA");
    College cl = new College("Santa Clara Univercity", adr);
    System.out.println(cl.collegeName);
    System.out.println(cl.collegeAddress.streetNumber);
    System.out.println(cl.collegeAddress.streetName);
    System.out.println(cl.collegeAddress.city);
    System.out.println(cl.collegeAddress.state);
    System.out.println(cl.collegeAddress.country);
    }
}