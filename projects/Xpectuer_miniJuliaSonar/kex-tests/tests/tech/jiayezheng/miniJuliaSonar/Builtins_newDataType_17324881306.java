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

public class Builtins_newDataType_17324881306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9255;

    public Builtins_newDataType_17324881306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9255 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term9255, term9255.getClass(), "modules", null);
        setField(term9255, term9255.getClass(), "BaseModule", null);
        setField(term9255, term9255.getClass(), "BaseVector", null);
        setField(term9255, term9255.getClass(), "BaseVectorInst", null);
        setField(term9255, term9255.getClass(), "BaseDict", null);
        setField(term9255, term9255.getClass(), "BaseTuple", null);
        setField(term9255, term9255.getClass(), "BaseStruct", null);
        setField(term9255, term9255.getClass(), "BaseFunction", null);
        setField(term9255, term9255.getClass(), "BasePair", null);
        setField(term9255, term9255.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "newDataType", argTypes, term9255, args);
    }

};


