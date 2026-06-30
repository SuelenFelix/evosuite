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
import java.lang.Object;
import java.lang.String;

public class PerformanceCalculator_volumeCreditFor_6180084142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1557;

    public PerformanceCalculator_volumeCreditFor_6180084142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1616 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term1615 = ((Class) term1616).getDeclaredField((String) "COMEDY");
        ((Field) term1615).setAccessible(true);
        Object enum6 = ((Field) term1615).get((Object) null);
        term1557 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculator"));
        Object term1558 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        Object term1572 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term1558, term1558.getClass(), "playId", "MxlszYVzRf");
        setIntField(term1558, term1558.getClass(), "audience", -1955890973);
        setField(term1557, term1557.getClass(), "performance", term1558);
        setField(term1572, term1572.getClass(), "name", "LQFpaHEwXR");
        setField(term1572, term1572.getClass(), "type", enum6);
        setField(term1557, term1557.getClass(), "play", term1572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "volumeCreditFor", argTypes, term1557, args);
    }

};


