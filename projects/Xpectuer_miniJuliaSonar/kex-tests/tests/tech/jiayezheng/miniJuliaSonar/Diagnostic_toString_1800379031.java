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
     Object term80226;

    public Diagnostic_toString_1800379031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80275 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Diagnostic$Category");
        Field term80274 = ((Class) term80275).getDeclaredField((String) "WARNING");
        ((Field) term80274).setAccessible(true);
        Object enum250 = ((Field) term80274).get((Object) null);
        term80226 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic"));
        setField(term80226, term80226.getClass(), "file", "wFyiZloCxg");
        setField(term80226, term80226.getClass(), "category", enum250);
        setIntField(term80226, term80226.getClass(), "start", -1284825282);
        setIntField(term80226, term80226.getClass(), "end", -1941343035);
        setField(term80226, term80226.getClass(), "msg", "xYztJEIPWy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term80226, args);
    }

};


