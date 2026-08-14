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

public class UnmodifiableCounter_elapsedTime_5572531948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212011;

    public UnmodifiableCounter_elapsedTime_5572531948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212070 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term212069 = ((Class) term212070).getDeclaredField((String) "CPU_TIME");
        ((Field) term212069).setAccessible(true);
        Object enum762 = ((Field) term212069).get((Object) null);
        Class<? extends Object> term212276 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term212275 = ((Class) term212276).getDeclaredField((String) "FAST");
        ((Field) term212275).setAccessible(true);
        Object enum763 = ((Field) term212275).get((Object) null);
        Class<? extends Object> term212480 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term212479 = ((Class) term212480).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term212479).setAccessible(true);
        Object enum764 = ((Field) term212479).get((Object) null);
        term212011 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term212012 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term212012, term212012.getClass(), "type", enum762);
        setField(term212012, term212012.getClass(), "conversionMode", enum763);
        setLongField(term212012, term212012.getClass(), "unitsBefore", 3412644969878030772L);
        setLongField(term212012, term212012.getClass(), "unitsAfter", 6698455537431331246L);
        setBooleanField(term212012, term212012.getClass(), "unitsAfterSet", true);
        setField(term212011, term212011.getClass(), "counter", term212012);
        setField(term212011, term212011.getClass(), "type", enum762);
        setField(term212011, term212011.getClass(), "conversionMode", enum764);
        setLongField(term212011, term212011.getClass(), "unitsBefore", -8327432141027603933L);
        setLongField(term212011, term212011.getClass(), "unitsAfter", -433040798405298080L);
        setBooleanField(term212011, term212011.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "elapsedTime", argTypes, term212011, args);
    }

};


