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

public class Tuple_toString_1044894895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10218;

    public Tuple_toString_1044894895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10218 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple"));
        setField(term10218, term10218.getClass(), "elts", null);
        setField(term10218, term10218.getClass(), "nodeType", null);
        setIntField(term10218, term10218.getClass(), "start", 0);
        setIntField(term10218, term10218.getClass(), "end", 0);
        setField(term10218, term10218.getClass(), "file", null);
        setField(term10218, term10218.getClass(), "parent", null);
        setField(term10218, term10218.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10218, args);
    }

};


