package com.alkemy.ong.application.service.slide;

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
import static com.alkemy.ong.application.service.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class CreateSlideUseCaseService_add_10924386210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;

    public CreateSlideUseCaseService_add_10924386210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.alkemy.ong.application.service.slide.CreateSlideUseCaseService"));
        setField(term3, term3.getClass(), "slideRepository", null);
        setField(term3, term3.getClass(), "imageUploader", null);
        Long term5 = new Long(2442117782898005296L);
        Integer term19 = new Integer(568599855);
        term4 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term4, term4.getClass(), "id", term5);
        setField(term4, term4.getClass(), "imageUrl", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "order", term19);
        setField(term4, term4.getClass(), "text", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "base64FileEncoded", "MuLcgQHgqz");
        setField(term4, term4.getClass(), "contentType", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.slide.CreateSlideUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "add", argTypes, term3, args);
    }

};


