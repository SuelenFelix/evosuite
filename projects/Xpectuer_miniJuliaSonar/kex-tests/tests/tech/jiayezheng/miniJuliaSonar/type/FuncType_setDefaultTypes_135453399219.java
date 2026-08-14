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

public class FuncType_setDefaultTypes_135453399219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28086;

    public FuncType_setDefaultTypes_135453399219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28086 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType"));
        setField(term28086, term28086.getClass(), "arrows", null);
        setField(term28086, term28086.getClass(), "func", null);
        setField(term28086, term28086.getClass(), "env", null);
        setField(term28086, term28086.getClass(), "defaultTypes", null);
        setField(term28086, term28086.getClass(), "table", null);
        setField(term28086, term28086.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDefaultTypes", argTypes, term28086, args);
    }

};


