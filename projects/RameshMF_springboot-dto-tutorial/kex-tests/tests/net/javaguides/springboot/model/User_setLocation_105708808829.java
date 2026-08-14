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

public class User_setLocation_105708808829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2511;

    public User_setLocation_105708808829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2511 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        setLongField(term2511, term2511.getClass(), "id", 0L);
        setField(term2511, term2511.getClass(), "email", null);
        setField(term2511, term2511.getClass(), "firstName", null);
        setField(term2511, term2511.getClass(), "lastName", null);
        setField(term2511, term2511.getClass(), "password", null);
        setField(term2511, term2511.getClass(), "location", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.javaguides.springboot.model.Location");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLocation", argTypes, term2511, args);
    }

};


