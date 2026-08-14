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

public class Ed25519_PartialXYZT_init_3948059612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2132;

    public Ed25519_PartialXYZT_init_3948059612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2132 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term2133 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2134 = (long[]) newLongArray(10);
        long[] term2145 = (long[]) newLongArray(10);
        long[] term2156 = (long[]) newLongArray(10);
        long[] term2167 = (long[]) newLongArray(10);
        setField(term2133, term2133.getClass(), "x", term2134);
        setField(term2133, term2133.getClass(), "y", term2145);
        setField(term2133, term2133.getClass(), "z", term2156);
        setField(term2132, term2132.getClass(), "xyz", term2133);
        setField(term2132, term2132.getClass(), "t", term2167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Object[] args = new Object[1];
        args[0] = term2132;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


