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

public class Complex_init_20795171460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum10;
     Object term3640;
     Object term3642;

    public Complex_init_20795171460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3657 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term3656 = ((Class) term3657).getDeclaredField((String) "Try");
        ((Field) term3656).setAccessible(true);
        enum10 = ((Field) term3656).get((Object) null);
        term3640 = new Integer(-203030934);
        term3642 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Complex");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = enum10;
        args[3] = term3640;
        args[4] = term3642;
        args[5] = "vrQLuWIDJX";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


