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

public class User_setPassword_12104459211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1451;

    public User_setPassword_12104459211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1451 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1501 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1451, term1451.getClass(), "id", -2585684163342970173L);
        setField(term1451, term1451.getClass(), "email", "eqJfYWRaEL");
        setField(term1451, term1451.getClass(), "firstName", "fhkbdRViHi");
        setField(term1451, term1451.getClass(), "lastName", "uWHnvSvaPl");
        setField(term1451, term1451.getClass(), "password", "kBdSllIBVz");
        setLongField(term1501, term1501.getClass(), "id", 8059786003080744426L);
        setField(term1501, term1501.getClass(), "place", "TJmVBGfTML");
        setField(term1501, term1501.getClass(), "description", "tPlsykYBqO");
        setDoubleField(term1501, term1501.getClass(), "longitude", 0.4569171842750229);
        setDoubleField(term1501, term1501.getClass(), "latitude", 0.8598297828918529);
        setField(term1451, term1451.getClass(), "location", term1501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        callMethod(klass, "setPassword", argTypes, term1451, args);
    }

};


