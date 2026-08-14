package net.obvj.performetrics.util.print;

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
import static net.obvj.performetrics.util.print.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PrintFormat_2_toRowFormat_10994466246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum20;
     Object term5823;

    public PrintFormat_2_toRowFormat_10994466246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5826 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term5825 = ((Class) term5826).getDeclaredField((String) "DETAILED");
        ((Field) term5825).setAccessible(true);
        enum20 = ((Field) term5825).get((Object) null);
        term5823 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$2");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[2] = Class.forName("net.obvj.performetrics.util.Duration");
        argTypes[3] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        argTypes[4] = Class.forName("net.obvj.performetrics.Counter$Type");
        Object[] args = new Object[5];
        args[0] = term5823;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "toRowFormat", argTypes, enum20, args);
    }

};


