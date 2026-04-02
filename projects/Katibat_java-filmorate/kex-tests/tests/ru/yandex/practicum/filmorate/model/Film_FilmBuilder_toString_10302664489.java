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

public class Film_FilmBuilder_toString_10302664489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3191;

    public Film_FilmBuilder_toString_10302664489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3192 = new Long(-2850532706972744550L);
        Integer term3222 = new Integer(-1339778481);
        term3191 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term3218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3224 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term3238 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3239 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3240 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3241 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term3243 = newInstance(Class.forName("java.lang.Object"));
        Object term3244 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3246 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3191, term3191.getClass(), "id", term3192);
        setField(term3191, term3191.getClass(), "name", "hMmaoREuCK");
        setField(term3191, term3191.getClass(), "description", "VeDtgDzGAN");
        setIntField(term3218, term3218.getClass(), "year", 2022);
        setShortField(term3218, term3218.getClass(), "month", (short) 8);
        setShortField(term3218, term3218.getClass(), "day", (short) 8);
        setField(term3191, term3191.getClass(), "releaseDate", term3218);
        setField(term3191, term3191.getClass(), "duration", term3222);
        setIntField(term3224, term3224.getClass(), "id", 933028652);
        setField(term3224, term3224.getClass(), "name", "aWYOWZFyaX");
        setField(term3191, term3191.getClass(), "mpa", term3224);
        setField(term3239, term3239.getClass(), "comparator", null);
        setIntField(term3241, term3241.getClass(), "id", 962840079);
        setField(term3241, term3241.getClass(), "name", null);
        setField(term3240, term3240.getClass(), "key", term3241);
        setField(term3240, term3240.getClass(), "value", term3243);
        setField(term3244, term3244.getClass(), "key", null);
        setField(term3244, term3244.getClass(), "value", term3243);
        setField(term3244, term3244.getClass(), "left", null);
        setField(term3244, term3244.getClass(), "right", null);
        setField(term3244, term3244.getClass(), "parent", term3240);
        setBooleanField(term3244, term3244.getClass(), "color", true);
        setField(term3240, term3240.getClass(), "left", term3244);
        setField(term3246, term3246.getClass(), "key", null);
        setField(term3246, term3246.getClass(), "value", term3243);
        setField(term3246, term3246.getClass(), "left", null);
        setField(term3246, term3246.getClass(), "right", null);
        setField(term3246, term3246.getClass(), "parent", term3240);
        setBooleanField(term3246, term3246.getClass(), "color", false);
        setField(term3240, term3240.getClass(), "right", term3246);
        setField(term3240, term3240.getClass(), "parent", null);
        setBooleanField(term3240, term3240.getClass(), "color", true);
        setField(term3239, term3239.getClass(), "root", term3240);
        setIntField(term3239, term3239.getClass(), "size", 9);
        setIntField(term3239, term3239.getClass(), "modCount", 9);
        setField(term3239, term3239.getClass(), "entrySet", null);
        setField(term3239, term3239.getClass(), "navigableKeySet", null);
        setField(term3239, term3239.getClass(), "descendingMap", null);
        setField(term3239, term3239.getClass(), "keySet", null);
        setField(term3239, term3239.getClass(), "values", null);
        setField(term3238, term3238.getClass(), "m", term3239);
        setField(term3191, term3191.getClass(), "genres", term3238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3191, args);
    }

};


