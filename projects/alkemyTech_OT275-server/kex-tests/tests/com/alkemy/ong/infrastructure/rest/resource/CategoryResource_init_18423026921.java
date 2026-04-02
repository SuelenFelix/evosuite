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

public class CategoryResource_init_18423026921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public CategoryResource_init_18423026921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.CategoryResource");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.category.usecase.IUpdateCategoryUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.category.usecase.IDeleteCategoryUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.application.service.category.usecase.IListCategoryUseCase");
        argTypes[3] = Class.forName("com.alkemy.ong.application.service.category.usecase.IGetCategoryUseCase");
        argTypes[4] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.UpdateCategoryMapper");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.CreateCategoryMapper");
        argTypes[6] = Class.forName("com.alkemy.ong.application.service.category.usecase.ICreateCategoryUseCase");
        argTypes[7] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper");
        argTypes[8] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.ListCategoryMapper");
        argTypes[9] = Class.forName("com.alkemy.ong.infrastructure.common.PaginatedResultsRetrieved");
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


