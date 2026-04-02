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

public class UnaryOp_toString_15701753671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36806;

    public UnaryOp_toString_15701753671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36860 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term36859 = ((Class) term36860).getDeclaredField((String) "TypeDecl");
        ((Field) term36859).setAccessible(true);
        Object enum121 = ((Field) term36859).get((Object) null);
        Class<? extends Object> term37076 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term37075 = ((Class) term37076).getDeclaredField((String) "Return");
        ((Field) term37075).setAccessible(true);
        Object enum122 = ((Field) term37075).get((Object) null);
        term36806 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.UnaryOp"));
        setField(term36806, term36806.getClass(), "op", enum121);
        setField(term36806, term36806.getClass(), "operand", null);
        setField(term36806, term36806.getClass(), "nodeType", enum122);
        setIntField(term36806, term36806.getClass(), "start", -420030135);
        setIntField(term36806, term36806.getClass(), "end", 267763294);
        setField(term36806, term36806.getClass(), "file", "EwQBhZjCIT");
        setField(term36806, term36806.getClass(), "parent", null);
        setField(term36806, term36806.getClass(), "name", "aSkmSwTnEw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.UnaryOp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term36806, args);
    }

};


