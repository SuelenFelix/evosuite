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

public class Operator_toString_15291702033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29402;

    public Operator_toString_15291702033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29402 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Operator"));
        setField(term29402, term29402.getClass(), "op", null);
        setField(term29402, term29402.getClass(), "nodeType", null);
        setIntField(term29402, term29402.getClass(), "start", 0);
        setIntField(term29402, term29402.getClass(), "end", 0);
        setField(term29402, term29402.getClass(), "file", null);
        setField(term29402, term29402.getClass(), "parent", null);
        setField(term29402, term29402.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Operator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29402, args);
    }

};


