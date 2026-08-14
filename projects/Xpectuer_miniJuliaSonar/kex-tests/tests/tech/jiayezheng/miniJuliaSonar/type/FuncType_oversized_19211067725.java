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

public class FuncType_oversized_19211067725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37199;

    public FuncType_oversized_19211067725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37199 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType"));
        setField(term37199, term37199.getClass(), "arrows", null);
        setField(term37199, term37199.getClass(), "func", null);
        setField(term37199, term37199.getClass(), "env", null);
        setField(term37199, term37199.getClass(), "defaultTypes", null);
        setField(term37199, term37199.getClass(), "table", null);
        setField(term37199, term37199.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.FuncType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "oversized", argTypes, term37199, args);
    }

};


