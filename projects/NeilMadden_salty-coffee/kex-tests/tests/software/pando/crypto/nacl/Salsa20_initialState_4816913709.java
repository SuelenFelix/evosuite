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

public class Salsa20_initialState_4816913709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;
     Object term404;

    public Salsa20_initialState_4816913709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398 = (byte[]) newByteArray(5);
        setByteElement(term398, 0, (byte) -53);
        setByteElement(term398, 1, (byte) -8);
        setByteElement(term398, 2, (byte) -9);
        setByteElement(term398, 3, (byte) 97);
        setByteElement(term398, 4, (byte) -46);
        term404 = (byte[]) newByteArray(5);
        setByteElement(term404, 0, (byte) 14);
        setByteElement(term404, 1, (byte) 34);
        setByteElement(term404, 2, (byte) 126);
        setByteElement(term404, 3, (byte) 7);
        setByteElement(term404, 4, (byte) -96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Salsa20");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term398;
        args[1] = term404;
        callMethod(klass, "initialState", argTypes, null, args);
    }

};


