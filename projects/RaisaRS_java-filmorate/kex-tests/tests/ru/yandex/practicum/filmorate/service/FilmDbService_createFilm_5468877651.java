package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmDbService_createFilm_5468877651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term18;

    public FilmDbService_createFilm_5468877651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService"));
        setField(term17, term17.getClass(), "filmStorage", null);
        setField(term17, term17.getClass(), "userService", null);
        setField(term17, term17.getClass(), "genreStorage", null);
        HashMap term76 = new HashMap();
        Set<Object> term149 =  ((Map) term76).keySet();
        HashSet term75 = new HashSet((Collection<? extends Object>) term149);
        HashMap term91 = new HashMap();
        Set<Object> term150 =  ((Map) term91).keySet();
        HashSet term90 = new HashSet((Collection<? extends Object>) term150);
        term18 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term44 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term18, term18.getClass(), "id", 2442117782898005296L);
        setField(term18, term18.getClass(), "name", "PAEBtnZtTD");
        setField(term18, term18.getClass(), "description", "sjlJAEtRrb");
        setIntField(term44, term44.getClass(), "year", 2012);
        setShortField(term44, term44.getClass(), "month", (short) 8);
        setShortField(term44, term44.getClass(), "day", (short) 25);
        setField(term18, term18.getClass(), "releaseDate", term44);
        setIntField(term18, term18.getClass(), "duration", 1484323161);
        setIntField(term49, term49.getClass(), "id", 391863371);
        setField(term49, term49.getClass(), "name", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "description", "xxtlPwDYFs");
        setField(term18, term18.getClass(), "mpa", term49);
        setField(term18, term18.getClass(), "genres", term75);
        setField(term18, term18.getClass(), "likes", term90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.FilmDbService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term18;
        callMethod(klass, "createFilm", argTypes, term17, args);
    }

};


