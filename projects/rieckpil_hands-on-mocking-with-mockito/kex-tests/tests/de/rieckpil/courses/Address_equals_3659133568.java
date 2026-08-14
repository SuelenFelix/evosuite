package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Address_equals_3659133568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term498;

    public Address_equals_3659133568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term496 = new Integer(-1339778481);
        term471 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term471, term471.getClass(), "country", "hNxWaHcfhY");
        setField(term471, term471.getClass(), "city", "RkybSrpybU");
        setField(term471, term471.getClass(), "postalCode", term496);
        term498 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.Address");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term498;
        callMethod(klass, "equals", argTypes, term471, args);
    }

};


