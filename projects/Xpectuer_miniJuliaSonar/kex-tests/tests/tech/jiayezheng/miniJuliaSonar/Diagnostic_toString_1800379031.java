package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Diagnostic_toString_1800379031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80232;

    public Diagnostic_toString_1800379031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80281 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Diagnostic$Category");
        Field term80280 = ((Class) term80281).getDeclaredField((String) "WARNING");
        ((Field) term80280).setAccessible(true);
        Object enum250 = ((Field) term80280).get((Object) null);
        term80232 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic"));
        setField(term80232, term80232.getClass(), "file", "wFyiZloCxg");
        setField(term80232, term80232.getClass(), "category", enum250);
        setIntField(term80232, term80232.getClass(), "start", -1284825282);
        setIntField(term80232, term80232.getClass(), "end", -1941343035);
        setField(term80232, term80232.getClass(), "msg", "xYztJEIPWy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term80232, args);
    }

};


