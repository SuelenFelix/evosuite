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

public class Stay_setTitle_153956458621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3740;

    public Stay_setTitle_153956458621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3740 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term3740, term3740.getClass(), "addr1", "XYtryyobou");
        setField(term3740, term3740.getClass(), "addr2", "OYbzXylRWW");
        setField(term3740, term3740.getClass(), "areaCode", "DSNsTGYXDF");
        setField(term3740, term3740.getClass(), "sigunguCode", "sQvGcVjdEx");
        setField(term3740, term3740.getClass(), "representImg", "rLHAoqXgPh");
        setField(term3740, term3740.getClass(), "sumnail", "zUlRdimJtU");
        setDoubleField(term3740, term3740.getClass(), "lng", 0.6588948704887806);
        setDoubleField(term3740, term3740.getClass(), "lat", 0.6397214730945112);
        setField(term3740, term3740.getClass(), "tel", "vwbEQQNQrx");
        setField(term3740, term3740.getClass(), "title", "xtftXXMbem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cudZvLMQon";
        callMethod(klass, "setTitle", argTypes, term3740, args);
    }

};


