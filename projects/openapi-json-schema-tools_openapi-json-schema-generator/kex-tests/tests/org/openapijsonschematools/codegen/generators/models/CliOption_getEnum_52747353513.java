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

public class CliOption_getEnum_52747353513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2548;

    public CliOption_getEnum_52747353513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2609 = new HashMap();
        term2548 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term2548, term2548.getClass(), "opt", "swZVeJAxjt");
        setField(term2548, term2548.getClass(), "description", "xOcJIiQQDu");
        setField(term2548, term2548.getClass(), "type", "GVizqqzXpy");
        setField(term2548, term2548.getClass(), "defaultValue", "JqXGgAhZPl");
        setField(term2548, term2548.getClass(), "optValue", "jiKYgYHqIS");
        setField(term2548, term2548.getClass(), "enumValues", term2609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnum", argTypes, term2548, args);
    }

};


