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

public class Counter_getUnitsAfter_18894912205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216528;

    public Counter_getUnitsAfter_18894912205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216569 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term216568 = ((Class) term216569).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term216568).setAccessible(true);
        Object enum781 = ((Field) term216568).get((Object) null);
        Class<? extends Object> term216784 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term216783 = ((Class) term216784).getDeclaredField((String) "FAST");
        ((Field) term216783).setAccessible(true);
        Object enum782 = ((Field) term216783).get((Object) null);
        term216528 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term216528, term216528.getClass(), "type", enum781);
        setField(term216528, term216528.getClass(), "conversionMode", enum782);
        setLongField(term216528, term216528.getClass(), "unitsBefore", 3288791194263207397L);
        setLongField(term216528, term216528.getClass(), "unitsAfter", 3288941170644426558L);
        setBooleanField(term216528, term216528.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitsAfter", argTypes, term216528, args);
    }

};


