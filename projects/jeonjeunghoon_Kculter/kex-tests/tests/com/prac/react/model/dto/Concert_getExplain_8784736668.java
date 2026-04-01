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

public class Concert_getExplain_8784736668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19171;

    public Concert_getExplain_8784736668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19171 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term19209 = newInstance(Class.forName("java.util.Date"));
        Object term19211 = newInstance(Class.forName("java.util.Date"));
        setIntField(term19171, term19171.getClass(), "concertNum", -1549607466);
        setField(term19171, term19171.getClass(), "concertHash", "pHBHlmLIZQ");
        setField(term19171, term19171.getClass(), "concertName", "ZWRAbOuktl");
        setField(term19171, term19171.getClass(), "explain", "iqFRvFmVID");
        setLongField(term19209, term19209.getClass(), "fastTime", 1706078172457L);
        setField(term19209, term19209.getClass(), "cdate", null);
        setField(term19171, term19171.getClass(), "startDate", term19209);
        setLongField(term19211, term19211.getClass(), "fastTime", 1863631094992L);
        setField(term19211, term19211.getClass(), "cdate", null);
        setField(term19171, term19171.getClass(), "endDate", term19211);
        setDoubleField(term19171, term19171.getClass(), "lat", 0.5957631946929023);
        setDoubleField(term19171, term19171.getClass(), "lng", 0.9963416078314885);
        setIntField(term19171, term19171.getClass(), "starKey", 853609788);
        setField(term19171, term19171.getClass(), "starHash", "pNAEtppZdv");
        setField(term19171, term19171.getClass(), "imageUrl", "VsFWNMdyRt");
        setIntField(term19171, term19171.getClass(), "status", -197820800);
        setField(term19171, term19171.getClass(), "starName", "QaoYFZhScg");
        setField(term19171, term19171.getClass(), "placeName", "UTvXIenLCR");
        setField(term19171, term19171.getClass(), "buySite", "PLeKpWaxhQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExplain", argTypes, term19171, args);
    }

};


