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
import java.lang.Object;

public class Film_FilmBuilder_name_17631249532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3485;

    public Film_FilmBuilder_name_17631249532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3485 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3516 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term3485, term3485.getClass(), "id", -2068172595987555756L);
        setField(term3485, term3485.getClass(), "name", "AdxvLJhNLe");
        setField(term3485, term3485.getClass(), "description", "lHfTrWKMPk");
        setIntField(term3511, term3511.getClass(), "year", 2012);
        setShortField(term3511, term3511.getClass(), "month", (short) 2);
        setShortField(term3511, term3511.getClass(), "day", (short) 19);
        setField(term3485, term3485.getClass(), "releaseDate", term3511);
        setIntField(term3485, term3485.getClass(), "duration", -244121226);
        setIntField(term3516, term3516.getClass(), "id", -203030934);
        setField(term3516, term3516.getClass(), "name", "JDaAnsVTGV");
        setField(term3516, term3516.getClass(), "description", "mLUZFTfjle");
        setField(term3485, term3485.getClass(), "mpa", term3516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xIeFjkHkOe";
        callMethod(klass, "name", argTypes, term3485, args);
    }

};


