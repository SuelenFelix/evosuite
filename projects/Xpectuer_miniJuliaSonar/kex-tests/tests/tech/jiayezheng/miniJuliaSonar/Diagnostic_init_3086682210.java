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
import java.lang.Integer;

public class Diagnostic_init_3086682210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum249;
     Object term79924;
     Object term79926;

    public Diagnostic_init_3086682210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79951 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Diagnostic$Category");
        Field term79950 = ((Class) term79951).getDeclaredField((String) "ERROR");
        ((Field) term79950).setAccessible(true);
        enum249 = ((Field) term79950).get((Object) null);
        term79924 = new Integer(-1703035419);
        term79926 = new Integer(765766290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic$Category");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = "TLLVSGTNsz";
        args[1] = enum249;
        args[2] = term79924;
        args[3] = term79926;
        args[4] = "mbBWfaHCrP";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


