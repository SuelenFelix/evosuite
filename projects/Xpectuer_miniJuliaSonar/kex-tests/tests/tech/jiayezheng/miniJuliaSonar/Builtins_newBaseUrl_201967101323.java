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

public class Builtins_newBaseUrl_201967101323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12332;

    public Builtins_newBaseUrl_201967101323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12332 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term12332, term12332.getClass(), "modules", null);
        setField(term12332, term12332.getClass(), "BaseModule", null);
        setField(term12332, term12332.getClass(), "BaseVector", null);
        setField(term12332, term12332.getClass(), "BaseVectorInst", null);
        setField(term12332, term12332.getClass(), "BaseDict", null);
        setField(term12332, term12332.getClass(), "BaseTuple", null);
        setField(term12332, term12332.getClass(), "BaseStruct", null);
        setField(term12332, term12332.getClass(), "BaseFunction", null);
        setField(term12332, term12332.getClass(), "BasePair", null);
        setField(term12332, term12332.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "newBaseUrl", argTypes, term12332, args);
    }

};


