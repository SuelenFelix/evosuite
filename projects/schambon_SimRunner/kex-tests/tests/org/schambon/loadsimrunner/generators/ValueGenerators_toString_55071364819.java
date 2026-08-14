package org.schambon.loadsimrunner.generators;

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
import static org.schambon.loadsimrunner.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ValueGenerators_toString_55071364819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;

    public ValueGenerators_toString_55071364819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term90 = new ArrayList();
        term89 = newInstance(Class.forName("org.schambon.loadsimrunner.DocumentGenerator"));
        setField(term89, term89.getClass(), "subgenerators", term90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.generators.ValueGenerators");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.DocumentGenerator");
        Object[] args = new Object[1];
        args[0] = term89;
        callMethod(klass, "_toString", argTypes, null, args);
    }

};


