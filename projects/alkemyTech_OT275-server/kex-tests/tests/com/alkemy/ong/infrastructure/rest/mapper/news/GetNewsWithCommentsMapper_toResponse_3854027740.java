package com.alkemy.ong.infrastructure.rest.mapper.news;

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
import static com.alkemy.ong.infrastructure.rest.mapper.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class GetNewsWithCommentsMapper_toResponse_3854027740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;
     Object term356;

    public GetNewsWithCommentsMapper_toResponse_3854027740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsWithCommentsMapper"));
        Object term355 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.GetCommentMapper"));
        setField(term354, term354.getClass(), "getCommentMapper", term355);
        Long term357 = new Long(-5447369594017685765L);
        Long term396 = new Long(-5724112525188606013L);
        Long term437 = new Long(-6100012593724108983L);
        Long term441 = new Long(5465527210299101732L);
        Long term444 = new Long(-78240609295693193L);
        Object term436 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term440 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term443 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term446 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term436, term436.getClass(), "id", term437);
        setField(term436, term436.getClass(), "body", "");
        setField(term440, term440.getClass(), "id", term441);
        setField(term440, term440.getClass(), "firstName", null);
        setField(term440, term440.getClass(), "lastName", null);
        setField(term440, term440.getClass(), "email", null);
        setField(term440, term440.getClass(), "password", null);
        setField(term440, term440.getClass(), "imageUrl", null);
        setField(term440, term440.getClass(), "role", null);
        setField(term440, term440.getClass(), "token", null);
        setField(term436, term436.getClass(), "createdBy", term440);
        setField(term443, term443.getClass(), "id", term444);
        setField(term443, term443.getClass(), "name", null);
        setField(term443, term443.getClass(), "content", null);
        setField(term443, term443.getClass(), "imageUrl", null);
        setField(term443, term443.getClass(), "category", null);
        setField(term443, term443.getClass(), "comments", null);
        setField(term436, term436.getClass(), "associatedNews", term443);
        setIntField(term446, term446.getClass(), "nanos", 666000000);
        setLongField(term446, term446.getClass(), "fastTime", 1395468691000L);
        setField(term446, term446.getClass(), "cdate", null);
        setField(term436, term436.getClass(), "createTimestamp", term446);
        Long term450 = new Long(185793058502220865L);
        Long term454 = new Long(-7698746988132548371L);
        Long term457 = new Long(2191130532479601175L);
        Object term449 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term453 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term456 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term459 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term449, term449.getClass(), "id", term450);
        setField(term449, term449.getClass(), "body", "");
        setField(term453, term453.getClass(), "id", term454);
        setField(term453, term453.getClass(), "firstName", null);
        setField(term453, term453.getClass(), "lastName", null);
        setField(term453, term453.getClass(), "email", null);
        setField(term453, term453.getClass(), "password", null);
        setField(term453, term453.getClass(), "imageUrl", null);
        setField(term453, term453.getClass(), "role", null);
        setField(term453, term453.getClass(), "token", null);
        setField(term449, term449.getClass(), "createdBy", term453);
        setField(term456, term456.getClass(), "id", term457);
        setField(term456, term456.getClass(), "name", null);
        setField(term456, term456.getClass(), "content", null);
        setField(term456, term456.getClass(), "imageUrl", null);
        setField(term456, term456.getClass(), "category", null);
        setField(term456, term456.getClass(), "comments", null);
        setField(term449, term449.getClass(), "associatedNews", term456);
        setIntField(term459, term459.getClass(), "nanos", 832000000);
        setLongField(term459, term459.getClass(), "fastTime", 1628684516000L);
        setField(term459, term459.getClass(), "cdate", null);
        setField(term449, term449.getClass(), "createTimestamp", term459);
        ArrayList term434 = new ArrayList();
        ((ArrayList) term434).add(term436);
        ((ArrayList) term434).add(term449);
        term356 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term395 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term356, term356.getClass(), "id", term357);
        setField(term356, term356.getClass(), "name", "wsysQLGFnl");
        setField(term356, term356.getClass(), "content", "ckQLZGFjMX");
        setField(term356, term356.getClass(), "imageUrl", "qphdrqUtNx");
        setField(term395, term395.getClass(), "id", term396);
        setField(term395, term395.getClass(), "name", "bwlLFAfNWx");
        setField(term395, term395.getClass(), "description", "JWodNQzjjV");
        setField(term395, term395.getClass(), "imageUrl", "CAgxWjhxNf");
        setField(term356, term356.getClass(), "category", term395);
        setField(term356, term356.getClass(), "comments", term434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsWithCommentsMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.News");
        Object[] args = new Object[1];
        args[0] = term356;
        callMethod(klass, "toResponse", argTypes, term354, args);
    }

};


