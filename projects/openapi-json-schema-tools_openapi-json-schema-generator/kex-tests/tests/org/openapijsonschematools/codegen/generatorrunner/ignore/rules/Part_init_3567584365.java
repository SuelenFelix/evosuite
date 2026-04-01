package org.openapijsonschematools.codegen.generatorrunner.ignore.rules;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.rules.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Part_init_3567584365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Part_init_3567584365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


