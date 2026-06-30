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

public class Film_hashCode_124247198124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7856;

    public Film_hashCode_124247198124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7914 = new HashMap();
        Set<Object> term8005 =  ((Map) term7914).keySet();
        HashSet term7913 = new HashSet((Collection<? extends Object>) term8005);
        HashMap term7931 = new HashMap();
        Set<Object> term8006 =  ((Map) term7931).keySet();
        HashSet term7930 = new HashSet((Collection<? extends Object>) term8006);
        term7856 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term7882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7887 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term7856, term7856.getClass(), "id", -8085190702504231560L);
        setField(term7856, term7856.getClass(), "name", "GNEmuHPNcU");
        setField(term7856, term7856.getClass(), "description", "IoSfuKDFRe");
        setIntField(term7882, term7882.getClass(), "year", 2016);
        setShortField(term7882, term7882.getClass(), "month", (short) 6);
        setShortField(term7882, term7882.getClass(), "day", (short) 15);
        setField(term7856, term7856.getClass(), "releaseDate", term7882);
        setIntField(term7856, term7856.getClass(), "duration", -1899301124);
        setIntField(term7887, term7887.getClass(), "id", -1882480155);
        setField(term7887, term7887.getClass(), "name", "AWYyZiNfsm");
        setField(term7887, term7887.getClass(), "description", "ITRRYiuDwH");
        setField(term7856, term7856.getClass(), "mpa", term7887);
        setField(term7856, term7856.getClass(), "genres", term7913);
        setField(term7856, term7856.getClass(), "likes", term7930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7856, args);
    }

};


