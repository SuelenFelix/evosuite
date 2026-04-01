package org.openapijsonschematools.codegen.validation.validators;

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
import static org.openapijsonschematools.codegen.validation.validators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ValidationRule_create_2232015516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum14;

    public ValidationRule_create_2232015516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12387 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term12386 = ((Class) term12387).getDeclaredField((String) "ERROR");
        ((Field) term12386).setAccessible(true);
        enum14 = ((Field) term12386).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.Severity");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.function.Function");
        Object[] args = new Object[4];
        args[0] = enum14;
        args[1] = "nHXjMycHlU";
        args[2] = "ieCtQFdkii";
        args[3] = null;
        callMethod(klass, "create", argTypes, null, args);
    }

};


