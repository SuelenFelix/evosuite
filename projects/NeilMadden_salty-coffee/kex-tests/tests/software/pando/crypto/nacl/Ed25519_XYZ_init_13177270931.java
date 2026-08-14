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

public class Ed25519_XYZ_init_13177270931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2513;
     Object term2515;
     Object term2518;

    public Ed25519_XYZ_init_13177270931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2513 = (long[]) newLongArray(1);
        setLongElement(term2513, 0, -433040798405298080L);
        term2515 = (long[]) newLongArray(2);
        setLongElement(term2515, 0, -1505191021111100819L);
        setLongElement(term2515, 1, -1000830646340880796L);
        term2518 = (long[]) newLongArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2513;
        args[1] = term2515;
        args[2] = term2518;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


