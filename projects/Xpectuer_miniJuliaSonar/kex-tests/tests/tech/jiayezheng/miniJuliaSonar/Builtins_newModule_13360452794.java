package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Builtins_newModule_13360452794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7605;

    public Builtins_newModule_13360452794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7605 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term7605, term7605.getClass(), "modules", null);
        setField(term7605, term7605.getClass(), "BaseModule", null);
        setField(term7605, term7605.getClass(), "BaseVector", null);
        setField(term7605, term7605.getClass(), "BaseVectorInst", null);
        setField(term7605, term7605.getClass(), "BaseDict", null);
        setField(term7605, term7605.getClass(), "BaseTuple", null);
        setField(term7605, term7605.getClass(), "BaseStruct", null);
        setField(term7605, term7605.getClass(), "BaseFunction", null);
        setField(term7605, term7605.getClass(), "BasePair", null);
        setField(term7605, term7605.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newModule", argTypes, term7605, args);
    }

};


