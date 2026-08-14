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

public class Counter_getUnitsBefore_6965756893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215550;

    public Counter_getUnitsBefore_6965756893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215599 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term215598 = ((Class) term215599).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term215598).setAccessible(true);
        Object enum777 = ((Field) term215598).get((Object) null);
        Class<? extends Object> term215826 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term215825 = ((Class) term215826).getDeclaredField((String) "FAST");
        ((Field) term215825).setAccessible(true);
        Object enum778 = ((Field) term215825).get((Object) null);
        term215550 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term215550, term215550.getClass(), "type", enum777);
        setField(term215550, term215550.getClass(), "conversionMode", enum778);
        setLongField(term215550, term215550.getClass(), "unitsBefore", 5731563613239387113L);
        setLongField(term215550, term215550.getClass(), "unitsAfter", 3381333711768010594L);
        setBooleanField(term215550, term215550.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitsBefore", argTypes, term215550, args);
    }

};


