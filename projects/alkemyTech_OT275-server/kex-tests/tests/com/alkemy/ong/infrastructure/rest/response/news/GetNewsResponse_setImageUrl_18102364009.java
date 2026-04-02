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

public class GetNewsResponse_setImageUrl_18102364009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;

    public GetNewsResponse_setImageUrl_18102364009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1599 = new Long(-7612550318181586304L);
        Long term1638 = new Long(-2170847986967241072L);
        term1598 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term1637 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term1598, term1598.getClass(), "id", term1599);
        setField(term1598, term1598.getClass(), "name", "hMmaoREuCK");
        setField(term1598, term1598.getClass(), "content", "VeDtgDzGAN");
        setField(term1598, term1598.getClass(), "imageUrl", "aWYOWZFyaX");
        setField(term1637, term1637.getClass(), "id", term1638);
        setField(term1637, term1637.getClass(), "description", "BRIVNtfUWU");
        setField(term1637, term1637.getClass(), "imageUrl", "DbiCVtPPCT");
        setField(term1637, term1637.getClass(), "name", "WzFopsaDuG");
        setField(term1598, term1598.getClass(), "category", term1637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PapWxkhEWe";
        callMethod(klass, "setImageUrl", argTypes, term1598, args);
    }

};


