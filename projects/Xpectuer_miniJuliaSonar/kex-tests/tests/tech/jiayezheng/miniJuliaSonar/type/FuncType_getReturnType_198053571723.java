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

public class FuncType_getReturnType_198053571723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34609;

    public FuncType_getReturnType_198053571723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34609 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType"));
        setField(term34609, term34609.getClass(), "arrows", null);
        setField(term34609, term34609.getClass(), "func", null);
        setField(term34609, term34609.getClass(), "env", null);
        setField(term34609, term34609.getClass(), "defaultTypes", null);
        setField(term34609, term34609.getClass(), "table", null);
        setField(term34609, term34609.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnType", argTypes, term34609, args);
    }

};


