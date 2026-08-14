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

public class Ed25519_doubleXYZT_18856181753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3575;
     Object term3621;

    public Ed25519_doubleXYZT_18856181753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3575 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term3576 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3577 = (long[]) newLongArray(10);
        long[] term3588 = (long[]) newLongArray(10);
        long[] term3599 = (long[]) newLongArray(10);
        long[] term3610 = (long[]) newLongArray(10);
        setField(term3576, term3576.getClass(), "x", term3577);
        setField(term3576, term3576.getClass(), "y", term3588);
        setField(term3576, term3576.getClass(), "z", term3599);
        setField(term3575, term3575.getClass(), "xyz", term3576);
        setField(term3575, term3575.getClass(), "t", term3610);
        term3621 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        Object term3622 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term3623 = (long[]) newLongArray(10);
        long[] term3634 = (long[]) newLongArray(10);
        long[] term3645 = (long[]) newLongArray(10);
        long[] term3656 = (long[]) newLongArray(10);
        setField(term3622, term3622.getClass(), "x", term3623);
        setField(term3622, term3622.getClass(), "y", term3634);
        setField(term3622, term3622.getClass(), "z", term3645);
        setField(term3621, term3621.getClass(), "xyz", term3622);
        setField(term3621, term3621.getClass(), "t", term3656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        Object[] args = new Object[2];
        args[0] = term3575;
        args[1] = term3621;
        callMethod(klass, "doubleXYZT", argTypes, null, args);
    }

};


