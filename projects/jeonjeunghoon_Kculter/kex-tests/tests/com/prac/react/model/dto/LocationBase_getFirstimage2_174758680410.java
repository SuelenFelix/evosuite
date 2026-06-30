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

public class LocationBase_getFirstimage2_174758680410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28767;

    public LocationBase_getFirstimage2_174758680410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28767 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term28767, term28767.getClass(), "addr1", "TQuvAoQcBe");
        setField(term28767, term28767.getClass(), "addr2", "nGYLfZrtWO");
        setField(term28767, term28767.getClass(), "contenttypeid", "DBufEhhBCQ");
        setField(term28767, term28767.getClass(), "firstimage", "GiNZRBZjgO");
        setField(term28767, term28767.getClass(), "firstimage2", "ceGAKcClsG");
        setField(term28767, term28767.getClass(), "mapx", "SEldZGJyvX");
        setField(term28767, term28767.getClass(), "mapy", "vyvpqcHTQN");
        setField(term28767, term28767.getClass(), "tel", "QQcpNMSHvA");
        setField(term28767, term28767.getClass(), "title", "FLLklaMZvg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstimage2", argTypes, term28767, args);
    }

};


