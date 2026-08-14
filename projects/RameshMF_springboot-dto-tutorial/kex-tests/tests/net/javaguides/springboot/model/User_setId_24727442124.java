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
import java.lang.Long;

public class User_setId_24727442124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2499;
     Object term2501;

    public User_setId_24727442124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2499 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        setLongField(term2499, term2499.getClass(), "id", 0L);
        setField(term2499, term2499.getClass(), "email", null);
        setField(term2499, term2499.getClass(), "firstName", null);
        setField(term2499, term2499.getClass(), "lastName", null);
        setField(term2499, term2499.getClass(), "password", null);
        setField(term2499, term2499.getClass(), "location", null);
        term2501 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2501;
        callMethod(klass, "setId", argTypes, term2499, args);
    }

};


