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

public class Invalid_init_6611110771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3533;

    public Invalid_init_6611110771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3594 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term3593 = ((Class) term3594).getDeclaredField((String) "WARNING");
        ((Field) term3593).setAccessible(true);
        Object enum4 = ((Field) term3593).get((Object) null);
        term3533 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term3533, term3533.getClass(), "severity", enum4);
        setField(term3533, term3533.getClass(), "description", "BYqFIqCKAV");
        setField(term3533, term3533.getClass(), "failureMessage", "vrQLuWIDJX");
        setField(term3533, term3533.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term3533;
        args[1] = "flxyYxBRtu";
        args[2] = "OclPbYPkcH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


