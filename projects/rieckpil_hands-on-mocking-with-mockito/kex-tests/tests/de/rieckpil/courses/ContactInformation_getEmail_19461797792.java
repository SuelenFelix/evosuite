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

public class ContactInformation_getEmail_19461797792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term643;

    public ContactInformation_getEmail_19461797792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term681 = new Integer(1134449235);
        term643 = newInstance(Class.forName("de.rieckpil.courses.ContactInformation"));
        Object term656 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term643, term643.getClass(), "email", "OclPbYPkcH");
        setField(term656, term656.getClass(), "country", "IoAlmYsBwc");
        setField(term656, term656.getClass(), "city", "TEParAifyi");
        setField(term656, term656.getClass(), "postalCode", term681);
        setField(term643, term643.getClass(), "address", term656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.ContactInformation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term643, args);
    }

};


