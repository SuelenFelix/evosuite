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

public class Stay_getRepresentImg_124813836110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1701;

    public Stay_getRepresentImg_124813836110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1701 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term1701, term1701.getClass(), "addr1", "oVgzLbrsFr");
        setField(term1701, term1701.getClass(), "addr2", "vQVyKLdtaz");
        setField(term1701, term1701.getClass(), "areaCode", "OWKQODBLzb");
        setField(term1701, term1701.getClass(), "sigunguCode", "wGmYcqUkgE");
        setField(term1701, term1701.getClass(), "representImg", "idgaQsnJpQ");
        setField(term1701, term1701.getClass(), "sumnail", "VgZnGoIFwQ");
        setDoubleField(term1701, term1701.getClass(), "lng", 0.6436713023569729);
        setDoubleField(term1701, term1701.getClass(), "lat", 0.7332741045694002);
        setField(term1701, term1701.getClass(), "tel", "jUbSRrkrYZ");
        setField(term1701, term1701.getClass(), "title", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepresentImg", argTypes, term1701, args);
    }

};


