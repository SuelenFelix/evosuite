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
import java.lang.Long;
import java.lang.Object;

public class User_getName_3859012951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;

    public User_getName_3859012951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term680 = new Long(-2585684163342970173L);
        term679 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term718 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term679, term679.getClass(), "id", term680);
        setField(term679, term679.getClass(), "email", "BYqFIqCKAV");
        setField(term679, term679.getClass(), "login", "vrQLuWIDJX");
        setField(term679, term679.getClass(), "name", "flxyYxBRtu");
        setIntField(term718, term718.getClass(), "year", 2016);
        setShortField(term718, term718.getClass(), "month", (short) 11);
        setShortField(term718, term718.getClass(), "day", (short) 29);
        setField(term679, term679.getClass(), "birthday", term718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term679, args);
    }

};


