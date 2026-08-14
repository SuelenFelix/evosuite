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

public class Ed25519_doubleXYZ_2211882472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3425;
     Object term3471;

    public Ed25519_doubleXYZ_2211882472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3425 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term3426 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3427 = (long[]) newLongArray(10);
        long[] term3438 = (long[]) newLongArray(10);
        long[] term3449 = (long[]) newLongArray(10);
        long[] term3460 = (long[]) newLongArray(10);
        setField(term3426, term3426.getClass(), "x", term3427);
        setField(term3426, term3426.getClass(), "y", term3438);
        setField(term3426, term3426.getClass(), "z", term3449);
        setField(term3425, term3425.getClass(), "xyz", term3426);
        setField(term3425, term3425.getClass(), "t", term3460);
        term3471 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3472 = (long[]) newLongArray(10);
        long[] term3483 = (long[]) newLongArray(10);
        long[] term3494 = (long[]) newLongArray(10);
        setField(term3471, term3471.getClass(), "x", term3472);
        setField(term3471, term3471.getClass(), "y", term3483);
        setField(term3471, term3471.getClass(), "z", term3494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Object[] args = new Object[2];
        args[0] = term3425;
        args[1] = term3471;
        callMethod(klass, "doubleXYZ", argTypes, null, args);
    }

};


