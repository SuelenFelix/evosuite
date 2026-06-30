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

public class Film_getDescription_15924047394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4221;

    public Film_getDescription_15924047394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4222 = new Integer(-1667990367);
        Integer term4254 = new Integer(-1214628358);
        Integer term4271 = new Integer(1102721075);
        Object term4270 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4270, term4270.getClass(), "id", term4271);
        setField(term4270, term4270.getClass(), "name", "");
        Integer term4275 = new Integer(-426764678);
        Object term4274 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        setField(term4274, term4274.getClass(), "id", term4275);
        setField(term4274, term4274.getClass(), "name", "");
        ArrayList term4268 = new ArrayList();
        ((ArrayList) term4268).add(term4270);
        ((ArrayList) term4268).add(term4274);
        term4221 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4253 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term4221, term4221.getClass(), "id", term4222);
        setField(term4221, term4221.getClass(), "name", "iikZEapDlu");
        setField(term4221, term4221.getClass(), "description", "nhoHrZfnIN");
        setIntField(term4248, term4248.getClass(), "year", 2020);
        setShortField(term4248, term4248.getClass(), "month", (short) 7);
        setShortField(term4248, term4248.getClass(), "day", (short) 23);
        setField(term4221, term4221.getClass(), "releaseDate", term4248);
        setIntField(term4221, term4221.getClass(), "duration", -1845499264);
        setField(term4253, term4253.getClass(), "id", term4254);
        setField(term4253, term4253.getClass(), "name", "ZkMALXpEAZ");
        setField(term4221, term4221.getClass(), "mpa", term4253);
        setField(term4221, term4221.getClass(), "genres", term4268);
        setIntField(term4221, term4221.getClass(), "rate", -505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term4221, args);
    }

};


