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

public class Builtins_newCoreUrl_179012094721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12330;

    public Builtins_newCoreUrl_179012094721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12330 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term12330, term12330.getClass(), "modules", null);
        setField(term12330, term12330.getClass(), "BaseModule", null);
        setField(term12330, term12330.getClass(), "BaseVector", null);
        setField(term12330, term12330.getClass(), "BaseVectorInst", null);
        setField(term12330, term12330.getClass(), "BaseDict", null);
        setField(term12330, term12330.getClass(), "BaseTuple", null);
        setField(term12330, term12330.getClass(), "BaseStruct", null);
        setField(term12330, term12330.getClass(), "BaseFunction", null);
        setField(term12330, term12330.getClass(), "BasePair", null);
        setField(term12330, term12330.getClass(), "Builtin", null);
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
        callMethod(klass, "newCoreUrl", argTypes, term12330, args);
    }

};


