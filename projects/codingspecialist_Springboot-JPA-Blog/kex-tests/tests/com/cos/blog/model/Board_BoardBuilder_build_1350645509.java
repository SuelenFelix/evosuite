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

public class Board_BoardBuilder_build_1350645509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33217;

    public Board_BoardBuilder_build_1350645509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33397 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term33396 = ((Class) term33397).getDeclaredField((String) "USER");
        ((Field) term33396).setAccessible(true);
        Object enum80 = ((Field) term33396).get((Object) null);
        Object term33307 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term33310 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term33313 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33315 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term33307, term33307.getClass(), "id", 1267740164);
        setField(term33307, term33307.getClass(), "content", "");
        setIntField(term33310, term33310.getClass(), "id", 1363887997);
        setField(term33310, term33310.getClass(), "title", null);
        setField(term33310, term33310.getClass(), "content", null);
        setIntField(term33310, term33310.getClass(), "count", -1744763945);
        setField(term33310, term33310.getClass(), "user", null);
        setField(term33310, term33310.getClass(), "replys", null);
        setField(term33310, term33310.getClass(), "createDate", null);
        setField(term33307, term33307.getClass(), "board", term33310);
        setIntField(term33313, term33313.getClass(), "id", -2077814162);
        setField(term33313, term33313.getClass(), "username", null);
        setField(term33313, term33313.getClass(), "password", null);
        setField(term33313, term33313.getClass(), "email", null);
        setField(term33313, term33313.getClass(), "role", null);
        setField(term33313, term33313.getClass(), "oauth", null);
        setField(term33313, term33313.getClass(), "createDate", null);
        setField(term33307, term33307.getClass(), "user", term33313);
        setField(term33315, term33315.getClass(), "date", null);
        setField(term33315, term33315.getClass(), "time", null);
        setField(term33307, term33307.getClass(), "createDate", term33315);
        Object term33316 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term33319 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term33322 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33324 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term33316, term33316.getClass(), "id", 961252909);
        setField(term33316, term33316.getClass(), "content", "");
        setIntField(term33319, term33319.getClass(), "id", 0);
        setField(term33319, term33319.getClass(), "title", null);
        setField(term33319, term33319.getClass(), "content", null);
        setIntField(term33319, term33319.getClass(), "count", 0);
        setField(term33319, term33319.getClass(), "user", null);
        setField(term33319, term33319.getClass(), "replys", null);
        setField(term33319, term33319.getClass(), "createDate", null);
        setField(term33316, term33316.getClass(), "board", term33319);
        setIntField(term33322, term33322.getClass(), "id", 0);
        setField(term33322, term33322.getClass(), "username", null);
        setField(term33322, term33322.getClass(), "password", null);
        setField(term33322, term33322.getClass(), "email", null);
        setField(term33322, term33322.getClass(), "role", null);
        setField(term33322, term33322.getClass(), "oauth", null);
        setField(term33322, term33322.getClass(), "createDate", null);
        setField(term33316, term33316.getClass(), "user", term33322);
        setField(term33324, term33324.getClass(), "date", null);
        setField(term33324, term33324.getClass(), "time", null);
        setField(term33316, term33316.getClass(), "createDate", term33324);
        Object term33325 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term33328 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term33331 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33333 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term33325, term33325.getClass(), "id", 1455842357);
        setField(term33325, term33325.getClass(), "content", "");
        setIntField(term33328, term33328.getClass(), "id", 0);
        setField(term33328, term33328.getClass(), "title", null);
        setField(term33328, term33328.getClass(), "content", null);
        setIntField(term33328, term33328.getClass(), "count", 0);
        setField(term33328, term33328.getClass(), "user", null);
        setField(term33328, term33328.getClass(), "replys", null);
        setField(term33328, term33328.getClass(), "createDate", null);
        setField(term33325, term33325.getClass(), "board", term33328);
        setIntField(term33331, term33331.getClass(), "id", 0);
        setField(term33331, term33331.getClass(), "username", null);
        setField(term33331, term33331.getClass(), "password", null);
        setField(term33331, term33331.getClass(), "email", null);
        setField(term33331, term33331.getClass(), "role", null);
        setField(term33331, term33331.getClass(), "oauth", null);
        setField(term33331, term33331.getClass(), "createDate", null);
        setField(term33325, term33325.getClass(), "user", term33331);
        setField(term33333, term33333.getClass(), "date", null);
        setField(term33333, term33333.getClass(), "time", null);
        setField(term33325, term33325.getClass(), "createDate", term33333);
        ArrayList term33305 = new ArrayList();
        ((ArrayList) term33305).add(term33307);
        ((ArrayList) term33305).add(term33316);
        ((ArrayList) term33305).add(term33325);
        term33217 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        Object term33244 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33302 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33341 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33217, term33217.getClass(), "id", -1671982964);
        setField(term33217, term33217.getClass(), "title", "kWMQGdvKwx");
        setField(term33217, term33217.getClass(), "content", "zRwnGNjqEc");
        setIntField(term33217, term33217.getClass(), "count", 776218451);
        setIntField(term33244, term33244.getClass(), "id", -1362132929);
        setField(term33244, term33244.getClass(), "username", "PadBNsKGSM");
        setField(term33244, term33244.getClass(), "password", "BqLgONTWcn");
        setField(term33244, term33244.getClass(), "email", "QyyvfuUsSl");
        setField(term33244, term33244.getClass(), "role", enum80);
        setField(term33244, term33244.getClass(), "oauth", "urXLfQoyuc");
        setIntField(term33302, term33302.getClass(), "nanos", 631000000);
        setLongField(term33302, term33302.getClass(), "fastTime", 1424554373000L);
        setField(term33302, term33302.getClass(), "cdate", null);
        setField(term33244, term33244.getClass(), "createDate", term33302);
        setField(term33217, term33217.getClass(), "user", term33244);
        setField(term33217, term33217.getClass(), "replys", term33305);
        setIntField(term33337, term33337.getClass(), "year", 2014);
        setShortField(term33337, term33337.getClass(), "month", (short) 11);
        setShortField(term33337, term33337.getClass(), "day", (short) 30);
        setField(term33336, term33336.getClass(), "date", term33337);
        setByteField(term33341, term33341.getClass(), "hour", (byte) 19);
        setByteField(term33341, term33341.getClass(), "minute", (byte) 38);
        setByteField(term33341, term33341.getClass(), "second", (byte) 52);
        setIntField(term33341, term33341.getClass(), "nano", 246326841);
        setField(term33336, term33336.getClass(), "time", term33341);
        setField(term33217, term33217.getClass(), "createDate", term33336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term33217, args);
    }

};


