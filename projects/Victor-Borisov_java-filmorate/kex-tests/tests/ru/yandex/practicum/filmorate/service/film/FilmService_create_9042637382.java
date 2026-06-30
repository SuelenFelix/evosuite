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

public class FilmService_create_9042637382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term18;

    public FilmService_create_9042637382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService"));
        setField(term17, term17.getClass(), "filmStorage", null);
        setField(term17, term17.getClass(), "filmLikeStorage", null);
        setField(term17, term17.getClass(), "genreStorage", null);
        Integer term19 = new Integer(391863371);
        Integer term51 = new Integer(-1922583790);
        Integer term68 = new Integer(-616727354);
        Object term67 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term67, term67.getClass(), "id", term68);
        setField(term67, term67.getClass(), "name", "");
        Integer term72 = new Integer(-1955890973);
        Object term71 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term71, term71.getClass(), "id", term72);
        setField(term71, term71.getClass(), "name", "");
        Integer term76 = new Integer(-2038273078);
        Object term75 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term75, term75.getClass(), "id", term76);
        setField(term75, term75.getClass(), "name", "");
        Integer term80 = new Integer(1227103734);
        Object term79 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term79, term79.getClass(), "id", term80);
        setField(term79, term79.getClass(), "name", "");
        Integer term84 = new Integer(-1339778481);
        Object term83 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term83, term83.getClass(), "id", term84);
        setField(term83, term83.getClass(), "name", "");
        ArrayList term65 = new ArrayList();
        ((ArrayList) term65).add(term67);
        ((ArrayList) term65).add(term71);
        ((ArrayList) term65).add(term75);
        ((ArrayList) term65).add(term79);
        ((ArrayList) term65).add(term83);
        term18 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term45 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term18, term18.getClass(), "id", term19);
        setField(term18, term18.getClass(), "name", "PAEBtnZtTD");
        setField(term18, term18.getClass(), "description", "sjlJAEtRrb");
        setIntField(term45, term45.getClass(), "year", 2012);
        setShortField(term45, term45.getClass(), "month", (short) 8);
        setShortField(term45, term45.getClass(), "day", (short) 25);
        setField(term18, term18.getClass(), "releaseDate", term45);
        setIntField(term18, term18.getClass(), "duration", 568599855);
        setField(term50, term50.getClass(), "id", term51);
        setField(term50, term50.getClass(), "name", "MuLcgQHgqz");
        setField(term18, term18.getClass(), "mpa", term50);
        setField(term18, term18.getClass(), "genres", term65);
        setIntField(term18, term18.getClass(), "rate", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.film.FilmService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Object[] args = new Object[1];
        args[0] = term18;
        callMethod(klass, "create", argTypes, term17, args);
    }

};


