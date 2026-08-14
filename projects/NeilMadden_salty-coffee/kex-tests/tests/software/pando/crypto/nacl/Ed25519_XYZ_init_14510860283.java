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
import java.lang.Object;

public class Ed25519_XYZ_init_14510860283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2586;

    public Ed25519_XYZ_init_14510860283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2586 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term2587 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2588 = (long[]) newLongArray(10);
        long[] term2599 = (long[]) newLongArray(10);
        long[] term2610 = (long[]) newLongArray(10);
        long[] term2621 = (long[]) newLongArray(10);
        setField(term2587, term2587.getClass(), "x", term2588);
        setField(term2587, term2587.getClass(), "y", term2599);
        setField(term2587, term2587.getClass(), "z", term2610);
        setField(term2586, term2586.getClass(), "xyz", term2587);
        setField(term2586, term2586.getClass(), "t", term2621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Object[] args = new Object[1];
        args[0] = term2586;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


