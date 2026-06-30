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

public class GetNewsWithCommentsResponse_setName_16677343813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public GetNewsWithCommentsResponse_setName_16677343813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term88, term88.getClass(), "body", "");
        Object term90 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term90, term90.getClass(), "body", "");
        Object term92 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term92, term92.getClass(), "body", "");
        ArrayList term86 = new ArrayList();
        ((ArrayList) term86).add(term88);
        ((ArrayList) term86).add(term90);
        ((ArrayList) term86).add(term92);
        term73 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse"));
        setField(term73, term73.getClass(), "name", "uuaPigETmJ");
        setField(term73, term73.getClass(), "comments", term86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "setName", argTypes, term73, args);
    }

};


