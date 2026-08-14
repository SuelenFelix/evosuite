package net.obvj.performetrics;

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
import static net.obvj.performetrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class ConversionMode_2_convert_6970370721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum229;
     Object term68704;
     Object enum230;
     Object enum231;

    public ConversionMode_2_convert_6970370721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68748 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term68747 = ((Class) term68748).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term68747).setAccessible(true);
        enum229 = ((Field) term68747).get((Object) null);
        term68704 = new Long(4044358158040652353L);
        Class<? extends Object> term68988 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term68987 = ((Class) term68988).getDeclaredField((String) "HOURS");
        ((Field) term68987).setAccessible(true);
        enum230 = ((Field) term68987).get((Object) null);
        Class<? extends Object> term69155 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term69154 = ((Class) term69155).getDeclaredField((String) "MICROSECONDS");
        ((Field) term69154).setAccessible(true);
        enum231 = ((Field) term69154).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.ConversionMode$2");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[3];
        args[0] = term68704;
        args[1] = enum230;
        args[2] = enum231;
        callMethod(klass, "convert", argTypes, enum229, args);
    }

};


