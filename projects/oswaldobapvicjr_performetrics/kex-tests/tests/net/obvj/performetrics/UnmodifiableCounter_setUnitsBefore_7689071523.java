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
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class UnmodifiableCounter_setUnitsBefore_7689071523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208163;
     Object term208215;

    public UnmodifiableCounter_setUnitsBefore_7689071523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term208218 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term208217 = ((Class) term208218).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term208217).setAccessible(true);
        Object enum746 = ((Field) term208217).get((Object) null);
        Class<? extends Object> term208445 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term208444 = ((Class) term208445).getDeclaredField((String) "FAST");
        ((Field) term208444).setAccessible(true);
        Object enum747 = ((Field) term208444).get((Object) null);
        term208163 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term208164 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term208164, term208164.getClass(), "type", enum746);
        setField(term208164, term208164.getClass(), "conversionMode", enum747);
        setLongField(term208164, term208164.getClass(), "unitsBefore", -8121849829073967555L);
        setLongField(term208164, term208164.getClass(), "unitsAfter", 5219030281405653303L);
        setBooleanField(term208164, term208164.getClass(), "unitsAfterSet", false);
        setField(term208163, term208163.getClass(), "counter", term208164);
        setField(term208163, term208163.getClass(), "type", enum746);
        setField(term208163, term208163.getClass(), "conversionMode", enum747);
        setLongField(term208163, term208163.getClass(), "unitsBefore", -8471550651709805183L);
        setLongField(term208163, term208163.getClass(), "unitsAfter", -948292411727204525L);
        setBooleanField(term208163, term208163.getClass(), "unitsAfterSet", true);
        term208215 = new Long(-8892586408602479513L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term208215;
        callMethod(klass, "setUnitsBefore", argTypes, term208163, args);
    }

};


