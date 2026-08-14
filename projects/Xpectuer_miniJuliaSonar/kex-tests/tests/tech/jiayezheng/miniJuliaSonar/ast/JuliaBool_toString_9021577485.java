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

public class JuliaBool_toString_9021577485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30875;

    public JuliaBool_toString_9021577485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30875 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaBool"));
        setField(term30875, term30875.getClass(), "value", null);
        setField(term30875, term30875.getClass(), "nodeType", null);
        setIntField(term30875, term30875.getClass(), "start", 0);
        setIntField(term30875, term30875.getClass(), "end", 0);
        setField(term30875, term30875.getClass(), "file", null);
        setField(term30875, term30875.getClass(), "parent", null);
        setField(term30875, term30875.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaBool");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30875, args);
    }

};


