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

public class Board_getUser_18192102396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15283;

    public Board_getUser_18192102396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15471 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term15470 = ((Class) term15471).getDeclaredField((String) "ADMIN");
        ((Field) term15470).setAccessible(true);
        Object enum35 = ((Field) term15470).get((Object) null);
        Object term15374 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15377 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15380 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15382 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15374, term15374.getClass(), "id", -128490829);
        setField(term15374, term15374.getClass(), "content", "");
        setIntField(term15377, term15377.getClass(), "id", 202214133);
        setField(term15377, term15377.getClass(), "title", null);
        setField(term15377, term15377.getClass(), "content", null);
        setIntField(term15377, term15377.getClass(), "count", 1543091617);
        setField(term15377, term15377.getClass(), "user", null);
        setField(term15377, term15377.getClass(), "replys", null);
        setField(term15377, term15377.getClass(), "createDate", null);
        setField(term15374, term15374.getClass(), "board", term15377);
        setIntField(term15380, term15380.getClass(), "id", 723812297);
        setField(term15380, term15380.getClass(), "username", null);
        setField(term15380, term15380.getClass(), "password", null);
        setField(term15380, term15380.getClass(), "email", null);
        setField(term15380, term15380.getClass(), "role", enum35);
        setField(term15380, term15380.getClass(), "oauth", null);
        setField(term15380, term15380.getClass(), "createDate", null);
        setField(term15374, term15374.getClass(), "user", term15380);
        setField(term15382, term15382.getClass(), "date", null);
        setField(term15382, term15382.getClass(), "time", null);
        setField(term15374, term15374.getClass(), "createDate", term15382);
        Object term15383 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15386 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15389 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15391 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15383, term15383.getClass(), "id", 1639448749);
        setField(term15383, term15383.getClass(), "content", "");
        setIntField(term15386, term15386.getClass(), "id", 873659088);
        setField(term15386, term15386.getClass(), "title", null);
        setField(term15386, term15386.getClass(), "content", null);
        setIntField(term15386, term15386.getClass(), "count", -975748721);
        setField(term15386, term15386.getClass(), "user", null);
        setField(term15386, term15386.getClass(), "replys", null);
        setField(term15386, term15386.getClass(), "createDate", null);
        setField(term15383, term15383.getClass(), "board", term15386);
        setIntField(term15389, term15389.getClass(), "id", 853609788);
        setField(term15389, term15389.getClass(), "username", null);
        setField(term15389, term15389.getClass(), "password", null);
        setField(term15389, term15389.getClass(), "email", null);
        setField(term15389, term15389.getClass(), "role", null);
        setField(term15389, term15389.getClass(), "oauth", null);
        setField(term15389, term15389.getClass(), "createDate", null);
        setField(term15383, term15383.getClass(), "user", term15389);
        setField(term15391, term15391.getClass(), "date", null);
        setField(term15391, term15391.getClass(), "time", null);
        setField(term15383, term15383.getClass(), "createDate", term15391);
        Object term15392 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15395 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15398 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15400 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15392, term15392.getClass(), "id", 1964967720);
        setField(term15392, term15392.getClass(), "content", "");
        setIntField(term15395, term15395.getClass(), "id", 1351900243);
        setField(term15395, term15395.getClass(), "title", null);
        setField(term15395, term15395.getClass(), "content", null);
        setIntField(term15395, term15395.getClass(), "count", -330897705);
        setField(term15395, term15395.getClass(), "user", null);
        setField(term15395, term15395.getClass(), "replys", null);
        setField(term15395, term15395.getClass(), "createDate", null);
        setField(term15392, term15392.getClass(), "board", term15395);
        setIntField(term15398, term15398.getClass(), "id", 1065595802);
        setField(term15398, term15398.getClass(), "username", null);
        setField(term15398, term15398.getClass(), "password", null);
        setField(term15398, term15398.getClass(), "email", null);
        setField(term15398, term15398.getClass(), "role", enum35);
        setField(term15398, term15398.getClass(), "oauth", null);
        setField(term15398, term15398.getClass(), "createDate", null);
        setField(term15392, term15392.getClass(), "user", term15398);
        setField(term15400, term15400.getClass(), "date", null);
        setField(term15400, term15400.getClass(), "time", null);
        setField(term15392, term15392.getClass(), "createDate", term15400);
        Object term15401 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15404 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15407 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15401, term15401.getClass(), "id", 1608016787);
        setField(term15401, term15401.getClass(), "content", "");
        setIntField(term15404, term15404.getClass(), "id", 0);
        setField(term15404, term15404.getClass(), "title", null);
        setField(term15404, term15404.getClass(), "content", null);
        setIntField(term15404, term15404.getClass(), "count", 0);
        setField(term15404, term15404.getClass(), "user", null);
        setField(term15404, term15404.getClass(), "replys", null);
        setField(term15404, term15404.getClass(), "createDate", null);
        setField(term15401, term15401.getClass(), "board", term15404);
        setField(term15401, term15401.getClass(), "user", term15398);
        setField(term15407, term15407.getClass(), "date", null);
        setField(term15407, term15407.getClass(), "time", null);
        setField(term15401, term15401.getClass(), "createDate", term15407);
        ArrayList term15372 = new ArrayList();
        ((ArrayList) term15372).add(term15374);
        ((ArrayList) term15372).add(term15383);
        ((ArrayList) term15372).add(term15392);
        ((ArrayList) term15372).add(term15401);
        term15283 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15310 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15369 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term15410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15415 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15283, term15283.getClass(), "id", 243280944);
        setField(term15283, term15283.getClass(), "title", "kevWstoxwq");
        setField(term15283, term15283.getClass(), "content", "aSYOhFwzSm");
        setIntField(term15283, term15283.getClass(), "count", -726681073);
        setIntField(term15310, term15310.getClass(), "id", -1724487863);
        setField(term15310, term15310.getClass(), "username", "pVZlzrBeDB");
        setField(term15310, term15310.getClass(), "password", "EfSUvjuZAA");
        setField(term15310, term15310.getClass(), "email", "PrHWfHydsG");
        setField(term15310, term15310.getClass(), "role", enum35);
        setField(term15310, term15310.getClass(), "oauth", "igruEzTbBE");
        setIntField(term15369, term15369.getClass(), "nanos", 937000000);
        setLongField(term15369, term15369.getClass(), "fastTime", 1291589597000L);
        setField(term15369, term15369.getClass(), "cdate", null);
        setField(term15310, term15310.getClass(), "createDate", term15369);
        setField(term15283, term15283.getClass(), "user", term15310);
        setField(term15283, term15283.getClass(), "replys", term15372);
        setIntField(term15411, term15411.getClass(), "year", 2027);
        setShortField(term15411, term15411.getClass(), "month", (short) 8);
        setShortField(term15411, term15411.getClass(), "day", (short) 16);
        setField(term15410, term15410.getClass(), "date", term15411);
        setByteField(term15415, term15415.getClass(), "hour", (byte) 8);
        setByteField(term15415, term15415.getClass(), "minute", (byte) 3);
        setByteField(term15415, term15415.getClass(), "second", (byte) 15);
        setIntField(term15415, term15415.getClass(), "nano", 332963320);
        setField(term15410, term15410.getClass(), "time", term15415);
        setField(term15283, term15283.getClass(), "createDate", term15410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term15283, args);
    }

};


