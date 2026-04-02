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

public class JuliaBool_asBoolValue_7345792204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30872;

    public JuliaBool_asBoolValue_7345792204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30872 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaBool"));
        setField(term30872, term30872.getClass(), "value", null);
        setField(term30872, term30872.getClass(), "nodeType", null);
        setIntField(term30872, term30872.getClass(), "start", 0);
        setIntField(term30872, term30872.getClass(), "end", 0);
        setField(term30872, term30872.getClass(), "file", null);
        setField(term30872, term30872.getClass(), "parent", null);
        setField(term30872, term30872.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaBool");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "asBoolValue", argTypes, term30872, args);
    }

};


