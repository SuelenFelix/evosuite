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

public class Ed25519_PartialXYZT_init_3265756501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2057;
     Object term2091;

    public Ed25519_PartialXYZT_init_3265756501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2057 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2058 = (long[]) newLongArray(10);
        long[] term2069 = (long[]) newLongArray(10);
        long[] term2080 = (long[]) newLongArray(10);
        setField(term2057, term2057.getClass(), "x", term2058);
        setField(term2057, term2057.getClass(), "y", term2069);
        setField(term2057, term2057.getClass(), "z", term2080);
        term2091 = (long[]) newLongArray(5);
        setLongElement(term2091, 0, 305759998609888272L);
        setLongElement(term2091, 1, -8654565919063661957L);
        setLongElement(term2091, 2, -5248475803419977214L);
        setLongElement(term2091, 3, -6723783499250797216L);
        setLongElement(term2091, 4, 41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2057;
        args[1] = term2091;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


