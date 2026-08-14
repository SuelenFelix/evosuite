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

public class PrintFormat_1_toRowFormat_4445863483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum34;

    public PrintFormat_1_toRowFormat_4445863483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9673 = Class.forName((String) "net.obvj.performetrics.util.print.PrintFormat");
        Field term9672 = ((Class) term9673).getDeclaredField((String) "SUMMARIZED");
        ((Field) term9672).setAccessible(true);
        enum34 = ((Field) term9672).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.util.print.PrintFormat$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.obvj.performetrics.TimingSessionContainer");
        argTypes[1] = Class.forName("net.obvj.performetrics.Counter$Type");
        argTypes[2] = Class.forName("net.obvj.performetrics.util.print.PrintStyle");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "toRowFormat", argTypes, enum34, args);
    }

};


