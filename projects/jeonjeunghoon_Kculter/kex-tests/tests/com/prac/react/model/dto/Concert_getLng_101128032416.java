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

public class Concert_getLng_101128032416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20687;

    public Concert_getLng_101128032416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20687 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term20725 = newInstance(Class.forName("java.util.Date"));
        Object term20727 = newInstance(Class.forName("java.util.Date"));
        setIntField(term20687, term20687.getClass(), "concertNum", -2138825831);
        setField(term20687, term20687.getClass(), "concertHash", "FKDqHRpMcc");
        setField(term20687, term20687.getClass(), "concertName", "mIRMQIxHUD");
        setField(term20687, term20687.getClass(), "explain", "FbBMtntDbw");
        setLongField(term20725, term20725.getClass(), "fastTime", 1442370534632L);
        setField(term20725, term20725.getClass(), "cdate", null);
        setField(term20687, term20687.getClass(), "startDate", term20725);
        setLongField(term20727, term20727.getClass(), "fastTime", 1659994192918L);
        setField(term20727, term20727.getClass(), "cdate", null);
        setField(term20687, term20687.getClass(), "endDate", term20727);
        setDoubleField(term20687, term20687.getClass(), "lat", 0.4337266793917268);
        setDoubleField(term20687, term20687.getClass(), "lng", 0.11979392765421404);
        setIntField(term20687, term20687.getClass(), "starKey", 1454781562);
        setField(term20687, term20687.getClass(), "starHash", "zRnpRGaHlI");
        setField(term20687, term20687.getClass(), "imageUrl", "dVHfxjbMRK");
        setIntField(term20687, term20687.getClass(), "status", -27944011);
        setField(term20687, term20687.getClass(), "starName", "LzwyLxKJpw");
        setField(term20687, term20687.getClass(), "placeName", "ZhWJlplAVK");
        setField(term20687, term20687.getClass(), "buySite", "pnmjTuTojv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLng", argTypes, term20687, args);
    }

};


