package com.alkemy.ong.application.service.news;

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
import static com.alkemy.ong.application.service.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class UpdateNewsUseCaseService_update_4308105880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;
     Object term203;

    public UpdateNewsUseCaseService_update_4308105880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("com.alkemy.ong.application.service.news.UpdateNewsUseCaseService"));
        setField(term202, term202.getClass(), "newsRepository", null);
        Long term204 = new Long(5262507301787091109L);
        Long term243 = new Long(-6823727938421990489L);
        Long term284 = new Long(-484994522244390100L);
        Long term288 = new Long(1233889271256172047L);
        Long term291 = new Long(1439298019805881866L);
        Object term283 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term287 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term290 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term293 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term283, term283.getClass(), "id", term284);
        setField(term283, term283.getClass(), "body", "");
        setField(term287, term287.getClass(), "id", term288);
        setField(term287, term287.getClass(), "firstName", null);
        setField(term287, term287.getClass(), "lastName", null);
        setField(term287, term287.getClass(), "email", null);
        setField(term287, term287.getClass(), "password", null);
        setField(term287, term287.getClass(), "imageUrl", null);
        setField(term287, term287.getClass(), "role", null);
        setField(term287, term287.getClass(), "token", null);
        setField(term283, term283.getClass(), "createdBy", term287);
        setField(term290, term290.getClass(), "id", term291);
        setField(term290, term290.getClass(), "name", null);
        setField(term290, term290.getClass(), "content", null);
        setField(term290, term290.getClass(), "imageUrl", null);
        setField(term290, term290.getClass(), "category", null);
        setField(term290, term290.getClass(), "comments", null);
        setField(term283, term283.getClass(), "associatedNews", term290);
        setIntField(term293, term293.getClass(), "nanos", 647000000);
        setLongField(term293, term293.getClass(), "fastTime", 1725111417000L);
        setField(term293, term293.getClass(), "cdate", null);
        setField(term283, term283.getClass(), "createTimestamp", term293);
        Long term297 = new Long(3825396310311739952L);
        Object term296 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term300 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term301 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term302 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term296, term296.getClass(), "id", term297);
        setField(term296, term296.getClass(), "body", "");
        setField(term300, term300.getClass(), "id", null);
        setField(term300, term300.getClass(), "firstName", null);
        setField(term300, term300.getClass(), "lastName", null);
        setField(term300, term300.getClass(), "email", null);
        setField(term300, term300.getClass(), "password", null);
        setField(term300, term300.getClass(), "imageUrl", null);
        setField(term300, term300.getClass(), "role", null);
        setField(term300, term300.getClass(), "token", null);
        setField(term296, term296.getClass(), "createdBy", term300);
        setField(term301, term301.getClass(), "id", null);
        setField(term301, term301.getClass(), "name", null);
        setField(term301, term301.getClass(), "content", null);
        setField(term301, term301.getClass(), "imageUrl", null);
        setField(term301, term301.getClass(), "category", null);
        setField(term301, term301.getClass(), "comments", null);
        setField(term296, term296.getClass(), "associatedNews", term301);
        setIntField(term302, term302.getClass(), "nanos", 960000000);
        setLongField(term302, term302.getClass(), "fastTime", 1349058953000L);
        setField(term302, term302.getClass(), "cdate", null);
        setField(term296, term296.getClass(), "createTimestamp", term302);
        ArrayList term281 = new ArrayList();
        ((ArrayList) term281).add(term283);
        ((ArrayList) term281).add(term296);
        term203 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term242 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term203, term203.getClass(), "id", term204);
        setField(term203, term203.getClass(), "name", "PHvxnGHptP");
        setField(term203, term203.getClass(), "content", "TimdotUuNC");
        setField(term203, term203.getClass(), "imageUrl", "PkWMRdJcBb");
        setField(term242, term242.getClass(), "id", term243);
        setField(term242, term242.getClass(), "name", "jSpAteRute");
        setField(term242, term242.getClass(), "description", "swZVeJAxjt");
        setField(term242, term242.getClass(), "imageUrl", "xOcJIiQQDu");
        setField(term203, term203.getClass(), "category", term242);
        setField(term203, term203.getClass(), "comments", term281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.news.UpdateNewsUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.News");
        Object[] args = new Object[1];
        args[0] = term203;
        callMethod(klass, "update", argTypes, term202, args);
    }

};


