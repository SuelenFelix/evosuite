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

public class User_getLocation_13995840205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1668;

    public User_getLocation_13995840205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1668 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1718 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1668, term1668.getClass(), "id", 1967728129628047933L);
        setField(term1668, term1668.getClass(), "email", "tPlsykYBqO");
        setField(term1668, term1668.getClass(), "firstName", "bLPjGVBhlX");
        setField(term1668, term1668.getClass(), "lastName", "whBvTVIIlC");
        setField(term1668, term1668.getClass(), "password", "IgRJUzaCwW");
        setLongField(term1718, term1718.getClass(), "id", 2120084523938730454L);
        setField(term1718, term1718.getClass(), "place", "JUmudUmaaV");
        setField(term1718, term1718.getClass(), "description", "KoyGrUJeJW");
        setDoubleField(term1718, term1718.getClass(), "longitude", 0.25937345430928016);
        setDoubleField(term1718, term1718.getClass(), "latitude", 0.5873228247510078);
        setField(term1668, term1668.getClass(), "location", term1718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term1668, args);
    }

};


