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

public class User_getLastName_19519830703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;

    public User_getLastName_19519830703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1392 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1442 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1392, term1392.getClass(), "id", 2486810210675247493L);
        setField(term1392, term1392.getClass(), "email", "ffYhPOzlUs");
        setField(term1392, term1392.getClass(), "firstName", "MLqYREekMl");
        setField(term1392, term1392.getClass(), "lastName", "ytSBIKXogI");
        setField(term1392, term1392.getClass(), "password", "nHXjMycHlU");
        setLongField(term1442, term1442.getClass(), "id", 7009926388951271268L);
        setField(term1442, term1442.getClass(), "place", "ieCtQFdkii");
        setField(term1442, term1442.getClass(), "description", "dEnhdmILtU");
        setDoubleField(term1442, term1442.getClass(), "longitude", 0.22651340641904605);
        setDoubleField(term1442, term1442.getClass(), "latitude", 0.8878841294187743);
        setField(term1392, term1392.getClass(), "location", term1442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1392, args);
    }

};


