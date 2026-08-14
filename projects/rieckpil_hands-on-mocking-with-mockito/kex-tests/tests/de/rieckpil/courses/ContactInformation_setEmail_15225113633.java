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

public class ContactInformation_setEmail_15225113633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term713;

    public ContactInformation_setEmail_15225113633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term751 = new Integer(-883034806);
        term713 = newInstance(Class.forName("de.rieckpil.courses.ContactInformation"));
        Object term726 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term713, term713.getClass(), "email", "OWDIEULEFu");
        setField(term726, term726.getClass(), "country", "dWRymuLBtr");
        setField(term726, term726.getClass(), "city", "AijpHYOFuy");
        setField(term726, term726.getClass(), "postalCode", term751);
        setField(term713, term713.getClass(), "address", term726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.ContactInformation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "setEmail", argTypes, term713, args);
    }

};


