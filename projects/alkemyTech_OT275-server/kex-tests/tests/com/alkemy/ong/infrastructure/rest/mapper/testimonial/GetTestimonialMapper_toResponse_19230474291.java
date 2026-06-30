package com.alkemy.ong.infrastructure.rest.mapper.testimonial;

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
import static com.alkemy.ong.infrastructure.rest.mapper.testimonial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class GetTestimonialMapper_toResponse_19230474291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term73;

    public GetTestimonialMapper_toResponse_19230474291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.GetTestimonialMapper"));
        Long term77 = new Long(6375119433582206027L);
        Object term76 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term76, term76.getClass(), "id", term77);
        setField(term76, term76.getClass(), "name", "xxtlPwDYFs");
        setField(term76, term76.getClass(), "content", "jJCZpVmanW");
        setField(term76, term76.getClass(), "imageUrl", "EGtDIRbSSb");
        Long term117 = new Long(-8257434502486459194L);
        Object term116 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term116, term116.getClass(), "id", term117);
        setField(term116, term116.getClass(), "name", "");
        setField(term116, term116.getClass(), "content", "");
        setField(term116, term116.getClass(), "imageUrl", "");
        Long term124 = new Long(-8400487765614892086L);
        Object term123 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term123, term123.getClass(), "id", term124);
        setField(term123, term123.getClass(), "name", null);
        setField(term123, term123.getClass(), "content", null);
        setField(term123, term123.getClass(), "imageUrl", null);
        term73 = new LinkedList();
        ((LinkedList) term73).add(term76);
        ((LinkedList) term73).add(term116);
        ((LinkedList) term73).add(term123);
        ((LinkedList) term73).add((Object)null);
        ((LinkedList) term73).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.GetTestimonialMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term73;
        callMethod(klass, "toResponse", argTypes, term72, args);
    }

};


