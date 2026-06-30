package com.alkemy.ong.infrastructure.rest.response.slide;

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
import static com.alkemy.ong.infrastructure.rest.response.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GetSlideResponse_getText_4414214774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;

    public GetSlideResponse_getText_4414214774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term388 = new Long(-8400487765614892086L);
        Integer term414 = new Integer(-1339778481);
        term387 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse"));
        setField(term387, term387.getClass(), "id", term388);
        setField(term387, term387.getClass(), "imageUrl", "ZiaGIbnzTs");
        setField(term387, term387.getClass(), "text", "tbcdzjIfER");
        setField(term387, term387.getClass(), "position", term414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term387, args);
    }

};


