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

public class StrategyAbstract_ReportElement_getName_11348942861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12112;

    public StrategyAbstract_ReportElement_getName_11348942861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12169 = Class.forName((String) "strategies.StrategyAbstract$ReportElementType");
        Field term12168 = ((Class) term12169).getDeclaredField((String) "INPUT");
        ((Field) term12168).setAccessible(true);
        Object enum38 = ((Field) term12168).get((Object) null);
        term12112 = newInstance(Class.forName("strategies.StrategyAbstract$ReportElement"));
        Object term12147 = newInstance(Class.forName("java.lang.Object"));
        setField(term12112, term12112.getClass(), "name", "FPvxVzzSvD");
        setField(term12112, term12112.getClass(), "section", "WHcwFgsGFC");
        setIntField(term12112, term12112.getClass(), "position", 57189932);
        setField(term12112, term12112.getClass(), "ret", enum38);
        setField(term12112, term12112.getClass(), "result", term12147);
        setField(term12112, term12112.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term12112, args);
    }

};


