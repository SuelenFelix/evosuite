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

public class Film_FilmBuilder_description_1416698003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2805;

    public Film_FilmBuilder_description_1416698003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2806 = new Integer(-1347665717);
        Integer term2838 = new Integer(-1888585309);
        Integer term2855 = new Integer(683666002);
        Object term2854 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2854, term2854.getClass(), "id", term2855);
        setField(term2854, term2854.getClass(), "name", "");
        Integer term2859 = new Integer(1596213415);
        Object term2858 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2858, term2858.getClass(), "id", term2859);
        setField(term2858, term2858.getClass(), "name", "");
        Integer term2863 = new Integer(-268815336);
        Object term2862 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2862, term2862.getClass(), "id", term2863);
        setField(term2862, term2862.getClass(), "name", "");
        ArrayList term2852 = new ArrayList();
        ((ArrayList) term2852).add(term2854);
        ((ArrayList) term2852).add(term2858);
        ((ArrayList) term2852).add(term2862);
        term2805 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2837 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2805, term2805.getClass(), "id", term2806);
        setField(term2805, term2805.getClass(), "name", "RYdKCNNMBR");
        setField(term2805, term2805.getClass(), "description", "yGtHPyvYiQ");
        setIntField(term2832, term2832.getClass(), "year", 2021);
        setShortField(term2832, term2832.getClass(), "month", (short) 9);
        setShortField(term2832, term2832.getClass(), "day", (short) 6);
        setField(term2805, term2805.getClass(), "releaseDate", term2832);
        setIntField(term2805, term2805.getClass(), "duration", 1135664017);
        setField(term2837, term2837.getClass(), "id", term2838);
        setField(term2837, term2837.getClass(), "name", "MvRIxilFMJ");
        setField(term2805, term2805.getClass(), "mpa", term2837);
        setField(term2805, term2805.getClass(), "genres", term2852);
        setIntField(term2805, term2805.getClass(), "rate", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mXGCWJDOqA";
        callMethod(klass, "description", argTypes, term2805, args);
    }

};


