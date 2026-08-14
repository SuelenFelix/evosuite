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

public class Ed25519_CachedXYZT_multByZ_20668250683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;
     Object term821;
     Object term822;

    public Ed25519_CachedXYZT_multByZ_20668250683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term776 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYZT"));
        long[] term777 = (long[]) newLongArray(10);
        long[] term788 = (long[]) newLongArray(10);
        long[] term799 = (long[]) newLongArray(10);
        long[] term810 = (long[]) newLongArray(10);
        setField(term776, term776.getClass(), "z", term777);
        setField(term776, term776.getClass(), "yPlusX", term788);
        setField(term776, term776.getClass(), "yMinusX", term799);
        setField(term776, term776.getClass(), "t2d", term810);
        term821 = (long[]) newLongArray(0);
        term822 = (long[]) newLongArray(2);
        setLongElement(term822, 0, -4920224193275732920L);
        setLongElement(term822, 1, 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYZT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term821;
        args[1] = term822;
        callMethod(klass, "multByZ", argTypes, term776, args);
    }

};


