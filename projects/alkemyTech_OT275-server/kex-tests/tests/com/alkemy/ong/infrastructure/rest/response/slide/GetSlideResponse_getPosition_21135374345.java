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

public class GetSlideResponse_getPosition_21135374345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;

    public GetSlideResponse_getPosition_21135374345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term437 = new Long(5270370404989704783L);
        Integer term463 = new Integer(1725571209);
        term436 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse"));
        setField(term436, term436.getClass(), "id", term437);
        setField(term436, term436.getClass(), "imageUrl", "HyxfbSQYBe");
        setField(term436, term436.getClass(), "text", "pCTimMblYc");
        setField(term436, term436.getClass(), "position", term463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term436, args);
    }

};


