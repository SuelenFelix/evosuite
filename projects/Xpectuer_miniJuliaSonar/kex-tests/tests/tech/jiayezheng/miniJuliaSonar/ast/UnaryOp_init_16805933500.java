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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class UnaryOp_init_16805933500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum120;
     Object term36579;
     Object term36581;

    public UnaryOp_init_16805933500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36596 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term36595 = ((Class) term36596).getDeclaredField((String) "Add");
        ((Field) term36595).setAccessible(true);
        enum120 = ((Field) term36595).get((Object) null);
        term36579 = new Integer(-282881827);
        term36581 = new Integer(-1183353915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.UnaryOp");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Op");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = enum120;
        args[1] = null;
        args[2] = term36579;
        args[3] = term36581;
        args[4] = "gUvcueTURF";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


