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

public class ConversionMode_2_convert_6970370723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum232;
     Object term69346;

    public ConversionMode_2_convert_6970370723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69349 = Class.forName((String) "net.obvj.performetrics.ConversionMode");
        Field term69348 = ((Class) term69349).getDeclaredField((String) "DOUBLE_PRECISION");
        ((Field) term69348).setAccessible(true);
        enum232 = ((Field) term69348).get((Object) null);
        term69346 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.ConversionMode$2");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.concurrent.TimeUnit");
        argTypes[2] = Class.forName("java.util.concurrent.TimeUnit");
        Object[] args = new Object[3];
        args[0] = term69346;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "convert", argTypes, enum232, args);
    }

};


