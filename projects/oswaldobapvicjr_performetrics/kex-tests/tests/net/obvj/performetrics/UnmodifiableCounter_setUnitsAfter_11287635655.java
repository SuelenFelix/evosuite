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

public class UnmodifiableCounter_setUnitsAfter_11287635655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209624;
     Object term209690;

    public UnmodifiableCounter_setUnitsAfter_11287635655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209693 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term209692 = ((Class) term209693).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term209692).setAccessible(true);
        Object enum752 = ((Field) term209692).get((Object) null);
        Class<? extends Object> term209908 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term209907 = ((Class) term209908).getDeclaredField((String) "FAST");
        ((Field) term209907).setAccessible(true);
        Object enum753 = ((Field) term209907).get((Object) null);
        Class<? extends Object> term210112 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term210111 = ((Class) term210112).getDeclaredField((String) "CPU_TIME");
        ((Field) term210111).setAccessible(true);
        Object enum754 = ((Field) term210111).get((Object) null);
        term209624 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term209625 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term209625, term209625.getClass(), "type", enum752);
        setField(term209625, term209625.getClass(), "conversionMode", enum753);
        setLongField(term209625, term209625.getClass(), "unitsBefore", -8614778293741404325L);
        setLongField(term209625, term209625.getClass(), "unitsAfter", -5447369594017685765L);
        setBooleanField(term209625, term209625.getClass(), "unitsAfterSet", false);
        setField(term209624, term209624.getClass(), "counter", term209625);
        setField(term209624, term209624.getClass(), "type", enum754);
        setField(term209624, term209624.getClass(), "conversionMode", enum753);
        setLongField(term209624, term209624.getClass(), "unitsBefore", -5724112525188606013L);
        setLongField(term209624, term209624.getClass(), "unitsAfter", -6100012593724108983L);
        setBooleanField(term209624, term209624.getClass(), "unitsAfterSet", false);
        term209690 = new Long(5465527210299101732L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term209690;
        callMethod(klass, "setUnitsAfter", argTypes, term209624, args);
    }

};


