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
import java.lang.String;

public class Valid_getRule_9142474343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15727;

    public Valid_getRule_9142474343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15763 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term15762 = ((Class) term15763).getDeclaredField((String) "ERROR");
        ((Field) term15762).setAccessible(true);
        Object enum22 = ((Field) term15762).get((Object) null);
        term15727 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid"));
        Object term15728 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term15728, term15728.getClass(), "severity", enum22);
        setField(term15728, term15728.getClass(), "description", "VgZnGoIFwQ");
        setField(term15728, term15728.getClass(), "failureMessage", "jUbSRrkrYZ");
        setField(term15728, term15728.getClass(), "test", null);
        setField(term15727, term15727.getClass(), "rule", term15728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRule", argTypes, term15727, args);
    }

};


