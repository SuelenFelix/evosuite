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

public class Counter_setUnitsBefore_11312418399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218404;

    public Counter_setUnitsBefore_11312418399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218453 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term218452 = ((Class) term218453).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term218452).setAccessible(true);
        Object enum789 = ((Field) term218452).get((Object) null);
        Class<? extends Object> term218680 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term218679 = ((Class) term218680).getDeclaredField((String) "FAST");
        ((Field) term218679).setAccessible(true);
        Object enum790 = ((Field) term218679).get((Object) null);
        term218404 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term218404, term218404.getClass(), "type", enum789);
        setField(term218404, term218404.getClass(), "conversionMode", enum790);
        setLongField(term218404, term218404.getClass(), "unitsBefore", 3230472384687362867L);
        setLongField(term218404, term218404.getClass(), "unitsAfter", -1145146470850585022L);
        setBooleanField(term218404, term218404.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsBefore", argTypes, term218404, args);
    }

};


