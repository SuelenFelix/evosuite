package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ClassDetails_canEqual_10537606834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2933;
     Object term3022;

    public ClassDetails_canEqual_10537606834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2946 = new ArrayList();
        ((ArrayList) term2946).add("HqyBQNuLnz");
        ((ArrayList) term2946).add("xWkZKbrvmX");
        ((ArrayList) term2946).add("PTEWoxLNqQ");
        ((ArrayList) term2946).add("XiAUBffMZP");
        ((ArrayList) term2946).add("pkfsHvqODq");
        ((ArrayList) term2946).add("OoRBUdwown");
        term2933 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        setField(term2933, term2933.getClass(), "name", "mJrFDaDdyY");
        setField(term2933, term2933.getClass(), "properties", term2946);
        term3022 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3022;
        callMethod(klass, "canEqual", argTypes, term2933, args);
    }

};


