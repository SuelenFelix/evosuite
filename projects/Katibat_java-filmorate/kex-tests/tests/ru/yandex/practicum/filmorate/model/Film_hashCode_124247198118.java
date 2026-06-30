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

public class Film_hashCode_124247198118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4852;

    public Film_hashCode_124247198118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4853 = new Long(-6723783499250797216L);
        Integer term4883 = new Integer(-1275173084);
        term4852 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4885 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term4899 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4900 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4901 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4902 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term4904 = newInstance(Class.forName("java.lang.Object"));
        Object term4905 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4907 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4852, term4852.getClass(), "id", term4853);
        setField(term4852, term4852.getClass(), "name", "NBrvVzvQHe");
        setField(term4852, term4852.getClass(), "description", "FjOiNAfBOc");
        setIntField(term4879, term4879.getClass(), "year", 2028);
        setShortField(term4879, term4879.getClass(), "month", (short) 9);
        setShortField(term4879, term4879.getClass(), "day", (short) 30);
        setField(term4852, term4852.getClass(), "releaseDate", term4879);
        setField(term4852, term4852.getClass(), "duration", term4883);
        setIntField(term4885, term4885.getClass(), "id", -1388471422);
        setField(term4885, term4885.getClass(), "name", "iCCsaLHohG");
        setField(term4852, term4852.getClass(), "mpa", term4885);
        setField(term4900, term4900.getClass(), "comparator", null);
        setIntField(term4902, term4902.getClass(), "id", 2098647989);
        setField(term4902, term4902.getClass(), "name", null);
        setField(term4901, term4901.getClass(), "key", term4902);
        setField(term4901, term4901.getClass(), "value", term4904);
        setField(term4905, term4905.getClass(), "key", null);
        setField(term4905, term4905.getClass(), "value", term4904);
        setField(term4905, term4905.getClass(), "left", null);
        setField(term4905, term4905.getClass(), "right", null);
        setField(term4905, term4905.getClass(), "parent", term4901);
        setBooleanField(term4905, term4905.getClass(), "color", true);
        setField(term4901, term4901.getClass(), "left", term4905);
        setField(term4907, term4907.getClass(), "key", null);
        setField(term4907, term4907.getClass(), "value", term4904);
        setField(term4907, term4907.getClass(), "left", null);
        setField(term4907, term4907.getClass(), "right", null);
        setField(term4907, term4907.getClass(), "parent", term4901);
        setBooleanField(term4907, term4907.getClass(), "color", true);
        setField(term4901, term4901.getClass(), "right", term4907);
        setField(term4901, term4901.getClass(), "parent", null);
        setBooleanField(term4901, term4901.getClass(), "color", true);
        setField(term4900, term4900.getClass(), "root", term4901);
        setIntField(term4900, term4900.getClass(), "size", 5);
        setIntField(term4900, term4900.getClass(), "modCount", 5);
        setField(term4900, term4900.getClass(), "entrySet", null);
        setField(term4900, term4900.getClass(), "navigableKeySet", null);
        setField(term4900, term4900.getClass(), "descendingMap", null);
        setField(term4900, term4900.getClass(), "keySet", null);
        setField(term4900, term4900.getClass(), "values", null);
        setField(term4899, term4899.getClass(), "m", term4900);
        setField(term4852, term4852.getClass(), "genres", term4899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4852, args);
    }

};


