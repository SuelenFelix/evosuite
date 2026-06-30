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
import java.lang.Object;

public class NewsResource_init_4240896100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term32;
     Object term34;
     Object term36;
     Object term38;
     Object term41;

    public NewsResource_init_4240896100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper"));
        Object term31 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term30, term30.getClass(), "getCategoryMapper", term31);
        term32 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.CreateNewsMapper"));
        Object term33 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term32, term32.getClass(), "getCategoryMapper", term33);
        term34 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsWithCommentsMapper"));
        Object term35 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.GetCommentMapper"));
        setField(term34, term34.getClass(), "getCommentMapper", term35);
        term36 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.UpdateNewsMapper"));
        Object term37 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term36, term36.getClass(), "getCategoryMapper", term37);
        term38 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.ListNewsMapper"));
        Object term39 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper"));
        Object term40 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term39, term39.getClass(), "getCategoryMapper", term40);
        setField(term38, term38.getClass(), "getNewsMapper", term39);
        term41 = newInstance(Class.forName("com.alkemy.ong.infrastructure.common.PaginatedResultsRetrieved"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.NewsResource");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.news.usecase.IDeleteNewsUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.news.usecase.IGetNewsUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.application.service.news.usecase.IGetNewsWithCommentsUseCase");
        argTypes[3] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper");
        argTypes[4] = Class.forName("com.alkemy.ong.application.service.news.usecase.ICreateNewsUseCase");
        argTypes[5] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.CreateNewsMapper");
        argTypes[6] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsWithCommentsMapper");
        argTypes[7] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.UpdateNewsMapper");
        argTypes[8] = Class.forName("com.alkemy.ong.application.service.news.usecase.IUpdateNewsUseCase");
        argTypes[9] = Class.forName("com.alkemy.ong.application.service.news.usecase.IListNewsUseCase");
        argTypes[10] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.ListNewsMapper");
        argTypes[11] = Class.forName("com.alkemy.ong.infrastructure.common.PaginatedResultsRetrieved");
        Object[] args = new Object[12];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term30;
        args[4] = null;
        args[5] = term32;
        args[6] = term34;
        args[7] = term36;
        args[8] = null;
        args[9] = null;
        args[10] = term38;
        args[11] = term41;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


