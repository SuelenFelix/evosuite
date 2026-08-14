package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Event_init_12211818380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6514;

    public Event_init_12211818380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6543 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term6542 = ((Class) term6543).getDeclaredField((String) "USER");
        ((Field) term6542).setAccessible(true);
        Object enum15 = ((Field) term6542).get((Object) null);
        Class<? extends Object> term6927 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term6926 = ((Class) term6927).getDeclaredField((String) "ORDER");
        ((Field) term6926).setAccessible(true);
        Object enum16 = ((Field) term6926).get((Object) null);
        term6514 = (Object[]) newArray("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag", 7);
        setElement(term6514, 0, enum15);
        setElement(term6514, 1, enum15);
        setElement(term6514, 2, enum16);
        setElement(term6514, 3, enum16);
        setElement(term6514, 4, enum15);
        setElement(term6514, 5, enum15);
        setElement(term6514, 6, enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = term6514;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


