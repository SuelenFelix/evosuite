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

public class Film_FilmBuilder_releaseDate_1450949264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2921;
     Object term2989;

    public Film_FilmBuilder_releaseDate_1450949264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2922 = new Integer(-1210583429);
        Integer term2954 = new Integer(-663691365);
        Integer term2971 = new Integer(339854490);
        Object term2970 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2970, term2970.getClass(), "id", term2971);
        setField(term2970, term2970.getClass(), "name", "");
        Integer term2975 = new Integer(-615654495);
        Object term2974 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2974, term2974.getClass(), "id", term2975);
        setField(term2974, term2974.getClass(), "name", "");
        Integer term2979 = new Integer(-1476117762);
        Object term2978 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2978, term2978.getClass(), "id", term2979);
        setField(term2978, term2978.getClass(), "name", "");
        Integer term2983 = new Integer(-341962980);
        Object term2982 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term2982, term2982.getClass(), "id", term2983);
        setField(term2982, term2982.getClass(), "name", "");
        ArrayList term2968 = new ArrayList();
        ((ArrayList) term2968).add(term2970);
        ((ArrayList) term2968).add(term2974);
        ((ArrayList) term2968).add(term2978);
        ((ArrayList) term2968).add(term2982);
        term2921 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2953 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term2921, term2921.getClass(), "id", term2922);
        setField(term2921, term2921.getClass(), "name", "dpNsDgfPso");
        setField(term2921, term2921.getClass(), "description", "hCWPJQKpdc");
        setIntField(term2948, term2948.getClass(), "year", 2025);
        setShortField(term2948, term2948.getClass(), "month", (short) 2);
        setShortField(term2948, term2948.getClass(), "day", (short) 13);
        setField(term2921, term2921.getClass(), "releaseDate", term2948);
        setIntField(term2921, term2921.getClass(), "duration", 865208305);
        setField(term2953, term2953.getClass(), "id", term2954);
        setField(term2953, term2953.getClass(), "name", "WzMEhMXkKx");
        setField(term2921, term2921.getClass(), "mpa", term2953);
        setField(term2921, term2921.getClass(), "genres", term2968);
        setIntField(term2921, term2921.getClass(), "rate", -1275173084);
        term2989 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2989, term2989.getClass(), "year", 2012);
        setShortField(term2989, term2989.getClass(), "month", (short) 2);
        setShortField(term2989, term2989.getClass(), "day", (short) 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2989;
        callMethod(klass, "releaseDate", argTypes, term2921, args);
    }

};


