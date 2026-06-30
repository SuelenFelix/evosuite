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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_canEqual_179964601123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7706;
     Object term7813;

    public Film_canEqual_179964601123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7764 = new HashMap();
        Set<Object> term7854 =  ((Map) term7764).keySet();
        HashSet term7763 = new HashSet((Collection<? extends Object>) term7854);
        HashMap term7783 = new HashMap();
        Set<Object> term7855 =  ((Map) term7783).keySet();
        HashSet term7782 = new HashSet((Collection<? extends Object>) term7855);
        term7706 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term7732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7737 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term7706, term7706.getClass(), "id", 2135754395358000892L);
        setField(term7706, term7706.getClass(), "name", "qFGKIJjlmV");
        setField(term7706, term7706.getClass(), "description", "IHqvyhMtuM");
        setIntField(term7732, term7732.getClass(), "year", 2014);
        setShortField(term7732, term7732.getClass(), "month", (short) 3);
        setShortField(term7732, term7732.getClass(), "day", (short) 22);
        setField(term7706, term7706.getClass(), "releaseDate", term7732);
        setIntField(term7706, term7706.getClass(), "duration", -506958186);
        setIntField(term7737, term7737.getClass(), "id", -507387516);
        setField(term7737, term7737.getClass(), "name", "dAldIGYAXV");
        setField(term7737, term7737.getClass(), "description", "mLwibAPEsa");
        setField(term7706, term7706.getClass(), "mpa", term7737);
        setField(term7706, term7706.getClass(), "genres", term7763);
        setField(term7706, term7706.getClass(), "likes", term7782);
        term7813 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7813;
        callMethod(klass, "canEqual", argTypes, term7706, args);
    }

};


