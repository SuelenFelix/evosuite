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

public class Comment_setBody_8167755297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8891;

    public Comment_setBody_8167755297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8892 = new Long(-5656664340499957324L);
        Long term8907 = new Long(-5460517064177800852L);
        Long term8970 = new Long(-5242567610844514867L);
        Long term9009 = new Long(-2951854704066477061L);
        Long term9048 = new Long(174253963298276221L);
        ArrayList term9086 = new ArrayList();
        term8891 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term8906 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term8969 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term9008 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term9047 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term9090 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term8891, term8891.getClass(), "id", term8892);
        setField(term8891, term8891.getClass(), "body", "zHiuLPzYQM");
        setField(term8906, term8906.getClass(), "id", term8907);
        setField(term8906, term8906.getClass(), "firstName", "ioYxUYJBrh");
        setField(term8906, term8906.getClass(), "lastName", "GXoLEdKEIe");
        setField(term8906, term8906.getClass(), "email", "EugWXkztim");
        setField(term8906, term8906.getClass(), "password", "DvRdOzzihn");
        setField(term8906, term8906.getClass(), "imageUrl", "wIygCdQAKO");
        setField(term8969, term8969.getClass(), "id", term8970);
        setField(term8969, term8969.getClass(), "name", "JsXroBYqwr");
        setField(term8969, term8969.getClass(), "description", "YciMAObLwl");
        setField(term8906, term8906.getClass(), "role", term8969);
        setField(term8906, term8906.getClass(), "token", "qAmVqwwdyf");
        setField(term8891, term8891.getClass(), "createdBy", term8906);
        setField(term9008, term9008.getClass(), "id", term9009);
        setField(term9008, term9008.getClass(), "name", "IXPaHQnEUy");
        setField(term9008, term9008.getClass(), "content", "zhcWVVrrjs");
        setField(term9008, term9008.getClass(), "imageUrl", "EAMaFLdmaG");
        setField(term9047, term9047.getClass(), "id", term9048);
        setField(term9047, term9047.getClass(), "name", "DYZSJMwbhX");
        setField(term9047, term9047.getClass(), "description", "QGcshsIIWo");
        setField(term9047, term9047.getClass(), "imageUrl", "dPHtrzKWgf");
        setField(term9008, term9008.getClass(), "category", term9047);
        setField(term9008, term9008.getClass(), "comments", term9086);
        setField(term8891, term8891.getClass(), "associatedNews", term9008);
        setIntField(term9090, term9090.getClass(), "nanos", 918000000);
        setLongField(term9090, term9090.getClass(), "fastTime", 1659983392000L);
        setField(term9090, term9090.getClass(), "cdate", null);
        setField(term8891, term8891.getClass(), "createTimestamp", term9090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "olmFxfIVeh";
        callMethod(klass, "setBody", argTypes, term8891, args);
    }

};


