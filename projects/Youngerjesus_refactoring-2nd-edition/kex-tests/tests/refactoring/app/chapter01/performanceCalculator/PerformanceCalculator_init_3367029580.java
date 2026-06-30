package refactoring.app.chapter01.performanceCalculator;

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
import static refactoring.app.chapter01.performanceCalculator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PerformanceCalculator_init_3367029580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;
     Object term1066;

    public PerformanceCalculator_init_3367029580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1052 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1052, term1052.getClass(), "playId", "hRNSzYYIrc");
        setIntField(term1052, term1052.getClass(), "audience", -1922583790);
        Class<? extends Object> term1110 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term1109 = ((Class) term1110).getDeclaredField((String) "COMEDY");
        ((Field) term1109).setAccessible(true);
        Object enum4 = ((Field) term1109).get((Object) null);
        term1066 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term1066, term1066.getClass(), "name", "RMFIsYGgne");
        setField(term1066, term1066.getClass(), "type", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        argTypes[1] = Class.forName("refactoring.app.chapter01.Play");
        Object[] args = new Object[2];
        args[0] = term1052;
        args[1] = term1066;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


