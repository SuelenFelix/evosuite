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
import java.lang.Integer;

public class Concert_setConcertNum_16297891403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18195;
     Object term18301;

    public Concert_setConcertNum_16297891403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18195 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term18233 = newInstance(Class.forName("java.util.Date"));
        Object term18235 = newInstance(Class.forName("java.util.Date"));
        setIntField(term18195, term18195.getClass(), "concertNum", -1252345779);
        setField(term18195, term18195.getClass(), "concertHash", "LFjgROsRUV");
        setField(term18195, term18195.getClass(), "concertName", "kHxujKiCsr");
        setField(term18195, term18195.getClass(), "explain", "cseZveWowm");
        setLongField(term18233, term18233.getClass(), "fastTime", 1442639565302L);
        setField(term18233, term18233.getClass(), "cdate", null);
        setField(term18195, term18195.getClass(), "startDate", term18233);
        setLongField(term18235, term18235.getClass(), "fastTime", 1515890130018L);
        setField(term18235, term18235.getClass(), "cdate", null);
        setField(term18195, term18195.getClass(), "endDate", term18235);
        setDoubleField(term18195, term18195.getClass(), "lat", 0.7361083671494018);
        setDoubleField(term18195, term18195.getClass(), "lng", 0.056643259984349825);
        setIntField(term18195, term18195.getClass(), "starKey", -2063365430);
        setField(term18195, term18195.getClass(), "starHash", "idfslIPhgx");
        setField(term18195, term18195.getClass(), "imageUrl", "HyFLOXeoDX");
        setIntField(term18195, term18195.getClass(), "status", 812570053);
        setField(term18195, term18195.getClass(), "starName", "crkNabVaWs");
        setField(term18195, term18195.getClass(), "placeName", "qBcAJgrABE");
        setField(term18195, term18195.getClass(), "buySite", "JKdZuLFRwC");
        term18301 = new Integer(-1488938905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18301;
        callMethod(klass, "setConcertNum", argTypes, term18195, args);
    }

};


