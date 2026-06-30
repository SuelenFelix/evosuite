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

public class Concert_getImageUrl_118223608522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21829;

    public Concert_getImageUrl_118223608522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21829 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term21867 = newInstance(Class.forName("java.util.Date"));
        Object term21869 = newInstance(Class.forName("java.util.Date"));
        setIntField(term21829, term21829.getClass(), "concertNum", 1862841859);
        setField(term21829, term21829.getClass(), "concertHash", "DwQmZEKeOp");
        setField(term21829, term21829.getClass(), "concertName", "DbxrFiyttv");
        setField(term21829, term21829.getClass(), "explain", "iVIrSxTsaM");
        setLongField(term21867, term21867.getClass(), "fastTime", 1426018874434L);
        setField(term21867, term21867.getClass(), "cdate", null);
        setField(term21829, term21829.getClass(), "startDate", term21867);
        setLongField(term21869, term21869.getClass(), "fastTime", 1633004775487L);
        setField(term21869, term21869.getClass(), "cdate", null);
        setField(term21829, term21829.getClass(), "endDate", term21869);
        setDoubleField(term21829, term21829.getClass(), "lat", 0.009446329384675933);
        setDoubleField(term21829, term21829.getClass(), "lng", 0.20131600000037786);
        setIntField(term21829, term21829.getClass(), "starKey", -1114668574);
        setField(term21829, term21829.getClass(), "starHash", "FmJNEfmYgq");
        setField(term21829, term21829.getClass(), "imageUrl", "NqQofgWsJd");
        setIntField(term21829, term21829.getClass(), "status", 514511037);
        setField(term21829, term21829.getClass(), "starName", "ZlVRdHsBMO");
        setField(term21829, term21829.getClass(), "placeName", "UMMXkhuqzw");
        setField(term21829, term21829.getClass(), "buySite", "KyGXZcXJwq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term21829, args);
    }

};


