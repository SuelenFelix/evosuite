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

public class Film_FilmBuilder_mpa_20827505826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2878;
     Object term2938;

    public Film_FilmBuilder_mpa_20827505826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2879 = new Long(-5788180182343976541L);
        Integer term2909 = new Integer(-1955890973);
        term2878 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder"));
        Object term2905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2911 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        Object term2925 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2926 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2927 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2928 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Genre"));
        Object term2930 = newInstance(Class.forName("java.lang.Object"));
        Object term2931 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2933 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term2878, term2878.getClass(), "id", term2879);
        setField(term2878, term2878.getClass(), "name", "mLUZFTfjle");
        setField(term2878, term2878.getClass(), "description", "xIeFjkHkOe");
        setIntField(term2905, term2905.getClass(), "year", 2017);
        setShortField(term2905, term2905.getClass(), "month", (short) 6);
        setShortField(term2905, term2905.getClass(), "day", (short) 7);
        setField(term2878, term2878.getClass(), "releaseDate", term2905);
        setField(term2878, term2878.getClass(), "duration", term2909);
        setIntField(term2911, term2911.getClass(), "id", -157887805);
        setField(term2911, term2911.getClass(), "name", "SdCKLMIYnX");
        setField(term2878, term2878.getClass(), "mpa", term2911);
        setField(term2926, term2926.getClass(), "comparator", null);
        setIntField(term2928, term2928.getClass(), "id", -1016503459);
        setField(term2928, term2928.getClass(), "name", null);
        setField(term2927, term2927.getClass(), "key", term2928);
        setField(term2927, term2927.getClass(), "value", term2930);
        setField(term2931, term2931.getClass(), "key", null);
        setField(term2931, term2931.getClass(), "value", term2930);
        setField(term2931, term2931.getClass(), "left", null);
        setField(term2931, term2931.getClass(), "right", null);
        setField(term2931, term2931.getClass(), "parent", term2927);
        setBooleanField(term2931, term2931.getClass(), "color", true);
        setField(term2927, term2927.getClass(), "left", term2931);
        setField(term2933, term2933.getClass(), "key", null);
        setField(term2933, term2933.getClass(), "value", term2930);
        setField(term2933, term2933.getClass(), "left", null);
        setField(term2933, term2933.getClass(), "right", null);
        setField(term2933, term2933.getClass(), "parent", term2927);
        setBooleanField(term2933, term2933.getClass(), "color", true);
        setField(term2927, term2927.getClass(), "right", term2933);
        setField(term2927, term2927.getClass(), "parent", null);
        setBooleanField(term2927, term2927.getClass(), "color", true);
        setField(term2926, term2926.getClass(), "root", term2927);
        setIntField(term2926, term2926.getClass(), "size", 6);
        setIntField(term2926, term2926.getClass(), "modCount", 6);
        setField(term2926, term2926.getClass(), "entrySet", null);
        setField(term2926, term2926.getClass(), "navigableKeySet", null);
        setField(term2926, term2926.getClass(), "descendingMap", null);
        setField(term2926, term2926.getClass(), "keySet", null);
        setField(term2926, term2926.getClass(), "values", null);
        setField(term2925, term2925.getClass(), "m", term2926);
        setField(term2878, term2878.getClass(), "genres", term2925);
        term2938 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setIntField(term2938, term2938.getClass(), "id", 1632125673);
        setField(term2938, term2938.getClass(), "name", "wfaXBpWAUH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film$FilmBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.Mpa");
        Object[] args = new Object[1];
        args[0] = term2938;
        callMethod(klass, "mpa", argTypes, term2878, args);
    }

};


