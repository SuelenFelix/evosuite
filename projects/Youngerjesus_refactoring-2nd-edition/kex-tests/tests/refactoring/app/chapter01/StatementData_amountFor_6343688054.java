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

public class StatementData_amountFor_6343688054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536;
     Object term1576;

    public StatementData_amountFor_6343688054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1552 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1552, term1552.getClass(), "playId", null);
        setIntField(term1552, term1552.getClass(), "audience", -73683645);
        Object term1554 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1554, term1554.getClass(), "playId", null);
        setIntField(term1554, term1554.getClass(), "audience", -226514366);
        Object term1556 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1556, term1556.getClass(), "playId", null);
        setIntField(term1556, term1556.getClass(), "audience", 1193880199);
        Object term1558 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1558, term1558.getClass(), "playId", null);
        setIntField(term1558, term1558.getClass(), "audience", -1087774327);
        Object term1560 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1560, term1560.getClass(), "playId", null);
        setIntField(term1560, term1560.getClass(), "audience", -1530420153);
        Object term1562 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1562, term1562.getClass(), "playId", null);
        setIntField(term1562, term1562.getClass(), "audience", -469968304);
        ArrayList term1550 = new ArrayList();
        ((ArrayList) term1550).add(term1552);
        ((ArrayList) term1550).add(term1554);
        ((ArrayList) term1550).add(term1556);
        ((ArrayList) term1550).add(term1558);
        ((ArrayList) term1550).add(term1560);
        ((ArrayList) term1550).add(term1562);
        HashMap term1567 = new HashMap();
        term1536 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1537 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1566 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1575 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1537, term1537.getClass(), "customer", "eqJfYWRaEL");
        setField(term1537, term1537.getClass(), "performances", term1550);
        setField(term1536, term1536.getClass(), "invoice", term1537);
        setField(term1566, term1566.getClass(), "playMap", term1567);
        setField(term1536, term1536.getClass(), "plays", term1566);
        setField(term1536, term1536.getClass(), "performanceCalculatorFactory", term1575);
        term1576 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1576, term1576.getClass(), "playId", "JUmudUmaaV");
        setIntField(term1576, term1576.getClass(), "audience", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        Object[] args = new Object[1];
        args[0] = term1576;
        callMethod(klass, "amountFor", argTypes, term1536, args);
    }

};


