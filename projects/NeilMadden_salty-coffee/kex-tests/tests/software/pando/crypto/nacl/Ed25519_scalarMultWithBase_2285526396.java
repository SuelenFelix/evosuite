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

public class Ed25519_scalarMultWithBase_2285526396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3819;

    public Ed25519_scalarMultWithBase_2285526396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3819 = (byte[]) newByteArray(6);
        setByteElement(term3819, 0, (byte) -50);
        setByteElement(term3819, 1, (byte) -103);
        setByteElement(term3819, 2, (byte) 122);
        setByteElement(term3819, 3, (byte) -75);
        setByteElement(term3819, 4, (byte) -72);
        setByteElement(term3819, 5, (byte) -19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3819;
        callMethod(klass, "scalarMultWithBase", argTypes, null, args);
    }

};


