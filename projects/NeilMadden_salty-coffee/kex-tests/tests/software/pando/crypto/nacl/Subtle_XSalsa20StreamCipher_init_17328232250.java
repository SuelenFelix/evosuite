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
import java.lang.Long;

public class Subtle_XSalsa20StreamCipher_init_17328232250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9380;
     Object term9384;
     Object term9392;

    public Subtle_XSalsa20StreamCipher_init_17328232250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9380 = (byte[]) newByteArray(3);
        setByteElement(term9380, 0, (byte) 105);
        setByteElement(term9380, 1, (byte) -60);
        setByteElement(term9380, 2, (byte) 53);
        term9384 = (byte[]) newByteArray(7);
        setByteElement(term9384, 0, (byte) 82);
        setByteElement(term9384, 1, (byte) -35);
        setByteElement(term9384, 2, (byte) 55);
        setByteElement(term9384, 3, (byte) -102);
        setByteElement(term9384, 4, (byte) -100);
        setByteElement(term9384, 5, (byte) -114);
        setByteElement(term9384, 6, (byte) 54);
        term9392 = new Long(-8862087040734407227L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Subtle$XSalsa20StreamCipher");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term9380;
        args[1] = term9384;
        args[2] = term9392;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


