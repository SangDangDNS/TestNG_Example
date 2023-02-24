import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"gp1"})
    void test1()
    {
        System.out.println("This is test1....");
    }

    @Test(groups = {"gp1"})
    void test2()
    {
        System.out.println("This is test2.....");
    }

    @Test(groups = {"gp2"})
    void test3()
    {
        System.out.println("This is test3....");
    }

    @Test(groups = {"gp2"})
    void test4()
    {
        System.out.println("This is test4.....");
    }

    @Test(groups = {"gp1","gp2"})
    void test5()
    {
        System.out.println("This is test5.....");
    }
}
