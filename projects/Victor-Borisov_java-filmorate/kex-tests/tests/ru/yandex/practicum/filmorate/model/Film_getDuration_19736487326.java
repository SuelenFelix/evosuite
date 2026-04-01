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

public class Film_getDuration_19736487326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4405;

    public Film_getDuration_19736487326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4406 = new Integer(318591690);
        Integer term4438 = new Integer(-165587447);
        Integer term4455 = new Integer(-1347358701);
        Object term4454 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4454, term4454.getClass(), "id", term4455);
        setField(term4454, term4454.getClass(), "name", "");
        ArrayList term4452 = new ArrayList();
        ((ArrayList) term4452).add(term4454);
        term4405 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4437 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4405, term4405.getClass(), "id", term4406);
        setField(term4405, term4405.getClass(), "name", "QduALnDSVo");
        setField(term4405, term4405.getClass(), "description", "izPpKDErnQ");
        setIntField(term4432, term4432.getClass(), "year", 2014);
        setShortField(term4432, term4432.getClass(), "month", (short) 7);
        setShortField(term4432, term4432.getClass(), "day", (short) 13);
        setField(term4405, term4405.getClass(), "releaseDate", term4432);
        setIntField(term4405, term4405.getClass(), "duration", 444029505);
        setField(term4437, term4437.getClass(), "id", term4438);
        setField(term4437, term4437.getClass(), "name", "NnpwZBUTvx");
        setField(term4405, term4405.getClass(), "mpa", term4437);
        setField(term4405, term4405.getClass(), "genres", term4452);
        setIntField(term4405, term4405.getClass(), "rate", -1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term4405, args);
    }

};


