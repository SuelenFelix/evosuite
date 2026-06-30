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

public class Statement_renderHtml_7253056593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2732;
     Object term2733;

    public Statement_renderHtml_7253056593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2732 = newInstance(Class.forName("refactoring.app.chapter01.Statement"));
        Object term2749 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2749, term2749.getClass(), "playId", null);
        setIntField(term2749, term2749.getClass(), "audience", 287287233);
        Object term2751 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term2751, term2751.getClass(), "playId", null);
        setIntField(term2751, term2751.getClass(), "audience", 962840079);
        ArrayList term2747 = new ArrayList();
        ((ArrayList) term2747).add(term2749);
        ((ArrayList) term2747).add(term2751);
        HashMap term2756 = new HashMap();
        term2733 = newInstance(Class.forName("refactoring.app.chapter01.StatementData"));
        Object term2734 = newInstance(Class.forName("refactoring.app.chapter01.Invoice"));
        Object term2755 = newInstance(Class.forName("refactoring.app.chapter01.Plays"));
        Object term2764 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.PerformanceCalculatorFactory"));
        setField(term2734, term2734.getClass(), "customer", "WzMEhMXkKx");
        setField(term2734, term2734.getClass(), "performances", term2747);
        setField(term2733, term2733.getClass(), "invoice", term2734);
        setField(term2755, term2755.getClass(), "playMap", term2756);
        setField(term2733, term2733.getClass(), "plays", term2755);
        setField(term2733, term2733.getClass(), "performanceCalculatorFactory", term2764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Statement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter01.StatementData");
        Object[] args = new Object[1];
        args[0] = term2733;
        callMethod(klass, "renderHtml", argTypes, term2732, args);
    }

};


