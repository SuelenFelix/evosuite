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

public class Film_getMpa_20404313457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4491;

    public Film_getMpa_20404313457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4492 = new Integer(806595993);
        Integer term4524 = new Integer(548228925);
        ArrayList term4538 = new ArrayList();
        term4491 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4523 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4491, term4491.getClass(), "id", term4492);
        setField(term4491, term4491.getClass(), "name", "PCipZnmBOF");
        setField(term4491, term4491.getClass(), "description", "zcorEihhLK");
        setIntField(term4518, term4518.getClass(), "year", 2027);
        setShortField(term4518, term4518.getClass(), "month", (short) 10);
        setShortField(term4518, term4518.getClass(), "day", (short) 4);
        setField(term4491, term4491.getClass(), "releaseDate", term4518);
        setIntField(term4491, term4491.getClass(), "duration", -1263114719);
        setField(term4523, term4523.getClass(), "id", term4524);
        setField(term4523, term4523.getClass(), "name", "GrqozDKFOk");
        setField(term4491, term4491.getClass(), "mpa", term4523);
        setField(term4491, term4491.getClass(), "genres", term4538);
        setIntField(term4491, term4491.getClass(), "rate", -894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term4491, args);
    }

};


