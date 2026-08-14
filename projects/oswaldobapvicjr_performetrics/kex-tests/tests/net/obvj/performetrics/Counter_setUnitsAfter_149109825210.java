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

public class Counter_setUnitsAfter_149109825210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218883;

    public Counter_setUnitsAfter_149109825210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218930 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term218929 = ((Class) term218930).getDeclaredField((String) "CPU_TIME");
        ((Field) term218929).setAccessible(true);
        Object enum791 = ((Field) term218929).get((Object) null);
        Class<? extends Object> term219136 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term219135 = ((Class) term219136).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term219135).setAccessible(true);
        Object enum792 = ((Field) term219135).get((Object) null);
        term218883 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term218883, term218883.getClass(), "type", enum791);
        setField(term218883, term218883.getClass(), "conversionMode", enum792);
        setLongField(term218883, term218883.getClass(), "unitsBefore", 1993646237353405740L);
        setLongField(term218883, term218883.getClass(), "unitsAfter", -4043093655001688454L);
        setBooleanField(term218883, term218883.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsAfter", argTypes, term218883, args);
    }

};


