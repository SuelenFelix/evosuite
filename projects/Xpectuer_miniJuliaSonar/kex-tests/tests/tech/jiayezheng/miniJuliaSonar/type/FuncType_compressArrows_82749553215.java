package tech.jiayezheng.miniJuliaSonar.type;

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
import static tech.jiayezheng.miniJuliaSonar.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FuncType_compressArrows_82749553215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22041;

    public FuncType_compressArrows_82749553215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22041 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType"));
        setField(term22041, term22041.getClass(), "arrows", null);
        setField(term22041, term22041.getClass(), "func", null);
        setField(term22041, term22041.getClass(), "env", null);
        setField(term22041, term22041.getClass(), "defaultTypes", null);
        setField(term22041, term22041.getClass(), "table", null);
        setField(term22041, term22041.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compressArrows", argTypes, term22041, args);
    }

};


