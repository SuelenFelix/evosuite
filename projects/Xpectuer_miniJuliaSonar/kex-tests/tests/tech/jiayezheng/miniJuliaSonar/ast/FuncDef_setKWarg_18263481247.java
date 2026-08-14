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

public class FuncDef_setKWarg_18263481247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46800;

    public FuncDef_setKWarg_18263481247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46800 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        setField(term46800, term46800.getClass(), "name", null);
        setField(term46800, term46800.getClass(), "params", null);
        setField(term46800, term46800.getClass(), "defaults", null);
        setField(term46800, term46800.getClass(), "vararg", null);
        setField(term46800, term46800.getClass(), "kwarg", null);
        setField(term46800, term46800.getClass(), "body", null);
        setField(term46800, term46800.getClass(), "end", null);
        setBooleanField(term46800, term46800.getClass(), "called", false);
        setBooleanField(term46800, term46800.getClass(), "isLambda", false);
        setField(term46800, term46800.getClass(), "nodeType", null);
        setIntField(term46800, term46800.getClass(), "start", 0);
        setIntField(term46800, term46800.getClass(), "end", 0);
        setField(term46800, term46800.getClass(), "file", null);
        setField(term46800, term46800.getClass(), "parent", null);
        setField(term46800, term46800.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setKWarg", argTypes, term46800, args);
    }

};


