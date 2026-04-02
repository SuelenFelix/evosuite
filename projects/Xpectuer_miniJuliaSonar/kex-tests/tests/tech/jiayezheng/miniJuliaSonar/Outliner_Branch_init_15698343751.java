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

public class Outliner_Branch_init_15698343751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247379;
     Object enum807;

    public Outliner_Branch_init_15698343751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247379 = new Integer(-1092883950);
        Class<? extends Object> term247404 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term247403 = ((Class) term247404).getDeclaredField((String) "DATATYPE");
        ((Field) term247403).setAccessible(true);
        enum807 = ((Field) term247403).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Object[] args = new Object[3];
        args[0] = "rhQpxOnBRb";
        args[1] = term247379;
        args[2] = enum807;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


