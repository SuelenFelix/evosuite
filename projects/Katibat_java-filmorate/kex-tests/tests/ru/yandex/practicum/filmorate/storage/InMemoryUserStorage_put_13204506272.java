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

public class InMemoryUserStorage_put_13204506272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term332;

    public InMemoryUserStorage_put_13204506272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term327 = new HashMap();
        term326 = newInstance(Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage"));
        setField(term326, term326.getClass(), "users", term327);
        Long term333 = new Long(5270370404989704783L);
        term332 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term371 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term332, term332.getClass(), "id", term333);
        setField(term332, term332.getClass(), "email", "HyxfbSQYBe");
        setField(term332, term332.getClass(), "login", "pCTimMblYc");
        setField(term332, term332.getClass(), "name", "hNxWaHcfhY");
        setIntField(term371, term371.getClass(), "year", 2020);
        setShortField(term371, term371.getClass(), "month", (short) 11);
        setShortField(term371, term371.getClass(), "day", (short) 22);
        setField(term332, term332.getClass(), "birthday", term371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.storage.InMemoryUserStorage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Object[] args = new Object[1];
        args[0] = term332;
        callMethod(klass, "put", argTypes, term326, args);
    }

};


