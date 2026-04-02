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

public class Builtins_newBaseUrl_159479149622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12325;

    public Builtins_newBaseUrl_159479149622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12325 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term12325, term12325.getClass(), "modules", null);
        setField(term12325, term12325.getClass(), "BaseModule", null);
        setField(term12325, term12325.getClass(), "BaseVector", null);
        setField(term12325, term12325.getClass(), "BaseVectorInst", null);
        setField(term12325, term12325.getClass(), "BaseDict", null);
        setField(term12325, term12325.getClass(), "BaseTuple", null);
        setField(term12325, term12325.getClass(), "BaseStruct", null);
        setField(term12325, term12325.getClass(), "BaseFunction", null);
        setField(term12325, term12325.getClass(), "BasePair", null);
        setField(term12325, term12325.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newBaseUrl", argTypes, term12325, args);
    }

};


