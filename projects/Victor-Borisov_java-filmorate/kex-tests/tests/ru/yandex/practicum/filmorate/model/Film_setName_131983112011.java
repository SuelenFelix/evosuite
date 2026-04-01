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

public class Film_setName_131983112011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4885;

    public Film_setName_131983112011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4886 = new Integer(-1254072822);
        Integer term4918 = new Integer(-1111249833);
        Integer term4935 = new Integer(-1692331299);
        Object term4934 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4934, term4934.getClass(), "id", term4935);
        setField(term4934, term4934.getClass(), "name", "");
        Integer term4939 = new Integer(479531250);
        Object term4938 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4938, term4938.getClass(), "id", term4939);
        setField(term4938, term4938.getClass(), "name", "");
        ArrayList term4932 = new ArrayList();
        ((ArrayList) term4932).add(term4934);
        ((ArrayList) term4932).add(term4938);
        term4885 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4917 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4885, term4885.getClass(), "id", term4886);
        setField(term4885, term4885.getClass(), "name", "PqtVXXZMqK");
        setField(term4885, term4885.getClass(), "description", "rYbtIDVdnd");
        setIntField(term4912, term4912.getClass(), "year", 2021);
        setShortField(term4912, term4912.getClass(), "month", (short) 9);
        setShortField(term4912, term4912.getClass(), "day", (short) 30);
        setField(term4885, term4885.getClass(), "releaseDate", term4912);
        setIntField(term4885, term4885.getClass(), "duration", -1210583429);
        setField(term4917, term4917.getClass(), "id", term4918);
        setField(term4917, term4917.getClass(), "name", "UKAReurpHG");
        setField(term4885, term4885.getClass(), "mpa", term4917);
        setField(term4885, term4885.getClass(), "genres", term4932);
        setIntField(term4885, term4885.getClass(), "rate", -663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOuMEpOQAg";
        callMethod(klass, "setName", argTypes, term4885, args);
    }

};


