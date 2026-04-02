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

public class Builtins_newFunc_185466640117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12320;

    public Builtins_newFunc_185466640117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12320 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term12320, term12320.getClass(), "modules", null);
        setField(term12320, term12320.getClass(), "BaseModule", null);
        setField(term12320, term12320.getClass(), "BaseVector", null);
        setField(term12320, term12320.getClass(), "BaseVectorInst", null);
        setField(term12320, term12320.getClass(), "BaseDict", null);
        setField(term12320, term12320.getClass(), "BaseTuple", null);
        setField(term12320, term12320.getClass(), "BaseStruct", null);
        setField(term12320, term12320.getClass(), "BaseFunction", null);
        setField(term12320, term12320.getClass(), "BasePair", null);
        setField(term12320, term12320.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newFunc", argTypes, term12320, args);
    }

};


