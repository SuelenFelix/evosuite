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

public class Counter_elapsedTime_19492142112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219854;

    public Counter_elapsedTime_19492142112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219915 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term219914 = ((Class) term219915).getDeclaredField((String) "WALL_CLOCK_TIME");
        ((Field) term219914).setAccessible(true);
        Object enum795 = ((Field) term219914).get((Object) null);
        Class<? extends Object> term220142 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term220141 = ((Class) term220142).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term220141).setAccessible(true);
        Object enum796 = ((Field) term220141).get((Object) null);
        term219854 = newInstance(Class.forName("net.obvj.performetrics.Counter"));
        setField(term219854, term219854.getClass(), "type", enum795);
        setField(term219854, term219854.getClass(), "conversionMode", enum796);
        setLongField(term219854, term219854.getClass(), "unitsBefore", -1820639665251914495L);
        setLongField(term219854, term219854.getClass(), "unitsAfter", 3238645206498300107L);
        setBooleanField(term219854, term219854.getClass(), "unitsAfterSet", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Counter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "elapsedTime", argTypes, term219854, args);
    }

};


