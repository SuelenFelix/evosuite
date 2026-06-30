package ru.yandex.practicum.filmorate.storage.film;

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
import static ru.yandex.practicum.filmorate.storage.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class FilmDbStorage_update_2876050803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;

    public FilmDbStorage_update_2876050803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term106 = new Integer(1227103734);
        Integer term138 = new Integer(-1339778481);
        Integer term155 = new Integer(1725571209);
        Object term154 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term154, term154.getClass(), "id", term155);
        setField(term154, term154.getClass(), "name", "");
        Integer term159 = new Integer(-522618178);
        Object term158 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term158, term158.getClass(), "id", term159);
        setField(term158, term158.getClass(), "name", "");
        Integer term163 = new Integer(1134449235);
        Object term162 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term162, term162.getClass(), "id", term163);
        setField(term162, term162.getClass(), "name", "");
        Integer term167 = new Integer(-883034806);
        Object term166 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term166, term166.getClass(), "id", term167);
        setField(term166, term166.getClass(), "name", "");
        ArrayList term152 = new ArrayList();
        ((ArrayList) term152).add(term154);
        ((ArrayList) term152).add(term158);
        ((ArrayList) term152).add(term162);
        ((ArrayList) term152).add(term166);
        term105 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term132 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term105, term105.getClass(), "id", term106);
        setField(term105, term105.getClass(), "name", "hRNSzYYIrc");
        setField(term105, term105.getClass(), "description", "RMFIsYGgne");
        setIntField(term132, term132.getClass(), "year", 2016);
        setShortField(term132, term132.getClass(), "month", (short) 11);
        setShortField(term132, term132.getClass(), "day", (short) 29);
        setField(term105, term105.getClass(), "releaseDate", term132);
        setIntField(term105, term105.getClass(), "duration", 1484323161);
        setField(term137, term137.getClass(), "id", term138);
        setField(term137, term137.getClass(), "name", "NRdvgJlhkX");
        setField(term105, term105.getClass(), "mpa", term137);
        setField(term105, term105.getClass(), "genres", term152);
        setIntField(term105, term105.getClass(), "rate", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.film.FilmDbStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "update", argTypes, null, args);
    }

};


