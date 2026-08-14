package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Counter_elapsedTimeNanos_117640397511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219375;

    public Counter_elapsedTimeNanos_117640397511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219424 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term219423 = ((Class) term219424).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term219423).setAccessible(true);
        Object enum793 = ((Field) term219423).get((Object) null);
        Class<? extends Object> term219651 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term219650 = ((Class) term219651).getDeclaredField((String) "FAST");
        ((Field) term219650).setAccessible(true);
        Object enum794 = ((Field) term219650).get((Object) null);
        term219375 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term219375, term219375.getClass(), "type", enum793);
        setField(term219375, term219375.getClass(), "conversionMode", enum794);
        setLongField(term219375, term219375.getClass(), "unitsBefore", -419800263764810394L);
        setLongField(term219375, term219375.getClass(), "unitsAfter", 5904678961906211249L);
        setBooleanField(term219375, term219375.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "elapsedTimeNanos", argTypes, term219375, args);
    }

};


