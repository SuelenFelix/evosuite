package org.openapijsonschematools.codegen.validation;

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
import static org.openapijsonschematools.codegen.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OpenApiSchemaValidations_checkOneOfWithProperties_1383576906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17347;

    public OpenApiSchemaValidations_checkOneOfWithProperties_1383576906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17347 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.OpenApiSchemaValidations"));
        setField(term17347, term17347.getClass(), "rules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.OpenApiSchemaValidations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.SchemaWrapper");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkOneOfWithProperties", argTypes, term17347, args);
    }

};


