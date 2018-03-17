
public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();
        String test1 = sm.trimAndConcat("foo", "bar");
        System.out.println(test1);
        int test2 = sm.getIndexOrNull("foobar", "b");
        System.out.println(test2);
        int test3 = sm.getIndexOrNull("foobar", "foo");
        System.out.println(test3);
        String test4 = sm.concatSubstring("foobar", 3, 4, "bar");
        System.out.println(test4);
    }
}