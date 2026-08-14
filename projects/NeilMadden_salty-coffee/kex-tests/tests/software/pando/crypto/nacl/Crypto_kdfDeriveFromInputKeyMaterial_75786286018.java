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
import java.lang.Integer;

public class Crypto_kdfDeriveFromInputKeyMaterial_75786286018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923;
     Object term1930;
     Object term1934;
     Object term1935;

    public Crypto_kdfDeriveFromInputKeyMaterial_75786286018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1923 = (byte[]) newByteArray(6);
        setByteElement(term1923, 0, (byte) -110);
        setByteElement(term1923, 1, (byte) -88);
        setByteElement(term1923, 2, (byte) 56);
        setByteElement(term1923, 3, (byte) -106);
        setByteElement(term1923, 4, (byte) 58);
        setByteElement(term1923, 5, (byte) 77);
        term1930 = (byte[]) newByteArray(3);
        setByteElement(term1930, 0, (byte) -54);
        setByteElement(term1930, 1, (byte) -59);
        setByteElement(term1930, 2, (byte) 103);
        term1934 = (byte[]) newByteArray(0);
        term1935 = new Integer(458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1923;
        args[1] = term1930;
        args[2] = term1934;
        args[3] = term1935;
        callMethod(klass, "kdfDeriveFromInputKeyMaterial", argTypes, null, args);
    }

};


