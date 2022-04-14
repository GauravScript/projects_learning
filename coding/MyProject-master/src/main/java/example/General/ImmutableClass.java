package example.General;

public final class ImmutableClass {
    final int no;
    final String string;

    public ImmutableClass(int no, String s) {
        this.no = no;
        this.string = s;
    }

    public int getNo() {
        return no;
    }

    public String getString() {
        return string;
    }
}

class TestImmutable {
    public static void main(String[] args) {
        ImmutableClass on = new ImmutableClass(1, "rohan");
        System.out.println(on.getNo() + "--" + on.getString());
    }
}

