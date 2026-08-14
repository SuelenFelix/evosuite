package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Style_init_8023085210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum21;
     Object term6536;
     Object term6538;

    public Style_init_8023085210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6541 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term6540 = ((Class) term6541).getDeclaredField((String) "BUILTIN");
        ((Field) term6540).setAccessible(true);
        enum21 = ((Field) term6540).get((Object) null);
        term6536 = new Integer(-1547384488);
        term6538 = new Integer(1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = enum21;
        args[1] = term6536;
        args[2] = term6538;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


