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

public class XSalsa20_encrypt_3216570361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4415;
     Object term4422;
     Object term4424;

    public XSalsa20_encrypt_3216570361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4415 = (byte[]) newByteArray(6);
        setByteElement(term4415, 0, (byte) 13);
        setByteElement(term4415, 1, (byte) 35);
        setByteElement(term4415, 2, (byte) -41);
        setByteElement(term4415, 3, (byte) 9);
        setByteElement(term4415, 4, (byte) 44);
        setByteElement(term4415, 5, (byte) 26);
        term4422 = (byte[]) newByteArray(1);
        setByteElement(term4422, 0, (byte) 125);
        term4424 = (byte[]) newByteArray(5);
        setByteElement(term4424, 0, (byte) -119);
        setByteElement(term4424, 1, (byte) 94);
        setByteElement(term4424, 2, (byte) -1);
        setByteElement(term4424, 3, (byte) 99);
        setByteElement(term4424, 4, (byte) 32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.XSalsa20");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4415;
        args[1] = term4422;
        args[2] = term4424;
        callMethod(klass, "encrypt", argTypes, null, args);
    }

};


