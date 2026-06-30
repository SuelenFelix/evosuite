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

public class Film_FilmBuilder_duration_6734664215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3023;
     Object term3079;

    public Film_FilmBuilder_duration_6734664215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3024 = new Integer(1532716628);
        Integer term3056 = new Integer(-1801760683);
        Integer term3073 = new Integer(1141317871);
        Object term3072 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term3072, term3072.getClass(), "id", term3073);
        setField(term3072, term3072.getClass(), "name", "");
        ArrayList term3070 = new ArrayList();
        ((ArrayList) term3070).add(term3072);
        term3023 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3055 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3023, term3023.getClass(), "id", term3024);
        setField(term3023, term3023.getClass(), "name", "mLUZFTfjle");
        setField(term3023, term3023.getClass(), "description", "xIeFjkHkOe");
        setIntField(term3050, term3050.getClass(), "year", 2012);
        setShortField(term3050, term3050.getClass(), "month", (short) 4);
        setShortField(term3050, term3050.getClass(), "day", (short) 19);
        setField(term3023, term3023.getClass(), "releaseDate", term3050);
        setIntField(term3023, term3023.getClass(), "duration", -244121226);
        setField(term3055, term3055.getClass(), "id", term3056);
        setField(term3055, term3055.getClass(), "name", "SdCKLMIYnX");
        setField(term3023, term3023.getClass(), "mpa", term3055);
        setField(term3023, term3023.getClass(), "genres", term3070);
        setIntField(term3023, term3023.getClass(), "rate", -203030934);
        term3079 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3079;
        callMethod(klass, "duration", argTypes, term3023, args);
    }

};


