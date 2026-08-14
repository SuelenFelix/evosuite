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

public class Do_init_14087985912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22651;
     Object term22653;

    public Do_init_14087985912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22651 = new Integer(0);
        term22653 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Do");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term22651;
        args[4] = term22653;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


