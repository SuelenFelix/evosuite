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
import java.util.HashMap;

public class CliOption_defaultValue_16740036689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1976;

    public CliOption_defaultValue_16740036689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2037 = new HashMap();
        term1976 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term1976, term1976.getClass(), "opt", "ytSBIKXogI");
        setField(term1976, term1976.getClass(), "description", "nHXjMycHlU");
        setField(term1976, term1976.getClass(), "type", "ieCtQFdkii");
        setField(term1976, term1976.getClass(), "defaultValue", "dEnhdmILtU");
        setField(term1976, term1976.getClass(), "optValue", "hoicvmsovO");
        setField(term1976, term1976.getClass(), "enumValues", term2037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "defaultValue", argTypes, term1976, args);
    }

};


