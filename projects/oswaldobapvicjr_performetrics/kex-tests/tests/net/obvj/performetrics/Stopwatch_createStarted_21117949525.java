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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class Stopwatch_createStarted_21117949525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26370;

    public Stopwatch_createStarted_21117949525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26414 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term26413 = ((Class) term26414).getDeclaredField((String) "SYSTEM_TIME");
        ((Field) term26413).setAccessible(true);
        Object enum94 =  ((Field) term26413).get((Object) null);
        Class<? extends Object> term26629 = Class.forName((String) "net.obvj.performetrics.Counter$Type");
        Field term26628 = ((Class) term26629).getDeclaredField((String) "CPU_TIME");
        ((Field) term26628).setAccessible(true);
        Object enum95 =  ((Field) term26628).get((Object) null);
        term26370 = new LinkedList();
        ((LinkedList) term26370).add(enum94);
        ((LinkedList) term26370).add(enum94);
        ((LinkedList) term26370).add(enum95);
        ((LinkedList) term26370).add((Object)null);
        ((LinkedList) term26370).add((Object)null);
        ((LinkedList) term26370).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.obvj.performetrics.Stopwatch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term26370;
        callMethod(klass, "createStarted", argTypes, null, args);
    }

};


