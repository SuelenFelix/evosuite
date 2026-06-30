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

public class Mpa_MpaBuilder_id_13803037401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8241;
     Object term8267;

    public Mpa_MpaBuilder_id_13803037401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8241 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa$MpaBuilder"));
        setIntField(term8241, term8241.getClass(), "id", 806595993);
        setField(term8241, term8241.getClass(), "name", "qUtkFGMNUV");
        setField(term8241, term8241.getClass(), "description", "mGRiYhnMcR");
        term8267 = new Integer(548228925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Mpa$MpaBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8267;
        callMethod(klass, "id", argTypes, term8241, args);
    }

};


