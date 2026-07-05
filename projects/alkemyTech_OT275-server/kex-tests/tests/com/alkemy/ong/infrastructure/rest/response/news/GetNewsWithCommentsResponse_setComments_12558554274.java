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
import java.util.LinkedList;

public class GetNewsWithCommentsResponse_setComments_12558554274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;
     Object term153;

    public GetNewsWithCommentsResponse_setComments_12558554274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term143 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term143, term143.getClass(), "body", "");
        Object term145 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term145, term145.getClass(), "body", "");
        Object term147 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term147, term147.getClass(), "body", "");
        Object term149 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term149, term149.getClass(), "body", "");
        ArrayList term141 = new ArrayList();
        ((ArrayList) term141).add(term143);
        ((ArrayList) term141).add(term145);
        ((ArrayList) term141).add(term147);
        ((ArrayList) term141).add(term149);
        term128 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse"));
        setField(term128, term128.getClass(), "name", "ZiaGIbnzTs");
        setField(term128, term128.getClass(), "comments", term141);
        Object term156 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term156, term156.getClass(), "body", "RkybSrpybU");
        Object term170 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term170, term170.getClass(), "body", "");
        Object term173 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term173, term173.getClass(), "body", null);
        term153 = new LinkedList();
        ((LinkedList) term153).add(term156);
        ((LinkedList) term153).add(term170);
        ((LinkedList) term153).add(term173);
        ((LinkedList) term153).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term153;
        callMethod(klass, "setComments", argTypes, term128, args);
    }

};


