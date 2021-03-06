package characterbuffer.noexception;

public class UsingBuffer {

    public static void testBufferFull(CharacterBuffer cb) {
        // testing buffer full
        cb.put('A');
        System.out.println("putting A... 1");
        cb.put('B');
        System.out.println("putting B... 2");
        for (int i = 3; i < 16; i++) {
            cb.put('X');
            System.out.println("putting X... " + i);
        }
        cb.put('P');
        System.out.println("putting P... 16");
        cb.put('Q');
        System.out.println("putting Q... FULL");
    }

    public static void main(String arg[]) {
        CharacterBuffer cb = new CharacterBuffer();
        cb.get();
        testBufferFull(cb);
    }
}
