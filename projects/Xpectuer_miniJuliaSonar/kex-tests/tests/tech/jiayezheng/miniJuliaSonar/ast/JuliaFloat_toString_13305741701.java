package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JuliaFloat_toString_13305741701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52506;

    public JuliaFloat_toString_13305741701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52563 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term52562 = ((Class) term52563).getDeclaredField((String) "End");
        ((Field) term52562).setAccessible(true);
        Object enum174 = ((Field) term52562).get((Object) null);
        term52506 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaFloat"));
        setField(term52506, term52506.getClass(), "value", "UDaboHZHhz");
        setField(term52506, term52506.getClass(), "nodeType", enum174);
        setIntField(term52506, term52506.getClass(), "start", 844222656);
        setIntField(term52506, term52506.getClass(), "end", -18216811);
        setField(term52506, term52506.getClass(), "file", "nRvKihUSPj");
        setField(term52506, term52506.getClass(), "parent", null);
        setField(term52506, term52506.getClass(), "name", "BbNeQJpYPr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaFloat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term52506, args);
    }

};


