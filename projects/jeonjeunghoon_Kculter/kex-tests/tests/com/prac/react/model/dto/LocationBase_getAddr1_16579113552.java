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

public class LocationBase_getAddr1_16579113552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27087;

    public LocationBase_getAddr1_16579113552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27087 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term27087, term27087.getClass(), "addr1", "RqnYUpQBbG");
        setField(term27087, term27087.getClass(), "addr2", "sKnuhmcjCC");
        setField(term27087, term27087.getClass(), "contenttypeid", "oCBbVNwMnb");
        setField(term27087, term27087.getClass(), "firstimage", "miJxAzOVJy");
        setField(term27087, term27087.getClass(), "firstimage2", "kjqlBVaviD");
        setField(term27087, term27087.getClass(), "mapx", "iVRXRDCrcM");
        setField(term27087, term27087.getClass(), "mapy", "WAZFhrxcSM");
        setField(term27087, term27087.getClass(), "tel", "gCRUlTuVMX");
        setField(term27087, term27087.getClass(), "title", "tYBgGQtkhi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddr1", argTypes, term27087, args);
    }

};


