package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class News_setComments_90720365411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19316;
     Object term19420;

    public News_setComments_90720365411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19317 = new Long(4337555582321907177L);
        Long term19356 = new Long(-6367418587326372844L);
        Long term19397 = new Long(6371581018571997173L);
        Long term19401 = new Long(6604328992663797314L);
        Long term19404 = new Long(7921404547326630089L);
        Object term19396 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term19400 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term19403 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term19406 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term19396, term19396.getClass(), "id", term19397);
        setField(term19396, term19396.getClass(), "body", "");
        setField(term19400, term19400.getClass(), "id", term19401);
        setField(term19400, term19400.getClass(), "firstName", null);
        setField(term19400, term19400.getClass(), "lastName", null);
        setField(term19400, term19400.getClass(), "email", null);
        setField(term19400, term19400.getClass(), "password", null);
        setField(term19400, term19400.getClass(), "imageUrl", null);
        setField(term19400, term19400.getClass(), "role", null);
        setField(term19400, term19400.getClass(), "token", null);
        setField(term19396, term19396.getClass(), "createdBy", term19400);
        setField(term19403, term19403.getClass(), "id", term19404);
        setField(term19403, term19403.getClass(), "name", null);
        setField(term19403, term19403.getClass(), "content", null);
        setField(term19403, term19403.getClass(), "imageUrl", null);
        setField(term19403, term19403.getClass(), "category", null);
        setField(term19403, term19403.getClass(), "comments", null);
        setField(term19396, term19396.getClass(), "associatedNews", term19403);
        setIntField(term19406, term19406.getClass(), "nanos", 891000000);
        setLongField(term19406, term19406.getClass(), "fastTime", 1303208814000L);
        setField(term19406, term19406.getClass(), "cdate", null);
        setField(term19396, term19396.getClass(), "createTimestamp", term19406);
        Long term19410 = new Long(-205762347192500511L);
        Object term19409 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term19413 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term19414 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term19415 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term19409, term19409.getClass(), "id", term19410);
        setField(term19409, term19409.getClass(), "body", "");
        setField(term19413, term19413.getClass(), "id", null);
        setField(term19413, term19413.getClass(), "firstName", null);
        setField(term19413, term19413.getClass(), "lastName", null);
        setField(term19413, term19413.getClass(), "email", null);
        setField(term19413, term19413.getClass(), "password", null);
        setField(term19413, term19413.getClass(), "imageUrl", null);
        setField(term19413, term19413.getClass(), "role", null);
        setField(term19413, term19413.getClass(), "token", null);
        setField(term19409, term19409.getClass(), "createdBy", term19413);
        setField(term19414, term19414.getClass(), "id", null);
        setField(term19414, term19414.getClass(), "name", null);
        setField(term19414, term19414.getClass(), "content", null);
        setField(term19414, term19414.getClass(), "imageUrl", null);
        setField(term19414, term19414.getClass(), "category", null);
        setField(term19414, term19414.getClass(), "comments", null);
        setField(term19409, term19409.getClass(), "associatedNews", term19414);
        setIntField(term19415, term19415.getClass(), "nanos", 711000000);
        setLongField(term19415, term19415.getClass(), "fastTime", 1312175339000L);
        setField(term19415, term19415.getClass(), "cdate", null);
        setField(term19409, term19409.getClass(), "createTimestamp", term19415);
        ArrayList term19394 = new ArrayList();
        ((ArrayList) term19394).add(term19396);
        ((ArrayList) term19394).add(term19409);
        term19316 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term19355 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term19316, term19316.getClass(), "id", term19317);
        setField(term19316, term19316.getClass(), "name", "Clkrygzvpw");
        setField(term19316, term19316.getClass(), "content", "TPzGOBNENK");
        setField(term19316, term19316.getClass(), "imageUrl", "ADhlvQDtuh");
        setField(term19355, term19355.getClass(), "id", term19356);
        setField(term19355, term19355.getClass(), "name", "rvUfMhtNrD");
        setField(term19355, term19355.getClass(), "description", "tVJNKfGPYg");
        setField(term19355, term19355.getClass(), "imageUrl", "AlAUNSOTmH");
        setField(term19316, term19316.getClass(), "category", term19355);
        setField(term19316, term19316.getClass(), "comments", term19394);
        term19420 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19420;
        callMethod(klass, "setComments", argTypes, term19316, args);
    }

};


