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

public class TragedyCalculator_init_6989645360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1812;
     Object term1826;

    public TragedyCalculator_init_6989645360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1812 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1812, term1812.getClass(), "playId", "oVcInYnLWB");
        setIntField(term1812, term1812.getClass(), "audience", -2038273078);
        Class<? extends Object> term1870 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term1869 = ((Class) term1870).getDeclaredField((String) "COMEDY");
        ((Field) term1869).setAccessible(true);
        Object enum7 = ((Field) term1869).get((Object) null);
        term1826 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term1826, term1826.getClass(), "name", "aJlieCFVtF");
        setField(term1826, term1826.getClass(), "type", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.TragedyCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        argTypes[1] = Class.forName("refactoring.app.chapter01.Play");
        Object[] args = new Object[2];
        args[0] = term1812;
        args[1] = term1826;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


