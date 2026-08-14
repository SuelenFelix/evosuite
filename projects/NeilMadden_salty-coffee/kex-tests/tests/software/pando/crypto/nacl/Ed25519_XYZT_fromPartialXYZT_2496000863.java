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

public class Ed25519_XYZT_fromPartialXYZT_2496000863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4758;
     Object term4804;

    public Ed25519_XYZT_fromPartialXYZT_2496000863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4758 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        Object term4759 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term4760 = (long[]) newLongArray(10);
        long[] term4771 = (long[]) newLongArray(10);
        long[] term4782 = (long[]) newLongArray(10);
        long[] term4793 = (long[]) newLongArray(10);
        setField(term4759, term4759.getClass(), "x", term4760);
        setField(term4759, term4759.getClass(), "y", term4771);
        setField(term4759, term4759.getClass(), "z", term4782);
        setField(term4758, term4758.getClass(), "xyz", term4759);
        setField(term4758, term4758.getClass(), "t", term4793);
        term4804 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT"));
        Object term4805 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term4806 = (long[]) newLongArray(10);
        long[] term4817 = (long[]) newLongArray(10);
        long[] term4828 = (long[]) newLongArray(10);
        long[] term4839 = (long[]) newLongArray(10);
        setField(term4805, term4805.getClass(), "x", term4806);
        setField(term4805, term4805.getClass(), "y", term4817);
        setField(term4805, term4805.getClass(), "z", term4828);
        setField(term4804, term4804.getClass(), "xyz", term4805);
        setField(term4804, term4804.getClass(), "t", term4839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        argTypes[1] = Class.forName("software.pando.crypto.nacl.Ed25519$PartialXYZT");
        Object[] args = new Object[2];
        args[0] = term4758;
        args[1] = term4804;
        callMethod(klass, "fromPartialXYZT", argTypes, null, args);
    }

};


