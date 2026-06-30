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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Film_setMpa_81352049514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4310;
     Object term4380;

    public Film_setMpa_81352049514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4311 = new Integer(287287233);
        Integer term4341 = new Integer(962840079);
        LinkedHashMap term4358 = new LinkedHashMap();
        Set<Object> term4424 =  ((Map) term4358).keySet();
        LinkedHashSet term4357 = new LinkedHashSet((Collection<? extends Object>) term4424);
        term4310 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4343 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4310, term4310.getClass(), "id", term4311);
        setField(term4310, term4310.getClass(), "name", "hOncybyCAH");
        setField(term4310, term4310.getClass(), "description", "QduALnDSVo");
        setIntField(term4337, term4337.getClass(), "year", 2014);
        setShortField(term4337, term4337.getClass(), "month", (short) 5);
        setShortField(term4337, term4337.getClass(), "day", (short) 21);
        setField(term4310, term4310.getClass(), "releaseDate", term4337);
        setField(term4310, term4310.getClass(), "duration", term4341);
        setIntField(term4343, term4343.getClass(), "id", -505439934);
        setField(term4343, term4343.getClass(), "name", "izPpKDErnQ");
        setField(term4310, term4310.getClass(), "mpa", term4343);
        setField(term4310, term4310.getClass(), "genres", term4357);
        term4380 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term4380, term4380.getClass(), "id", -894662986);
        setField(term4380, term4380.getClass(), "name", "CFyoseFGLF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term4380;
        callMethod(klass, "setMpa", argTypes, term4310, args);
    }

};


