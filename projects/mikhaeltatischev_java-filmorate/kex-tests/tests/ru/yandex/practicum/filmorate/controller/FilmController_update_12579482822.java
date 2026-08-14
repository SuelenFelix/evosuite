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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FilmController_update_12579482822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term256;

    public FilmController_update_12579482822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("ru.yandex.practicum.filmorate.controller.FilmController"));
        setField(term255, term255.getClass(), "filmService", null);
        Long term257 = new Long(-4920224193275732920L);
        Integer term287 = new Integer(1484323161);
        Integer term290 = new Integer(391863371);
        HashMap term305 = new HashMap();
        Set<Object> term364 =  ((Map) term305).keySet();
        HashSet term304 = new HashSet((Collection<? extends Object>) term364);
        HashMap term318 = new HashMap();
        Set<Object> term365 =  ((Map) term318).keySet();
        HashSet term317 = new HashSet((Collection<? extends Object>) term365);
        Integer term332 = new Integer(-2038273078);
        term256 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term256, term256.getClass(), "id", term257);
        setField(term256, term256.getClass(), "name", "SzjVpOQTyS");
        setField(term256, term256.getClass(), "description", "MjGYSRKTNF");
        setIntField(term283, term283.getClass(), "year", 2021);
        setShortField(term283, term283.getClass(), "month", (short) 1);
        setShortField(term283, term283.getClass(), "day", (short) 18);
        setField(term256, term256.getClass(), "releaseDate", term283);
        setField(term256, term256.getClass(), "duration", term287);
        setField(term289, term289.getClass(), "id", term290);
        setField(term289, term289.getClass(), "name", "hRNSzYYIrc");
        setField(term256, term256.getClass(), "mpa", term289);
        setField(term256, term256.getClass(), "genres", term304);
        setField(term256, term256.getClass(), "likes", term317);
        setField(term256, term256.getClass(), "rate", term332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.controller.FilmController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Object[] args = new Object[1];
        args[0] = term256;
        callMethod(klass, "update", argTypes, term255, args);
    }

};


