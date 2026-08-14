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

public class Crypto_authKey_18112782294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1791;

    public Crypto_authKey_18112782294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1791 = (byte[]) newByteArray(8);
        setByteElement(term1791, 0, (byte) -23);
        setByteElement(term1791, 1, (byte) 25);
        setByteElement(term1791, 2, (byte) 98);
        setByteElement(term1791, 3, (byte) -92);
        setByteElement(term1791, 4, (byte) -43);
        setByteElement(term1791, 5, (byte) -55);
        setByteElement(term1791, 6, (byte) 122);
        setByteElement(term1791, 7, (byte) -44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1791;
        callMethod(klass, "authKey", argTypes, null, args);
    }

};


