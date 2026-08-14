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
import java.lang.Long;

public class Counter_setUnitsBefore_11312389254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216029;
     Object term216077;

    public Counter_setUnitsBefore_11312389254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216080 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term216079 = ((Class) term216080).getDeclaredField((String) "USER_TIME");
        ((Field) term216079).setAccessible(true);
        Object enum779 = ((Field) term216079).get((Object) null);
        Class<? extends Object> term216289 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term216288 = ((Class) term216289).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term216288).setAccessible(true);
        Object enum780 = ((Field) term216288).get((Object) null);
        term216029 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term216029, term216029.getClass(), "type", enum779);
        setField(term216029, term216029.getClass(), "conversionMode", enum780);
        setLongField(term216029, term216029.getClass(), "unitsBefore", 3580984732036213717L);
        setLongField(term216029, term216029.getClass(), "unitsAfter", 5330761990446327930L);
        setBooleanField(term216029, term216029.getClass(), "unitsAfterSet", false);
        term216077 = new Long(-3954795081650780841L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term216077;
        callMethod(klass, "setUnitsBefore", argTypes, term216029, args);
    }

};


