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

public class User_setLastName_36564063010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public User_setLastName_36564063010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1291 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1341 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1291, term1291.getClass(), "id", -4920224193275732920L);
        setField(term1291, term1291.getClass(), "email", "ffYhPOzlUs");
        setField(term1291, term1291.getClass(), "firstName", "MLqYREekMl");
        setField(term1291, term1291.getClass(), "lastName", "ytSBIKXogI");
        setField(term1291, term1291.getClass(), "password", "nHXjMycHlU");
        setLongField(term1341, term1341.getClass(), "id", 8428634514691209827L);
        setField(term1341, term1341.getClass(), "place", "ieCtQFdkii");
        setField(term1341, term1341.getClass(), "description", "dEnhdmILtU");
        setDoubleField(term1341, term1341.getClass(), "longitude", 0.6436713023569729);
        setDoubleField(term1341, term1341.getClass(), "latitude", 0.7332741045694002);
        setField(term1291, term1291.getClass(), "location", term1341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "setLastName", argTypes, term1291, args);
    }

};


