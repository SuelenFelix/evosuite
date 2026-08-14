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

public class ValidationResult_addResult_18430096176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16916;

    public ValidationResult_addResult_18430096176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16918 = new ArrayList();
        term16916 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult"));
        Object term16917 = newInstance(Class.forName("java.util.Collections$SynchronizedRandomAccessList"));
        setField(term16917, term16917.getClass(), "list", term16918);
        setField(term16917, term16917.getClass(), "c", term16918);
        setField(term16917, term16917.getClass(), "mutex", term16917);
        setField(term16916, term16916.getClass(), "validations", term16917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.Validated");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addResult", argTypes, term16916, args);
    }

};


