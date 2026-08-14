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

public class UnmodifiableCounter_getUnitsAfter_20431443034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208648;

    public UnmodifiableCounter_getUnitsAfter_20431443034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term208745 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term208744 = ((Class) term208745).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term208744).setAccessible(true);
        Object enum748 = ((Field) term208744).get((Object) null);
        Class<? extends Object> term208972 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term208971 = ((Class) term208972).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term208971).setAccessible(true);
        Object enum749 = ((Field) term208971).get((Object) null);
        Class<? extends Object> term209212 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term209211 = ((Class) term209212).getDeclaredField((String) "USER_TIME");
        ((Field) term209211).setAccessible(true);
        Object enum750 = ((Field) term209211).get((Object) null);
        Class<? extends Object> term209421 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term209420 = ((Class) term209421).getDeclaredField((String) "FAST");
        ((Field) term209420).setAccessible(true);
        Object enum751 = ((Field) term209420).get((Object) null);
        term208648 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term208649 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term208649, term208649.getClass(), "type", enum748);
        setField(term208649, term208649.getClass(), "conversionMode", enum749);
        setLongField(term208649, term208649.getClass(), "unitsBefore", 4616440478358528406L);
        setLongField(term208649, term208649.getClass(), "unitsAfter", 3427570961451840069L);
        setBooleanField(term208649, term208649.getClass(), "unitsAfterSet", false);
        setField(term208648, term208648.getClass(), "counter", term208649);
        setField(term208648, term208648.getClass(), "type", enum750);
        setField(term208648, term208648.getClass(), "conversionMode", enum751);
        setLongField(term208648, term208648.getClass(), "unitsBefore", 4502292577098212311L);
        setLongField(term208648, term208648.getClass(), "unitsAfter", -3730936709704460408L);
        setBooleanField(term208648, term208648.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitsAfter", argTypes, term208648, args);
    }

};


