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

public class Concert_getConcertHash_5130407354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18383;

    public Concert_getConcertHash_5130407354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18383 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term18421 = newInstance(Class.forName("java.util.Date"));
        Object term18423 = newInstance(Class.forName("java.util.Date"));
        setIntField(term18383, term18383.getClass(), "concertNum", 1916544127);
        setField(term18383, term18383.getClass(), "concertHash", "hfhLLoWnRU");
        setField(term18383, term18383.getClass(), "concertName", "RpofnOPYha");
        setField(term18383, term18383.getClass(), "explain", "CQYmAsjvPU");
        setLongField(term18421, term18421.getClass(), "fastTime", 1429023851389L);
        setField(term18421, term18421.getClass(), "cdate", null);
        setField(term18383, term18383.getClass(), "startDate", term18421);
        setLongField(term18423, term18423.getClass(), "fastTime", 1495357463288L);
        setField(term18423, term18423.getClass(), "cdate", null);
        setField(term18383, term18383.getClass(), "endDate", term18423);
        setDoubleField(term18383, term18383.getClass(), "lat", 0.5984863932443171);
        setDoubleField(term18383, term18383.getClass(), "lng", 0.04708163975594959);
        setIntField(term18383, term18383.getClass(), "starKey", -1133405894);
        setField(term18383, term18383.getClass(), "starHash", "NNkIIFpxiB");
        setField(term18383, term18383.getClass(), "imageUrl", "sBmtvFPDso");
        setIntField(term18383, term18383.getClass(), "status", 1289741214);
        setField(term18383, term18383.getClass(), "starName", "qsUIxrLolr");
        setField(term18383, term18383.getClass(), "placeName", "IlQxArYcgB");
        setField(term18383, term18383.getClass(), "buySite", "lIgKCvCuoH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConcertHash", argTypes, term18383, args);
    }

};


