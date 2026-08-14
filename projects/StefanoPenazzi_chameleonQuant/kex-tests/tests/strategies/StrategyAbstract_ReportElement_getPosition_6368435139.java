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

public class StrategyAbstract_ReportElement_getPosition_6368435139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13641;

    public StrategyAbstract_ReportElement_getPosition_6368435139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13641 = newInstance(Class.forName("strategies.StrategyAbstract$ReportElement"));
        setField(term13641, term13641.getClass(), "name", null);
        setField(term13641, term13641.getClass(), "section", null);
        setIntField(term13641, term13641.getClass(), "position", 0);
        setField(term13641, term13641.getClass(), "ret", null);
        setField(term13641, term13641.getClass(), "result", null);
        setField(term13641, term13641.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term13641, args);
    }

};


