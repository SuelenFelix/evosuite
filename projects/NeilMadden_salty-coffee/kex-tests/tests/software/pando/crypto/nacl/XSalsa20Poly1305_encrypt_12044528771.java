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

public class XSalsa20Poly1305_encrypt_12044528771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4989;
     Object term4999;
     Object term5007;

    public XSalsa20Poly1305_encrypt_12044528771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4989 = (byte[]) newByteArray(9);
        setByteElement(term4989, 0, (byte) -101);
        setByteElement(term4989, 1, (byte) -44);
        setByteElement(term4989, 3, (byte) -99);
        setByteElement(term4989, 4, (byte) 36);
        setByteElement(term4989, 5, (byte) 46);
        setByteElement(term4989, 6, (byte) -104);
        setByteElement(term4989, 7, (byte) -70);
        setByteElement(term4989, 8, (byte) -124);
        term4999 = (byte[]) newByteArray(7);
        setByteElement(term4999, 0, (byte) 82);
        setByteElement(term4999, 1, (byte) 37);
        setByteElement(term4999, 2, (byte) -10);
        setByteElement(term4999, 3, (byte) 100);
        setByteElement(term4999, 4, (byte) 90);
        setByteElement(term4999, 5, (byte) -76);
        setByteElement(term4999, 6, (byte) 72);
        term5007 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.XSalsa20Poly1305");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4989;
        args[1] = term4999;
        args[2] = term5007;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


