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

public class ValidationResult_getValid_12120949053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16898;

    public ValidationResult_getValid_12120949053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16900 = new ArrayList();
        term16898 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult"));
        Object term16899 = newInstance(Class.forName("java.util.Collections$SynchronizedRandomAccessList"));
        setField(term16899, term16899.getClass(), "list", term16900);
        setField(term16899, term16899.getClass(), "c", term16900);
        setField(term16899, term16899.getClass(), "mutex", term16899);
        setField(term16898, term16898.getClass(), "validations", term16899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValid", argTypes, term16898, args);
    }

};


