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

public class ComedyCalculator_volumeCreditFor_7368224652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;

    public ComedyCalculator_volumeCreditFor_7368224652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term853 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term852 = ((Class) term853).getDeclaredField((String) "TRAGEDY");
        ((Field) term852).setAccessible(true);
        Object enum3 = ((Field) term852).get((Object) null);
        term793 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.ComedyCalculator"));
        Object term794 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        Object term808 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term794, term794.getClass(), "playId", "SzjVpOQTyS");
        setIntField(term794, term794.getClass(), "audience", 391863371);
        setField(term793, term793.getClass(), "performance", term794);
        setField(term808, term808.getClass(), "name", "MjGYSRKTNF");
        setField(term808, term808.getClass(), "type", enum3);
        setField(term793, term793.getClass(), "play", term808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.ComedyCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "volumeCreditFor", argTypes, term793, args);
    }

};


