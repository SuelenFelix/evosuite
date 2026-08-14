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

public class StrategyAbstract_ReportElement_getPosition_6368435133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12718;

    public StrategyAbstract_ReportElement_getPosition_6368435133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12775 = Class.forName((String) "strategies.StrategyAbstract$ReportElementType");
        Field term12774 = ((Class) term12775).getDeclaredField((String) "INPUT");
        ((Field) term12774).setAccessible(true);
        Object enum40 = ((Field) term12774).get((Object) null);
        term12718 = newInstance(Class.forName("strategies.StrategyAbstract$ReportElement"));
        Object term12753 = newInstance(Class.forName("java.lang.Object"));
        setField(term12718, term12718.getClass(), "name", "ZfdXfCCFDf");
        setField(term12718, term12718.getClass(), "section", "MwwjNtdOFT");
        setIntField(term12718, term12718.getClass(), "position", 1743224434);
        setField(term12718, term12718.getClass(), "ret", enum40);
        setField(term12718, term12718.getClass(), "result", term12753);
        setField(term12718, term12718.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term12718, args);
    }

};


