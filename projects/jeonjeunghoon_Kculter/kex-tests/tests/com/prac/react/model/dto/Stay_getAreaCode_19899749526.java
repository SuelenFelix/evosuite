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

public class Stay_getAreaCode_19899749526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941;

    public Stay_getAreaCode_19899749526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term941, term941.getClass(), "addr1", "gGSMzuGICf");
        setField(term941, term941.getClass(), "addr2", "hxCBltsObl");
        setField(term941, term941.getClass(), "areaCode", "BndsHwAFMv");
        setField(term941, term941.getClass(), "sigunguCode", "GzFkzHGYFt");
        setField(term941, term941.getClass(), "representImg", "tShwQLRGNe");
        setField(term941, term941.getClass(), "sumnail", "LvtrsXUliU");
        setDoubleField(term941, term941.getClass(), "lng", 0.8474802076607362);
        setDoubleField(term941, term941.getClass(), "lat", 0.5183269973490326);
        setField(term941, term941.getClass(), "tel", "xLbjWUgOIL");
        setField(term941, term941.getClass(), "title", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreaCode", argTypes, term941, args);
    }

};


