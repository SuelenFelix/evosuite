package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_equals_108974267213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1797;
     Object term1875;

    public User_equals_108974267213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1797 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1847 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1797, term1797.getClass(), "id", -7672528020740371001L);
        setField(term1797, term1797.getClass(), "email", "OWKQODBLzb");
        setField(term1797, term1797.getClass(), "firstName", "wGmYcqUkgE");
        setField(term1797, term1797.getClass(), "lastName", "idgaQsnJpQ");
        setField(term1797, term1797.getClass(), "password", "VgZnGoIFwQ");
        setLongField(term1847, term1847.getClass(), "id", -4502405999831680926L);
        setField(term1847, term1847.getClass(), "place", "jUbSRrkrYZ");
        setField(term1847, term1847.getClass(), "description", "bWWfajKbEX");
        setDoubleField(term1847, term1847.getClass(), "longitude", 0.5840714198152577);
        setDoubleField(term1847, term1847.getClass(), "latitude", 0.7559240768573477);
        setField(term1797, term1797.getClass(), "location", term1847);
        term1875 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1875;
        callMethod(klass, "equals", argTypes, term1797, args);
    }

};


