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

public class Film_setMpa_38255925017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3222;
     Object term3267;

    public Film_setMpa_38255925017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3255 = new HashMap();
        Set<Object> term3301 =  ((Map) term3255).keySet();
        HashSet term3254 = new HashSet((Collection<? extends Object>) term3301);
        HashMap term3261 = new HashMap();
        Set<Object> term3302 =  ((Map) term3261).keySet();
        HashSet term3260 = new HashSet((Collection<? extends Object>) term3302);
        term3222 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3252 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3222, term3222.getClass(), "name", "WXMWFDGcLB");
        setField(term3222, term3222.getClass(), "description", "wKWbJssZuG");
        setIntField(term3247, term3247.getClass(), "year", 2020);
        setShortField(term3247, term3247.getClass(), "month", (short) 10);
        setShortField(term3247, term3247.getClass(), "day", (short) 28);
        setField(term3222, term3222.getClass(), "releaseDate", term3247);
        setLongField(term3222, term3222.getClass(), "duration", -5963439350418910964L);
        setField(term3252, term3252.getClass(), "name", null);
        setIntField(term3252, term3252.getClass(), "id", 0);
        setField(term3222, term3222.getClass(), "mpa", term3252);
        setField(term3222, term3222.getClass(), "genres", term3254);
        setField(term3222, term3222.getClass(), "likedUsers", term3260);
        setIntField(term3222, term3222.getClass(), "id", -663691365);
        term3267 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3267, term3267.getClass(), "name", "NzBMMhkhpT");
        setIntField(term3267, term3267.getClass(), "id", 339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.yandex.practicum.filmorate.model.MpaRating");
        Object[] args = new Object[1];
        args[0] = term3267;
        callMethod(klass, "setMpa", argTypes, term3222, args);
    }

};


