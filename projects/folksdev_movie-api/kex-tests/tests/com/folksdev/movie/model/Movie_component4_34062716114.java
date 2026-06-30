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

public class Movie_component4_34062716114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13153;

    public Movie_component4_34062716114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13267 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term13266 = ((Class) term13267).getDeclaredField((String) "DRAMA");
        ((Field) term13266).setAccessible(true);
        Object enum50 =  ((Field) term13266).get((Object) null);
        Class<? extends Object> term13464 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term13463 = ((Class) term13464).getDeclaredField((String) "THRILLER");
        ((Field) term13463).setAccessible(true);
        Object enum51 =  ((Field) term13463).get((Object) null);
        Class<? extends Object> term13670 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term13669 = ((Class) term13670).getDeclaredField((String) "MYSTERY");
        ((Field) term13669).setAccessible(true);
        Object enum52 =  ((Field) term13669).get((Object) null);
        Class<? extends Object> term13873 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term13872 = ((Class) term13873).getDeclaredField((String) "SCI_FI");
        ((Field) term13872).setAccessible(true);
        Object enum53 =  ((Field) term13872).get((Object) null);
        Class<? extends Object> term14073 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term14072 = ((Class) term14073).getDeclaredField((String) "HORROR");
        ((Field) term14072).setAccessible(true);
        Object enum54 =  ((Field) term14072).get((Object) null);
        Class<? extends Object> term14273 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term14272 = ((Class) term14273).getDeclaredField((String) "ROMANCE");
        ((Field) term14272).setAccessible(true);
        Object enum55 =  ((Field) term14272).get((Object) null);
        ArrayList term13204 = new ArrayList();
        ((ArrayList) term13204).add(enum50);
        ((ArrayList) term13204).add(enum51);
        ((ArrayList) term13204).add(enum52);
        ((ArrayList) term13204).add(enum53);
        ((ArrayList) term13204).add(enum54);
        ((ArrayList) term13204).add(enum55);
        ((ArrayList) term13204).add(enum53);
        term13153 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term13153, term13153.getClass(), "id", "IaSymdfFGa");
        setField(term13153, term13153.getClass(), "title", "FxSvJCIpul");
        setField(term13153, term13153.getClass(), "description", "HCjKwpexJj");
        setField(term13153, term13153.getClass(), "imdbUrl", "sCpIHVPdfl");
        setIntField(term13153, term13153.getClass(), "duration", -1467089634);
        setIntField(term13153, term13153.getClass(), "featuredYear", 413548937);
        setField(term13153, term13153.getClass(), "genresTypes", term13204);
        setField(term13153, term13153.getClass(), "actors", null);
        setField(term13153, term13153.getClass(), "director", null);
        setField(term13153, term13153.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term13153, args);
    }

};


