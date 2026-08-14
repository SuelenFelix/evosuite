package ru.yandex.practicum.filmorate.service.film;

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
import static ru.yandex.practicum.filmorate.service.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmServiceImpl_create_8939242181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public FilmServiceImpl_create_8939242181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmServiceImpl"));
        setField(term1, term1.getClass(), "filmStorageDao", null);
        setField(term1, term1.getClass(), "dataStorageDao", null);
        HashMap term47 = new HashMap();
        Set<Object> term83 =  ((Map) term47).keySet();
        HashSet term46 = new HashSet((Collection<? extends Object>) term83);
        term2 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term27 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "description", "sjlJAEtRrb");
        setIntField(term27, term27.getClass(), "year", 2012);
        setShortField(term27, term27.getClass(), "month", (short) 8);
        setShortField(term27, term27.getClass(), "day", (short) 25);
        setField(term2, term2.getClass(), "releaseDate", term27);
        setLongField(term2, term2.getClass(), "duration", 2442117782898005296L);
        setField(term32, term32.getClass(), "name", "MuLcgQHgqz");
        setLongField(term32, term32.getClass(), "id", 6375119433582206027L);
        setField(term2, term2.getClass(), "mpa", term32);
        setField(term2, term2.getClass(), "genres", term46);
        setLongField(term2, term2.getClass(), "id", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "create", argTypes, term1, args);
    }

};


