package com.alkemy.ong.infrastructure.rest.mapper.slide;

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
import static com.alkemy.ong.infrastructure.rest.mapper.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GetSlideMapper_toResponse_18560869441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public GetSlideMapper_toResponse_18560869441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.GetSlideMapper"));
        Long term3 = new Long(2442117782898005296L);
        Integer term17 = new Integer(568599855);
        term2 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "imageUrl", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "order", term17);
        setField(term2, term2.getClass(), "text", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "base64FileEncoded", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "contentType", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.GetSlideMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "toResponse", argTypes, term1, args);
    }

};


