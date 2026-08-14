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

public class Ed25519_XYZ_isOnCurve_11201940076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2886;

    public Ed25519_XYZ_isOnCurve_11201940076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2886 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2887 = (long[]) newLongArray(10);
        long[] term2898 = (long[]) newLongArray(10);
        long[] term2909 = (long[]) newLongArray(10);
        setField(term2886, term2886.getClass(), "x", term2887);
        setField(term2886, term2886.getClass(), "y", term2898);
        setField(term2886, term2886.getClass(), "z", term2909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnCurve", argTypes, term2886, args);
    }

};


