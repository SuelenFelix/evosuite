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

public class BaseMovieRequest_getImdbUrl_16283028432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3330;

    public BaseMovieRequest_getImdbUrl_16283028432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3335 = new Integer(0);
        Integer term3337 = new Integer(0);
        ArrayList term3339 = new ArrayList();
        ArrayList term3343 = new ArrayList();
        term3330 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3330, term3330.getClass(), "description", "");
        setField(term3330, term3330.getClass(), "imdbUrl", "");
        setField(term3330, term3330.getClass(), "duration", term3335);
        setField(term3330, term3330.getClass(), "featuredYear", term3337);
        setField(term3330, term3330.getClass(), "genresType", term3339);
        setField(term3330, term3330.getClass(), "actorIds", term3343);
        setField(term3330, term3330.getClass(), "publisherId", "");
        setField(term3330, term3330.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImdbUrl", argTypes, term3330, args);
    }

};


