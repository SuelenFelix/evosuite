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

public class Film_FilmBuilder_duration_9763745815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656;
     Object term2703;

    public Film_FilmBuilder_duration_9763745815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2657 = new Integer(-226514366);
        Integer term2687 = new Integer(1193880199);
        term2656 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2689 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2656, term2656.getClass(), "id", term2657);
        setField(term2656, term2656.getClass(), "name", "xBsXSDjXYK");
        setField(term2656, term2656.getClass(), "description", "sEnIVFtZuQ");
        setIntField(term2683, term2683.getClass(), "year", 2012);
        setShortField(term2683, term2683.getClass(), "month", (short) 4);
        setShortField(term2683, term2683.getClass(), "day", (short) 19);
        setField(term2656, term2656.getClass(), "releaseDate", term2683);
        setField(term2656, term2656.getClass(), "duration", term2687);
        setIntField(term2689, term2689.getClass(), "id", -1007160944);
        setField(term2689, term2689.getClass(), "name", "ZVecLZMLHF");
        setField(term2656, term2656.getClass(), "mpa", term2689);
        term2703 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2703;
        callMethod(klass, "duration", argTypes, term2656, args);
    }

};


