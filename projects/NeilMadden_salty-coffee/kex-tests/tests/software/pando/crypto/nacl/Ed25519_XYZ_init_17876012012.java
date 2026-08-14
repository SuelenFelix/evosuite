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

public class Ed25519_XYZ_init_17876012012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2522;

    public Ed25519_XYZ_init_17876012012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2522 = newInstance(Class.forName("software.pando.crypto.nacl.Ed25519$XYZ"));
        long[] term2523 = (long[]) newLongArray(10);
        long[] term2534 = (long[]) newLongArray(10);
        long[] term2545 = (long[]) newLongArray(10);
        setField(term2522, term2522.getClass(), "x", term2523);
        setField(term2522, term2522.getClass(), "y", term2534);
        setField(term2522, term2522.getClass(), "z", term2545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("software.pando.crypto.nacl.Ed25519$XYZ");
        Object[] args = new Object[1];
        args[0] = term2522;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


