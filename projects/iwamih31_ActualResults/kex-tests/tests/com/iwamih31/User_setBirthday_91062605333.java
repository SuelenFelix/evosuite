package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setBirthday_91062605333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3241;

    public User_setBirthday_91062605333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3241 = newInstance(Class.forName("com.iwamih31.User"));
        setField(term3241, term3241.getClass(), "id", null);
        setField(term3241, term3241.getClass(), "room", null);
        setField(term3241, term3241.getClass(), "name", null);
        setField(term3241, term3241.getClass(), "birthday", null);
        setField(term3241, term3241.getClass(), "level", null);
        setField(term3241, term3241.getClass(), "move_in", null);
        setField(term3241, term3241.getClass(), "use", null);
        setField(term3241, term3241.getClass(), "note", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBirthday", argTypes, term3241, args);
    }

};


