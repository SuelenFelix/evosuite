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

public class Operator_toString_15291702031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28877;

    public Operator_toString_15291702031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28929 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term28928 = ((Class) term28929).getDeclaredField((String) "BwNor");
        ((Field) term28928).setAccessible(true);
        Object enum95 = ((Field) term28928).get((Object) null);
        Class<? extends Object> term29136 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term29135 = ((Class) term29136).getDeclaredField((String) "RSQUARE");
        ((Field) term29135).setAccessible(true);
        Object enum96 = ((Field) term29135).get((Object) null);
        term28877 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Operator"));
        setField(term28877, term28877.getClass(), "op", enum95);
        setField(term28877, term28877.getClass(), "nodeType", enum96);
        setIntField(term28877, term28877.getClass(), "start", -2104981311);
        setIntField(term28877, term28877.getClass(), "end", -571169753);
        setField(term28877, term28877.getClass(), "file", "DyiXbeYIaN");
        setField(term28877, term28877.getClass(), "parent", null);
        setField(term28877, term28877.getClass(), "name", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Operator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28877, args);
    }

};


