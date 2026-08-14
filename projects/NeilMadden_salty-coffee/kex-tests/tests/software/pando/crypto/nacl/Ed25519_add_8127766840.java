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

public class Ed25519_add_8127766840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2953;
     Object term2999;
     Object term3045;

    public Ed25519_add_8127766840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2953 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term2954 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2955 = (long[]) newLongArray(10);
        long[] term2966 = (long[]) newLongArray(10);
        long[] term2977 = (long[]) newLongArray(10);
        long[] term2988 = (long[]) newLongArray(10);
        setField(term2954, term2954.getClass(), "x", term2955);
        setField(term2954, term2954.getClass(), "y", term2966);
        setField(term2954, term2954.getClass(), "z", term2977);
        setField(term2953, term2953.getClass(), "xyz", term2954);
        setField(term2953, term2953.getClass(), "t", term2988);
        term2999 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        Object term3000 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3001 = (long[]) newLongArray(10);
        long[] term3012 = (long[]) newLongArray(10);
        long[] term3023 = (long[]) newLongArray(10);
        long[] term3034 = (long[]) newLongArray(10);
        setField(term3000, term3000.getClass(), "x", term3001);
        setField(term3000, term3000.getClass(), "y", term3012);
        setField(term3000, term3000.getClass(), "z", term3023);
        setField(term2999, term2999.getClass(), "xyz", term3000);
        setField(term2999, term2999.getClass(), "t", term3034);
        term3045 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        long[] term3046 = (long[]) newLongArray(10);
        long[] term3057 = (long[]) newLongArray(10);
        long[] term3068 = (long[]) newLongArray(10);
        setField(term3045, term3045.getClass(), "yPlusX", term3046);
        setField(term3045, term3045.getClass(), "yMinusX", term3057);
        setField(term3045, term3045.getClass(), "t2d", term3068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        argTypes[2] = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Object[] args = new Object[3];
        args[0] = term2953;
        args[1] = term2999;
        args[2] = term3045;
        callMethod(klass, "add", argTypes, null, args);
    }

};


