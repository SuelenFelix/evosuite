package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stay_getSumnail_52876116512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2081;

    public Stay_getSumnail_52876116512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2081 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term2081, term2081.getClass(), "addr1", "JqXGgAhZPl");
        setField(term2081, term2081.getClass(), "addr2", "jiKYgYHqIS");
        setField(term2081, term2081.getClass(), "areaCode", "DfISiziTgG");
        setField(term2081, term2081.getClass(), "sigunguCode", "XqgfKFvPSD");
        setField(term2081, term2081.getClass(), "representImg", "JiVRgTZvKc");
        setField(term2081, term2081.getClass(), "sumnail", "XPKmummaqg");
        setDoubleField(term2081, term2081.getClass(), "lng", 0.43692187681405226);
        setDoubleField(term2081, term2081.getClass(), "lat", 0.7633268466829064);
        setField(term2081, term2081.getClass(), "tel", "BKLfkLiZTH");
        setField(term2081, term2081.getClass(), "title", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumnail", argTypes, term2081, args);
    }

};


