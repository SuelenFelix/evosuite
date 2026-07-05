package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class Slide_getContent_6102737470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12122;

    public Slide_getContent_6102737470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12123 = new Long(6077991958696417121L);
        Integer term12137 = new Integer(1114000454);
        term12122 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12122, term12122.getClass(), "id", term12123);
        setField(term12122, term12122.getClass(), "imageUrl", "mJJxTuZuKO");
        setField(term12122, term12122.getClass(), "order", term12137);
        setField(term12122, term12122.getClass(), "text", "anSZCikKpS");
        setField(term12122, term12122.getClass(), "base64FileEncoded", "zvMQGbTtsV");
        setField(term12122, term12122.getClass(), "contentType", "DyUuIDzZPG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term12122, args);
    }

};


