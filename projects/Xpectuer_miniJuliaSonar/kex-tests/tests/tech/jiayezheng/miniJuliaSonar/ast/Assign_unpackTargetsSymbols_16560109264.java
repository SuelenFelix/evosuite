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

public class Assign_unpackTargetsSymbols_16560109264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15740;

    public Assign_unpackTargetsSymbols_16560109264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15740 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign"));
        setField(term15740, term15740.getClass(), "target", null);
        setField(term15740, term15740.getClass(), "value", null);
        setBooleanField(term15740, term15740.getClass(), "nonLocal", false);
        setField(term15740, term15740.getClass(), "nodeType", null);
        setIntField(term15740, term15740.getClass(), "start", 0);
        setIntField(term15740, term15740.getClass(), "end", 0);
        setField(term15740, term15740.getClass(), "file", null);
        setField(term15740, term15740.getClass(), "parent", null);
        setField(term15740, term15740.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unpackTargetsSymbols", argTypes, term15740, args);
    }

};


