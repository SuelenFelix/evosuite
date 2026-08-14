package software.pando.crypto.nacl;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static software.pando.crypto.nacl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Bytes_concat_11168223665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9573;
     Object term9582;
     Object term9589;

    public Bytes_concat_11168223665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9573 = (byte[]) newByteArray(8);
        setByteElement(term9573, 0, (byte) -66);
        setByteElement(term9573, 1, (byte) -26);
        setByteElement(term9573, 2, (byte) -78);
        setByteElement(term9573, 3, (byte) 48);
        setByteElement(term9573, 4, (byte) -108);
        setByteElement(term9573, 5, (byte) -63);
        setByteElement(term9573, 6, (byte) -5);
        setByteElement(term9573, 7, (byte) -125);
        term9582 = (byte[]) newByteArray(6);
        setByteElement(term9582, 0, (byte) 106);
        setByteElement(term9582, 1, (byte) 88);
        setByteElement(term9582, 2, (byte) -13);
        setByteElement(term9582, 3, (byte) -27);
        setByteElement(term9582, 4, (byte) 13);
        setByteElement(term9582, 5, (byte) -69);
        term9589 = (byte[]) newByteArray(3);
        setByteElement(term9589, 0, (byte) -54);
        setByteElement(term9589, 1, (byte) 88);
        setByteElement(term9589, 2, (byte) -109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Bytes");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term9573;
        args[1] = term9582;
        args[2] = term9589;
        callMethod(klass, "concat", argTypes, null, args);
    }

};


