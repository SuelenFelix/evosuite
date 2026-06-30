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

public class LocationBase_setTitle_205388159719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30646;

    public LocationBase_setTitle_205388159719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30646 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term30646, term30646.getClass(), "addr1", "nUDhadopHE");
        setField(term30646, term30646.getClass(), "addr2", "vLrTnQTIPg");
        setField(term30646, term30646.getClass(), "contenttypeid", "GsXvLZCFtf");
        setField(term30646, term30646.getClass(), "firstimage", "JqSCTBGSUs");
        setField(term30646, term30646.getClass(), "firstimage2", "bZrrPiMnsr");
        setField(term30646, term30646.getClass(), "mapx", "IeromvfDmz");
        setField(term30646, term30646.getClass(), "mapy", "xJLHPTRSqe");
        setField(term30646, term30646.getClass(), "tel", "OIFZYdbUZz");
        setField(term30646, term30646.getClass(), "title", "FPablxseTr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wNndrIQDbr";
        callMethod(klass, "setTitle", argTypes, term30646, args);
    }

};


