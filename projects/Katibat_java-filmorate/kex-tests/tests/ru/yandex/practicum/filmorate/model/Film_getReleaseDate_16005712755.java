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
import java.lang.Integer;

public class Film_getReleaseDate_16005712755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3625;

    public Film_getReleaseDate_16005712755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3626 = new Long(3825396310311739952L);
        Integer term3656 = new Integer(1585847225);
        term3625 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3658 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3672 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3673 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3674 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3675 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3677 = newInstance(Class.forName("java.lang.Object"));
        setField(term3625, term3625.getClass(), "id", term3626);
        setField(term3625, term3625.getClass(), "name", "tRxZafjqIx");
        setField(term3625, term3625.getClass(), "description", "DhjNLmRMCu");
        setIntField(term3652, term3652.getClass(), "year", 2020);
        setShortField(term3652, term3652.getClass(), "month", (short) 7);
        setShortField(term3652, term3652.getClass(), "day", (short) 23);
        setField(term3625, term3625.getClass(), "releaseDate", term3652);
        setField(term3625, term3625.getClass(), "duration", term3656);
        setIntField(term3658, term3658.getClass(), "id", -344842608);
        setField(term3658, term3658.getClass(), "name", "PgPzMSEjjX");
        setField(term3625, term3625.getClass(), "mpa", term3658);
        setField(term3673, term3673.getClass(), "comparator", null);
        setIntField(term3675, term3675.getClass(), "id", 941650513);
        setField(term3675, term3675.getClass(), "name", null);
        setField(term3674, term3674.getClass(), "key", term3675);
        setField(term3674, term3674.getClass(), "value", term3677);
        setField(term3674, term3674.getClass(), "left", null);
        setField(term3674, term3674.getClass(), "right", null);
        setField(term3674, term3674.getClass(), "parent", null);
        setBooleanField(term3674, term3674.getClass(), "color", true);
        setField(term3673, term3673.getClass(), "root", term3674);
        setIntField(term3673, term3673.getClass(), "size", 1);
        setIntField(term3673, term3673.getClass(), "modCount", 1);
        setField(term3673, term3673.getClass(), "entrySet", null);
        setField(term3673, term3673.getClass(), "navigableKeySet", null);
        setField(term3673, term3673.getClass(), "descendingMap", null);
        setField(term3673, term3673.getClass(), "keySet", null);
        setField(term3673, term3673.getClass(), "values", null);
        setField(term3672, term3672.getClass(), "m", term3673);
        setField(term3625, term3625.getClass(), "genres", term3672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReleaseDate", argTypes, term3625, args);
    }

};


