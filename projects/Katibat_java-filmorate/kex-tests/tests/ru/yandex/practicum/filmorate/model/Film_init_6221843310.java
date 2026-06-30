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

public class Film_init_6221843310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314;
     Object term3318;
     Object term3320;

    public Film_init_6221843310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3314, term3314.getClass(), "year", 2029);
        setShortField(term3314, term3314.getClass(), "month", (short) 6);
        setShortField(term3314, term3314.getClass(), "day", (short) 22);
        term3318 = new Integer(1725571209);
        term3320 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term3320, term3320.getClass(), "id", -478195677);
        setField(term3320, term3320.getClass(), "name", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[5];
        args[0] = "rLHAoqXgPh";
        args[1] = "zUlRdimJtU";
        args[2] = term3314;
        args[3] = term3318;
        args[4] = term3320;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


