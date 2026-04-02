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

public class Film_getMpa_20404313457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792;

    public Film_getMpa_20404313457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3793 = new Long(3892018155439224435L);
        Integer term3823 = new Integer(-1685132342);
        term3792 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3825 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3839 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3840 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3841 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3842 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3844 = newInstance(Class.forName("java.lang.Object"));
        Object term3845 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3792, term3792.getClass(), "id", term3793);
        setField(term3792, term3792.getClass(), "name", "iikZEapDlu");
        setField(term3792, term3792.getClass(), "description", "nhoHrZfnIN");
        setIntField(term3819, term3819.getClass(), "year", 2014);
        setShortField(term3819, term3819.getClass(), "month", (short) 7);
        setShortField(term3819, term3819.getClass(), "day", (short) 13);
        setField(term3792, term3792.getClass(), "releaseDate", term3819);
        setField(term3792, term3792.getClass(), "duration", term3823);
        setIntField(term3825, term3825.getClass(), "id", -1034506028);
        setField(term3825, term3825.getClass(), "name", "ZkMALXpEAZ");
        setField(term3792, term3792.getClass(), "mpa", term3825);
        setField(term3840, term3840.getClass(), "comparator", null);
        setIntField(term3842, term3842.getClass(), "id", -1263114719);
        setField(term3842, term3842.getClass(), "name", null);
        setField(term3841, term3841.getClass(), "key", term3842);
        setField(term3841, term3841.getClass(), "value", term3844);
        setField(term3841, term3841.getClass(), "left", null);
        setField(term3845, term3845.getClass(), "key", null);
        setField(term3845, term3845.getClass(), "value", term3844);
        setField(term3845, term3845.getClass(), "left", null);
        setField(term3845, term3845.getClass(), "right", null);
        setField(term3845, term3845.getClass(), "parent", term3841);
        setBooleanField(term3845, term3845.getClass(), "color", false);
        setField(term3841, term3841.getClass(), "right", term3845);
        setField(term3841, term3841.getClass(), "parent", null);
        setBooleanField(term3841, term3841.getClass(), "color", true);
        setField(term3840, term3840.getClass(), "root", term3841);
        setIntField(term3840, term3840.getClass(), "size", 2);
        setIntField(term3840, term3840.getClass(), "modCount", 2);
        setField(term3840, term3840.getClass(), "entrySet", null);
        setField(term3840, term3840.getClass(), "navigableKeySet", null);
        setField(term3840, term3840.getClass(), "descendingMap", null);
        setField(term3840, term3840.getClass(), "keySet", null);
        setField(term3840, term3840.getClass(), "values", null);
        setField(term3839, term3839.getClass(), "m", term3840);
        setField(term3792, term3792.getClass(), "genres", term3839);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMpa", argTypes, term3792, args);
    }

};


