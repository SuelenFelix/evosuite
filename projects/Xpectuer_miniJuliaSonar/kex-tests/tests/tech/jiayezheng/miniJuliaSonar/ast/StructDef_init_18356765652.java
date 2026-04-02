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
import java.lang.Boolean;
import java.lang.Integer;

public class StructDef_init_18356765652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50818;
     Object term50820;
     Object term50822;

    public StructDef_init_18356765652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50818 = new Boolean(false);
        term50820 = new Integer(0);
        term50822 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.StructDef");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[3] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term50818;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term50820;
        args[5] = term50822;
        args[6] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


