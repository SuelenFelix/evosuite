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
import java.lang.Integer;

public class Ed25519_CachedXYT_copyConditional_3495140124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;
     Object term1097;
     Object term1131;

    public Ed25519_CachedXYT_copyConditional_3495140124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        long[] term1064 = (long[]) newLongArray(10);
        long[] term1075 = (long[]) newLongArray(10);
        long[] term1086 = (long[]) newLongArray(10);
        setField(term1063, term1063.getClass(), "yPlusX", term1064);
        setField(term1063, term1063.getClass(), "yMinusX", term1075);
        setField(term1063, term1063.getClass(), "t2d", term1086);
        term1097 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT"));
        long[] term1098 = (long[]) newLongArray(10);
        long[] term1109 = (long[]) newLongArray(10);
        long[] term1120 = (long[]) newLongArray(10);
        setField(term1097, term1097.getClass(), "yPlusX", term1098);
        setField(term1097, term1097.getClass(), "yMinusX", term1109);
        setField(term1097, term1097.getClass(), "t2d", term1120);
        term1131 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYT");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1097;
        args[1] = term1131;
        callMethod(klass, "copyConditional", argTypes, term1063, args);
    }

};


