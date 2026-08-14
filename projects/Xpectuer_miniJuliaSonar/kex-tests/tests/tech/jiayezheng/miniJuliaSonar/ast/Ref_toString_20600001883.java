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

public class Ref_toString_20600001883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33827;

    public Ref_toString_20600001883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33827 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Ref"));
        setField(term33827, term33827.getClass(), "name", null);
        setField(term33827, term33827.getClass(), "index", null);
        setField(term33827, term33827.getClass(), "nodeType", null);
        setIntField(term33827, term33827.getClass(), "start", 0);
        setIntField(term33827, term33827.getClass(), "end", 0);
        setField(term33827, term33827.getClass(), "file", null);
        setField(term33827, term33827.getClass(), "parent", null);
        setField(term33827, term33827.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33827, args);
    }

};


