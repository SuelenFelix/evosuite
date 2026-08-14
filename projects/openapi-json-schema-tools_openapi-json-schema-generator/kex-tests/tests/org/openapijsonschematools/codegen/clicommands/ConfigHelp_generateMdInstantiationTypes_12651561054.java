package org.openapijsonschematools.codegen.clicommands;

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
import static org.openapijsonschematools.codegen.clicommands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ConfigHelp_generateMdInstantiationTypes_12651561054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;

    public ConfigHelp_generateMdInstantiationTypes_12651561054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term107 = (byte[]) newByteArray(16);
        setField(term106, term106.getClass(), "value", term107);
        setByteField(term106, term106.getClass(), "coder", (byte) 89);
        setIntField(term106, term106.getClass(), "count", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.clicommands.ConfigHelp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.generators.Generator");
        Object[] args = new Object[2];
        args[0] = term106;
        args[1] = null;
        callMethod(klass, "generateMdInstantiationTypes", argTypes, null, args);
    }

};


