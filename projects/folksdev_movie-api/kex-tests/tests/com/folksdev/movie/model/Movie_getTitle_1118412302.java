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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Movie_getTitle_1118412302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3367;

    public Movie_getTitle_1118412302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3481 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term3480 = ((Class) term3481).getDeclaredField((String) "ROMANCE");
        ((Field) term3480).setAccessible(true);
        Object enum9 =  ((Field) term3480).get((Object) null);
        Class<? extends Object> term3684 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term3683 = ((Class) term3684).getDeclaredField((String) "MYSTERY");
        ((Field) term3683).setAccessible(true);
        Object enum10 =  ((Field) term3683).get((Object) null);
        Class<? extends Object> term3887 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term3886 = ((Class) term3887).getDeclaredField((String) "SCI_FI");
        ((Field) term3886).setAccessible(true);
        Object enum11 =  ((Field) term3886).get((Object) null);
        Class<? extends Object> term4087 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term4086 = ((Class) term4087).getDeclaredField((String) "SCI_FI");
        ((Field) term4086).setAccessible(true);
        Object enum12 =  ((Field) term4086).get((Object) null);
        Class<? extends Object> term4287 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term4286 = ((Class) term4287).getDeclaredField((String) "MYSTERY");
        ((Field) term4286).setAccessible(true);
        Object enum13 =  ((Field) term4286).get((Object) null);
        Class<? extends Object> term4490 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term4489 = ((Class) term4490).getDeclaredField((String) "THRILLER");
        ((Field) term4489).setAccessible(true);
        Object enum14 =  ((Field) term4489).get((Object) null);
        ArrayList term3418 = new ArrayList();
        ((ArrayList) term3418).add(enum9);
        ((ArrayList) term3418).add(enum10);
        ((ArrayList) term3418).add(enum11);
        ((ArrayList) term3418).add(enum11);
        ((ArrayList) term3418).add(enum12);
        ((ArrayList) term3418).add(enum13);
        ((ArrayList) term3418).add(enum9);
        ((ArrayList) term3418).add(enum9);
        ((ArrayList) term3418).add(enum14);
        term3367 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term3367, term3367.getClass(), "id", "wWWidPCHzx");
        setField(term3367, term3367.getClass(), "title", "OwPIiBRuKK");
        setField(term3367, term3367.getClass(), "description", "sgfGySMODT");
        setField(term3367, term3367.getClass(), "imdbUrl", "ndAITnOsny");
        setIntField(term3367, term3367.getClass(), "duration", 628918458);
        setIntField(term3367, term3367.getClass(), "featuredYear", -1274456137);
        setField(term3367, term3367.getClass(), "genresTypes", term3418);
        setField(term3367, term3367.getClass(), "actors", null);
        setField(term3367, term3367.getClass(), "director", null);
        setField(term3367, term3367.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term3367, args);
    }

};


