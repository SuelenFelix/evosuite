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

public class Film_getDuration_19736487649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2636;

    public Film_getDuration_19736487649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2669 = new HashMap();
        Set<Object> term2701 =  ((Map) term2669).keySet();
        HashSet term2668 = new HashSet((Collection<? extends Object>) term2701);
        HashMap term2675 = new HashMap();
        Set<Object> term2702 =  ((Map) term2675).keySet();
        HashSet term2674 = new HashSet((Collection<? extends Object>) term2702);
        term2636 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term2661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2666 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term2636, term2636.getClass(), "name", "BjugTaMcxJ");
        setField(term2636, term2636.getClass(), "description", "vGiuZVPJNH");
        setIntField(term2661, term2661.getClass(), "year", 2020);
        setShortField(term2661, term2661.getClass(), "month", (short) 8);
        setShortField(term2661, term2661.getClass(), "day", (short) 14);
        setField(term2636, term2636.getClass(), "releaseDate", term2661);
        setLongField(term2636, term2636.getClass(), "duration", 463622836963501975L);
        setField(term2666, term2666.getClass(), "name", null);
        setIntField(term2666, term2666.getClass(), "id", 0);
        setField(term2636, term2636.getClass(), "mpa", term2666);
        setField(term2636, term2636.getClass(), "genres", term2668);
        setField(term2636, term2636.getClass(), "likedUsers", term2674);
        setIntField(term2636, term2636.getClass(), "id", -894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term2636, args);
    }

};


