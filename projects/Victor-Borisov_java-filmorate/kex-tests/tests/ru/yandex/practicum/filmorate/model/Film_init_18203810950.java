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
import java.util.LinkedList;

public class Film_init_18203810950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3935;
     Object term3961;
     Object term3965;
     Object term3967;
     Object term3982;
     Object term3985;

    public Film_init_18203810950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3935 = new Integer(991356662);
        term3961 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3961, term3961.getClass(), "year", 2011);
        setShortField(term3961, term3961.getClass(), "month", (short) 5);
        setShortField(term3961, term3961.getClass(), "day", (short) 4);
        term3965 = new Integer(1090617576);
        Integer term3968 = new Integer(-506958186);
        term3967 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3967, term3967.getClass(), "id", term3968);
        setField(term3967, term3967.getClass(), "name", "ekxGuOYIwi");
        term3982 = new LinkedList();
        term3985 = new Integer(-1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term3935;
        args[1] = "VGizxZnyHX";
        args[2] = "kVEZMHmRtR";
        args[3] = term3961;
        args[4] = term3965;
        args[5] = term3967;
        args[6] = term3982;
        args[7] = term3985;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


