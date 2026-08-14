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

public class PrimitiveType_toString_16194331943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20159;

    public PrimitiveType_toString_16194331943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20159 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.PrimitiveType"));
        setField(term20159, term20159.getClass(), "name", null);
        setField(term20159, term20159.getClass(), "base", null);
        setIntField(term20159, term20159.getClass(), "size", 0);
        setField(term20159, term20159.getClass(), "nodeType", null);
        setIntField(term20159, term20159.getClass(), "start", 0);
        setIntField(term20159, term20159.getClass(), "end", 0);
        setField(term20159, term20159.getClass(), "file", null);
        setField(term20159, term20159.getClass(), "parent", null);
        setField(term20159, term20159.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.PrimitiveType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20159, args);
    }

};


