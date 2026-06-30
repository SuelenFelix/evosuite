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
import java.lang.Object;
import java.lang.Long;

public class Film_FilmBuilder_id_5548098921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3386;
     Object term3443;

    public Film_FilmBuilder_id_5548098921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3386 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3417 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term3386, term3386.getClass(), "id", 5907001541142728739L);
        setField(term3386, term3386.getClass(), "name", "dpNsDgfPso");
        setField(term3386, term3386.getClass(), "description", "hCWPJQKpdc");
        setIntField(term3412, term3412.getClass(), "year", 2025);
        setShortField(term3412, term3412.getClass(), "month", (short) 2);
        setShortField(term3412, term3412.getClass(), "day", (short) 13);
        setField(term3386, term3386.getClass(), "releaseDate", term3412);
        setIntField(term3386, term3386.getClass(), "duration", 865208305);
        setIntField(term3417, term3417.getClass(), "id", -1275173084);
        setField(term3417, term3417.getClass(), "name", "WzMEhMXkKx");
        setField(term3417, term3417.getClass(), "description", "XOiDvlDhdc");
        setField(term3386, term3386.getClass(), "mpa", term3417);
        term3443 = new Long(4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3443;
        callMethod(klass, "id", argTypes, term3386, args);
    }

};


