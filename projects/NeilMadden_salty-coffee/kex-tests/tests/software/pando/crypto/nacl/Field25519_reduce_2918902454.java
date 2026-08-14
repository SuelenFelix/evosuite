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

public class Field25519_reduce_2918902454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2343;
     Object term2346;

    public Field25519_reduce_2918902454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2343 = (long[]) newLongArray(2);
        setLongElement(term2343, 0, -2255965562447970862L);
        setLongElement(term2343, 1, 148047808219672941L);
        term2346 = (long[]) newLongArray(6);
        setLongElement(term2346, 0, 7489064039921396098L);
        setLongElement(term2346, 1, 6843866297465638866L);
        setLongElement(term2346, 2, -4023935540989049732L);
        setLongElement(term2346, 3, 855932984568615096L);
        setLongElement(term2346, 4, -1616722610139554082L);
        setLongElement(term2346, 5, 7495904023107549024L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2343;
        args[1] = term2346;
        callMethod(klass, "reduce", argTypes, null, args);
    }

};


