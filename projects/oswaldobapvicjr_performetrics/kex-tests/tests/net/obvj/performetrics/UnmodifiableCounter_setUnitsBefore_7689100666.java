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

public class UnmodifiableCounter_setUnitsBefore_7689100666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210317;

    public UnmodifiableCounter_setUnitsBefore_7689100666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term210418 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term210417 = ((Class) term210418).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term210417).setAccessible(true);
        Object enum755 = ((Field) term210417).get((Object) null);
        Class<? extends Object> term210633 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term210632 = ((Class) term210633).getDeclaredField((String) "FAST");
        ((Field) term210632).setAccessible(true);
        Object enum756 = ((Field) term210632).get((Object) null);
        Class<? extends Object> term210837 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term210836 = ((Class) term210837).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term210836).setAccessible(true);
        Object enum757 = ((Field) term210836).get((Object) null);
        Class<? extends Object> term211064 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term211063 = ((Class) term211064).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term211063).setAccessible(true);
        Object enum758 = ((Field) term211063).get((Object) null);
        term210317 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term210318 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term210318, term210318.getClass(), "type", enum755);
        setField(term210318, term210318.getClass(), "conversionMode", enum756);
        setLongField(term210318, term210318.getClass(), "unitsBefore", 4699157009689333952L);
        setLongField(term210318, term210318.getClass(), "unitsAfter", -78240609295693193L);
        setBooleanField(term210318, term210318.getClass(), "unitsAfterSet", true);
        setField(term210317, term210317.getClass(), "counter", term210318);
        setField(term210317, term210317.getClass(), "type", enum757);
        setField(term210317, term210317.getClass(), "conversionMode", enum758);
        setLongField(term210317, term210317.getClass(), "unitsBefore", 3090901538358721367L);
        setLongField(term210317, term210317.getClass(), "unitsAfter", -1677189124507026637L);
        setBooleanField(term210317, term210317.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUnitsBefore", argTypes, term210317, args);
    }

};


