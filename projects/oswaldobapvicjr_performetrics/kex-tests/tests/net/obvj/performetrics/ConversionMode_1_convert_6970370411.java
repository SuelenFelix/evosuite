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

public class ConversionMode_1_convert_6970370411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum225;
     Object term67846;
     Object enum226;
     Object enum227;

    public ConversionMode_1_convert_6970370411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67892 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term67891 = ((Class) term67892).getDeclaredField((String) "FAST");
        ((Field) term67891).setAccessible(true);
        enum225 = ((Field) term67891).get((Object) null);
        term67846 = new Long(-2170847986967241072L);
        Class<? extends Object> term68096 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term68095 = ((Class) term68096).getDeclaredField((String) "MICROSECONDS");
        ((Field) term68095).setAccessible(true);
        enum226 = ((Field) term68095).get((Object) null);
        Class<? extends Object> term68284 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term68283 = ((Class) term68284).getDeclaredField((String) "MINUTES");
        ((Field) term68283).setAccessible(true);
        enum227 = ((Field) term68283).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.ConversionMode$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[3];
        args[0] = term67846;
        args[1] = enum226;
        args[2] = enum227;
        callMethod(klass, "convert", argTypes, enum225, args);
    }

};


