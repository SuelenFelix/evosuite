package com.alkemy.ong.infrastructure.rest.response.news;

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
import static com.alkemy.ong.infrastructure.rest.response.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class GetNewsResponse_getImageUrl_8983884564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;

    public GetNewsResponse_getImageUrl_8983884564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term863 = new Long(-484994522244390100L);
        Long term902 = new Long(1233889271256172047L);
        term862 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term901 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term862, term862.getClass(), "id", term863);
        setField(term862, term862.getClass(), "name", "mLUZFTfjle");
        setField(term862, term862.getClass(), "content", "xIeFjkHkOe");
        setField(term862, term862.getClass(), "imageUrl", "SdCKLMIYnX");
        setField(term901, term901.getClass(), "id", term902);
        setField(term901, term901.getClass(), "description", "OJJtVNPyKZ");
        setField(term901, term901.getClass(), "imageUrl", "AKNapTAfmD");
        setField(term901, term901.getClass(), "name", "xJgPlLxpgC");
        setField(term862, term862.getClass(), "category", term901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term862, args);
    }

};


