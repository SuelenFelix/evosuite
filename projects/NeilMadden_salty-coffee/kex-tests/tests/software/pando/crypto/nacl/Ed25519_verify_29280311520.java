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

public class Ed25519_verify_29280311520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4123;
     Object term4133;
     Object term4141;

    public Ed25519_verify_29280311520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4123 = (byte[]) newByteArray(9);
        setByteElement(term4123, 0, (byte) 8);
        setByteElement(term4123, 1, (byte) -11);
        setByteElement(term4123, 2, (byte) 104);
        setByteElement(term4123, 3, (byte) 56);
        setByteElement(term4123, 4, (byte) -61);
        setByteElement(term4123, 5, (byte) -108);
        setByteElement(term4123, 6, (byte) 10);
        setByteElement(term4123, 7, (byte) -83);
        setByteElement(term4123, 8, (byte) -117);
        term4133 = (byte[]) newByteArray(7);
        setByteElement(term4133, 0, (byte) 97);
        setByteElement(term4133, 1, (byte) 100);
        setByteElement(term4133, 2, (byte) 79);
        setByteElement(term4133, 3, (byte) -56);
        setByteElement(term4133, 4, (byte) 105);
        setByteElement(term4133, 5, (byte) -8);
        setByteElement(term4133, 6, (byte) 62);
        term4141 = (byte[]) newByteArray(8);
        setByteElement(term4141, 0, (byte) 38);
        setByteElement(term4141, 1, (byte) 31);
        setByteElement(term4141, 2, (byte) -105);
        setByteElement(term4141, 3, (byte) 73);
        setByteElement(term4141, 4, (byte) -67);
        setByteElement(term4141, 5, (byte) -72);
        setByteElement(term4141, 6, (byte) 38);
        setByteElement(term4141, 7, (byte) 91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4123;
        args[1] = term4133;
        args[2] = term4141;
        callMethod(klass, "verify", argTypes, null, args);
    }

};


