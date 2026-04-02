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

public class Tuple_unPack_9515729144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10215;

    public Tuple_unPack_9515729144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10215 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple"));
        setField(term10215, term10215.getClass(), "elts", null);
        setField(term10215, term10215.getClass(), "nodeType", null);
        setIntField(term10215, term10215.getClass(), "start", 0);
        setIntField(term10215, term10215.getClass(), "end", 0);
        setField(term10215, term10215.getClass(), "file", null);
        setField(term10215, term10215.getClass(), "parent", null);
        setField(term10215, term10215.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unPack", argTypes, term10215, args);
    }

};


