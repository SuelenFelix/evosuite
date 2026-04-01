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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class GenericValidator_validate_6249600951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;
     Object term483;

    public GenericValidator_validate_6249600951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term485 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term484 = ((Class) term485).getDeclaredField((String) "ERROR");
        ((Field) term484).setAccessible(true);
        Object enum1 = ((Field) term484).get((Object) null);
        Object term465 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term465, term465.getClass(), "severity", enum1);
        setField(term465, term465.getClass(), "description", "");
        setField(term465, term465.getClass(), "failureMessage", "");
        setField(term465, term465.getClass(), "test", null);
        Object term470 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term470, term470.getClass(), "severity", enum1);
        setField(term470, term470.getClass(), "description", "");
        setField(term470, term470.getClass(), "failureMessage", "");
        setField(term470, term470.getClass(), "test", null);
        Object term473 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term473, term473.getClass(), "severity", enum1);
        setField(term473, term473.getClass(), "description", "");
        setField(term473, term473.getClass(), "failureMessage", "");
        setField(term473, term473.getClass(), "test", null);
        Class<? extends Object> term832 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term831 = ((Class) term832).getDeclaredField((String) "ERROR");
        ((Field) term831).setAccessible(true);
        Object enum2 = ((Field) term831).get((Object) null);
        Object term476 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term476, term476.getClass(), "severity", enum2);
        setField(term476, term476.getClass(), "description", "");
        setField(term476, term476.getClass(), "failureMessage", "");
        setField(term476, term476.getClass(), "test", null);
        ArrayList term463 = new ArrayList();
        ((ArrayList) term463).add(term465);
        ((ArrayList) term463).add(term470);
        ((ArrayList) term463).add(term473);
        ((ArrayList) term463).add(term476);
        term462 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.GenericValidator"));
        setField(term462, term462.getClass(), "rules", term463);
        term483 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.GenericValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term483;
        callMethod(klass, "validate", argTypes, term462, args);
    }

};


