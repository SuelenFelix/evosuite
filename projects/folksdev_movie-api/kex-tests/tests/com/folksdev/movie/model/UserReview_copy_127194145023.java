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

public class UserReview_copy_127194145023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27904;

    public UserReview_copy_127194145023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27904 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27904, term27904.getClass(), "userReviewId", null);
        setField(term27904, term27904.getClass(), "user", null);
        setField(term27904, term27904.getClass(), "review", null);
        setField(term27904, term27904.getClass(), "date", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.folksdev.movie.model.UserReviewId");
        argTypes[1] = Class.forName("com.folksdev.movie.model.User");
        argTypes[2] = Class.forName("com.folksdev.movie.model.Review");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "copy", argTypes, term27904, args);
    }

};


