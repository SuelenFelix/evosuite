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

public class Board_equals_15345773219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19144;
     Object term19265;

    public Board_equals_15345773219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19317 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term19316 = ((Class) term19317).getDeclaredField((String) "ADMIN");
        ((Field) term19316).setAccessible(true);
        Object enum46 = ((Field) term19316).get((Object) null);
        Object term19235 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term19238 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term19241 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term19243 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term19235, term19235.getClass(), "id", -802592348);
        setField(term19235, term19235.getClass(), "content", "");
        setIntField(term19238, term19238.getClass(), "id", -1576584269);
        setField(term19238, term19238.getClass(), "title", null);
        setField(term19238, term19238.getClass(), "content", null);
        setIntField(term19238, term19238.getClass(), "count", 1474899591);
        setField(term19238, term19238.getClass(), "user", null);
        setField(term19238, term19238.getClass(), "replys", null);
        setField(term19238, term19238.getClass(), "createDate", null);
        setField(term19235, term19235.getClass(), "board", term19238);
        setIntField(term19241, term19241.getClass(), "id", -1485916498);
        setField(term19241, term19241.getClass(), "username", null);
        setField(term19241, term19241.getClass(), "password", null);
        setField(term19241, term19241.getClass(), "email", null);
        setField(term19241, term19241.getClass(), "role", enum46);
        setField(term19241, term19241.getClass(), "oauth", null);
        setField(term19241, term19241.getClass(), "createDate", null);
        setField(term19235, term19235.getClass(), "user", term19241);
        setField(term19243, term19243.getClass(), "date", null);
        setField(term19243, term19243.getClass(), "time", null);
        setField(term19235, term19235.getClass(), "createDate", term19243);
        Object term19244 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term19247 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term19250 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term19252 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term19244, term19244.getClass(), "id", 722787672);
        setField(term19244, term19244.getClass(), "content", "");
        setIntField(term19247, term19247.getClass(), "id", 2077491675);
        setField(term19247, term19247.getClass(), "title", null);
        setField(term19247, term19247.getClass(), "content", null);
        setIntField(term19247, term19247.getClass(), "count", -1728316609);
        setField(term19247, term19247.getClass(), "user", null);
        setField(term19247, term19247.getClass(), "replys", null);
        setField(term19247, term19247.getClass(), "createDate", null);
        setField(term19244, term19244.getClass(), "board", term19247);
        setIntField(term19250, term19250.getClass(), "id", 297582552);
        setField(term19250, term19250.getClass(), "username", null);
        setField(term19250, term19250.getClass(), "password", null);
        setField(term19250, term19250.getClass(), "email", null);
        setField(term19250, term19250.getClass(), "role", enum46);
        setField(term19250, term19250.getClass(), "oauth", null);
        setField(term19250, term19250.getClass(), "createDate", null);
        setField(term19244, term19244.getClass(), "user", term19250);
        setField(term19252, term19252.getClass(), "date", null);
        setField(term19252, term19252.getClass(), "time", null);
        setField(term19244, term19244.getClass(), "createDate", term19252);
        ArrayList term19233 = new ArrayList();
        ((ArrayList) term19233).add(term19235);
        ((ArrayList) term19233).add(term19244);
        term19144 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term19171 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term19230 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term19255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19260 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19144, term19144.getClass(), "id", 1743398246);
        setField(term19144, term19144.getClass(), "title", "UsCZaSgXzI");
        setField(term19144, term19144.getClass(), "content", "IXZCeVwvBM");
        setIntField(term19144, term19144.getClass(), "count", -934658823);
        setIntField(term19171, term19171.getClass(), "id", 1632177303);
        setField(term19171, term19171.getClass(), "username", "ElTdyUVQYi");
        setField(term19171, term19171.getClass(), "password", "KkgJnxXxVl");
        setField(term19171, term19171.getClass(), "email", "TGnzPlGFMb");
        setField(term19171, term19171.getClass(), "role", enum46);
        setField(term19171, term19171.getClass(), "oauth", "yEvLMSpdHy");
        setIntField(term19230, term19230.getClass(), "nanos", 341000000);
        setLongField(term19230, term19230.getClass(), "fastTime", 1373113661000L);
        setField(term19230, term19230.getClass(), "cdate", null);
        setField(term19171, term19171.getClass(), "createDate", term19230);
        setField(term19144, term19144.getClass(), "user", term19171);
        setField(term19144, term19144.getClass(), "replys", term19233);
        setIntField(term19256, term19256.getClass(), "year", 2016);
        setShortField(term19256, term19256.getClass(), "month", (short) 11);
        setShortField(term19256, term19256.getClass(), "day", (short) 8);
        setField(term19255, term19255.getClass(), "date", term19256);
        setByteField(term19260, term19260.getClass(), "hour", (byte) 7);
        setByteField(term19260, term19260.getClass(), "minute", (byte) 33);
        setByteField(term19260, term19260.getClass(), "second", (byte) 30);
        setIntField(term19260, term19260.getClass(), "nano", 274725601);
        setField(term19255, term19255.getClass(), "time", term19260);
        setField(term19144, term19144.getClass(), "createDate", term19255);
        term19265 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19265;
        callMethod(klass, "equals", argTypes, term19144, args);
    }

};


