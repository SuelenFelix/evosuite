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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class Outliner_Leaf_init_16011944293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319385;
     Object enum1043;

    public Outliner_Leaf_init_16011944293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319385 = new Integer(-1665928103);
        Class<? extends Object> term319410 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term319409 = ((Class) term319410).getDeclaredField((String) "FUNCTION");
        ((Field) term319409).setAccessible(true);
        enum1043 = ((Field) term319409).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Object[] args = new Object[3];
        args[0] = "QpTiKNQuKE";
        args[1] = term319385;
        args[2] = enum1043;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


