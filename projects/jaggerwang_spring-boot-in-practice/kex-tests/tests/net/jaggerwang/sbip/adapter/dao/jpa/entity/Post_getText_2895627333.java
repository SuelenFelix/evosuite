package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Post_getText_2895627333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11519;

    public Post_getText_2895627333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11519 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        setField(term11519, term11519.getClass(), "id", null);
        setField(term11519, term11519.getClass(), "userId", null);
        setField(term11519, term11519.getClass(), "type", null);
        setField(term11519, term11519.getClass(), "text", null);
        setField(term11519, term11519.getClass(), "imageIds", null);
        setField(term11519, term11519.getClass(), "videoId", null);
        setField(term11519, term11519.getClass(), "createdAt", null);
        setField(term11519, term11519.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term11519, args);
    }

};


