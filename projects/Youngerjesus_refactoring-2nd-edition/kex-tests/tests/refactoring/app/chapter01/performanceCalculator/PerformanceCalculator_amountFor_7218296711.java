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

public class PerformanceCalculator_amountFor_7218296711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1304;

    public PerformanceCalculator_amountFor_7218296711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1363 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term1362 = ((Class) term1363).getDeclaredField((String) "COMEDY");
        ((Field) term1362).setAccessible(true);
        Object enum5 = ((Field) term1362).get((Object) null);
        term1304 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculator"));
        Object term1305 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        Object term1319 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term1305, term1305.getClass(), "playId", "NRdvgJlhkX");
        setIntField(term1305, term1305.getClass(), "audience", -616727354);
        setField(term1304, term1304.getClass(), "performance", term1305);
        setField(term1319, term1319.getClass(), "name", "uuaPigETmJ");
        setField(term1319, term1319.getClass(), "type", enum5);
        setField(term1304, term1304.getClass(), "play", term1319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "amountFor", argTypes, term1304, args);
    }

};


