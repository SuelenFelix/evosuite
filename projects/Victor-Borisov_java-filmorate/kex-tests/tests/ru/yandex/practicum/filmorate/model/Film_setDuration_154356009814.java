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

public class Film_setDuration_154356009814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5227;
     Object term5291;

    public Film_setDuration_154356009814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5228 = new Integer(-282881827);
        Integer term5260 = new Integer(-1183353915);
        Integer term5277 = new Integer(-420030135);
        Object term5276 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5276, term5276.getClass(), "id", term5277);
        setField(term5276, term5276.getClass(), "name", "");
        Integer term5281 = new Integer(267763294);
        Object term5280 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5280, term5280.getClass(), "id", term5281);
        setField(term5280, term5280.getClass(), "name", "");
        Integer term5285 = new Integer(-1497710478);
        Object term5284 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term5284, term5284.getClass(), "id", term5285);
        setField(term5284, term5284.getClass(), "name", "");
        ArrayList term5274 = new ArrayList();
        ((ArrayList) term5274).add(term5276);
        ((ArrayList) term5274).add(term5280);
        ((ArrayList) term5274).add(term5284);
        term5227 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5259 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term5227, term5227.getClass(), "id", term5228);
        setField(term5227, term5227.getClass(), "name", "SOrEHbcbmn");
        setField(term5227, term5227.getClass(), "description", "bnsyeQXFdu");
        setIntField(term5254, term5254.getClass(), "year", 2025);
        setShortField(term5254, term5254.getClass(), "month", (short) 11);
        setShortField(term5254, term5254.getClass(), "day", (short) 1);
        setField(term5227, term5227.getClass(), "releaseDate", term5254);
        setIntField(term5227, term5227.getClass(), "duration", 1532716628);
        setField(term5259, term5259.getClass(), "id", term5260);
        setField(term5259, term5259.getClass(), "name", "BwtdjiefJn");
        setField(term5227, term5227.getClass(), "mpa", term5259);
        setField(term5227, term5227.getClass(), "genres", term5274);
        setIntField(term5227, term5227.getClass(), "rate", -1801760683);
        term5291 = new Integer(1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5291;
        callMethod(klass, "setDuration", argTypes, term5227, args);
    }

};


