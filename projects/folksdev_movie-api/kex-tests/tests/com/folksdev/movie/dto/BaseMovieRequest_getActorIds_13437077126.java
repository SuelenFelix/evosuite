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

public class BaseMovieRequest_getActorIds_13437077126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3414;

    public BaseMovieRequest_getActorIds_13437077126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3419 = new Integer(0);
        Integer term3421 = new Integer(0);
        ArrayList term3423 = new ArrayList();
        ArrayList term3427 = new ArrayList();
        term3414 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3414, term3414.getClass(), "description", "");
        setField(term3414, term3414.getClass(), "imdbUrl", "");
        setField(term3414, term3414.getClass(), "duration", term3419);
        setField(term3414, term3414.getClass(), "featuredYear", term3421);
        setField(term3414, term3414.getClass(), "genresType", term3423);
        setField(term3414, term3414.getClass(), "actorIds", term3427);
        setField(term3414, term3414.getClass(), "publisherId", "");
        setField(term3414, term3414.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActorIds", argTypes, term3414, args);
    }

};


