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

public class UpdateSlideResponse_getId_13151879655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term981;

    public UpdateSlideResponse_getId_13151879655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term982 = new Long(-872011222785455006L);
        Integer term996 = new Integer(-6029667);
        term981 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.UpdateSlideResponse"));
        setField(term981, term981.getClass(), "id", term982);
        setField(term981, term981.getClass(), "text", "wSQxaModmm");
        setField(term981, term981.getClass(), "order", term996);
        setField(term981, term981.getClass(), "imageUrl", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.UpdateSlideResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term981, args);
    }

};


