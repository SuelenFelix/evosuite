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

public class StatementData_getPerformances_11871653712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;

    public StatementData_getPerformances_11871653712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1436 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1436, term1436.getClass(), "playId", null);
        setIntField(term1436, term1436.getClass(), "audience", -117576464);
        Object term1438 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1438, term1438.getClass(), "playId", null);
        setIntField(term1438, term1438.getClass(), "audience", -1007160944);
        Object term1440 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1440, term1440.getClass(), "playId", null);
        setIntField(term1440, term1440.getClass(), "audience", 1135664017);
        Object term1442 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1442, term1442.getClass(), "playId", null);
        setIntField(term1442, term1442.getClass(), "audience", 590364439);
        Object term1444 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1444, term1444.getClass(), "playId", null);
        setIntField(term1444, term1444.getClass(), "audience", 865208305);
        Object term1446 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1446, term1446.getClass(), "playId", null);
        setIntField(term1446, term1446.getClass(), "audience", -1275173084);
        ArrayList term1434 = new ArrayList();
        ((ArrayList) term1434).add(term1436);
        ((ArrayList) term1434).add(term1438);
        ((ArrayList) term1434).add(term1440);
        ((ArrayList) term1434).add(term1442);
        ((ArrayList) term1434).add(term1444);
        ((ArrayList) term1434).add(term1446);
        HashMap term1451 = new HashMap();
        term1420 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1421 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1450 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1459 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1421, term1421.getClass(), "customer", "xLbjWUgOIL");
        setField(term1421, term1421.getClass(), "performances", term1434);
        setField(term1420, term1420.getClass(), "invoice", term1421);
        setField(term1450, term1450.getClass(), "playMap", term1451);
        setField(term1420, term1420.getClass(), "plays", term1450);
        setField(term1420, term1420.getClass(), "performanceCalculatorFactory", term1459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerformances", argTypes, term1420, args);
    }

};


