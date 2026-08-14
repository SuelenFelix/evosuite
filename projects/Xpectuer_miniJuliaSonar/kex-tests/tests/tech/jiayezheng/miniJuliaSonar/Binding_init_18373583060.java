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
import java.lang.String;
import java.lang.Object;

public class Binding_init_18373583060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum59;

    public Binding_init_18373583060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19942 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term19941 = ((Class) term19942).getDeclaredField((String) "FUNCTION");
        ((Field) term19941).setAccessible(true);
        enum59 = ((Field) term19941).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        argTypes[3] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Object[] args = new Object[4];
        args[0] = "OxNXeKMDje";
        args[1] = null;
        args[2] = null;
        args[3] = enum59;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


