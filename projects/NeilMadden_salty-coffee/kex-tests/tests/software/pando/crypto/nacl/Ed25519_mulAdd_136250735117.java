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

public class Ed25519_mulAdd_136250735117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4029;
     Object term4039;
     Object term4045;
     Object term4047;

    public Ed25519_mulAdd_136250735117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4029 = (byte[]) newByteArray(9);
        setByteElement(term4029, 0, (byte) 8);
        setByteElement(term4029, 1, (byte) 25);
        setByteElement(term4029, 2, (byte) 103);
        setByteElement(term4029, 3, (byte) 111);
        setByteElement(term4029, 4, (byte) -43);
        setByteElement(term4029, 5, (byte) 35);
        setByteElement(term4029, 6, (byte) 62);
        setByteElement(term4029, 7, (byte) 90);
        setByteElement(term4029, 8, (byte) -40);
        term4039 = (byte[]) newByteArray(5);
        setByteElement(term4039, 0, (byte) 79);
        setByteElement(term4039, 1, (byte) -102);
        setByteElement(term4039, 2, (byte) 55);
        setByteElement(term4039, 3, (byte) -63);
        setByteElement(term4039, 4, (byte) -76);
        term4045 = (byte[]) newByteArray(1);
        setByteElement(term4045, 0, (byte) -87);
        term4047 = (byte[]) newByteArray(2);
        setByteElement(term4047, 0, (byte) 108);
        setByteElement(term4047, 1, (byte) -119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term4029;
        args[1] = term4039;
        args[2] = term4045;
        args[3] = term4047;
        callMethod(klass, "mulAdd", argTypes, null, args);
    }

};


