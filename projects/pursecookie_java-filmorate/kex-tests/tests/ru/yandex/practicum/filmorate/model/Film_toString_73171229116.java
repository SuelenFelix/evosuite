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

public class Film_toString_73171229116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3154;

    public Film_toString_73171229116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3199 = new HashMap();
        Set<Object> term3235 =  ((Map) term3199).keySet();
        HashSet term3198 = new HashSet((Collection<? extends Object>) term3235);
        term3154 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term3179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3184 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setField(term3154, term3154.getClass(), "name", "XOiDvlDhdc");
        setField(term3154, term3154.getClass(), "description", "AdxvLJhNLe");
        setIntField(term3179, term3179.getClass(), "year", 2012);
        setShortField(term3179, term3179.getClass(), "month", (short) 4);
        setShortField(term3179, term3179.getClass(), "day", (short) 19);
        setField(term3154, term3154.getClass(), "releaseDate", term3179);
        setLongField(term3154, term3154.getClass(), "duration", 8166095254618543564L);
        setField(term3184, term3184.getClass(), "name", "lHfTrWKMPk");
        setLongField(term3184, term3184.getClass(), "id", -4598158870068953328L);
        setField(term3154, term3154.getClass(), "mpa", term3184);
        setField(term3154, term3154.getClass(), "genres", term3198);
        setLongField(term3154, term3154.getClass(), "id", 138235087558060686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3154, args);
    }

};


