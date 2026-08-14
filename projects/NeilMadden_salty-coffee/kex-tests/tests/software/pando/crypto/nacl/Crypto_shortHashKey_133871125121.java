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

public class Crypto_shortHashKey_133871125121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1960;

    public Crypto_shortHashKey_133871125121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1960 = (byte[]) newByteArray(6);
        setByteElement(term1960, 0, (byte) 73);
        setByteElement(term1960, 1, (byte) -77);
        setByteElement(term1960, 2, (byte) -11);
        setByteElement(term1960, 3, (byte) -95);
        setByteElement(term1960, 4, (byte) 114);
        setByteElement(term1960, 5, (byte) -9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Crypto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1960;
        callMethod(klass, "shortHashKey", argTypes, null, args);
    }

};


