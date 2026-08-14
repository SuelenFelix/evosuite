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

public class User_getPassword_14652978484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1530;

    public User_getPassword_14652978484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1530 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1580 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1530, term1530.getClass(), "id", -7672528020740371001L);
        setField(term1530, term1530.getClass(), "email", "hoicvmsovO");
        setField(term1530, term1530.getClass(), "firstName", "eqJfYWRaEL");
        setField(term1530, term1530.getClass(), "lastName", "fhkbdRViHi");
        setField(term1530, term1530.getClass(), "password", "uWHnvSvaPl");
        setLongField(term1580, term1580.getClass(), "id", -4502405999831680926L);
        setField(term1580, term1580.getClass(), "place", "kBdSllIBVz");
        setField(term1580, term1580.getClass(), "description", "TJmVBGfTML");
        setDoubleField(term1580, term1580.getClass(), "longitude", 0.6588948704887806);
        setDoubleField(term1580, term1580.getClass(), "latitude", 0.6397214730945112);
        setField(term1530, term1530.getClass(), "location", term1580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1530, args);
    }

};


