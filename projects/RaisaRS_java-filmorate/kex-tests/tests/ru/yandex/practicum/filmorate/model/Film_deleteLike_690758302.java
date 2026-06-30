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

public class Film_deleteLike_690758302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4834;
     Object term4939;

    public Film_deleteLike_690758302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4892 = new HashMap();
        Set<Object> term4981 =  ((Map) term4892).keySet();
        HashSet term4891 = new HashSet((Collection<? extends Object>) term4981);
        HashMap term4901 = new HashMap();
        Set<Object> term4982 =  ((Map) term4901).keySet();
        HashSet term4900 = new HashSet((Collection<? extends Object>) term4982);
        term4834 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Film"));
        Object term4860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4865 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Mpa"));
        setLongField(term4834, term4834.getClass(), "id", 682356318767179819L);
        setField(term4834, term4834.getClass(), "name", "igCAtimmYB");
        setField(term4834, term4834.getClass(), "description", "DyiXbeYIaN");
        setIntField(term4860, term4860.getClass(), "year", 2020);
        setShortField(term4860, term4860.getClass(), "month", (short) 7);
        setShortField(term4860, term4860.getClass(), "day", (short) 23);
        setField(term4834, term4834.getClass(), "releaseDate", term4860);
        setIntField(term4834, term4834.getClass(), "duration", 493620644);
        setIntField(term4865, term4865.getClass(), "id", 1328271830);
        setField(term4865, term4865.getClass(), "name", "VGizxZnyHX");
        setField(term4865, term4865.getClass(), "description", "kVEZMHmRtR");
        setField(term4834, term4834.getClass(), "mpa", term4865);
        setField(term4834, term4834.getClass(), "genres", term4891);
        setField(term4834, term4834.getClass(), "likes", term4900);
        term4939 = new Long(-7291743527973326814L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.Film");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4939;
        callMethod(klass, "deleteLike", argTypes, term4834, args);
    }

};


