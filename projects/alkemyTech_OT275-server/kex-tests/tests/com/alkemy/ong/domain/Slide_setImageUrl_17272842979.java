package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class Slide_setImageUrl_17272842979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12961;

    public Slide_setImageUrl_17272842979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12962 = new Long(3103198349031409063L);
        Integer term12976 = new Integer(-1263114719);
        term12961 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12961, term12961.getClass(), "id", term12962);
        setField(term12961, term12961.getClass(), "imageUrl", "LqNgPziYtv");
        setField(term12961, term12961.getClass(), "order", term12976);
        setField(term12961, term12961.getClass(), "text", "wiDfuaXnrP");
        setField(term12961, term12961.getClass(), "base64FileEncoded", "btdGZUcaZl");
        setField(term12961, term12961.getClass(), "contentType", "WnEAVdCxna");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lnPIxHHyEK";
        callMethod(klass, "setImageUrl", argTypes, term12961, args);
    }

};


