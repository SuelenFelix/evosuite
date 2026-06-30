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

public class Film_init_10039371650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2998;
     Object term3024;
     Object term3028;
     Object term3030;

    public Film_init_10039371650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2998 = new Integer(-602026508);
        term3024 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3024, term3024.getClass(), "year", 2022);
        setShortField(term3024, term3024.getClass(), "month", (short) 8);
        setShortField(term3024, term3024.getClass(), "day", (short) 8);
        term3028 = new Integer(-157887805);
        term3030 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term3030, term3030.getClass(), "id", -244121226);
        setField(term3030, term3030.getClass(), "name", "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[6];
        args[0] = term2998;
        args[1] = "mXGCWJDOqA";
        args[2] = "dpNsDgfPso";
        args[3] = term3024;
        args[4] = term3028;
        args[5] = term3030;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


