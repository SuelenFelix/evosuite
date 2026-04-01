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

public class Invalid_getMessage_8645619805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4443;

    public Invalid_getMessage_8645619805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4515 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term4514 = ((Class) term4515).getDeclaredField((String) "WARNING");
        ((Field) term4514).setAccessible(true);
        Object enum6 = ((Field) term4514).get((Object) null);
        term4443 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term4456 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term4443, term4443.getClass(), "message", "AijpHYOFuy");
        setField(term4456, term4456.getClass(), "severity", enum6);
        setField(term4456, term4456.getClass(), "description", "SbAoxhfrkn");
        setField(term4456, term4456.getClass(), "failureMessage", "kuTXqwMtDB");
        setField(term4456, term4456.getClass(), "test", null);
        setField(term4443, term4443.getClass(), "rule", term4456);
        setField(term4443, term4443.getClass(), "details", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term4443, args);
    }

};


