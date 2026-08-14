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

public class Actor_component1_6953155218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32003;

    public Actor_component1_6953155218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32061 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term32060 = ((Class) term32061).getDeclaredField((String) "MALE");
        ((Field) term32060).setAccessible(true);
        Object enum107 = ((Field) term32060).get((Object) null);
        term32003 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term32028 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32003, term32003.getClass(), "id", "eywpqasaKj");
        setField(term32003, term32003.getClass(), "name", "QnaLMKXAzJ");
        setIntField(term32028, term32028.getClass(), "year", 2022);
        setShortField(term32028, term32028.getClass(), "month", (short) 2);
        setShortField(term32028, term32028.getClass(), "day", (short) 2);
        setField(term32003, term32003.getClass(), "dateOfBirth", term32028);
        setField(term32003, term32003.getClass(), "gender", enum107);
        setField(term32003, term32003.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term32003, args);
    }

};


