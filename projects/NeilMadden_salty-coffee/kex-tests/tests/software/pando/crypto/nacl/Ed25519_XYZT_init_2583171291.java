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

public class Ed25519_XYZT_init_2583171291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4605;
     Object term4639;

    public Ed25519_XYZT_init_2583171291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4605 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term4606 = (long[]) newLongArray(10);
        long[] term4617 = (long[]) newLongArray(10);
        long[] term4628 = (long[]) newLongArray(10);
        setField(term4605, term4605.getClass(), "x", term4606);
        setField(term4605, term4605.getClass(), "y", term4617);
        setField(term4605, term4605.getClass(), "z", term4628);
        term4639 = (long[]) newLongArray(1);
        setLongElement(term4639, 0, -419800263764810394L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4605;
        args[1] = term4639;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


