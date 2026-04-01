package org.openapijsonschematools.codegen.config;

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
import static org.openapijsonschematools.codegen.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DynamicSettings_getGeneratorSettings_11066874377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37006;

    public DynamicSettings_getGeneratorSettings_11066874377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37006 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        setField(term37006, term37006.getClass(), "LOGGER", null);
        setField(term37006, term37006.getClass(), "dynamicProperties", null);
        setField(term37006, term37006.getClass(), "generatorSettings", null);
        setField(term37006, term37006.getClass(), "workflowSettings", null);
        setField(term37006, term37006.getClass(), "files", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneratorSettings", argTypes, term37006, args);
    }

};


