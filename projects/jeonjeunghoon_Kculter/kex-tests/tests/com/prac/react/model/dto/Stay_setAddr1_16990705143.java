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

public class Stay_setAddr1_16990705143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360;

    public Stay_setAddr1_16990705143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term360, term360.getClass(), "addr1", "ZiaGIbnzTs");
        setField(term360, term360.getClass(), "addr2", "tbcdzjIfER");
        setField(term360, term360.getClass(), "areaCode", "HyxfbSQYBe");
        setField(term360, term360.getClass(), "sigunguCode", "pCTimMblYc");
        setField(term360, term360.getClass(), "representImg", "hNxWaHcfhY");
        setField(term360, term360.getClass(), "sumnail", "RkybSrpybU");
        setDoubleField(term360, term360.getClass(), "lng", 0.28570734989730284);
        setDoubleField(term360, term360.getClass(), "lat", 0.40176586625454525);
        setField(term360, term360.getClass(), "tel", "xOEqzGAmDU");
        setField(term360, term360.getClass(), "title", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setAddr1", argTypes, term360, args);
    }

};


