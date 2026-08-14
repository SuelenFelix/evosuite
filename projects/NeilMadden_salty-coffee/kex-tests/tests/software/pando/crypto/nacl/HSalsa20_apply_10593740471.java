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

public class HSalsa20_apply_10593740471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4376;
     Object term4386;

    public HSalsa20_apply_10593740471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4376 = (byte[]) newByteArray(9);
        setByteElement(term4376, 0, (byte) 98);
        setByteElement(term4376, 1, (byte) 11);
        setByteElement(term4376, 2, (byte) 108);
        setByteElement(term4376, 3, (byte) 97);
        setByteElement(term4376, 4, (byte) -9);
        setByteElement(term4376, 5, (byte) -101);
        setByteElement(term4376, 6, (byte) 49);
        setByteElement(term4376, 7, (byte) 34);
        setByteElement(term4376, 8, (byte) -23);
        term4386 = (byte[]) newByteArray(9);
        setByteElement(term4386, 0, (byte) 45);
        setByteElement(term4386, 1, (byte) -64);
        setByteElement(term4386, 2, (byte) -25);
        setByteElement(term4386, 3, (byte) 28);
        setByteElement(term4386, 4, (byte) 56);
        setByteElement(term4386, 5, (byte) -111);
        setByteElement(term4386, 6, (byte) -98);
        setByteElement(term4386, 7, (byte) -91);
        setByteElement(term4386, 8, (byte) -12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.HSalsa20");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4376;
        args[1] = term4386;
        callMethod(klass, "apply", argTypes, null, args);
    }

};


