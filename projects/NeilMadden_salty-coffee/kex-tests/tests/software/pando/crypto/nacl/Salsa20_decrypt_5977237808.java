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

public class Salsa20_decrypt_5977237808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;
     Object term378;
     Object term384;

    public Salsa20_decrypt_5977237808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375 = (byte[]) newByteArray(2);
        setByteElement(term375, 0, (byte) 85);
        setByteElement(term375, 1, (byte) -17);
        term378 = (byte[]) newByteArray(5);
        setByteElement(term378, 0, (byte) -83);
        setByteElement(term378, 1, (byte) 48);
        setByteElement(term378, 2, (byte) -128);
        setByteElement(term378, 3, (byte) 70);
        setByteElement(term378, 4, (byte) -28);
        term384 = (byte[]) newByteArray(3);
        setByteElement(term384, 0, (byte) 115);
        setByteElement(term384, 1, (byte) 96);
        setByteElement(term384, 2, (byte) 51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term375;
        args[1] = term378;
        args[2] = term384;
        callMethod(klass, "decrypt", argTypes, null, args);
    }

};


