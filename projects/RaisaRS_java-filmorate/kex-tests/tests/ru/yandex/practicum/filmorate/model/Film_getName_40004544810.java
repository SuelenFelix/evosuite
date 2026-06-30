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

public class Film_getName_40004544810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5820;

    public Film_getName_40004544810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5878 = new HashMap();
        Set<Object> term5947 =  ((Map) term5878).keySet();
        HashSet term5877 = new HashSet((Collection<? extends Object>) term5947);
        HashMap term5893 = new HashMap();
        Set<Object> term5948 =  ((Map) term5893).keySet();
        HashSet term5892 = new HashSet((Collection<? extends Object>) term5948);
        term5820 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term5846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5851 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term5820, term5820.getClass(), "id", -1983291584002806658L);
        setField(term5820, term5820.getClass(), "name", "aSkmSwTnEw");
        setField(term5820, term5820.getClass(), "description", "xvkbvaEGYd");
        setIntField(term5846, term5846.getClass(), "year", 2021);
        setShortField(term5846, term5846.getClass(), "month", (short) 9);
        setShortField(term5846, term5846.getClass(), "day", (short) 30);
        setField(term5820, term5820.getClass(), "releaseDate", term5846);
        setIntField(term5820, term5820.getClass(), "duration", 444029505);
        setIntField(term5851, term5851.getClass(), "id", -1034506028);
        setField(term5851, term5851.getClass(), "name", "HBGNxdNURv");
        setField(term5851, term5851.getClass(), "description", "mfCpTPPQQm");
        setField(term5820, term5820.getClass(), "mpa", term5851);
        setField(term5820, term5820.getClass(), "genres", term5877);
        setField(term5820, term5820.getClass(), "likes", term5892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5820, args);
    }

};


