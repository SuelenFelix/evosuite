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

public class SlideResource_init_19714042011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public SlideResource_init_19714042011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.SlideResource");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.slide.usecase.IDeleteSlideUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.slide.usecase.IListSlideUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.application.service.slide.usecase.IGetSlideUseCase");
        argTypes[3] = Class.forName("com.alkemy.ong.application.service.slide.usecase.ICreateSlideUseCase");
        argTypes[4] = Class.forName("com.alkemy.ong.application.service.slide.usecase.IUpdateSlideUseCase");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.ListSlideMapper");
        argTypes[6] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.GetSlideMapper");
        argTypes[7] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.CreateSlideMapper");
        argTypes[8] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.UpdateSlideMapper");
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


