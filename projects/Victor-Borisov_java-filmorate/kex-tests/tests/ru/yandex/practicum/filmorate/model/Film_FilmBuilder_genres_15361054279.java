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

public class Film_FilmBuilder_genres_15361054279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3250;
     Object term3310;

    public Film_FilmBuilder_genres_15361054279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3251 = new Integer(1474524152);
        Integer term3283 = new Integer(568954359);
        Integer term3300 = new Integer(53410913);
        Object term3299 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3299, term3299.getClass(), "id", term3300);
        setField(term3299, term3299.getClass(), "name", "");
        Integer term3304 = new Integer(-375014958);
        Object term3303 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3303, term3303.getClass(), "id", term3304);
        setField(term3303, term3303.getClass(), "name", "");
        ArrayList term3297 = new ArrayList();
        ((ArrayList) term3297).add(term3299);
        ((ArrayList) term3297).add(term3303);
        term3250 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3282 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3250, term3250.getClass(), "id", term3251);
        setField(term3250, term3250.getClass(), "name", "yVMkkQhvmN");
        setField(term3250, term3250.getClass(), "description", "mvrkADEgpp");
        setIntField(term3277, term3277.getClass(), "year", 2023);
        setShortField(term3277, term3277.getClass(), "month", (short) 8);
        setShortField(term3277, term3277.getClass(), "day", (short) 12);
        setField(term3250, term3250.getClass(), "releaseDate", term3277);
        setIntField(term3250, term3250.getClass(), "duration", 1193880199);
        setField(term3282, term3282.getClass(), "id", term3283);
        setField(term3282, term3282.getClass(), "name", "pXOkjyeIRb");
        setField(term3250, term3250.getClass(), "mpa", term3282);
        setField(term3250, term3250.getClass(), "genres", term3297);
        setIntField(term3250, term3250.getClass(), "rate", -1087774327);
        Integer term3314 = new Integer(1107176718);
        Object term3313 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3313, term3313.getClass(), "id", term3314);
        setField(term3313, term3313.getClass(), "name", "UfQtPRyWRC");
        Integer term3330 = new Integer(480137250);
        Object term3329 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3329, term3329.getClass(), "id", term3330);
        setField(term3329, term3329.getClass(), "name", "");
        Integer term3335 = new Integer(-341152642);
        Object term3334 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3334, term3334.getClass(), "id", term3335);
        setField(term3334, term3334.getClass(), "name", null);
        term3310 = new LinkedList();
        ((LinkedList) term3310).add(term3313);
        ((LinkedList) term3310).add(term3329);
        ((LinkedList) term3310).add(term3334);
        ((LinkedList) term3310).add((Object)null);
        ((LinkedList) term3310).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3310;
        callMethod(klass, "genres", argTypes, term3250, args);
    }

};


