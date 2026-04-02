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

public class FuncDef_genLambdaName_9405135568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46805;

    public FuncDef_genLambdaName_9405135568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46805 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        setField(term46805, term46805.getClass(), "name", null);
        setField(term46805, term46805.getClass(), "params", null);
        setField(term46805, term46805.getClass(), "defaults", null);
        setField(term46805, term46805.getClass(), "vararg", null);
        setField(term46805, term46805.getClass(), "kwarg", null);
        setField(term46805, term46805.getClass(), "body", null);
        setField(term46805, term46805.getClass(), "end", null);
        setBooleanField(term46805, term46805.getClass(), "called", false);
        setBooleanField(term46805, term46805.getClass(), "isLambda", false);
        setField(term46805, term46805.getClass(), "nodeType", null);
        setIntField(term46805, term46805.getClass(), "start", 0);
        setIntField(term46805, term46805.getClass(), "end", 0);
        setField(term46805, term46805.getClass(), "file", null);
        setField(term46805, term46805.getClass(), "parent", null);
        setField(term46805, term46805.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "genLambdaName", argTypes, term46805, args);
    }

};


