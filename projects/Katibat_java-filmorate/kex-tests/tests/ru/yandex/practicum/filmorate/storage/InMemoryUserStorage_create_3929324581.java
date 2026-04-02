package ru.yandex.practicum.filmorate.storage;

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
import static ru.yandex.practicum.filmorate.storage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Object;

public class InMemoryUserStorage_create_3929324581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term253;

    public InMemoryUserStorage_create_3929324581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term248 = new HashMap();
        term247 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage"));
        setField(term247, term247.getClass(), "users", term248);
        Long term254 = new Long(-8400487765614892086L);
        term253 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term292 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term253, term253.getClass(), "id", term254);
        setField(term253, term253.getClass(), "email", "aJlieCFVtF");
        setField(term253, term253.getClass(), "login", "ZiaGIbnzTs");
        setField(term253, term253.getClass(), "name", "tbcdzjIfER");
        setIntField(term292, term292.getClass(), "year", 2021);
        setShortField(term292, term292.getClass(), "month", (short) 1);
        setShortField(term292, term292.getClass(), "day", (short) 18);
        setField(term253, term253.getClass(), "birthday", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term253;
        callMethod(klass, "create", argTypes, term247, args);
    }

};


