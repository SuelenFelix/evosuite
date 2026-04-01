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

public class ValidationResult_getAll_5314710602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16892;

    public ValidationResult_getAll_5314710602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16894 = new ArrayList();
        term16892 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult"));
        Object term16893 = newInstance(Class.forName("java.util.Collections$SynchronizedRandomAccessList"));
        setField(term16893, term16893.getClass(), "list", term16894);
        setField(term16893, term16893.getClass(), "c", term16894);
        setField(term16893, term16893.getClass(), "mutex", term16893);
        setField(term16892, term16892.getClass(), "validations", term16893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAll", argTypes, term16892, args);
    }

};


