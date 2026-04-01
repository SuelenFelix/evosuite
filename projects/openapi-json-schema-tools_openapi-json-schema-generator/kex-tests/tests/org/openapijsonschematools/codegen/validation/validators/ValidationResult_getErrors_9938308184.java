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

public class ValidationResult_getErrors_9938308184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16904;

    public ValidationResult_getErrors_9938308184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16906 = new ArrayList();
        term16904 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult"));
        Object term16905 = newInstance(Class.forName("java.util.Collections$SynchronizedRandomAccessList"));
        setField(term16905, term16905.getClass(), "list", term16906);
        setField(term16905, term16905.getClass(), "c", term16906);
        setField(term16905, term16905.getClass(), "mutex", term16905);
        setField(term16904, term16904.getClass(), "validations", term16905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getErrors", argTypes, term16904, args);
    }

};


