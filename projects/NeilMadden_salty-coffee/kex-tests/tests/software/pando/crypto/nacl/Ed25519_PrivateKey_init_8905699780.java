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

public class Ed25519_PrivateKey_init_8905699780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1621;

    public Ed25519_PrivateKey_init_8905699780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1621 = (byte[]) newByteArray(9);
        setByteElement(term1621, 0, (byte) -57);
        setByteElement(term1621, 1, (byte) 103);
        setByteElement(term1621, 2, (byte) 40);
        setByteElement(term1621, 3, (byte) -106);
        setByteElement(term1621, 4, (byte) -95);
        setByteElement(term1621, 5, (byte) 69);
        setByteElement(term1621, 6, (byte) 63);
        setByteElement(term1621, 7, (byte) -41);
        setByteElement(term1621, 8, (byte) -44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PrivateKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1621;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


