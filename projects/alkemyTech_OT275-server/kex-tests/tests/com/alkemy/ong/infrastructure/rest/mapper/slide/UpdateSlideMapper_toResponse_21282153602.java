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

public class UpdateSlideMapper_toResponse_21282153602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834;
     Object term835;

    public UpdateSlideMapper_toResponse_21282153602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term834 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.UpdateSlideMapper"));
        Long term836 = new Long(-872011222785455006L);
        Integer term850 = new Integer(-1456670397);
        term835 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term835, term835.getClass(), "id", term836);
        setField(term835, term835.getClass(), "imageUrl", "fhkbdRViHi");
        setField(term835, term835.getClass(), "order", term850);
        setField(term835, term835.getClass(), "text", "uWHnvSvaPl");
        setField(term835, term835.getClass(), "base64FileEncoded", "kBdSllIBVz");
        setField(term835, term835.getClass(), "contentType", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.UpdateSlideMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term835;
        callMethod(klass, "toResponse", argTypes, term834, args);
    }

};


