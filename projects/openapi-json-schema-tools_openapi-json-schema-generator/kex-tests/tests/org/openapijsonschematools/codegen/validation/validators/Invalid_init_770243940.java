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

public class Invalid_init_770243940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3110;

    public Invalid_init_770243940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3157 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term3156 = ((Class) term3157).getDeclaredField((String) "ERROR");
        ((Field) term3156).setAccessible(true);
        Object enum3 = ((Field) term3156).get((Object) null);
        term3110 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term3110, term3110.getClass(), "severity", enum3);
        setField(term3110, term3110.getClass(), "description", "RkybSrpybU");
        setField(term3110, term3110.getClass(), "failureMessage", "xOEqzGAmDU");
        setField(term3110, term3110.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3110;
        args[1] = "eZFUvlxvGV";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


