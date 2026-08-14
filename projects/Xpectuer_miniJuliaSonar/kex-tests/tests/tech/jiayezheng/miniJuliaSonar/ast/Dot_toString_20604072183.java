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

public class Dot_toString_20604072183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36218;

    public Dot_toString_20604072183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36218 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot"));
        setField(term36218, term36218.getClass(), "target", null);
        setField(term36218, term36218.getClass(), "attr", null);
        setField(term36218, term36218.getClass(), "nodeType", null);
        setIntField(term36218, term36218.getClass(), "start", 0);
        setIntField(term36218, term36218.getClass(), "end", 0);
        setField(term36218, term36218.getClass(), "file", null);
        setField(term36218, term36218.getClass(), "parent", null);
        setField(term36218, term36218.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term36218, args);
    }

};


