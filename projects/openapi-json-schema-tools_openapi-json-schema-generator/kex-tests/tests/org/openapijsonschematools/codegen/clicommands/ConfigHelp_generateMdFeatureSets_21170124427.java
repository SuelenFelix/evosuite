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

public class ConfigHelp_generateMdFeatureSets_21170124427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;

    public ConfigHelp_generateMdFeatureSets_21170124427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term214 = (byte[]) newByteArray(16);
        setField(term213, term213.getClass(), "value", term214);
        setByteField(term213, term213.getClass(), "coder", (byte) -58);
        setIntField(term213, term213.getClass(), "count", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.clicommands.ConfigHelp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.generators.Generator");
        Object[] args = new Object[2];
        args[0] = term213;
        args[1] = null;
        callMethod(klass, "generateMdFeatureSets", argTypes, null, args);
    }

};


