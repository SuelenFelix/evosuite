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

public class ParamType_toString_9347647203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2093;

    public ParamType_toString_9347647203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2093 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType"));
        setField(term2093, term2093.getClass(), "type", null);
        setField(term2093, term2093.getClass(), "params", null);
        setField(term2093, term2093.getClass(), "nodeType", null);
        setIntField(term2093, term2093.getClass(), "start", 0);
        setIntField(term2093, term2093.getClass(), "end", 0);
        setField(term2093, term2093.getClass(), "file", null);
        setField(term2093, term2093.getClass(), "parent", null);
        setField(term2093, term2093.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2093, args);
    }

};


