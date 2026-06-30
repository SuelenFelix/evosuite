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

public class GetNewsResponse_setCategory_63210664310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1758;
     Object term1836;

    public GetNewsResponse_setCategory_63210664310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1759 = new Long(4044358158040652353L);
        Long term1798 = new Long(-4443169559037975007L);
        term1758 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term1797 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term1758, term1758.getClass(), "id", term1759);
        setField(term1758, term1758.getClass(), "name", "smnHEqRFRx");
        setField(term1758, term1758.getClass(), "content", "XYtryyobou");
        setField(term1758, term1758.getClass(), "imageUrl", "OYbzXylRWW");
        setField(term1797, term1797.getClass(), "id", term1798);
        setField(term1797, term1797.getClass(), "description", "DSNsTGYXDF");
        setField(term1797, term1797.getClass(), "imageUrl", "sQvGcVjdEx");
        setField(term1797, term1797.getClass(), "name", "rLHAoqXgPh");
        setField(term1758, term1758.getClass(), "category", term1797);
        Long term1837 = new Long(-3842548265506930260L);
        term1836 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term1836, term1836.getClass(), "id", term1837);
        setField(term1836, term1836.getClass(), "description", "zUlRdimJtU");
        setField(term1836, term1836.getClass(), "imageUrl", "vwbEQQNQrx");
        setField(term1836, term1836.getClass(), "name", "xtftXXMbem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse");
        Object[] args = new Object[1];
        args[0] = term1836;
        callMethod(klass, "setCategory", argTypes, term1758, args);
    }

};


