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

public class Bytes_concat_11156903084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9543;
     Object term9552;

    public Bytes_concat_11156903084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9543 = (byte[]) newByteArray(8);
        setByteElement(term9543, 0, (byte) 33);
        setByteElement(term9543, 1, (byte) 116);
        setByteElement(term9543, 2, (byte) 45);
        setByteElement(term9543, 3, (byte) 18);
        setByteElement(term9543, 4, (byte) 116);
        setByteElement(term9543, 5, (byte) 40);
        setByteElement(term9543, 6, (byte) 101);
        setByteElement(term9543, 7, (byte) 70);
        term9552 = (byte[]) newByteArray(6);
        setByteElement(term9552, 0, (byte) -113);
        setByteElement(term9552, 1, (byte) 85);
        setByteElement(term9552, 2, (byte) 52);
        setByteElement(term9552, 3, (byte) 31);
        setByteElement(term9552, 4, (byte) -12);
        setByteElement(term9552, 5, (byte) 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Bytes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9543;
        args[1] = term9552;
        callMethod(klass, "concat", argTypes, null, args);
    }

};


