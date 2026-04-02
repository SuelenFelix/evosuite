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

public class FuncType_subsumed_166280728017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25197;

    public FuncType_subsumed_166280728017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25197 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType"));
        setField(term25197, term25197.getClass(), "arrows", null);
        setField(term25197, term25197.getClass(), "func", null);
        setField(term25197, term25197.getClass(), "env", null);
        setField(term25197, term25197.getClass(), "defaultTypes", null);
        setField(term25197, term25197.getClass(), "table", null);
        setField(term25197, term25197.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "subsumed", argTypes, term25197, args);
    }

};


