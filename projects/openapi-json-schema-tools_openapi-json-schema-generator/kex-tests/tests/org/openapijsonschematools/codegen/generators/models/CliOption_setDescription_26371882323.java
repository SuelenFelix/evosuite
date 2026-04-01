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

public class CliOption_setDescription_26371882323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3080;

    public CliOption_setDescription_26371882323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3080 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption"));
        setField(term3080, term3080.getClass(), "opt", null);
        setField(term3080, term3080.getClass(), "description", null);
        setField(term3080, term3080.getClass(), "type", null);
        setField(term3080, term3080.getClass(), "defaultValue", null);
        setField(term3080, term3080.getClass(), "optValue", null);
        setField(term3080, term3080.getClass(), "enumValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CliOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term3080, args);
    }

};


