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

public class Salsa20Poly1305_decrypt_18461081012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4958;
     Object term4959;
     Object term4960;

    public Salsa20Poly1305_decrypt_18461081012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4958 = (byte[]) newByteArray(0);
        term4959 = (byte[]) newByteArray(0);
        term4960 = (byte[]) newByteArray(9);
        setByteElement(term4960, 0, (byte) 24);
        setByteElement(term4960, 1, (byte) -51);
        setByteElement(term4960, 2, (byte) 123);
        setByteElement(term4960, 3, (byte) 104);
        setByteElement(term4960, 4, (byte) 85);
        setByteElement(term4960, 5, (byte) -27);
        setByteElement(term4960, 6, (byte) 106);
        setByteElement(term4960, 7, (byte) 104);
        setByteElement(term4960, 8, (byte) 28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20Poly1305");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4958;
        args[1] = term4959;
        args[2] = term4960;
        callMethod(klass, "decrypt", argTypes, null, args);
    }

};


