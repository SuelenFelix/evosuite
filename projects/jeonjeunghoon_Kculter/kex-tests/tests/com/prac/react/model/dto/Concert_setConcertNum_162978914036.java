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
import java.lang.Integer;

public class Concert_setConcertNum_162978914036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23981;
     Object term23987;

    public Concert_setConcertNum_162978914036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23981 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        setIntField(term23981, term23981.getClass(), "concertNum", 0);
        setField(term23981, term23981.getClass(), "concertHash", null);
        setField(term23981, term23981.getClass(), "concertName", null);
        setField(term23981, term23981.getClass(), "explain", null);
        setField(term23981, term23981.getClass(), "startDate", null);
        setField(term23981, term23981.getClass(), "endDate", null);
        setDoubleField(term23981, term23981.getClass(), "lat", 0.0);
        setDoubleField(term23981, term23981.getClass(), "lng", 0.0);
        setIntField(term23981, term23981.getClass(), "starKey", 0);
        setField(term23981, term23981.getClass(), "starHash", null);
        setField(term23981, term23981.getClass(), "imageUrl", null);
        setIntField(term23981, term23981.getClass(), "status", 0);
        setField(term23981, term23981.getClass(), "starName", null);
        setField(term23981, term23981.getClass(), "placeName", null);
        setField(term23981, term23981.getClass(), "buySite", null);
        term23987 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23987;
        callMethod(klass, "setConcertNum", argTypes, term23981, args);
    }

};


