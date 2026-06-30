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
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class FilmService_update_4064421833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term121;

    public FilmService_update_4064421833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService"));
        setField(term120, term120.getClass(), "filmStorage", null);
        setField(term120, term120.getClass(), "filmLikeStorage", null);
        setField(term120, term120.getClass(), "genreStorage", null);
        Integer term122 = new Integer(1725571209);
        Integer term154 = new Integer(-522618178);
        Integer term171 = new Integer(1134449235);
        Object term170 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term170, term170.getClass(), "id", term171);
        setField(term170, term170.getClass(), "name", "");
        Integer term175 = new Integer(-883034806);
        Object term174 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term174, term174.getClass(), "id", term175);
        setField(term174, term174.getClass(), "name", "");
        Integer term179 = new Integer(1585847225);
        Object term178 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term178, term178.getClass(), "id", term179);
        setField(term178, term178.getClass(), "name", "");
        Integer term183 = new Integer(597278769);
        Object term182 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term182, term182.getClass(), "id", term183);
        setField(term182, term182.getClass(), "name", "");
        ArrayList term168 = new ArrayList();
        ((ArrayList) term168).add(term170);
        ((ArrayList) term168).add(term174);
        ((ArrayList) term168).add(term178);
        ((ArrayList) term168).add(term182);
        term121 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term121, term121.getClass(), "id", term122);
        setField(term121, term121.getClass(), "name", "hRNSzYYIrc");
        setField(term121, term121.getClass(), "description", "RMFIsYGgne");
        setIntField(term148, term148.getClass(), "year", 2016);
        setShortField(term148, term148.getClass(), "month", (short) 11);
        setShortField(term148, term148.getClass(), "day", (short) 29);
        setField(term121, term121.getClass(), "releaseDate", term148);
        setIntField(term121, term121.getClass(), "duration", 1484323161);
        setField(term153, term153.getClass(), "id", term154);
        setField(term153, term153.getClass(), "name", "NRdvgJlhkX");
        setField(term121, term121.getClass(), "mpa", term153);
        setField(term121, term121.getClass(), "genres", term168);
        setIntField(term121, term121.getClass(), "rate", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term121;
        callMethod(klass, "update", argTypes, term120, args);
    }

};


