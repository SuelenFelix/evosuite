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

public class Crypto_seedSigningKeyPair_75750057611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;

    public Crypto_seedSigningKeyPair_75750057611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = (byte[]) newByteArray(6);
        setByteElement(term1836, 0, (byte) 65);
        setByteElement(term1836, 1, (byte) 103);
        setByteElement(term1836, 2, (byte) -19);
        setByteElement(term1836, 3, (byte) -36);
        setByteElement(term1836, 4, (byte) -23);
        setByteElement(term1836, 5, (byte) -100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1836;
        callMethod(klass, "seedSigningKeyPair", argTypes, null, args);
    }

};


