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

public class Film_getId_3570279172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4017;

    public Film_getId_3570279172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4018 = new Integer(-507387516);
        Integer term4050 = new Integer(-1970452551);
        Integer term4067 = new Integer(-1896376975);
        Object term4066 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4066, term4066.getClass(), "id", term4067);
        setField(term4066, term4066.getClass(), "name", "");
        Integer term4071 = new Integer(729658803);
        Object term4070 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4070, term4070.getClass(), "id", term4071);
        setField(term4070, term4070.getClass(), "name", "");
        Integer term4075 = new Integer(114754804);
        Object term4074 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4074, term4074.getClass(), "id", term4075);
        setField(term4074, term4074.getClass(), "name", "");
        Integer term4079 = new Integer(1687361082);
        Object term4078 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4078, term4078.getClass(), "id", term4079);
        setField(term4078, term4078.getClass(), "name", "");
        Integer term4083 = new Integer(584893196);
        Object term4082 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4082, term4082.getClass(), "id", term4083);
        setField(term4082, term4082.getClass(), "name", "");
        ArrayList term4064 = new ArrayList();
        ((ArrayList) term4064).add(term4066);
        ((ArrayList) term4064).add(term4070);
        ((ArrayList) term4064).add(term4074);
        ((ArrayList) term4064).add(term4078);
        ((ArrayList) term4064).add(term4082);
        term4017 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4049 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4017, term4017.getClass(), "id", term4018);
        setField(term4017, term4017.getClass(), "name", "RbVQXSpxXy");
        setField(term4017, term4017.getClass(), "description", "YpJbIgJWWv");
        setIntField(term4044, term4044.getClass(), "year", 2017);
        setShortField(term4044, term4044.getClass(), "month", (short) 3);
        setShortField(term4044, term4044.getClass(), "day", (short) 5);
        setField(term4017, term4017.getClass(), "releaseDate", term4044);
        setIntField(term4017, term4017.getClass(), "duration", 1442160736);
        setField(term4049, term4049.getClass(), "id", term4050);
        setField(term4049, term4049.getClass(), "name", "JppkknKVOw");
        setField(term4017, term4017.getClass(), "mpa", term4049);
        setField(term4017, term4017.getClass(), "genres", term4064);
        setIntField(term4017, term4017.getClass(), "rate", 1114000454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4017, args);
    }

};


