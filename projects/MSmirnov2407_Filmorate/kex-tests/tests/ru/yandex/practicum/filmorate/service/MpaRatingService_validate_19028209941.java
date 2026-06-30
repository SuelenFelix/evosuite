package ru.yandex.practicum.filmorate.service;

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
import static ru.yandex.practicum.filmorate.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MpaRatingService_validate_19028209941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public MpaRatingService_validate_19028209941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.yandex.practicum.filmorate.service.MpaRatingService"));
        setField(term1, term1.getClass(), "storage", null);
        term2 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setIntField(term2, term2.getClass(), "id", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.service.MpaRatingService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.MpaRating");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "validate", argTypes, term1, args);
    }

};


