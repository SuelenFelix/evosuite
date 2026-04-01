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

public class Validated_invalid_757678521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13229;

    public Validated_invalid_757678521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13276 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term13275 = ((Class) term13276).getDeclaredField((String) "ERROR");
        ((Field) term13275).setAccessible(true);
        Object enum16 = ((Field) term13275).get((Object) null);
        term13229 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term13229, term13229.getClass(), "severity", enum16);
        setField(term13229, term13229.getClass(), "description", "kBdSllIBVz");
        setField(term13229, term13229.getClass(), "failureMessage", "TJmVBGfTML");
        setField(term13229, term13229.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Validated");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term13229;
        args[1] = "tPlsykYBqO";
        callMethod(klass, "invalid", argTypes, null, args);
    }

};


