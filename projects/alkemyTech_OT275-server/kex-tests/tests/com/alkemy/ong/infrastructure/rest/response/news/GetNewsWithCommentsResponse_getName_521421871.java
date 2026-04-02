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
import java.util.ArrayList;
import java.lang.Object;

public class GetNewsWithCommentsResponse_getName_521421871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GetNewsWithCommentsResponse_getName_521421871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term16, term16.getClass(), "body", "");
        Object term18 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term18, term18.getClass(), "body", "");
        Object term20 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term20, term20.getClass(), "body", "");
        Object term22 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term22, term22.getClass(), "body", "");
        Object term24 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term24, term24.getClass(), "body", "");
        ArrayList term14 = new ArrayList();
        ((ArrayList) term14).add(term16);
        ((ArrayList) term14).add(term18);
        ((ArrayList) term14).add(term20);
        ((ArrayList) term14).add(term22);
        ((ArrayList) term14).add(term24);
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "comments", term14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1, args);
    }

};


