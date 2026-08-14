package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StrategyAbstract_ReportElement_getSection_1966241322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12415;

    public StrategyAbstract_ReportElement_getSection_1966241322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12472 = Class.forName((String) "strategies.StrategyAbstract$ReportElementType");
        Field term12471 = ((Class) term12472).getDeclaredField((String) "INPUT");
        ((Field) term12471).setAccessible(true);
        Object enum39 = ((Field) term12471).get((Object) null);
        term12415 = newInstance(Class.forName("strategies.StrategyAbstract$ReportElement"));
        Object term12450 = newInstance(Class.forName("java.lang.Object"));
        setField(term12415, term12415.getClass(), "name", "HzqpegHiRq");
        setField(term12415, term12415.getClass(), "section", "jwsfVjMoJT");
        setIntField(term12415, term12415.getClass(), "position", 1460722225);
        setField(term12415, term12415.getClass(), "ret", enum39);
        setField(term12415, term12415.getClass(), "result", term12450);
        setField(term12415, term12415.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSection", argTypes, term12415, args);
    }

};


