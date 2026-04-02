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

public class Reply_ReplyBuilder_createDate_2766156425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44231;
     Object term44423;

    public Reply_ReplyBuilder_createDate_2766156425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44494 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term44493 = ((Class) term44494).getDeclaredField((String) "ADMIN");
        ((Field) term44493).setAccessible(true);
        Object enum92 = ((Field) term44493).get((Object) null);
        Object term44330 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44330, term44330.getClass(), "id", -1628481565);
        setField(term44330, term44330.getClass(), "content", null);
        setField(term44330, term44330.getClass(), "board", null);
        setField(term44330, term44330.getClass(), "user", null);
        setField(term44330, term44330.getClass(), "createDate", null);
        Object term44332 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44332, term44332.getClass(), "id", 0);
        setField(term44332, term44332.getClass(), "content", null);
        setField(term44332, term44332.getClass(), "board", null);
        setField(term44332, term44332.getClass(), "user", null);
        setField(term44332, term44332.getClass(), "createDate", null);
        Object term44334 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44334, term44334.getClass(), "id", -370819357);
        setField(term44334, term44334.getClass(), "content", null);
        setField(term44334, term44334.getClass(), "board", null);
        setField(term44334, term44334.getClass(), "user", null);
        setField(term44334, term44334.getClass(), "createDate", null);
        Object term44336 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44336, term44336.getClass(), "id", 0);
        setField(term44336, term44336.getClass(), "content", null);
        setField(term44336, term44336.getClass(), "board", null);
        setField(term44336, term44336.getClass(), "user", null);
        setField(term44336, term44336.getClass(), "createDate", null);
        Object term44338 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term44338, term44338.getClass(), "id", -992847709);
        setField(term44338, term44338.getClass(), "content", null);
        setField(term44338, term44338.getClass(), "board", null);
        setField(term44338, term44338.getClass(), "user", null);
        setField(term44338, term44338.getClass(), "createDate", null);
        ArrayList term44328 = new ArrayList();
        ((ArrayList) term44328).add(term44330);
        ((ArrayList) term44328).add(term44332);
        ((ArrayList) term44328).add(term44332);
        ((ArrayList) term44328).add(term44334);
        ((ArrayList) term44328).add(term44336);
        ((ArrayList) term44328).add(term44338);
        ((ArrayList) term44328).add(term44332);
        Class<? extends Object> term44691 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term44690 = ((Class) term44691).getDeclaredField((String) "USER");
        ((Field) term44690).setAccessible(true);
        Object enum93 = ((Field) term44690).get((Object) null);
        term44231 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term44245 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term44272 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term44325 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44347 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44352 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term44410 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term44413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44418 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term44231, term44231.getClass(), "id", 1286440081);
        setField(term44231, term44231.getClass(), "content", "RspkCWCAFM");
        setIntField(term44245, term44245.getClass(), "id", -928538452);
        setField(term44245, term44245.getClass(), "title", "zAkmDkobmH");
        setField(term44245, term44245.getClass(), "content", "FASdrZqBfN");
        setIntField(term44245, term44245.getClass(), "count", -1313207353);
        setIntField(term44272, term44272.getClass(), "id", 402612318);
        setField(term44272, term44272.getClass(), "username", "YNwqJgOcWq");
        setField(term44272, term44272.getClass(), "password", "tUcoJjDoJV");
        setField(term44272, term44272.getClass(), "email", "ICNsClDoAn");
        setField(term44272, term44272.getClass(), "role", enum92);
        setField(term44272, term44272.getClass(), "oauth", "LACfLkaJjq");
        setIntField(term44325, term44325.getClass(), "nanos", 851000000);
        setLongField(term44325, term44325.getClass(), "fastTime", 1396818653000L);
        setField(term44325, term44325.getClass(), "cdate", null);
        setField(term44272, term44272.getClass(), "createDate", term44325);
        setField(term44245, term44245.getClass(), "user", term44272);
        setField(term44245, term44245.getClass(), "replys", term44328);
        setIntField(term44343, term44343.getClass(), "year", 2028);
        setShortField(term44343, term44343.getClass(), "month", (short) 1);
        setShortField(term44343, term44343.getClass(), "day", (short) 21);
        setField(term44342, term44342.getClass(), "date", term44343);
        setByteField(term44347, term44347.getClass(), "hour", (byte) 22);
        setByteField(term44347, term44347.getClass(), "minute", (byte) 51);
        setByteField(term44347, term44347.getClass(), "second", (byte) 58);
        setIntField(term44347, term44347.getClass(), "nano", 921867240);
        setField(term44342, term44342.getClass(), "time", term44347);
        setField(term44245, term44245.getClass(), "createDate", term44342);
        setField(term44231, term44231.getClass(), "board", term44245);
        setIntField(term44352, term44352.getClass(), "id", 752858379);
        setField(term44352, term44352.getClass(), "username", "wizysRLgRr");
        setField(term44352, term44352.getClass(), "password", "VbDDltcmiT");
        setField(term44352, term44352.getClass(), "email", "VWIEojCQCj");
        setField(term44352, term44352.getClass(), "role", enum93);
        setField(term44352, term44352.getClass(), "oauth", "jbeRMWjQTQ");
        setIntField(term44410, term44410.getClass(), "nanos", 695000000);
        setLongField(term44410, term44410.getClass(), "fastTime", 1379426634000L);
        setField(term44410, term44410.getClass(), "cdate", null);
        setField(term44352, term44352.getClass(), "createDate", term44410);
        setField(term44231, term44231.getClass(), "user", term44352);
        setIntField(term44414, term44414.getClass(), "year", 2024);
        setShortField(term44414, term44414.getClass(), "month", (short) 12);
        setShortField(term44414, term44414.getClass(), "day", (short) 29);
        setField(term44413, term44413.getClass(), "date", term44414);
        setByteField(term44418, term44418.getClass(), "hour", (byte) 22);
        setByteField(term44418, term44418.getClass(), "minute", (byte) 7);
        setByteField(term44418, term44418.getClass(), "second", (byte) 1);
        setIntField(term44418, term44418.getClass(), "nano", 924286363);
        setField(term44413, term44413.getClass(), "time", term44418);
        setField(term44231, term44231.getClass(), "createDate", term44413);
        term44423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44428 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term44424, term44424.getClass(), "year", 2011);
        setShortField(term44424, term44424.getClass(), "month", (short) 12);
        setShortField(term44424, term44424.getClass(), "day", (short) 13);
        setField(term44423, term44423.getClass(), "date", term44424);
        setByteField(term44428, term44428.getClass(), "hour", (byte) 4);
        setByteField(term44428, term44428.getClass(), "minute", (byte) 19);
        setByteField(term44428, term44428.getClass(), "second", (byte) 3);
        setIntField(term44428, term44428.getClass(), "nano", 325415099);
        setField(term44423, term44423.getClass(), "time", term44428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term44423;
        callMethod(klass, "createDate", argTypes, term44231, args);
    }

};


