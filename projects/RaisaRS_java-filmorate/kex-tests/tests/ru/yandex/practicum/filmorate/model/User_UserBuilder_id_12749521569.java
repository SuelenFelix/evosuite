package ru.yandex.practicum.filmorate.model;

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
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class User_UserBuilder_id_12749521569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3370;
     Object term3372;

    public User_UserBuilder_id_12749521569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3370 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        setLongField(term3370, term3370.getClass(), "id", 0L);
        setField(term3370, term3370.getClass(), "email", null);
        setField(term3370, term3370.getClass(), "login", null);
        setField(term3370, term3370.getClass(), "name", null);
        setField(term3370, term3370.getClass(), "birthday", null);
        term3372 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3372;
        callMethod(klass, "id", argTypes, term3370, args);
    }

};


