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

public class UnmodifiableCounter_setUnitsAfter_11287664797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211303;

    public UnmodifiableCounter_setUnitsAfter_11287664797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211362 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term211361 = ((Class) term211362).getDeclaredField((String) "CPU_TIME");
        ((Field) term211361).setAccessible(true);
        Object enum759 = ((Field) term211361).get((Object) null);
        Class<? extends Object> term211568 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term211567 = ((Class) term211568).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term211567).setAccessible(true);
        Object enum760 = ((Field) term211567).get((Object) null);
        Class<? extends Object> term211808 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term211807 = ((Class) term211808).getDeclaredField((String) "FAST");
        ((Field) term211807).setAccessible(true);
        Object enum761 = ((Field) term211807).get((Object) null);
        term211303 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term211304 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term211304, term211304.getClass(), "type", enum759);
        setField(term211304, term211304.getClass(), "conversionMode", enum760);
        setLongField(term211304, term211304.getClass(), "unitsBefore", 4795660804170399986L);
        setLongField(term211304, term211304.getClass(), "unitsAfter", -4030863184426321096L);
        setBooleanField(term211304, term211304.getClass(), "unitsAfterSet", false);
        setField(term211303, term211303.getClass(), "counter", term211304);
        setField(term211303, term211303.getClass(), "type", enum759);
        setField(term211303, term211303.getClass(), "conversionMode", enum761);
        setLongField(term211303, term211303.getClass(), "unitsBefore", -8010214112439224349L);
        setLongField(term211303, term211303.getClass(), "unitsAfter", -6673920710396545553L);
        setBooleanField(term211303, term211303.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsAfter", argTypes, term211303, args);
    }

};


