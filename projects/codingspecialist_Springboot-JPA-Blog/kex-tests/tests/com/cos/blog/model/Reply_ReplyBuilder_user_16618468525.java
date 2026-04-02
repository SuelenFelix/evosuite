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

public class Reply_ReplyBuilder_user_16618468525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38370;
     Object term38561;

    public Reply_ReplyBuilder_user_16618468525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38675 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term38674 = ((Class) term38675).getDeclaredField((String) "USER");
        ((Field) term38674).setAccessible(true);
        Object enum86 = ((Field) term38674).get((Object) null);
        Object term38469 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term38469, term38469.getClass(), "id", -19567889);
        setField(term38469, term38469.getClass(), "content", null);
        setField(term38469, term38469.getClass(), "board", null);
        setField(term38469, term38469.getClass(), "user", null);
        setField(term38469, term38469.getClass(), "createDate", null);
        Object term38471 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term38471, term38471.getClass(), "id", 698633875);
        setField(term38471, term38471.getClass(), "content", null);
        setField(term38471, term38471.getClass(), "board", null);
        setField(term38471, term38471.getClass(), "user", null);
        setField(term38471, term38471.getClass(), "createDate", null);
        Object term38473 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term38473, term38473.getClass(), "id", 0);
        setField(term38473, term38473.getClass(), "content", null);
        setField(term38473, term38473.getClass(), "board", null);
        setField(term38473, term38473.getClass(), "user", null);
        setField(term38473, term38473.getClass(), "createDate", null);
        Object term38475 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term38475, term38475.getClass(), "id", 1574493440);
        setField(term38475, term38475.getClass(), "content", null);
        setField(term38475, term38475.getClass(), "board", null);
        setField(term38475, term38475.getClass(), "user", null);
        setField(term38475, term38475.getClass(), "createDate", null);
        ArrayList term38467 = new ArrayList();
        ((ArrayList) term38467).add(term38469);
        ((ArrayList) term38467).add(term38471);
        ((ArrayList) term38467).add(term38473);
        ((ArrayList) term38467).add(term38475);
        Class<? extends Object> term38869 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term38868 = ((Class) term38869).getDeclaredField((String) "ADMIN");
        ((Field) term38868).setAccessible(true);
        Object enum87 = ((Field) term38868).get((Object) null);
        term38370 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term38384 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term38411 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term38464 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term38479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38489 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term38548 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term38551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38556 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38370, term38370.getClass(), "id", -91240911);
        setField(term38370, term38370.getClass(), "content", "NUmCDjLJOd");
        setIntField(term38384, term38384.getClass(), "id", -321227954);
        setField(term38384, term38384.getClass(), "title", "miAgzoWkiV");
        setField(term38384, term38384.getClass(), "content", "teJJZHDWWb");
        setIntField(term38384, term38384.getClass(), "count", 373810833);
        setIntField(term38411, term38411.getClass(), "id", -215979293);
        setField(term38411, term38411.getClass(), "username", "QDGurdhyNf");
        setField(term38411, term38411.getClass(), "password", "FnxmVYYBUu");
        setField(term38411, term38411.getClass(), "email", "FcaMVDYJay");
        setField(term38411, term38411.getClass(), "role", enum86);
        setField(term38411, term38411.getClass(), "oauth", "pLLUuhaofY");
        setIntField(term38464, term38464.getClass(), "nanos", 700000000);
        setLongField(term38464, term38464.getClass(), "fastTime", 1308620041000L);
        setField(term38464, term38464.getClass(), "cdate", null);
        setField(term38411, term38411.getClass(), "createDate", term38464);
        setField(term38384, term38384.getClass(), "user", term38411);
        setField(term38384, term38384.getClass(), "replys", term38467);
        setIntField(term38480, term38480.getClass(), "year", 2016);
        setShortField(term38480, term38480.getClass(), "month", (short) 8);
        setShortField(term38480, term38480.getClass(), "day", (short) 23);
        setField(term38479, term38479.getClass(), "date", term38480);
        setByteField(term38484, term38484.getClass(), "hour", (byte) 15);
        setByteField(term38484, term38484.getClass(), "minute", (byte) 21);
        setByteField(term38484, term38484.getClass(), "second", (byte) 10);
        setIntField(term38484, term38484.getClass(), "nano", 549669034);
        setField(term38479, term38479.getClass(), "time", term38484);
        setField(term38384, term38384.getClass(), "createDate", term38479);
        setField(term38370, term38370.getClass(), "board", term38384);
        setIntField(term38489, term38489.getClass(), "id", -1606698075);
        setField(term38489, term38489.getClass(), "username", "wiqxbqDkJU");
        setField(term38489, term38489.getClass(), "password", "psNunGzDVf");
        setField(term38489, term38489.getClass(), "email", "YFOetAfnRt");
        setField(term38489, term38489.getClass(), "role", enum87);
        setField(term38489, term38489.getClass(), "oauth", "VgCCefhtcT");
        setIntField(term38548, term38548.getClass(), "nanos", 322000000);
        setLongField(term38548, term38548.getClass(), "fastTime", 1538533165000L);
        setField(term38548, term38548.getClass(), "cdate", null);
        setField(term38489, term38489.getClass(), "createDate", term38548);
        setField(term38370, term38370.getClass(), "user", term38489);
        setIntField(term38552, term38552.getClass(), "year", 2010);
        setShortField(term38552, term38552.getClass(), "month", (short) 3);
        setShortField(term38552, term38552.getClass(), "day", (short) 19);
        setField(term38551, term38551.getClass(), "date", term38552);
        setByteField(term38556, term38556.getClass(), "hour", (byte) 8);
        setByteField(term38556, term38556.getClass(), "minute", (byte) 38);
        setByteField(term38556, term38556.getClass(), "second", (byte) 34);
        setIntField(term38556, term38556.getClass(), "nano", 473897267);
        setField(term38551, term38551.getClass(), "time", term38556);
        setField(term38370, term38370.getClass(), "createDate", term38551);
        term38561 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term38611 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term38561, term38561.getClass(), "id", 694100722);
        setField(term38561, term38561.getClass(), "username", "mQqpexSybQ");
        setField(term38561, term38561.getClass(), "password", "KxEBqnheIv");
        setField(term38561, term38561.getClass(), "email", "ExgxdQmpcx");
        setField(term38561, term38561.getClass(), "role", enum86);
        setField(term38561, term38561.getClass(), "oauth", "SUwVfgXZzs");
        setIntField(term38611, term38611.getClass(), "nanos", 216000000);
        setLongField(term38611, term38611.getClass(), "fastTime", 1609337065000L);
        setField(term38611, term38611.getClass(), "cdate", null);
        setField(term38561, term38561.getClass(), "createDate", term38611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = term38561;
        callMethod(klass, "user", argTypes, term38370, args);
    }

};


