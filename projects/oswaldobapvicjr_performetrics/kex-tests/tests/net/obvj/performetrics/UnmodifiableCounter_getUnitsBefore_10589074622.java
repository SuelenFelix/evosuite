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

public class UnmodifiableCounter_getUnitsBefore_10589074622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207177;

    public UnmodifiableCounter_getUnitsBefore_10589074622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207278 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term207277 = ((Class) term207278).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term207277).setAccessible(true);
        Object enum742 = ((Field) term207277).get((Object) null);
        Class<? extends Object> term207505 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term207504 = ((Class) term207505).getDeclaredField((String) "FAST");
        ((Field) term207504).setAccessible(true);
        Object enum743 = ((Field) term207504).get((Object) null);
        Class<? extends Object> term207709 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term207708 = ((Class) term207709).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term207708).setAccessible(true);
        Object enum744 = ((Field) term207708).get((Object) null);
        Class<? extends Object> term207924 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term207923 = ((Class) term207924).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term207923).setAccessible(true);
        Object enum745 = ((Field) term207923).get((Object) null);
        term207177 = newInstance(Class.forName("net.obvj.performetrics.UnmodifiableCounter"));
        Object term207178 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term207178, term207178.getClass(), "type", enum742);
        setField(term207178, term207178.getClass(), "conversionMode", enum743);
        setLongField(term207178, term207178.getClass(), "unitsBefore", 1195529027276497124L);
        setLongField(term207178, term207178.getClass(), "unitsAfter", -2783999800714825789L);
        setBooleanField(term207178, term207178.getClass(), "unitsAfterSet", true);
        setField(term207177, term207177.getClass(), "counter", term207178);
        setField(term207177, term207177.getClass(), "type", enum744);
        setField(term207177, term207177.getClass(), "conversionMode", enum745);
        setLongField(term207177, term207177.getClass(), "unitsBefore", 4266570509071948633L);
        setLongField(term207177, term207177.getClass(), "unitsAfter", -7291742736502427077L);
        setBooleanField(term207177, term207177.getClass(), "unitsAfterSet", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.UnmodifiableCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnitsBefore", argTypes, term207177, args);
    }

};


