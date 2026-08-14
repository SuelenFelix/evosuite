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

public class FuncDef_toString_8228166509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46810;

    public FuncDef_toString_8228166509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46810 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        setField(term46810, term46810.getClass(), "name", null);
        setField(term46810, term46810.getClass(), "params", null);
        setField(term46810, term46810.getClass(), "defaults", null);
        setField(term46810, term46810.getClass(), "vararg", null);
        setField(term46810, term46810.getClass(), "kwarg", null);
        setField(term46810, term46810.getClass(), "body", null);
        setField(term46810, term46810.getClass(), "end", null);
        setBooleanField(term46810, term46810.getClass(), "called", false);
        setBooleanField(term46810, term46810.getClass(), "isLambda", false);
        setField(term46810, term46810.getClass(), "nodeType", null);
        setIntField(term46810, term46810.getClass(), "start", 0);
        setIntField(term46810, term46810.getClass(), "end", 0);
        setField(term46810, term46810.getClass(), "file", null);
        setField(term46810, term46810.getClass(), "parent", null);
        setField(term46810, term46810.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term46810, args);
    }

};


