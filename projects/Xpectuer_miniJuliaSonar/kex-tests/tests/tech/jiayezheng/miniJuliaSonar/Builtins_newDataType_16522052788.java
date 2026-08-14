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

public class Builtins_newDataType_16522052788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11708;

    public Builtins_newDataType_16522052788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11708 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term11708, term11708.getClass(), "modules", null);
        setField(term11708, term11708.getClass(), "BaseModule", null);
        setField(term11708, term11708.getClass(), "BaseVector", null);
        setField(term11708, term11708.getClass(), "BaseVectorInst", null);
        setField(term11708, term11708.getClass(), "BaseDict", null);
        setField(term11708, term11708.getClass(), "BaseTuple", null);
        setField(term11708, term11708.getClass(), "BaseStruct", null);
        setField(term11708, term11708.getClass(), "BaseFunction", null);
        setField(term11708, term11708.getClass(), "BasePair", null);
        setField(term11708, term11708.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType");
        argTypes[3] = Array.newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "newDataType", argTypes, term11708, args);
    }

};


