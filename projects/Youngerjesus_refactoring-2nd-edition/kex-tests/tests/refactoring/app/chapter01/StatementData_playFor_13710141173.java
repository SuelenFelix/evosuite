package refactoring.app.chapter01;

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
import static refactoring.app.chapter01.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class StatementData_playFor_13710141173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1470;
     Object term1502;

    public StatementData_playFor_13710141173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1486 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1486, term1486.getClass(), "playId", null);
        setIntField(term1486, term1486.getClass(), "audience", -244121226);
        Object term1488 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1488, term1488.getClass(), "playId", null);
        setIntField(term1488, term1488.getClass(), "audience", -203030934);
        ArrayList term1484 = new ArrayList();
        ((ArrayList) term1484).add(term1486);
        ((ArrayList) term1484).add(term1488);
        HashMap term1493 = new HashMap();
        term1470 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1471 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1492 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1501 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1471, term1471.getClass(), "customer", "MLqYREekMl");
        setField(term1471, term1471.getClass(), "performances", term1484);
        setField(term1470, term1470.getClass(), "invoice", term1471);
        setField(term1492, term1492.getClass(), "playMap", term1493);
        setField(term1470, term1470.getClass(), "plays", term1492);
        setField(term1470, term1470.getClass(), "performanceCalculatorFactory", term1501);
        term1502 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1502, term1502.getClass(), "playId", "hoicvmsovO");
        setIntField(term1502, term1502.getClass(), "audience", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        Object[] args = new Object[1];
        args[0] = term1502;
        callMethod(klass, "playFor", argTypes, term1470, args);
    }

};


