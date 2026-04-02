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

public class User_UserBuilder_name_666370954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2055;

    public User_UserBuilder_name_666370954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2056 = new Long(4178434741742309755L);
        term2055 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2094 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2055, term2055.getClass(), "id", term2056);
        setField(term2055, term2055.getClass(), "email", "idgaQsnJpQ");
        setField(term2055, term2055.getClass(), "login", "VgZnGoIFwQ");
        setField(term2055, term2055.getClass(), "name", "jUbSRrkrYZ");
        setIntField(term2094, term2094.getClass(), "year", 2024);
        setShortField(term2094, term2094.getClass(), "month", (short) 8);
        setShortField(term2094, term2094.getClass(), "day", (short) 31);
        setField(term2055, term2055.getClass(), "birthday", term2094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "name", argTypes, term2055, args);
    }

};


