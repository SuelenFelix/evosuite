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

public class Field25519_reduceCoefficients_20372615416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2364;

    public Field25519_reduceCoefficients_20372615416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2364 = (long[]) newLongArray(6);
        setLongElement(term2364, 0, 4513004407927379358L);
        setLongElement(term2364, 1, -7115418542247301000L);
        setLongElement(term2364, 2, 8034714140377562739L);
        setLongElement(term2364, 3, -2924531382671518368L);
        setLongElement(term2364, 4, -3948863953565024517L);
        setLongElement(term2364, 5, -6587807377747738663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2364;
        callMethod(klass, "reduceCoefficients", argTypes, null, args);
    }

};


