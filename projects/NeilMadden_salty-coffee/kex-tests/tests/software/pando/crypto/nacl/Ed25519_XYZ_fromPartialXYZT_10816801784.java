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

public class Ed25519_XYZ_fromPartialXYZT_10816801784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2672;
     Object term2706;

    public Ed25519_XYZ_fromPartialXYZT_10816801784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2672 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2673 = (long[]) newLongArray(10);
        long[] term2684 = (long[]) newLongArray(10);
        long[] term2695 = (long[]) newLongArray(10);
        setField(term2672, term2672.getClass(), "x", term2673);
        setField(term2672, term2672.getClass(), "y", term2684);
        setField(term2672, term2672.getClass(), "z", term2695);
        term2706 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term2707 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2708 = (long[]) newLongArray(10);
        long[] term2719 = (long[]) newLongArray(10);
        long[] term2730 = (long[]) newLongArray(10);
        long[] term2741 = (long[]) newLongArray(10);
        setField(term2707, term2707.getClass(), "x", term2708);
        setField(term2707, term2707.getClass(), "y", term2719);
        setField(term2707, term2707.getClass(), "z", term2730);
        setField(term2706, term2706.getClass(), "xyz", term2707);
        setField(term2706, term2706.getClass(), "t", term2741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Object[] args = new Object[2];
        args[0] = term2672;
        args[1] = term2706;
        callMethod(klass, "fromPartialXYZT", argTypes, null, args);
    }

};


