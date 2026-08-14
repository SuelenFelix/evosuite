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

public class Counter_toString_135020144215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221953;

    public Counter_toString_135020144215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term221988 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term221987 = ((Class) term221988).getDeclaredField((String) "CPU_TIME");
        ((Field) term221987).setAccessible(true);
        Object enum804 = ((Field) term221987).get((Object) null);
        Class<? extends Object> term222194 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term222193 = ((Class) term222194).getDeclaredField((String) "FAST");
        ((Field) term222193).setAccessible(true);
        Object enum805 = ((Field) term222193).get((Object) null);
        term221953 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term221953, term221953.getClass(), "type", enum804);
        setField(term221953, term221953.getClass(), "conversionMode", enum805);
        setLongField(term221953, term221953.getClass(), "unitsBefore", -2955854401507097864L);
        setLongField(term221953, term221953.getClass(), "unitsAfter", 329213208496958131L);
        setBooleanField(term221953, term221953.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term221953, args);
    }

};


