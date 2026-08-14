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

public class Salsa20Poly1305_encrypt_14559225311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4943;
     Object term4946;
     Object term4950;

    public Salsa20Poly1305_encrypt_14559225311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4943 = (byte[]) newByteArray(2);
        setByteElement(term4943, 0, (byte) -125);
        setByteElement(term4943, 1, (byte) -126);
        term4946 = (byte[]) newByteArray(3);
        setByteElement(term4946, 0, (byte) 80);
        setByteElement(term4946, 1, (byte) 118);
        setByteElement(term4946, 2, (byte) -116);
        term4950 = (byte[]) newByteArray(1);
        setByteElement(term4950, 0, (byte) 85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20Poly1305");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4943;
        args[1] = term4946;
        args[2] = term4950;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


