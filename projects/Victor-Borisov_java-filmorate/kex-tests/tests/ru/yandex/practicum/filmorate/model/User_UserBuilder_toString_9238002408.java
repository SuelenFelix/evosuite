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

public class User_UserBuilder_toString_9238002408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2443;

    public User_UserBuilder_toString_9238002408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2444 = new Integer(1324040357);
        term2443 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2482 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2443, term2443.getClass(), "id", term2444);
        setField(term2443, term2443.getClass(), "email", "jiKYgYHqIS");
        setField(term2443, term2443.getClass(), "login", "DfISiziTgG");
        setField(term2443, term2443.getClass(), "name", "XqgfKFvPSD");
        setIntField(term2482, term2482.getClass(), "year", 2025);
        setShortField(term2482, term2482.getClass(), "month", (short) 4);
        setShortField(term2482, term2482.getClass(), "day", (short) 8);
        setField(term2443, term2443.getClass(), "birthday", term2482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2443, args);
    }

};


