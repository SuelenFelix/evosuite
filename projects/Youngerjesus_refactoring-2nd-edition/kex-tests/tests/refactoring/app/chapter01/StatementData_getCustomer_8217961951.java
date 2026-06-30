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

public class StatementData_getCustomer_8217961951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1380;

    public StatementData_getCustomer_8217961951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1396 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term1396, term1396.getClass(), "playId", null);
        setIntField(term1396, term1396.getClass(), "audience", -2068769794);
        ArrayList term1394 = new ArrayList();
        ((ArrayList) term1394).add(term1396);
        HashMap term1401 = new HashMap();
        term1380 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term1381 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term1400 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term1409 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term1381, term1381.getClass(), "customer", "BndsHwAFMv");
        setField(term1381, term1381.getClass(), "performances", term1394);
        setField(term1380, term1380.getClass(), "invoice", term1381);
        setField(term1400, term1400.getClass(), "playMap", term1401);
        setField(term1380, term1380.getClass(), "plays", term1400);
        setField(term1380, term1380.getClass(), "performanceCalculatorFactory", term1409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.StatementData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomer", argTypes, term1380, args);
    }

};


