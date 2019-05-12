/**
 * Encapsulation
 */
class Family
{
    int membercount;
    String name;
    String nickname;

    public int getMembercount()
    {
        return membercount;
    }

    public String getName()
    {
        return name;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setMembercount(int membcnt)
    {
        membercount = membcnt;
    }

    public void setName(String nm)
    {
        name = nm;
    }

    public void setNickname(String nknm)
    {
        nickname = nknm;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Family fm = new Family();
        fm.setMembercount(2);
        fm.setName("Nirvisha");
        fm.setNickname("Nishu");
        System.out.println("There are " +fm.getMembercount()+ " members in the family");
        System.out.println(fm.getName());
        System.out.println(fm.getNickname());
    }
}