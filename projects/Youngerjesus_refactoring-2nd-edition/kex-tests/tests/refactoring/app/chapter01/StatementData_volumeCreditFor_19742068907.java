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

public class StatementData_volumeCreditFor_19742068907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1702;
     Object term1742;

    public StatementData_volumeCreditFor_19742068907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1718 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1718, term1718.getClass(), "playId", null);
        setIntField(term1718, term1718.getClass(), "audience", -1968847291);
        Object term1720 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1720, term1720.getClass(), "playId", null);
        setIntField(term1720, term1720.getClass(), "audience", 579005622);
        Object term1722 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1722, term1722.getClass(), "playId", null);
        setIntField(term1722, term1722.getClass(), "audience", -14890619);
        Object term1724 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1724, term1724.getClass(), "playId", null);
        setIntField(term1724, term1724.getClass(), "audience", 1632125673);
        Object term1726 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1726, term1726.getClass(), "playId", null);
        setIntField(term1726, term1726.getClass(), "audience", 454281060);
        Object term1728 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1728, term1728.getClass(), "playId", null);
        setIntField(term1728, term1728.getClass(), "audience", -1786399638);
        ArrayList term1716 = new ArrayList();
        ((ArrayList) term1716).add(term1718);
        ((ArrayList) term1716).add(term1720);
        ((ArrayList) term1716).add(term1722);
        ((ArrayList) term1716).add(term1724);
        ((ArrayList) term1716).add(term1726);
        ((ArrayList) term1716).add(term1728);
        HashMap term1733 = new HashMap();
        term1702 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1703 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1732 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1741 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1703, term1703.getClass(), "customer", "TimdotUuNC");
        setField(term1703, term1703.getClass(), "performances", term1716);
        setField(term1702, term1702.getClass(), "invoice", term1703);
        setField(term1732, term1732.getClass(), "playMap", term1733);
        setField(term1702, term1702.getClass(), "plays", term1732);
        setField(term1702, term1702.getClass(), "performanceCalculatorFactory", term1741);
        term1742 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1742, term1742.getClass(), "playId", "XqgfKFvPSD");
        setIntField(term1742, term1742.getClass(), "audience", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        Object[] args = new Object[1];
        args[0] = term1742;
        callMethod(klass, "volumeCreditFor", argTypes, term1702, args);
    }

};


