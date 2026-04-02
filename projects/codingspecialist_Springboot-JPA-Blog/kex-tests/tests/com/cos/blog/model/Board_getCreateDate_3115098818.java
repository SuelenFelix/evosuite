package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Board_getCreateDate_3115098818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15987;

    public Board_getCreateDate_3115098818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16149 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term16148 = ((Class) term16149).getDeclaredField((String) "USER");
        ((Field) term16148).setAccessible(true);
        Object enum37 = ((Field) term16148).get((Object) null);
        Object term16077 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term16080 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16083 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16085 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term16077, term16077.getClass(), "id", 2068435279);
        setField(term16077, term16077.getClass(), "content", "");
        setIntField(term16080, term16080.getClass(), "id", -1556527718);
        setField(term16080, term16080.getClass(), "title", null);
        setField(term16080, term16080.getClass(), "content", null);
        setIntField(term16080, term16080.getClass(), "count", 895255351);
        setField(term16080, term16080.getClass(), "user", null);
        setField(term16080, term16080.getClass(), "replys", null);
        setField(term16080, term16080.getClass(), "createDate", null);
        setField(term16077, term16077.getClass(), "board", term16080);
        setIntField(term16083, term16083.getClass(), "id", -1428063820);
        setField(term16083, term16083.getClass(), "username", null);
        setField(term16083, term16083.getClass(), "password", null);
        setField(term16083, term16083.getClass(), "email", null);
        setField(term16083, term16083.getClass(), "role", null);
        setField(term16083, term16083.getClass(), "oauth", null);
        setField(term16083, term16083.getClass(), "createDate", null);
        setField(term16077, term16077.getClass(), "user", term16083);
        setField(term16085, term16085.getClass(), "date", null);
        setField(term16085, term16085.getClass(), "time", null);
        setField(term16077, term16077.getClass(), "createDate", term16085);
        ArrayList term16075 = new ArrayList();
        ((ArrayList) term16075).add(term16077);
        term15987 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16014 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16072 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term16088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16093 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15987, term15987.getClass(), "id", 1237549886);
        setField(term15987, term15987.getClass(), "title", "dUHylIprea");
        setField(term15987, term15987.getClass(), "content", "FKDqHRpMcc");
        setIntField(term15987, term15987.getClass(), "count", -1945635750);
        setIntField(term16014, term16014.getClass(), "id", -1622760744);
        setField(term16014, term16014.getClass(), "username", "mIRMQIxHUD");
        setField(term16014, term16014.getClass(), "password", "FbBMtntDbw");
        setField(term16014, term16014.getClass(), "email", "zRnpRGaHlI");
        setField(term16014, term16014.getClass(), "role", enum37);
        setField(term16014, term16014.getClass(), "oauth", "dVHfxjbMRK");
        setIntField(term16072, term16072.getClass(), "nanos", 416000000);
        setLongField(term16072, term16072.getClass(), "fastTime", 1744259919000L);
        setField(term16072, term16072.getClass(), "cdate", null);
        setField(term16014, term16014.getClass(), "createDate", term16072);
        setField(term15987, term15987.getClass(), "user", term16014);
        setField(term15987, term15987.getClass(), "replys", term16075);
        setIntField(term16089, term16089.getClass(), "year", 2014);
        setShortField(term16089, term16089.getClass(), "month", (short) 2);
        setShortField(term16089, term16089.getClass(), "day", (short) 26);
        setField(term16088, term16088.getClass(), "date", term16089);
        setByteField(term16093, term16093.getClass(), "hour", (byte) 16);
        setByteField(term16093, term16093.getClass(), "minute", (byte) 42);
        setByteField(term16093, term16093.getClass(), "second", (byte) 39);
        setIntField(term16093, term16093.getClass(), "nano", 690212071);
        setField(term16088, term16088.getClass(), "time", term16093);
        setField(term15987, term15987.getClass(), "createDate", term16088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term15987, args);
    }

};


