package com.alkemy.ong.infrastructure.rest.response.testimonial;

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
import static com.alkemy.ong.infrastructure.rest.response.testimonial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class ListTestimonialResponse_getTestimonials_18057667553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public ListTestimonialResponse_getTestimonials_18057667553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term961 = new Long(7009926388951271268L);
        Object term960 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term960, term960.getClass(), "id", term961);
        setField(term960, term960.getClass(), "name", "");
        setField(term960, term960.getClass(), "content", "");
        setField(term960, term960.getClass(), "imageUrl", "");
        Long term967 = new Long(-7672528020740371001L);
        Object term966 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term966, term966.getClass(), "id", term967);
        setField(term966, term966.getClass(), "name", "");
        setField(term966, term966.getClass(), "content", "");
        setField(term966, term966.getClass(), "imageUrl", "");
        Long term973 = new Long(-4502405999831680926L);
        Object term972 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term972, term972.getClass(), "id", term973);
        setField(term972, term972.getClass(), "name", "");
        setField(term972, term972.getClass(), "content", "");
        setField(term972, term972.getClass(), "imageUrl", "");
        ArrayList term958 = new ArrayList();
        ((ArrayList) term958).add(term960);
        ((ArrayList) term958).add(term966);
        ((ArrayList) term958).add(term972);
        term957 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.ListTestimonialResponse"));
        setField(term957, term957.getClass(), "testimonials", term958);
        setIntField(term957, term957.getClass(), "page", 391863371);
        setIntField(term957, term957.getClass(), "size", -1922583790);
        setIntField(term957, term957.getClass(), "totalPages", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.ListTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestimonials", argTypes, term957, args);
    }

};


