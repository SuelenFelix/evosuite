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

public class PerformanceCalculatorFactory_createPerformanceCalculator_2191459591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term16;

    public PerformanceCalculatorFactory_createPerformanceCalculator_2191459591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        term2 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2, term2.getClass(), "playId", "PAEBtnZtTD");
        setIntField(term2, term2.getClass(), "audience", 568599855);
        Class<? extends Object> term82 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term81 = ((Class) term82).getDeclaredField((String) "TRAGEDY");
        ((Field) term81).setAccessible(true);
        Object enum0 = ((Field) term81).get((Object) null);
        term16 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term16, term16.getClass(), "name", "sjlJAEtRrb");
        setField(term16, term16.getClass(), "type", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        argTypes[1] = Class.forName("refactoring.app.chapter01.Play");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term16;
        callMethod(klass, "createPerformanceCalculator", argTypes, term1, args);
    }

};


