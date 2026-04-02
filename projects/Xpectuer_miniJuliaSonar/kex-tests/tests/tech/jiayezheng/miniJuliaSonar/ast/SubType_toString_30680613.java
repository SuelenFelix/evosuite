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

public class SubType_toString_30680613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39832;

    public SubType_toString_30680613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39832 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.SubType"));
        setField(term39832, term39832.getClass(), "subType", null);
        setField(term39832, term39832.getClass(), "baseType", null);
        setField(term39832, term39832.getClass(), "op", null);
        setField(term39832, term39832.getClass(), "nodeType", null);
        setIntField(term39832, term39832.getClass(), "start", 0);
        setIntField(term39832, term39832.getClass(), "end", 0);
        setField(term39832, term39832.getClass(), "file", null);
        setField(term39832, term39832.getClass(), "parent", null);
        setField(term39832, term39832.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.SubType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term39832, args);
    }

};


