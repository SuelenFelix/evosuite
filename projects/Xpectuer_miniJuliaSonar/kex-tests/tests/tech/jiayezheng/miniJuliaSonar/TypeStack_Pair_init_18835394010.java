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
import java.util.ArrayList;

public class TypeStack_Pair_init_18835394010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325260;
     Object term325265;
     Object term325266;

    public TypeStack_Pair_init_18835394010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term325261 = new ArrayList();
        term325260 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TypeStack"));
        setField(term325260, term325260.getClass(), "stack", term325261);
        term325265 = newInstance(Class.forName("java.lang.Object"));
        term325266 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TypeStack$Pair");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.TypeStack");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term325260;
        args[1] = term325265;
        args[2] = term325266;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


