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
import java.lang.Integer;
import java.lang.Object;

public class User_getEmail_16302390503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670;

    public User_getEmail_16302390503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term671 = new Integer(1484323161);
        term670 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term709 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term670, term670.getClass(), "id", term671);
        setField(term670, term670.getClass(), "email", "flxyYxBRtu");
        setField(term670, term670.getClass(), "login", "OclPbYPkcH");
        setField(term670, term670.getClass(), "name", "IoAlmYsBwc");
        setIntField(term709, term709.getClass(), "year", 2021);
        setShortField(term709, term709.getClass(), "month", (short) 1);
        setShortField(term709, term709.getClass(), "day", (short) 18);
        setField(term670, term670.getClass(), "birthday", term709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term670, args);
    }

};


