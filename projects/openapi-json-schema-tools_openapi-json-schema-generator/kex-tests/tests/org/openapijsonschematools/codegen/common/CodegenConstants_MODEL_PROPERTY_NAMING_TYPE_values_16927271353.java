package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CodegenConstants_MODEL_PROPERTY_NAMING_TYPE_values_16927271353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum19;

    public CodegenConstants_MODEL_PROPERTY_NAMING_TYPE_values_16927271353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10811 = Class.forName((String) "org.openapijsonschematools.codegen.common.CodegenConstants$MODEL_PROPERTY_NAMING_TYPE");
        Field term10810 = ((Class) term10811).getDeclaredField((String) "original");
        ((Field) term10810).setAccessible(true);
        enum19 = ((Field) term10810).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.CodegenConstants$MODEL_PROPERTY_NAMING_TYPE");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum19, args);
    }

};


