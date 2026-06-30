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

public class User_getEmail_16302390504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825;

    public User_getEmail_16302390504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term826 = new Long(-4365849114644724155L);
        term825 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term864 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term825, term825.getClass(), "id", term826);
        setField(term825, term825.getClass(), "email", "OWDIEULEFu");
        setField(term825, term825.getClass(), "login", "dWRymuLBtr");
        setField(term825, term825.getClass(), "name", "AijpHYOFuy");
        setIntField(term864, term864.getClass(), "year", 2020);
        setShortField(term864, term864.getClass(), "month", (short) 11);
        setShortField(term864, term864.getClass(), "day", (short) 22);
        setField(term825, term825.getClass(), "birthday", term864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term825, args);
    }

};


