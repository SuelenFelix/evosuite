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

public class User_canEqual_178550185813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1697;
     Object term1740;

    public User_canEqual_178550185813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1698 = new Integer(292681826);
        term1697 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1736 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1697, term1697.getClass(), "id", term1698);
        setField(term1697, term1697.getClass(), "email", "fhkbdRViHi");
        setField(term1697, term1697.getClass(), "login", "uWHnvSvaPl");
        setField(term1697, term1697.getClass(), "name", "kBdSllIBVz");
        setIntField(term1736, term1736.getClass(), "year", 2012);
        setShortField(term1736, term1736.getClass(), "month", (short) 10);
        setShortField(term1736, term1736.getClass(), "day", (short) 1);
        setField(term1697, term1697.getClass(), "birthday", term1736);
        term1740 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1740;
        callMethod(klass, "canEqual", argTypes, term1697, args);
    }

};


