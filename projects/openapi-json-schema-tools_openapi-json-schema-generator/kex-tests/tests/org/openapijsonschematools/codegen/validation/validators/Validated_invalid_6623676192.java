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

public class Validated_invalid_6623676192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13652;

    public Validated_invalid_6623676192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13711 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term13710 = ((Class) term13711).getDeclaredField((String) "ERROR");
        ((Field) term13710).setAccessible(true);
        Object enum17 = ((Field) term13710).get((Object) null);
        term13652 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term13652, term13652.getClass(), "severity", enum17);
        setField(term13652, term13652.getClass(), "description", "bLPjGVBhlX");
        setField(term13652, term13652.getClass(), "failureMessage", "whBvTVIIlC");
        setField(term13652, term13652.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Validated");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term13652;
        args[1] = "IgRJUzaCwW";
        args[2] = "JUmudUmaaV";
        callMethod(klass, "invalid", argTypes, null, args);
    }

};


