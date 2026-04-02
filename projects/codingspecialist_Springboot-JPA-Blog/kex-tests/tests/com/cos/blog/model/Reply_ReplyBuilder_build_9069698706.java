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

public class Reply_ReplyBuilder_build_9069698706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44854;

    public Reply_ReplyBuilder_build_9069698706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45107 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term45106 = ((Class) term45107).getDeclaredField((String) "USER");
        ((Field) term45106).setAccessible(true);
        Object enum94 = ((Field) term45106).get((Object) null);
        Object term44953 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44953, term44953.getClass(), "id", -1413291732);
        setField(term44953, term44953.getClass(), "content", null);
        setField(term44953, term44953.getClass(), "board", null);
        setField(term44953, term44953.getClass(), "user", null);
        setField(term44953, term44953.getClass(), "createDate", null);
        Object term44955 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44955, term44955.getClass(), "id", 1017354215);
        setField(term44955, term44955.getClass(), "content", null);
        setField(term44955, term44955.getClass(), "board", null);
        setField(term44955, term44955.getClass(), "user", null);
        setField(term44955, term44955.getClass(), "createDate", null);
        Object term44957 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44957, term44957.getClass(), "id", 1469939797);
        setField(term44957, term44957.getClass(), "content", null);
        setField(term44957, term44957.getClass(), "board", null);
        setField(term44957, term44957.getClass(), "user", null);
        setField(term44957, term44957.getClass(), "createDate", null);
        Object term44959 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44959, term44959.getClass(), "id", 0);
        setField(term44959, term44959.getClass(), "content", null);
        setField(term44959, term44959.getClass(), "board", null);
        setField(term44959, term44959.getClass(), "user", null);
        setField(term44959, term44959.getClass(), "createDate", null);
        Object term44961 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44961, term44961.getClass(), "id", 1810754549);
        setField(term44961, term44961.getClass(), "content", null);
        setField(term44961, term44961.getClass(), "board", null);
        setField(term44961, term44961.getClass(), "user", null);
        setField(term44961, term44961.getClass(), "createDate", null);
        ArrayList term44951 = new ArrayList();
        ((ArrayList) term44951).add(term44953);
        ((ArrayList) term44951).add(term44955);
        ((ArrayList) term44951).add(term44957);
        ((ArrayList) term44951).add(term44959);
        ((ArrayList) term44951).add(term44959);
        ((ArrayList) term44951).add(term44961);
        Class<? extends Object> term45301 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term45300 = ((Class) term45301).getDeclaredField((String) "USER");
        ((Field) term45300).setAccessible(true);
        Object enum95 = ((Field) term45300).get((Object) null);
        term44854 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term44868 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term44895 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term44948 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44970 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44975 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term45033 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45041 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term44854, term44854.getClass(), "id", 407708341);
        setField(term44854, term44854.getClass(), "content", "UfdjcAQclb");
        setIntField(term44868, term44868.getClass(), "id", -287519200);
        setField(term44868, term44868.getClass(), "title", "skKLlFIRTI");
        setField(term44868, term44868.getClass(), "content", "SfjOvqPCwx");
        setIntField(term44868, term44868.getClass(), "count", -1490696181);
        setIntField(term44895, term44895.getClass(), "id", 623717232);
        setField(term44895, term44895.getClass(), "username", "rinBVtrpcr");
        setField(term44895, term44895.getClass(), "password", "KjCvQWfqew");
        setField(term44895, term44895.getClass(), "email", "WewLrXvLmC");
        setField(term44895, term44895.getClass(), "role", enum94);
        setField(term44895, term44895.getClass(), "oauth", "vbEYtFntxd");
        setIntField(term44948, term44948.getClass(), "nanos", 546000000);
        setLongField(term44948, term44948.getClass(), "fastTime", 1499771491000L);
        setField(term44948, term44948.getClass(), "cdate", null);
        setField(term44895, term44895.getClass(), "createDate", term44948);
        setField(term44868, term44868.getClass(), "user", term44895);
        setField(term44868, term44868.getClass(), "replys", term44951);
        setIntField(term44966, term44966.getClass(), "year", 2028);
        setShortField(term44966, term44966.getClass(), "month", (short) 7);
        setShortField(term44966, term44966.getClass(), "day", (short) 24);
        setField(term44965, term44965.getClass(), "date", term44966);
        setByteField(term44970, term44970.getClass(), "hour", (byte) 11);
        setByteField(term44970, term44970.getClass(), "minute", (byte) 2);
        setByteField(term44970, term44970.getClass(), "second", (byte) 47);
        setIntField(term44970, term44970.getClass(), "nano", 875421060);
        setField(term44965, term44965.getClass(), "time", term44970);
        setField(term44868, term44868.getClass(), "createDate", term44965);
        setField(term44854, term44854.getClass(), "board", term44868);
        setIntField(term44975, term44975.getClass(), "id", -269909549);
        setField(term44975, term44975.getClass(), "username", "GmpbCvsoQd");
        setField(term44975, term44975.getClass(), "password", "ypYkYRcFQq");
        setField(term44975, term44975.getClass(), "email", "lXLLmOVwcF");
        setField(term44975, term44975.getClass(), "role", enum95);
        setField(term44975, term44975.getClass(), "oauth", "lIrBbPBrDY");
        setIntField(term45033, term45033.getClass(), "nanos", 395000000);
        setLongField(term45033, term45033.getClass(), "fastTime", 1659495441000L);
        setField(term45033, term45033.getClass(), "cdate", null);
        setField(term44975, term44975.getClass(), "createDate", term45033);
        setField(term44854, term44854.getClass(), "user", term44975);
        setIntField(term45037, term45037.getClass(), "year", 2029);
        setShortField(term45037, term45037.getClass(), "month", (short) 12);
        setShortField(term45037, term45037.getClass(), "day", (short) 20);
        setField(term45036, term45036.getClass(), "date", term45037);
        setByteField(term45041, term45041.getClass(), "hour", (byte) 3);
        setByteField(term45041, term45041.getClass(), "minute", (byte) 1);
        setByteField(term45041, term45041.getClass(), "second", (byte) 52);
        setIntField(term45041, term45041.getClass(), "nano", 833458434);
        setField(term45036, term45036.getClass(), "time", term45041);
        setField(term44854, term44854.getClass(), "createDate", term45036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term44854, args);
    }

};


