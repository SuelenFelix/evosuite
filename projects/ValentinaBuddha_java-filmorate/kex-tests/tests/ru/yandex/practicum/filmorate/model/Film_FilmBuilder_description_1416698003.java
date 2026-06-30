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

public class Film_FilmBuilder_description_1416698003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;

    public Film_FilmBuilder_description_1416698003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2477 = new Integer(-244121226);
        Integer term2507 = new Integer(-203030934);
        term2476 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2509 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2476, term2476.getClass(), "id", term2477);
        setField(term2476, term2476.getClass(), "name", "BKLfkLiZTH");
        setField(term2476, term2476.getClass(), "description", "SPpkrGcPRr");
        setIntField(term2503, term2503.getClass(), "year", 2021);
        setShortField(term2503, term2503.getClass(), "month", (short) 9);
        setShortField(term2503, term2503.getClass(), "day", (short) 6);
        setField(term2476, term2476.getClass(), "releaseDate", term2503);
        setField(term2476, term2476.getClass(), "duration", term2507);
        setIntField(term2509, term2509.getClass(), "id", -2068769794);
        setField(term2509, term2509.getClass(), "name", "sEccwbJKYE");
        setField(term2476, term2476.getClass(), "mpa", term2509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "description", argTypes, term2476, args);
    }

};


