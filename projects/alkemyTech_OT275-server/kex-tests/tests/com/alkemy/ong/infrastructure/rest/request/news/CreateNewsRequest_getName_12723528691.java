package com.alkemy.ong.infrastructure.rest.request.news;

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
import static com.alkemy.ong.infrastructure.rest.request.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateNewsRequest_getName_12723528691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;

    public CreateNewsRequest_getName_12723528691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest"));
        setField(term475, term475.getClass(), "name", "RkybSrpybU");
        setField(term475, term475.getClass(), "text", "xOEqzGAmDU");
        setField(term475, term475.getClass(), "image", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term475, args);
    }

};


