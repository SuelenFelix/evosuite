package ru.yandex.practicum.filmorate;

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
import static ru.yandex.practicum.filmorate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FilmorateApplication_main_16113605771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7183;

    public FilmorateApplication_main_16113605771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7183 = (Object[]) newArray("java.lang.String", 7);
        setElement(term7183, 0, "qUtkFGMNUV");
        setElement(term7183, 1, "mGRiYhnMcR");
        setElement(term7183, 2, "NFlvfJCVPO");
        setElement(term7183, 3, "KarbTXFmUU");
        setElement(term7183, 4, "jiUSjqwSIQ");
        setElement(term7183, 5, "MgLCedQfoj");
        setElement(term7183, 6, "zgKiINdgNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.FilmorateApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7183;
        callMethod(klass, "main", argTypes, null, args);
    }

};


