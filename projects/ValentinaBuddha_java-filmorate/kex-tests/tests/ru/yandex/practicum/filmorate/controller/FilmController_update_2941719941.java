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
import java.lang.Integer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FilmController_update_2941719941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;
     Object term331;

    public FilmController_update_2941719941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        Object term330 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.FilmService"));
        setField(term330, term330.getClass(), "filmStorage", null);
        setField(term330, term330.getClass(), "mpaStorage", null);
        setField(term330, term330.getClass(), "genreStorage", null);
        setField(term330, term330.getClass(), "likeStorage", null);
        setField(term330, term330.getClass(), "userStorage", null);
        setField(term329, term329.getClass(), "filmService", term330);
        Integer term332 = new Integer(-1922583790);
        Integer term362 = new Integer(-616727354);
        LinkedHashMap term379 = new LinkedHashMap();
        Set<Object> term429 =  ((Map) term379).keySet();
        LinkedHashSet term378 = new LinkedHashSet((Collection<? extends Object>) term429);
        term331 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term364 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term331, term331.getClass(), "id", term332);
        setField(term331, term331.getClass(), "name", "oVcInYnLWB");
        setField(term331, term331.getClass(), "description", "aJlieCFVtF");
        setIntField(term358, term358.getClass(), "year", 2020);
        setShortField(term358, term358.getClass(), "month", (short) 11);
        setShortField(term358, term358.getClass(), "day", (short) 22);
        setField(term331, term331.getClass(), "releaseDate", term358);
        setField(term331, term331.getClass(), "duration", term362);
        setIntField(term364, term364.getClass(), "id", -1685132342);
        setField(term364, term364.getClass(), "name", "ZiaGIbnzTs");
        setField(term331, term331.getClass(), "mpa", term364);
        setField(term331, term331.getClass(), "genres", term378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term331;
        callMethod(klass, "update", argTypes, term329, args);
    }

};


