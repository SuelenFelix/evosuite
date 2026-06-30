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

public class StatementData_totalVolumeCredits_13712454726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1662;

    public StatementData_totalVolumeCredits_13712454726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1678 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1678, term1678.getClass(), "playId", null);
        setIntField(term1678, term1678.getClass(), "audience", -1016503459);
        ArrayList term1676 = new ArrayList();
        ((ArrayList) term1676).add(term1678);
        HashMap term1683 = new HashMap();
        term1662 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1663 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1682 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1691 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1663, term1663.getClass(), "customer", "bWWfajKbEX");
        setField(term1663, term1663.getClass(), "performances", term1676);
        setField(term1662, term1662.getClass(), "invoice", term1663);
        setField(term1682, term1682.getClass(), "playMap", term1683);
        setField(term1662, term1662.getClass(), "plays", term1682);
        setField(term1662, term1662.getClass(), "performanceCalculatorFactory", term1691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "totalVolumeCredits", argTypes, term1662, args);
    }

};


