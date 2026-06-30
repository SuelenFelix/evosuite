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
import java.util.ArrayList;
import java.util.LinkedList;

public class Film_FilmBuilder_genres_15361054277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;
     Object term3302;

    public Film_FilmBuilder_genres_15361054277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3243 = new Integer(1474524152);
        Integer term3275 = new Integer(568954359);
        Integer term3292 = new Integer(53410913);
        Object term3291 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3291, term3291.getClass(), "id", term3292);
        setField(term3291, term3291.getClass(), "name", "");
        Integer term3296 = new Integer(-375014958);
        Object term3295 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3295, term3295.getClass(), "id", term3296);
        setField(term3295, term3295.getClass(), "name", "");
        ArrayList term3289 = new ArrayList();
        ((ArrayList) term3289).add(term3291);
        ((ArrayList) term3289).add(term3295);
        term3242 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3274 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3242, term3242.getClass(), "id", term3243);
        setField(term3242, term3242.getClass(), "name", "yVMkkQhvmN");
        setField(term3242, term3242.getClass(), "description", "mvrkADEgpp");
        setIntField(term3269, term3269.getClass(), "year", 2023);
        setShortField(term3269, term3269.getClass(), "month", (short) 8);
        setShortField(term3269, term3269.getClass(), "day", (short) 12);
        setField(term3242, term3242.getClass(), "releaseDate", term3269);
        setIntField(term3242, term3242.getClass(), "duration", 1193880199);
        setField(term3274, term3274.getClass(), "id", term3275);
        setField(term3274, term3274.getClass(), "name", "pXOkjyeIRb");
        setField(term3242, term3242.getClass(), "mpa", term3274);
        setField(term3242, term3242.getClass(), "genres", term3289);
        setIntField(term3242, term3242.getClass(), "rate", -1087774327);
        Integer term3306 = new Integer(1107176718);
        Object term3305 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3305, term3305.getClass(), "id", term3306);
        setField(term3305, term3305.getClass(), "name", "UfQtPRyWRC");
        Integer term3322 = new Integer(480137250);
        Object term3321 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3321, term3321.getClass(), "id", term3322);
        setField(term3321, term3321.getClass(), "name", "");
        Integer term3327 = new Integer(-341152642);
        Object term3326 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3326, term3326.getClass(), "id", term3327);
        setField(term3326, term3326.getClass(), "name", null);
        term3302 = new LinkedList();
        ((LinkedList) term3302).add(term3305);
        ((LinkedList) term3302).add(term3321);
        ((LinkedList) term3302).add(term3326);
        ((LinkedList) term3302).add((Object)null);
        ((LinkedList) term3302).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3302;
        callMethod(klass, "genres", argTypes, term3242, args);
    }

};


