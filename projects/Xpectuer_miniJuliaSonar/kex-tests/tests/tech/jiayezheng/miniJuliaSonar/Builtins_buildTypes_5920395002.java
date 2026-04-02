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

public class Builtins_buildTypes_5920395002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6878;

    public Builtins_buildTypes_5920395002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6878 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        setField(term6878, term6878.getClass(), "modules", null);
        setField(term6878, term6878.getClass(), "BaseModule", null);
        setField(term6878, term6878.getClass(), "BaseVector", null);
        setField(term6878, term6878.getClass(), "BaseVectorInst", null);
        setField(term6878, term6878.getClass(), "BaseDict", null);
        setField(term6878, term6878.getClass(), "BaseTuple", null);
        setField(term6878, term6878.getClass(), "BaseStruct", null);
        setField(term6878, term6878.getClass(), "BaseFunction", null);
        setField(term6878, term6878.getClass(), "BasePair", null);
        setField(term6878, term6878.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildTypes", argTypes, term6878, args);
    }

};


