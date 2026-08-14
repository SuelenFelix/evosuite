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

public class CryptoBox_fromCombined_173800059412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342;
     Object term1348;

    public CryptoBox_fromCombined_173800059412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1342 = (byte[]) newByteArray(5);
        setByteElement(term1342, 0, (byte) 10);
        setByteElement(term1342, 1, (byte) 65);
        setByteElement(term1342, 2, (byte) -44);
        setByteElement(term1342, 3, (byte) 115);
        setByteElement(term1342, 4, (byte) -32);
        term1348 = (byte[]) newByteArray(1);
        setByteElement(term1348, 0, (byte) -52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.CryptoBox");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1342;
        args[1] = term1348;
        callMethod(klass, "fromCombined", argTypes, null, args);
    }

};


