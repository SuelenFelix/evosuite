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

public class Ed25519_CachedXYZT_init_8598350931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;

    public Ed25519_CachedXYZT_init_8598350931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZT"));
        Object term659 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term660 = (long[]) newLongArray(10);
        long[] term671 = (long[]) newLongArray(10);
        long[] term682 = (long[]) newLongArray(10);
        long[] term693 = (long[]) newLongArray(10);
        setField(term659, term659.getClass(), "x", term660);
        setField(term659, term659.getClass(), "y", term671);
        setField(term659, term659.getClass(), "z", term682);
        setField(term658, term658.getClass(), "xyz", term659);
        setField(term658, term658.getClass(), "t", term693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$CachedXYZT");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZT");
        Object[] args = new Object[1];
        args[0] = term658;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


