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

public class GetNewsResponse_getContent_4347137453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public GetNewsResponse_getContent_4347137453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term725 = new Long(5262507301787091109L);
        Long term764 = new Long(-6823727938421990489L);
        term724 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term763 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term724, term724.getClass(), "id", term725);
        setField(term724, term724.getClass(), "name", "hCWPJQKpdc");
        setField(term724, term724.getClass(), "content", "WzMEhMXkKx");
        setField(term724, term724.getClass(), "imageUrl", "XOiDvlDhdc");
        setField(term763, term763.getClass(), "id", term764);
        setField(term763, term763.getClass(), "description", "AdxvLJhNLe");
        setField(term763, term763.getClass(), "imageUrl", "lHfTrWKMPk");
        setField(term763, term763.getClass(), "name", "JDaAnsVTGV");
        setField(term724, term724.getClass(), "category", term763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term724, args);
    }

};


