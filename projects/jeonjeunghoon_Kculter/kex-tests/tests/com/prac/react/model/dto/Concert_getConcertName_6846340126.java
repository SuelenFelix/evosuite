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

public class Concert_getConcertName_6846340126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18777;

    public Concert_getConcertName_6846340126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18777 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term18815 = newInstance(Class.forName("java.util.Date"));
        Object term18817 = newInstance(Class.forName("java.util.Date"));
        setIntField(term18777, term18777.getClass(), "concertNum", -128490829);
        setField(term18777, term18777.getClass(), "concertHash", "azMTTmEXnh");
        setField(term18777, term18777.getClass(), "concertName", "BjJtxwsIpt");
        setField(term18777, term18777.getClass(), "explain", "gUQhOyGfzF");
        setLongField(term18815, term18815.getClass(), "fastTime", 1797203628025L);
        setField(term18815, term18815.getClass(), "cdate", null);
        setField(term18777, term18777.getClass(), "startDate", term18815);
        setLongField(term18817, term18817.getClass(), "fastTime", 1589457921030L);
        setField(term18817, term18817.getClass(), "cdate", null);
        setField(term18777, term18777.getClass(), "endDate", term18817);
        setDoubleField(term18777, term18777.getClass(), "lat", 0.198746516614277);
        setDoubleField(term18777, term18777.getClass(), "lng", 0.16852568658760048);
        setIntField(term18777, term18777.getClass(), "starKey", 202214133);
        setField(term18777, term18777.getClass(), "starHash", "IqDObvPBZX");
        setField(term18777, term18777.getClass(), "imageUrl", "NITCrIISoC");
        setIntField(term18777, term18777.getClass(), "status", 1543091617);
        setField(term18777, term18777.getClass(), "starName", "nSzzeexTDI");
        setField(term18777, term18777.getClass(), "placeName", "WBrpvMhmsz");
        setField(term18777, term18777.getClass(), "buySite", "ZzqRHVEXcM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConcertName", argTypes, term18777, args);
    }

};


