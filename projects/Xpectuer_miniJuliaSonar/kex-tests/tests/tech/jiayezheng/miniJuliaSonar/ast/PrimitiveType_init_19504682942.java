package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PrimitiveType_init_19504682942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20153;
     Object term20155;
     Object term20157;

    public PrimitiveType_init_19504682942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20153 = new Integer(0);
        term20155 = new Integer(0);
        term20157 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.PrimitiveType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term20153;
        args[3] = term20155;
        args[4] = term20157;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


