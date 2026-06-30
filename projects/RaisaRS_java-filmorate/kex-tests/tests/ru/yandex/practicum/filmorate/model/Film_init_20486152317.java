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
import java.lang.Long;
import java.lang.Integer;

public class Film_init_20486152317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5593;
     Object term5619;
     Object term5623;
     Object term5625;

    public Film_init_20486152317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5593 = new Long(5510783420697225605L);
        term5619 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term5619, term5619.getClass(), "year", 2022);
        setShortField(term5619, term5619.getClass(), "month", (short) 10);
        setShortField(term5619, term5619.getClass(), "day", (short) 18);
        term5623 = new Integer(1090617576);
        term5625 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term5625, term5625.getClass(), "id", -1547384488);
        setField(term5625, term5625.getClass(), "name", "CFyoseFGLF");
        setField(term5625, term5625.getClass(), "description", "SFqCrhEWLm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[6];
        args[0] = term5593;
        args[1] = "zcorEihhLK";
        args[2] = "GrqozDKFOk";
        args[3] = term5619;
        args[4] = term5623;
        args[5] = term5625;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


