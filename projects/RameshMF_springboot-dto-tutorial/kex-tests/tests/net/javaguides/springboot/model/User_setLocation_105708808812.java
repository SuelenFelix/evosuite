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

public class User_setLocation_105708808812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1611;
     Object term1689;

    public User_setLocation_105708808812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1611 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1661 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1611, term1611.getClass(), "id", -4365849114644724155L);
        setField(term1611, term1611.getClass(), "email", "whBvTVIIlC");
        setField(term1611, term1611.getClass(), "firstName", "IgRJUzaCwW");
        setField(term1611, term1611.getClass(), "lastName", "JUmudUmaaV");
        setField(term1611, term1611.getClass(), "password", "KoyGrUJeJW");
        setLongField(term1661, term1661.getClass(), "id", 2486810210675247493L);
        setField(term1661, term1661.getClass(), "place", "HqBOwkVqjD");
        setField(term1661, term1661.getClass(), "description", "MAcUBcBckh");
        setDoubleField(term1661, term1661.getClass(), "longitude", 0.43692187681405226);
        setDoubleField(term1661, term1661.getClass(), "latitude", 0.7633268466829064);
        setField(term1611, term1611.getClass(), "location", term1661);
        term1689 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1689, term1689.getClass(), "id", 7009926388951271268L);
        setField(term1689, term1689.getClass(), "place", "oVgzLbrsFr");
        setField(term1689, term1689.getClass(), "description", "vQVyKLdtaz");
        setDoubleField(term1689, term1689.getClass(), "longitude", 0.13481025392611334);
        setDoubleField(term1689, term1689.getClass(), "latitude", 0.3800088629986428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.javaguides.springboot.model.Location");
        Object[] args = new Object[1];
        args[0] = term1689;
        callMethod(klass, "setLocation", argTypes, term1611, args);
    }

};


