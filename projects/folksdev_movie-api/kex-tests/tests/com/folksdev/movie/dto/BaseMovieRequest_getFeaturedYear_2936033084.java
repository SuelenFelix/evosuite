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

public class BaseMovieRequest_getFeaturedYear_2936033084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3372;

    public BaseMovieRequest_getFeaturedYear_2936033084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3377 = new Integer(0);
        Integer term3379 = new Integer(0);
        ArrayList term3381 = new ArrayList();
        ArrayList term3385 = new ArrayList();
        term3372 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3372, term3372.getClass(), "description", "");
        setField(term3372, term3372.getClass(), "imdbUrl", "");
        setField(term3372, term3372.getClass(), "duration", term3377);
        setField(term3372, term3372.getClass(), "featuredYear", term3379);
        setField(term3372, term3372.getClass(), "genresType", term3381);
        setField(term3372, term3372.getClass(), "actorIds", term3385);
        setField(term3372, term3372.getClass(), "publisherId", "");
        setField(term3372, term3372.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeaturedYear", argTypes, term3372, args);
    }

};


