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
import java.lang.Object;
import java.util.ArrayList;

public class ValidationResult_consume_18682251857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16922;
     Object term16928;

    public ValidationResult_consume_18682251857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16924 = new ArrayList();
        term16922 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult"));
        Object term16923 = newInstance(Class.forName("java.util.Collections$SynchronizedRandomAccessList"));
        setField(term16923, term16923.getClass(), "list", term16924);
        setField(term16923, term16923.getClass(), "c", term16924);
        setField(term16923, term16923.getClass(), "mutex", term16923);
        setField(term16922, term16922.getClass(), "validations", term16923);
        ArrayList term16930 = new ArrayList();
        term16928 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult"));
        Object term16929 = newInstance(Class.forName("java.util.Collections$SynchronizedRandomAccessList"));
        setField(term16929, term16929.getClass(), "list", term16930);
        setField(term16929, term16929.getClass(), "c", term16930);
        setField(term16929, term16929.getClass(), "mutex", term16929);
        setField(term16928, term16928.getClass(), "validations", term16929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult");
        Object[] args = new Object[1];
        args[0] = term16928;
        callMethod(klass, "consume", argTypes, term16922, args);
    }

};


