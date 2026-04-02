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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Tuple_toString_1044894892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9906;

    public Tuple_toString_1044894892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9907 = new ArrayList();
        ((ArrayList) term9907).add((Object)null);
        Class<? extends Object> term9949 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term9948 = ((Class) term9949).getDeclaredField((String) "Complex");
        ((Field) term9948).setAccessible(true);
        Object enum31 = ((Field) term9948).get((Object) null);
        term9906 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple"));
        setField(term9906, term9906.getClass(), "elts", term9907);
        setField(term9906, term9906.getClass(), "nodeType", enum31);
        setIntField(term9906, term9906.getClass(), "start", -2027534003);
        setIntField(term9906, term9906.getClass(), "end", 1063420942);
        setField(term9906, term9906.getClass(), "file", "fhkbdRViHi");
        setField(term9906, term9906.getClass(), "parent", null);
        setField(term9906, term9906.getClass(), "name", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9906, args);
    }

};


