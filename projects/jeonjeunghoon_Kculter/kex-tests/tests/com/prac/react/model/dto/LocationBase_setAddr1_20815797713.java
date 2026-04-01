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

public class LocationBase_setAddr1_20815797713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27286;

    public LocationBase_setAddr1_20815797713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27286 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term27286, term27286.getClass(), "addr1", "PhGPFLIMKH");
        setField(term27286, term27286.getClass(), "addr2", "pWCYcLhoms");
        setField(term27286, term27286.getClass(), "contenttypeid", "IWNJVfvTuw");
        setField(term27286, term27286.getClass(), "firstimage", "DLpKfwPpvr");
        setField(term27286, term27286.getClass(), "firstimage2", "DLFXidLbuT");
        setField(term27286, term27286.getClass(), "mapx", "FjkxfTXGIH");
        setField(term27286, term27286.getClass(), "mapy", "KJkWSFFnmR");
        setField(term27286, term27286.getClass(), "tel", "FBYRIDZvmW");
        setField(term27286, term27286.getClass(), "title", "IyjLfrDZrV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BRMTHqqoRg";
        callMethod(klass, "setAddr1", argTypes, term27286, args);
    }

};


