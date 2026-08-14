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
import java.lang.Object;
import java.lang.Integer;

public class ContactInformation_getAddress_13061626074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;

    public ContactInformation_getAddress_13061626074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term843 = new Integer(1585847225);
        term805 = newInstance(Class.forName("de.rieckpil.courses.ContactInformation"));
        Object term818 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term805, term805.getClass(), "email", "kuTXqwMtDB");
        setField(term818, term818.getClass(), "country", "Ghbwtircqb");
        setField(term818, term818.getClass(), "city", "xrwlQZdwCp");
        setField(term818, term818.getClass(), "postalCode", term843);
        setField(term805, term805.getClass(), "address", term818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.ContactInformation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term805, args);
    }

};


