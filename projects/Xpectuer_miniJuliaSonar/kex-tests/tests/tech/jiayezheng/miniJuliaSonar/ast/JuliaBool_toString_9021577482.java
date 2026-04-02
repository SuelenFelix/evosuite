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

public class JuliaBool_toString_9021577482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30254;

    public JuliaBool_toString_9021577482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30326 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.JuliaBool$BoolValue");
        Field term30325 = ((Class) term30326).getDeclaredField((String) "FALSE");
        ((Field) term30325).setAccessible(true);
        Object enum100 = ((Field) term30325).get((Object) null);
        Class<? extends Object> term30618 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term30617 = ((Class) term30618).getDeclaredField((String) "Try");
        ((Field) term30617).setAccessible(true);
        Object enum101 = ((Field) term30617).get((Object) null);
        term30254 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaBool"));
        setField(term30254, term30254.getClass(), "value", enum100);
        setField(term30254, term30254.getClass(), "nodeType", enum101);
        setIntField(term30254, term30254.getClass(), "start", 1694224101);
        setIntField(term30254, term30254.getClass(), "end", 937859191);
        setField(term30254, term30254.getClass(), "file", "kNqaJKIATy");
        setField(term30254, term30254.getClass(), "parent", null);
        setField(term30254, term30254.getClass(), "name", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaBool");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30254, args);
    }

};


