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

public class StatementData_totalAmount_16635599685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1610;

    public StatementData_totalAmount_16635599685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1626 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1626, term1626.getClass(), "playId", null);
        setIntField(term1626, term1626.getClass(), "audience", 679763016);
        Object term1628 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1628, term1628.getClass(), "playId", null);
        setIntField(term1628, term1628.getClass(), "audience", 1962444399);
        Object term1630 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1630, term1630.getClass(), "playId", null);
        setIntField(term1630, term1630.getClass(), "audience", 767834723);
        Object term1632 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1632, term1632.getClass(), "playId", null);
        setIntField(term1632, term1632.getClass(), "audience", -602026508);
        Object term1634 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1634, term1634.getClass(), "playId", null);
        setIntField(term1634, term1634.getClass(), "audience", -157887805);
        Object term1636 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1636, term1636.getClass(), "playId", null);
        setIntField(term1636, term1636.getClass(), "audience", 1876565163);
        Object term1638 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1638, term1638.getClass(), "playId", null);
        setIntField(term1638, term1638.getClass(), "audience", -817164822);
        ArrayList term1624 = new ArrayList();
        ((ArrayList) term1624).add(term1626);
        ((ArrayList) term1624).add(term1628);
        ((ArrayList) term1624).add(term1630);
        ((ArrayList) term1624).add(term1632);
        ((ArrayList) term1624).add(term1634);
        ((ArrayList) term1624).add(term1636);
        ((ArrayList) term1624).add(term1638);
        HashMap term1643 = new HashMap();
        term1610 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1611 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1642 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1651 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1611, term1611.getClass(), "customer", "KoyGrUJeJW");
        setField(term1611, term1611.getClass(), "performances", term1624);
        setField(term1610, term1610.getClass(), "invoice", term1611);
        setField(term1642, term1642.getClass(), "playMap", term1643);
        setField(term1610, term1610.getClass(), "plays", term1642);
        setField(term1610, term1610.getClass(), "performanceCalculatorFactory", term1651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "totalAmount", argTypes, term1610, args);
    }

};


