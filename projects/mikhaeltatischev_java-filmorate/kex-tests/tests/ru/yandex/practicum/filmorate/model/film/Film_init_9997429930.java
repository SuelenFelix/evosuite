package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class Film_init_9997429930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term27;
     Object term31;
     Object term33;

    public Film_init_9997429930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term27 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term27, term27.getClass(), "year", 2012);
        setShortField(term27, term27.getClass(), "month", (short) 8);
        setShortField(term27, term27.getClass(), "day", (short) 25);
        term31 = new Integer(568599855);
        Integer term34 = new Integer(1162663216);
        term33 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term33, term33.getClass(), "id", term34);
        setField(term33, term33.getClass(), "name", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa");
        Object[] args = new Object[6];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = "sjlJAEtRrb";
        args[3] = term27;
        args[4] = term31;
        args[5] = term33;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


