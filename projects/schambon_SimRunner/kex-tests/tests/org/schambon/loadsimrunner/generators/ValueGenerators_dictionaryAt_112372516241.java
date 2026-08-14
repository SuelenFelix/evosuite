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
import java.util.LinkedHashMap;

public class ValueGenerators_dictionaryAt_112372516241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;
     Object term303;

    public ValueGenerators_dictionaryAt_112372516241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term299 = new ArrayList();
        term298 = newInstance(Class.forName("org.schambon.loadsimrunner.DocumentGenerator"));
        setField(term298, term298.getClass(), "subgenerators", term299);
        term303 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.generators.ValueGenerators");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.DocumentGenerator");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term298;
        args[1] = term303;
        callMethod(klass, "dictionaryAt", argTypes, null, args);
    }

};


