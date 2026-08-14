package ru.yandex.practicum.filmorate.model.film;

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
import static ru.yandex.practicum.filmorate.model.film.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Film_toString_21367762223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656;

    public Film_toString_21367762223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2657 = new Long(2145420811068634601L);
        Integer term2687 = new Integer(11724947);
        Integer term2690 = new Integer(1953277050);
        HashMap term2705 = new HashMap();
        Set<Object> term2768 =  ((Map) term2705).keySet();
        HashSet term2704 = new HashSet((Collection<? extends Object>) term2768);
        HashMap term2718 = new HashMap();
        Set<Object> term2769 =  ((Map) term2718).keySet();
        HashSet term2717 = new HashSet((Collection<? extends Object>) term2769);
        Integer term2736 = new Integer(229204365);
        term2656 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.film.Film"));
        Object term2683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2689 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.mpa.Mpa"));
        setField(term2656, term2656.getClass(), "id", term2657);
        setField(term2656, term2656.getClass(), "name", "hMmaoREuCK");
        setField(term2656, term2656.getClass(), "description", "VeDtgDzGAN");
        setIntField(term2683, term2683.getClass(), "year", 2012);
        setShortField(term2683, term2683.getClass(), "month", (short) 9);
        setShortField(term2683, term2683.getClass(), "day", (short) 11);
        setField(term2656, term2656.getClass(), "releaseDate", term2683);
        setField(term2656, term2656.getClass(), "duration", term2687);
        setField(term2689, term2689.getClass(), "id", term2690);
        setField(term2689, term2689.getClass(), "name", "aWYOWZFyaX");
        setField(term2656, term2656.getClass(), "mpa", term2689);
        setField(term2656, term2656.getClass(), "genres", term2704);
        setField(term2656, term2656.getClass(), "likes", term2717);
        setField(term2656, term2656.getClass(), "rate", term2736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.film.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2656, args);
    }

};


