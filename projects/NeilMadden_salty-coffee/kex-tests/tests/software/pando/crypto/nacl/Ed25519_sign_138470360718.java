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

public class Ed25519_sign_138470360718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4067;
     Object term4076;
     Object term4078;

    public Ed25519_sign_138470360718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4067 = (byte[]) newByteArray(8);
        setByteElement(term4067, 0, (byte) -51);
        setByteElement(term4067, 1, (byte) -55);
        setByteElement(term4067, 2, (byte) -5);
        setByteElement(term4067, 3, (byte) 14);
        setByteElement(term4067, 4, (byte) 125);
        setByteElement(term4067, 5, (byte) 57);
        setByteElement(term4067, 6, (byte) 40);
        setByteElement(term4067, 7, (byte) -31);
        term4076 = (byte[]) newByteArray(1);
        setByteElement(term4076, 0, (byte) 83);
        term4078 = (byte[]) newByteArray(9);
        setByteElement(term4078, 0, (byte) 19);
        setByteElement(term4078, 1, (byte) 95);
        setByteElement(term4078, 2, (byte) 95);
        setByteElement(term4078, 3, (byte) 15);
        setByteElement(term4078, 4, (byte) 121);
        setByteElement(term4078, 5, (byte) 83);
        setByteElement(term4078, 6, (byte) -2);
        setByteElement(term4078, 7, (byte) 101);
        setByteElement(term4078, 8, (byte) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4067;
        args[1] = term4076;
        args[2] = term4078;
        callMethod(klass, "sign", argTypes, null, args);
    }

};


