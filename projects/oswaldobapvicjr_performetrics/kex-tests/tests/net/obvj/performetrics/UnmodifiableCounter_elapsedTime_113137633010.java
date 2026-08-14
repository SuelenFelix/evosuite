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

public class UnmodifiableCounter_elapsedTime_113137633010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213410;
     Object enum771;
     Object enum769;

    public UnmodifiableCounter_elapsedTime_113137633010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213515 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term213514 = ((Class) term213515).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term213514).setAccessible(true);
        Object enum768 = ((Field) term213514).get((Object) null);
        Class<? extends Object> term213730 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term213729 = ((Class) term213730).getDeclaredField((String) "FAST");
        ((Field) term213729).setAccessible(true);
        enum769 = ((Field) term213729).get((Object) null);
        Class<? extends Object> term213934 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term213933 = ((Class) term213934).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term213933).setAccessible(true);
        Object enum770 = ((Field) term213933).get((Object) null);
        term213410 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term213411 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term213411, term213411.getClass(), "type", enum768);
        setField(term213411, term213411.getClass(), "conversionMode", enum769);
        setLongField(term213411, term213411.getClass(), "unitsBefore", 4394651392080968777L);
        setLongField(term213411, term213411.getClass(), "unitsAfter", -7310273014364148916L);
        setBooleanField(term213411, term213411.getClass(), "unitsAfterSet", false);
        setField(term213410, term213410.getClass(), "counter", term213411);
        setField(term213410, term213410.getClass(), "type", enum770);
        setField(term213410, term213410.getClass(), "conversionMode", enum769);
        setLongField(term213410, term213410.getClass(), "unitsBefore", 8863790908271299748L);
        setLongField(term213410, term213410.getClass(), "unitsAfter", 9205327385733285058L);
        setBooleanField(term213410, term213410.getClass(), "unitsAfterSet", true);
        Class<? extends Object> term214161 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term214160 = ((Class) term214161).getDeclaredField((String) "MILLISECONDS");
        ((Field) term214160).setAccessible(true);
        enum771 = ((Field) term214160).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[1] = Class.forName("net.obvj.performetrics.ConversionMode");
        Object[] args = new Object[2];
        args[0] = enum771;
        args[1] = enum769;
        callMethod(klass, "elapsedTime", argTypes, term213410, args);
    }

};


