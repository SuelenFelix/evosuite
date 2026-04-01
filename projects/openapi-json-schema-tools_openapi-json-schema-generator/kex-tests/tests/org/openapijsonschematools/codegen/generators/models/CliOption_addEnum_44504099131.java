package org.openapijsonschematools.codegen.generators.models;

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
import static org.openapijsonschematools.codegen.generators.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CliOption_addEnum_44504099131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3088;

    public CliOption_addEnum_44504099131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3088 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term3088, term3088.getClass(), "opt", null);
        setField(term3088, term3088.getClass(), "description", null);
        setField(term3088, term3088.getClass(), "type", null);
        setField(term3088, term3088.getClass(), "defaultValue", null);
        setField(term3088, term3088.getClass(), "optValue", null);
        setField(term3088, term3088.getClass(), "enumValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addEnum", argTypes, term3088, args);
    }

};


