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

public class StrategyAbstract_ReportElement_getResult_21024387985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13328;

    public StrategyAbstract_ReportElement_getResult_21024387985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13386 = Class.forName((String) "strategies.StrategyAbstract$ReportElementType");
        Field term13385 = ((Class) term13386).getDeclaredField((String) "OUTPUT");
        ((Field) term13385).setAccessible(true);
        Object enum42 = ((Field) term13385).get((Object) null);
        term13328 = newInstance(Class.forName("strategies.StrategyAbstract$ReportElement"));
        Object term13364 = newInstance(Class.forName("java.lang.Object"));
        setField(term13328, term13328.getClass(), "name", "aNWLJdrZMq");
        setField(term13328, term13328.getClass(), "section", "HHmNoYxIGj");
        setIntField(term13328, term13328.getClass(), "position", 1008080511);
        setField(term13328, term13328.getClass(), "ret", enum42);
        setField(term13328, term13328.getClass(), "result", term13364);
        setField(term13328, term13328.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term13328, args);
    }

};


