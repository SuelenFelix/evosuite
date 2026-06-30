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
import java.lang.Long;

public class Film_setDuration_154355910616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3153;
     Object term3198;

    public Film_setDuration_154355910616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3186 = new HashMap();
        Set<Object> term3220 =  ((Map) term3186).keySet();
        HashSet term3185 = new HashSet((Collection<? extends Object>) term3220);
        HashMap term3192 = new HashMap();
        Set<Object> term3221 =  ((Map) term3192).keySet();
        HashSet term3191 = new HashSet((Collection<? extends Object>) term3221);
        term3153 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3183 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.MpaRating"));
        setField(term3153, term3153.getClass(), "name", "GZdcJyZntS");
        setField(term3153, term3153.getClass(), "description", "OIHoJeysUi");
        setIntField(term3178, term3178.getClass(), "year", 2027);
        setShortField(term3178, term3178.getClass(), "month", (short) 8);
        setShortField(term3178, term3178.getClass(), "day", (short) 22);
        setField(term3153, term3153.getClass(), "releaseDate", term3178);
        setLongField(term3153, term3153.getClass(), "duration", 682356318767179819L);
        setField(term3183, term3183.getClass(), "name", null);
        setIntField(term3183, term3183.getClass(), "id", 0);
        setField(term3153, term3153.getClass(), "mpa", term3183);
        setField(term3153, term3153.getClass(), "genres", term3185);
        setField(term3153, term3153.getClass(), "likedUsers", term3191);
        setIntField(term3153, term3153.getClass(), "id", -1210583429);
        term3198 = new Long(-7291743527973326814L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3198;
        callMethod(klass, "setDuration", argTypes, term3153, args);
    }

};


