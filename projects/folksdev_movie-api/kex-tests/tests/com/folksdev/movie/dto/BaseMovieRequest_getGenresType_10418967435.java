package com.folksdev.movie.dto;

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
import static com.folksdev.movie.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class BaseMovieRequest_getGenresType_10418967435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;

    public BaseMovieRequest_getGenresType_10418967435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3398 = new Integer(0);
        Integer term3400 = new Integer(0);
        ArrayList term3402 = new ArrayList();
        ArrayList term3406 = new ArrayList();
        term3393 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3393, term3393.getClass(), "description", "");
        setField(term3393, term3393.getClass(), "imdbUrl", "");
        setField(term3393, term3393.getClass(), "duration", term3398);
        setField(term3393, term3393.getClass(), "featuredYear", term3400);
        setField(term3393, term3393.getClass(), "genresType", term3402);
        setField(term3393, term3393.getClass(), "actorIds", term3406);
        setField(term3393, term3393.getClass(), "publisherId", "");
        setField(term3393, term3393.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenresType", argTypes, term3393, args);
    }

};


