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

public class Ed25519_sub_7956487811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3189;
     Object term3235;
     Object term3281;

    public Ed25519_sub_7956487811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3189 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term3190 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3191 = (long[]) newLongArray(10);
        long[] term3202 = (long[]) newLongArray(10);
        long[] term3213 = (long[]) newLongArray(10);
        long[] term3224 = (long[]) newLongArray(10);
        setField(term3190, term3190.getClass(), "x", term3191);
        setField(term3190, term3190.getClass(), "y", term3202);
        setField(term3190, term3190.getClass(), "z", term3213);
        setField(term3189, term3189.getClass(), "xyz", term3190);
        setField(term3189, term3189.getClass(), "t", term3224);
        term3235 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        Object term3236 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3237 = (long[]) newLongArray(10);
        long[] term3248 = (long[]) newLongArray(10);
        long[] term3259 = (long[]) newLongArray(10);
        long[] term3270 = (long[]) newLongArray(10);
        setField(term3236, term3236.getClass(), "x", term3237);
        setField(term3236, term3236.getClass(), "y", term3248);
        setField(term3236, term3236.getClass(), "z", term3259);
        setField(term3235, term3235.getClass(), "xyz", term3236);
        setField(term3235, term3235.getClass(), "t", term3270);
        term3281 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        long[] term3282 = (long[]) newLongArray(10);
        long[] term3293 = (long[]) newLongArray(10);
        long[] term3304 = (long[]) newLongArray(10);
        setField(term3281, term3281.getClass(), "yPlusX", term3282);
        setField(term3281, term3281.getClass(), "yMinusX", term3293);
        setField(term3281, term3281.getClass(), "t2d", term3304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        argTypes[2] = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Object[] args = new Object[3];
        args[0] = term3189;
        args[1] = term3235;
        args[2] = term3281;
        callMethod(klass, "sub", argTypes, null, args);
    }

};


