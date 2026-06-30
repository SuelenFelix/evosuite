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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class ListNewsResponse_init_4720520992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300;

    public ListNewsResponse_init_4720520992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term304 = new Long(-6573104506744284592L);
        Long term343 = new Long(-4920224193275732920L);
        Object term303 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term342 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term303, term303.getClass(), "id", term304);
        setField(term303, term303.getClass(), "name", "wGmYcqUkgE");
        setField(term303, term303.getClass(), "content", "idgaQsnJpQ");
        setField(term303, term303.getClass(), "imageUrl", "VgZnGoIFwQ");
        setField(term342, term342.getClass(), "id", term343);
        setField(term342, term342.getClass(), "description", "");
        setField(term342, term342.getClass(), "imageUrl", "");
        setField(term342, term342.getClass(), "name", "");
        setField(term303, term303.getClass(), "category", term342);
        Long term350 = new Long(8428634514691209827L);
        Long term356 = new Long(-2585684163342970173L);
        Object term349 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term355 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term349, term349.getClass(), "id", term350);
        setField(term349, term349.getClass(), "name", "");
        setField(term349, term349.getClass(), "content", "");
        setField(term349, term349.getClass(), "imageUrl", "");
        setField(term355, term355.getClass(), "id", term356);
        setField(term355, term355.getClass(), "description", null);
        setField(term355, term355.getClass(), "imageUrl", null);
        setField(term355, term355.getClass(), "name", null);
        setField(term349, term349.getClass(), "category", term355);
        Long term360 = new Long(8059786003080744426L);
        Object term359 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        setField(term359, term359.getClass(), "id", term360);
        setField(term359, term359.getClass(), "name", null);
        setField(term359, term359.getClass(), "content", null);
        setField(term359, term359.getClass(), "imageUrl", null);
        setField(term359, term359.getClass(), "category", null);
        term300 = new LinkedList();
        ((LinkedList) term300).add(term303);
        ((LinkedList) term300).add(term349);
        ((LinkedList) term300).add(term359);
        ((LinkedList) term300).add((Object)null);
        ((LinkedList) term300).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListNewsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term300;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


