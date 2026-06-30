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

public class Stay_getAddr2_21227398914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;

    public Stay_getAddr2_21227398914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term561, term561.getClass(), "addr1", "vrQLuWIDJX");
        setField(term561, term561.getClass(), "addr2", "flxyYxBRtu");
        setField(term561, term561.getClass(), "areaCode", "OclPbYPkcH");
        setField(term561, term561.getClass(), "sigunguCode", "IoAlmYsBwc");
        setField(term561, term561.getClass(), "representImg", "TEParAifyi");
        setField(term561, term561.getClass(), "sumnail", "OWDIEULEFu");
        setDoubleField(term561, term561.getClass(), "lng", 0.2641345529914265);
        setDoubleField(term561, term561.getClass(), "lat", 0.36923381893433327);
        setField(term561, term561.getClass(), "tel", "dWRymuLBtr");
        setField(term561, term561.getClass(), "title", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddr2", argTypes, term561, args);
    }

};


