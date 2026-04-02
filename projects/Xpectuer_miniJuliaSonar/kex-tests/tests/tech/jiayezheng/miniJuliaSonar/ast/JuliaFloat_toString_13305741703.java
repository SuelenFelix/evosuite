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

public class JuliaFloat_toString_13305741703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52817;

    public JuliaFloat_toString_13305741703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52817 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaFloat"));
        setField(term52817, term52817.getClass(), "value", null);
        setField(term52817, term52817.getClass(), "nodeType", null);
        setIntField(term52817, term52817.getClass(), "start", 0);
        setIntField(term52817, term52817.getClass(), "end", 0);
        setField(term52817, term52817.getClass(), "file", null);
        setField(term52817, term52817.getClass(), "parent", null);
        setField(term52817, term52817.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaFloat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term52817, args);
    }

};


