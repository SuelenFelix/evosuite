package ru.yandex.practicum.filmorate.controller;

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
import static ru.yandex.practicum.filmorate.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmController_putFilm_18739345244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;
     Object term415;

    public FilmController_putFilm_18739345244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term414 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term414, term414.getClass(), "userStorage", null);
        setField(term414, term414.getClass(), "storage", null);
        setField(term413, term413.getClass(), "filmService", term414);
        HashMap term448 = new HashMap();
        Set<Object> term480 =  ((Map) term448).keySet();
        HashSet term447 = new HashSet((Collection<? extends Object>) term480);
        HashMap term454 = new HashMap();
        Set<Object> term481 =  ((Map) term454).keySet();
        HashSet term453 = new HashSet((Collection<? extends Object>) term481);
        term415 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term445 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term415, term415.getClass(), "name", "IoAlmYsBwc");
        setField(term415, term415.getClass(), "description", "TEParAifyi");
        setIntField(term440, term440.getClass(), "year", 2025);
        setShortField(term440, term440.getClass(), "month", (short) 4);
        setShortField(term440, term440.getClass(), "day", (short) 23);
        setField(term415, term415.getClass(), "releaseDate", term440);
        setLongField(term415, term415.getClass(), "duration", -2813493605142626659L);
        setField(term445, term445.getClass(), "name", null);
        setIntField(term445, term445.getClass(), "id", 0);
        setField(term415, term415.getClass(), "mpa", term445);
        setField(term415, term415.getClass(), "genres", term447);
        setField(term415, term415.getClass(), "likedUsers", term453);
        setIntField(term415, term415.getClass(), "id", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term415;
        callMethod(klass, "putFilm", argTypes, term413, args);
    }

};


