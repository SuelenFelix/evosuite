package com.folksdev.movie.model;

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
import static com.folksdev.movie.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Actor_toString_157880251914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33663;

    public Actor_toString_157880251914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33730 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33729 = ((Class) term33730).getDeclaredField((String) "UNKNOWN");
        ((Field) term33729).setAccessible(true);
        Object enum114 = ((Field) term33729).get((Object) null);
        HashMap term33704 = new HashMap();
        Set<Object> term33912 =  ((Map) term33704).keySet();
        HashSet term33703 = new HashSet((Collection<? extends Object>) term33912);
        term33663 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term33688 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33663, term33663.getClass(), "id", "bozHpjFCmy");
        setField(term33663, term33663.getClass(), "name", "fufOvYOUme");
        setIntField(term33688, term33688.getClass(), "year", 2029);
        setShortField(term33688, term33688.getClass(), "month", (short) 7);
        setShortField(term33688, term33688.getClass(), "day", (short) 13);
        setField(term33663, term33663.getClass(), "dateOfBirth", term33688);
        setField(term33663, term33663.getClass(), "gender", enum114);
        setField(term33663, term33663.getClass(), "movies", term33703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33663, args);
    }

};


