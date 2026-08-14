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

public class DynamicSettings_excludeSettingsFromDynamicProperties_33846789911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37009;

    public DynamicSettings_excludeSettingsFromDynamicProperties_33846789911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37009 = newInstance(Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings"));
        setField(term37009, term37009.getClass(), "LOGGER", null);
        setField(term37009, term37009.getClass(), "dynamicProperties", null);
        setField(term37009, term37009.getClass(), "generatorSettings", null);
        setField(term37009, term37009.getClass(), "workflowSettings", null);
        setField(term37009, term37009.getClass(), "files", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.config.DynamicSettings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "excludeSettingsFromDynamicProperties", argTypes, term37009, args);
    }

};


