package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerService_checkDuplicate_4997592475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1798;
     Object term1799;

    public ManagerService_checkDuplicate_4997592475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1798 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1798, term1798.getClass(), "md", null);
        setField(term1798, term1798.getClass(), "logger", null);
        term1799 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term1799, term1799.getClass(), "placeNum", -469968304);
        setField(term1799, term1799.getClass(), "keyHash", "fhkbdRViHi");
        setIntField(term1799, term1799.getClass(), "placeType", -1145578966);
        setField(term1799, term1799.getClass(), "culture", "uWHnvSvaPl");
        setField(term1799, term1799.getClass(), "kpop", "kBdSllIBVz");
        setDoubleField(term1799, term1799.getClass(), "lat", 0.28570734989730284);
        setDoubleField(term1799, term1799.getClass(), "lng", 0.40176586625454525);
        setIntField(term1799, term1799.getClass(), "status", 679763016);
        setField(term1799, term1799.getClass(), "name", "TJmVBGfTML");
        setField(term1799, term1799.getClass(), "explain", "tPlsykYBqO");
        setField(term1799, term1799.getClass(), "address", "bLPjGVBhlX");
        setField(term1799, term1799.getClass(), "fileUrl", "whBvTVIIlC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Place");
        Object[] args = new Object[1];
        args[0] = term1799;
        callMethod(klass, "checkDuplicate", argTypes, term1798, args);
    }

};


