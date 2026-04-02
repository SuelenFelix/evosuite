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

public class Reply_setContent_93511673011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5256;

    public Reply_setContent_93511673011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5512 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term5511 = ((Class) term5512).getDeclaredField((String) "ADMIN");
        ((Field) term5511).setAccessible(true);
        Object enum10 = ((Field) term5511).get((Object) null);
        ArrayList term5353 = new ArrayList();
        Class<? extends Object> term5709 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term5708 = ((Class) term5709).getDeclaredField((String) "ADMIN");
        ((Field) term5708).setAccessible(true);
        Object enum11 = ((Field) term5708).get((Object) null);
        term5256 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term5270 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term5297 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term5350 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5362 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5367 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term5426 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5429 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5430 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5434 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term5256, term5256.getClass(), "id", 548228925);
        setField(term5256, term5256.getClass(), "content", "sOdkipUKRu");
        setIntField(term5270, term5270.getClass(), "id", -749861210);
        setField(term5270, term5270.getClass(), "title", "oKwCDqywym");
        setField(term5270, term5270.getClass(), "content", "zjZYTddemL");
        setIntField(term5270, term5270.getClass(), "count", 1694224101);
        setIntField(term5297, term5297.getClass(), "id", 937859191);
        setField(term5297, term5297.getClass(), "username", "QtrylgCLiF");
        setField(term5297, term5297.getClass(), "password", "orEuhCStGM");
        setField(term5297, term5297.getClass(), "email", "HhEaSXWvrY");
        setField(term5297, term5297.getClass(), "role", enum10);
        setField(term5297, term5297.getClass(), "oauth", "CVRGEomOth");
        setIntField(term5350, term5350.getClass(), "nanos", 394000000);
        setLongField(term5350, term5350.getClass(), "fastTime", 1362769763000L);
        setField(term5350, term5350.getClass(), "cdate", null);
        setField(term5297, term5297.getClass(), "createDate", term5350);
        setField(term5270, term5270.getClass(), "user", term5297);
        setField(term5270, term5270.getClass(), "replys", term5353);
        setIntField(term5358, term5358.getClass(), "year", 2020);
        setShortField(term5358, term5358.getClass(), "month", (short) 5);
        setShortField(term5358, term5358.getClass(), "day", (short) 12);
        setField(term5357, term5357.getClass(), "date", term5358);
        setByteField(term5362, term5362.getClass(), "hour", (byte) 0);
        setByteField(term5362, term5362.getClass(), "minute", (byte) 15);
        setByteField(term5362, term5362.getClass(), "second", (byte) 24);
        setIntField(term5362, term5362.getClass(), "nano", 250257744);
        setField(term5357, term5357.getClass(), "time", term5362);
        setField(term5270, term5270.getClass(), "createDate", term5357);
        setField(term5256, term5256.getClass(), "board", term5270);
        setIntField(term5367, term5367.getClass(), "id", -916584829);
        setField(term5367, term5367.getClass(), "username", "vSeruUyNWX");
        setField(term5367, term5367.getClass(), "password", "UkKvaeJfEC");
        setField(term5367, term5367.getClass(), "email", "WPxXsahPRq");
        setField(term5367, term5367.getClass(), "role", enum11);
        setField(term5367, term5367.getClass(), "oauth", "IENRuqmwUU");
        setIntField(term5426, term5426.getClass(), "nanos", 281000000);
        setLongField(term5426, term5426.getClass(), "fastTime", 1853953179000L);
        setField(term5426, term5426.getClass(), "cdate", null);
        setField(term5367, term5367.getClass(), "createDate", term5426);
        setField(term5256, term5256.getClass(), "user", term5367);
        setIntField(term5430, term5430.getClass(), "year", 2013);
        setShortField(term5430, term5430.getClass(), "month", (short) 9);
        setShortField(term5430, term5430.getClass(), "day", (short) 19);
        setField(term5429, term5429.getClass(), "date", term5430);
        setByteField(term5434, term5434.getClass(), "hour", (byte) 12);
        setByteField(term5434, term5434.getClass(), "minute", (byte) 29);
        setByteField(term5434, term5434.getClass(), "second", (byte) 28);
        setIntField(term5434, term5434.getClass(), "nano", 244069764);
        setField(term5429, term5429.getClass(), "time", term5434);
        setField(term5256, term5256.getClass(), "createDate", term5429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GsWxOwXvSu";
        callMethod(klass, "setContent", argTypes, term5256, args);
    }

};


