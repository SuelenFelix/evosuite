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
import java.lang.Object;

public class User_getId_11817872763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;

    public User_getId_11817872763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term753 = new Long(8059786003080744426L);
        term752 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term791 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term752, term752.getClass(), "id", term753);
        setField(term752, term752.getClass(), "email", "OclPbYPkcH");
        setField(term752, term752.getClass(), "login", "IoAlmYsBwc");
        setField(term752, term752.getClass(), "name", "TEParAifyi");
        setIntField(term791, term791.getClass(), "year", 2021);
        setShortField(term791, term791.getClass(), "month", (short) 1);
        setShortField(term791, term791.getClass(), "day", (short) 18);
        setField(term752, term752.getClass(), "birthday", term791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term752, args);
    }

};


