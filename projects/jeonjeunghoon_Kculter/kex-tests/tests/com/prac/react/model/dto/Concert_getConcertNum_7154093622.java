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

public class Concert_getConcertNum_7154093622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18009;

    public Concert_getConcertNum_7154093622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18009 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term18047 = newInstance(Class.forName("java.util.Date"));
        Object term18049 = newInstance(Class.forName("java.util.Date"));
        setIntField(term18009, term18009.getClass(), "concertNum", -1537255112);
        setField(term18009, term18009.getClass(), "concertHash", "vjaZIyixCm");
        setField(term18009, term18009.getClass(), "concertName", "gAAPyftlIR");
        setField(term18009, term18009.getClass(), "explain", "kevWstoxwq");
        setLongField(term18047, term18047.getClass(), "fastTime", 1610940182830L);
        setField(term18047, term18047.getClass(), "cdate", null);
        setField(term18009, term18009.getClass(), "startDate", term18047);
        setLongField(term18049, term18049.getClass(), "fastTime", 1606045635837L);
        setField(term18049, term18049.getClass(), "cdate", null);
        setField(term18009, term18009.getClass(), "endDate", term18049);
        setDoubleField(term18009, term18009.getClass(), "lat", 0.5195852993308188);
        setDoubleField(term18009, term18009.getClass(), "lng", 0.6533293939565151);
        setIntField(term18009, term18009.getClass(), "starKey", 934477462);
        setField(term18009, term18009.getClass(), "starHash", "aSYOhFwzSm");
        setField(term18009, term18009.getClass(), "imageUrl", "pVZlzrBeDB");
        setIntField(term18009, term18009.getClass(), "status", 4900410);
        setField(term18009, term18009.getClass(), "starName", "EfSUvjuZAA");
        setField(term18009, term18009.getClass(), "placeName", "PrHWfHydsG");
        setField(term18009, term18009.getClass(), "buySite", "igruEzTbBE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConcertNum", argTypes, term18009, args);
    }

};


