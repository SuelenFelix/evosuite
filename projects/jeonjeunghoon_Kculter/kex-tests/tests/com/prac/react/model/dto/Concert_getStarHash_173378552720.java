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
import java.lang.Object;

public class Concert_getStarHash_173378552720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21435;

    public Concert_getStarHash_173378552720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21435 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term21473 = newInstance(Class.forName("java.util.Date"));
        Object term21475 = newInstance(Class.forName("java.util.Date"));
        setIntField(term21435, term21435.getClass(), "concertNum", 2027686272);
        setField(term21435, term21435.getClass(), "concertHash", "shLHFznysy");
        setField(term21435, term21435.getClass(), "concertName", "YCKIloBHLj");
        setField(term21435, term21435.getClass(), "explain", "qUWDhAeFJY");
        setLongField(term21473, term21473.getClass(), "fastTime", 1405279189488L);
        setField(term21473, term21473.getClass(), "cdate", null);
        setField(term21435, term21435.getClass(), "startDate", term21473);
        setLongField(term21475, term21475.getClass(), "fastTime", 1822704644050L);
        setField(term21475, term21475.getClass(), "cdate", null);
        setField(term21435, term21435.getClass(), "endDate", term21475);
        setDoubleField(term21435, term21435.getClass(), "lat", 0.6933516214415875);
        setDoubleField(term21435, term21435.getClass(), "lng", 0.7039847711405768);
        setIntField(term21435, term21435.getClass(), "starKey", -1494356104);
        setField(term21435, term21435.getClass(), "starHash", "wboNBMhRjP");
        setField(term21435, term21435.getClass(), "imageUrl", "HZODpafOGe");
        setIntField(term21435, term21435.getClass(), "status", -695279311);
        setField(term21435, term21435.getClass(), "starName", "dUTYEKtTfQ");
        setField(term21435, term21435.getClass(), "placeName", "HUtbHklGel");
        setField(term21435, term21435.getClass(), "buySite", "QbfKDAwhSB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarHash", argTypes, term21435, args);
    }

};


