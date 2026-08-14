package net.obvj.performetrics.util;

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
import static net.obvj.performetrics.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

public class DurationFormat_appendlegend_9775282615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9305;
     Object term9325;
     Object enum35;

    public DurationFormat_appendlegend_9775282615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9305 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9306 = (byte[]) newByteArray(16);
        setField(term9305, term9305.getClass(), "value", term9306);
        setByteField(term9305, term9305.getClass(), "coder", (byte) 48);
        setIntField(term9305, term9305.getClass(), "count", 444029505);
        term9325 = new Boolean(true);
        Class<? extends Object> term9428 = Class.forName((String) "net.obvj.performetrics.util.DurationFormat$MyTimeUnit");
        Field term9427 = ((Class) term9428).getDeclaredField((String) "MINUTES");
        ((Field) term9427).setAccessible(true);
        enum35 = ((Field) term9427).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.DurationFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("net.obvj.performetrics.util.DurationFormat$MyTimeUnit");
        Object[] args = new Object[3];
        args[0] = term9305;
        args[1] = term9325;
        args[2] = enum35;
        callMethod(klass, "appendlegend", argTypes, null, args);
    }

};


