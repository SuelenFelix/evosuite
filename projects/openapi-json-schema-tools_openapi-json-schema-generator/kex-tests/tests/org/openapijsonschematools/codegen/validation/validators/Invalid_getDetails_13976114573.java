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

public class Invalid_getDetails_13976114573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3996;

    public Invalid_getDetails_13976114573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4066 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term4065 = ((Class) term4066).getDeclaredField((String) "ERROR");
        ((Field) term4065).setAccessible(true);
        Object enum5 = ((Field) term4065).get((Object) null);
        term3996 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term4009 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term3996, term3996.getClass(), "message", "IoAlmYsBwc");
        setField(term4009, term4009.getClass(), "severity", enum5);
        setField(term4009, term4009.getClass(), "description", "TEParAifyi");
        setField(term4009, term4009.getClass(), "failureMessage", "OWDIEULEFu");
        setField(term4009, term4009.getClass(), "test", null);
        setField(term3996, term3996.getClass(), "rule", term4009);
        setField(term3996, term3996.getClass(), "details", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetails", argTypes, term3996, args);
    }

};


