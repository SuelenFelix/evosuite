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

public class XSalsa20_decrypt_6712796284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4548;
     Object term4556;
     Object term4566;

    public XSalsa20_decrypt_6712796284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4548 = (byte[]) newByteArray(7);
        setByteElement(term4548, 0, (byte) -52);
        setByteElement(term4548, 1, (byte) -48);
        setByteElement(term4548, 2, (byte) -15);
        setByteElement(term4548, 3, (byte) -117);
        setByteElement(term4548, 4, (byte) 45);
        setByteElement(term4548, 5, (byte) 60);
        setByteElement(term4548, 6, (byte) 22);
        term4556 = (byte[]) newByteArray(9);
        setByteElement(term4556, 0, (byte) -98);
        setByteElement(term4556, 1, (byte) -113);
        setByteElement(term4556, 2, (byte) -1);
        setByteElement(term4556, 3, (byte) -84);
        setByteElement(term4556, 4, (byte) 34);
        setByteElement(term4556, 5, (byte) -125);
        setByteElement(term4556, 6, (byte) 11);
        setByteElement(term4556, 7, (byte) 50);
        setByteElement(term4556, 8, (byte) 86);
        term4566 = (byte[]) newByteArray(7);
        setByteElement(term4566, 0, (byte) -96);
        setByteElement(term4566, 1, (byte) 18);
        setByteElement(term4566, 2, (byte) -53);
        setByteElement(term4566, 3, (byte) 46);
        setByteElement(term4566, 4, (byte) -106);
        setByteElement(term4566, 5, (byte) 3);
        setByteElement(term4566, 6, (byte) 120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.XSalsa20");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4548;
        args[1] = term4556;
        args[2] = term4566;
        callMethod(klass, "decrypt", argTypes, null, args);
    }

};


