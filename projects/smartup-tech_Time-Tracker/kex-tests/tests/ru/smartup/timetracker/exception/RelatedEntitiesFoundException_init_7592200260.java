package ru.smartup.timetracker.exception;

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
import static ru.smartup.timetracker.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class RelatedEntitiesFoundException_init_7592200260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum5;
     Object term10738;

    public RelatedEntitiesFoundException_init_7592200260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10755 = Class.forName((String) "ru.smartup.timetracker.dto.ErrorCode");
        Field term10754 = ((Class) term10755).getDeclaredField((String) "NOT_PROCESSED_TRACK_UNITS_FOR_PROJECT");
        ((Field) term10754).setAccessible(true);
        enum5 = ((Field) term10754).get((Object) null);
        Object term10741 = newInstance(Class.forName("java.lang.Object"));
        Object term10743 = newInstance(Class.forName("java.lang.Object"));
        Object term10745 = newInstance(Class.forName("java.lang.Object"));
        term10738 = new LinkedList();
        ((LinkedList) term10738).add(term10741);
        ((LinkedList) term10738).add(term10743);
        ((LinkedList) term10738).add(term10745);
        ((LinkedList) term10738).add((Object)null);
        ((LinkedList) term10738).add((Object)null);
        ((LinkedList) term10738).add((Object)null);
        ((LinkedList) term10738).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.exception.RelatedEntitiesFoundException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.ErrorCode");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = enum5;
        args[1] = "cAPeiZHKGJ";
        args[2] = term10738;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


