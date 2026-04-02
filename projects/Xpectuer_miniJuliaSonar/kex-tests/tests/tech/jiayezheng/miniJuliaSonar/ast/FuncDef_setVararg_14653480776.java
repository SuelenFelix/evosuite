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

public class FuncDef_setVararg_14653480776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46795;

    public FuncDef_setVararg_14653480776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46795 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        setField(term46795, term46795.getClass(), "name", null);
        setField(term46795, term46795.getClass(), "params", null);
        setField(term46795, term46795.getClass(), "defaults", null);
        setField(term46795, term46795.getClass(), "vararg", null);
        setField(term46795, term46795.getClass(), "kwarg", null);
        setField(term46795, term46795.getClass(), "body", null);
        setField(term46795, term46795.getClass(), "end", null);
        setBooleanField(term46795, term46795.getClass(), "called", false);
        setBooleanField(term46795, term46795.getClass(), "isLambda", false);
        setField(term46795, term46795.getClass(), "nodeType", null);
        setIntField(term46795, term46795.getClass(), "start", 0);
        setIntField(term46795, term46795.getClass(), "end", 0);
        setField(term46795, term46795.getClass(), "file", null);
        setField(term46795, term46795.getClass(), "parent", null);
        setField(term46795, term46795.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVararg", argTypes, term46795, args);
    }

};


