package com.alkemy.ong.infrastructure.rest.resource;

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
import static com.alkemy.ong.infrastructure.rest.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TestimonialResource_init_5906542581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TestimonialResource_init_5906542581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.TestimonialResource");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.testimonial.usecase.IDeleteTestimonialUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.testimonial.usecase.ICreateTestimonialUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.CreateTestimonialMapper");
        argTypes[3] = Class.forName("com.alkemy.ong.application.service.testimonial.usecase.IListTestimonialUseCase");
        argTypes[4] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.ListTestimonialMapper");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.common.PaginatedResultsRetrieved");
        argTypes[6] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.testimonial.UpdateTestimonialMapper");
        argTypes[7] = Class.forName("com.alkemy.ong.application.service.testimonial.usecase.IUpdateTestimonialUseCase");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


