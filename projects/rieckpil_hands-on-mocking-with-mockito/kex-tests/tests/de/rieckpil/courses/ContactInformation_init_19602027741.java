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

public class ContactInformation_init_19602027741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;

    public ContactInformation_init_19602027741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term611 = new Integer(-522618178);
        term586 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term586, term586.getClass(), "country", "vrQLuWIDJX");
        setField(term586, term586.getClass(), "city", "flxyYxBRtu");
        setField(term586, term586.getClass(), "postalCode", term611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.ContactInformation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("de.rieckpil.courses.Address");
        Object[] args = new Object[2];
        args[0] = "BYqFIqCKAV";
        args[1] = term586;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


