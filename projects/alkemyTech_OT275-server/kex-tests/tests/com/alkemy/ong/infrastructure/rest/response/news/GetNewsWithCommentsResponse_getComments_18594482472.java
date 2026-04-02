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

public class GetNewsWithCommentsResponse_getComments_18594482472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;

    public GetNewsWithCommentsResponse_getComments_18594482472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term53, term53.getClass(), "body", "");
        Object term55 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term55, term55.getClass(), "body", "");
        Object term57 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term57, term57.getClass(), "body", "");
        Object term59 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.comment.GetCommentResponse"));
        setField(term59, term59.getClass(), "body", "");
        ArrayList term51 = new ArrayList();
        ((ArrayList) term51).add(term53);
        ((ArrayList) term51).add(term55);
        ((ArrayList) term51).add(term57);
        ((ArrayList) term51).add(term59);
        term38 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse"));
        setField(term38, term38.getClass(), "name", "SzjVpOQTyS");
        setField(term38, term38.getClass(), "comments", term51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsWithCommentsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term38, args);
    }

};


