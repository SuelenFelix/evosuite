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

public class StrategyAbstract_ReportElement_getReportElementType_10220015734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13021;

    public StrategyAbstract_ReportElement_getReportElementType_10220015734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13079 = Class.forName((String) "strategies.StrategyAbstract$ReportElementType");
        Field term13078 = ((Class) term13079).getDeclaredField((String) "OUTPUT");
        ((Field) term13078).setAccessible(true);
        Object enum41 = ((Field) term13078).get((Object) null);
        term13021 = newInstance(Class.forName("strategies.StrategyAbstract$ReportElement"));
        Object term13057 = newInstance(Class.forName("java.lang.Object"));
        setField(term13021, term13021.getClass(), "name", "VYkqXKVlAJ");
        setField(term13021, term13021.getClass(), "section", "XkIoWJRNwN");
        setIntField(term13021, term13021.getClass(), "position", 842904495);
        setField(term13021, term13021.getClass(), "ret", enum41);
        setField(term13021, term13021.getClass(), "result", term13057);
        setField(term13021, term13021.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReportElementType", argTypes, term13021, args);
    }

};


