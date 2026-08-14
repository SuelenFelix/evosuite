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

public class ContactInformation_setAddress_173587002311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;

    public ContactInformation_setAddress_173587002311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("de.rieckpil.courses.ContactInformation"));
        setField(term995, term995.getClass(), "email", null);
        setField(term995, term995.getClass(), "address", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.ContactInformation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.rieckpil.courses.Address");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAddress", argTypes, term995, args);
    }

};


