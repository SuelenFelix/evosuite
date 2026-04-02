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

public class Reply_setUser_147613960313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6521;
     Object term6703;

    public Reply_setUser_147613960313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6817 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term6816 = ((Class) term6817).getDeclaredField((String) "USER");
        ((Field) term6816).setAccessible(true);
        Object enum13 = ((Field) term6816).get((Object) null);
        ArrayList term6618 = new ArrayList();
        Class<? extends Object> term7011 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term7010 = ((Class) term7011).getDeclaredField((String) "USER");
        ((Field) term7010).setAccessible(true);
        Object enum14 = ((Field) term7010).get((Object) null);
        term6521 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term6535 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term6562 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term6615 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6627 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6632 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term6690 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6698 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6521, term6521.getClass(), "id", -376422566);
        setField(term6521, term6521.getClass(), "content", "GbahCBMvct");
        setIntField(term6535, term6535.getClass(), "id", 306847454);
        setField(term6535, term6535.getClass(), "title", "iiHBhsNFgk");
        setField(term6535, term6535.getClass(), "content", "HknsTajwxJ");
        setIntField(term6535, term6535.getClass(), "count", 1745276158);
        setIntField(term6562, term6562.getClass(), "id", 2009020256);
        setField(term6562, term6562.getClass(), "username", "XtiurrVYKw");
        setField(term6562, term6562.getClass(), "password", "rsumfoDNHa");
        setField(term6562, term6562.getClass(), "email", "ceCWHUTQUM");
        setField(term6562, term6562.getClass(), "role", enum13);
        setField(term6562, term6562.getClass(), "oauth", "LrqwfrKKtS");
        setIntField(term6615, term6615.getClass(), "nanos", 768000000);
        setLongField(term6615, term6615.getClass(), "fastTime", 1272765521000L);
        setField(term6615, term6615.getClass(), "cdate", null);
        setField(term6562, term6562.getClass(), "createDate", term6615);
        setField(term6535, term6535.getClass(), "user", term6562);
        setField(term6535, term6535.getClass(), "replys", term6618);
        setIntField(term6623, term6623.getClass(), "year", 2026);
        setShortField(term6623, term6623.getClass(), "month", (short) 10);
        setShortField(term6623, term6623.getClass(), "day", (short) 19);
        setField(term6622, term6622.getClass(), "date", term6623);
        setByteField(term6627, term6627.getClass(), "hour", (byte) 7);
        setByteField(term6627, term6627.getClass(), "minute", (byte) 22);
        setByteField(term6627, term6627.getClass(), "second", (byte) 11);
        setIntField(term6627, term6627.getClass(), "nano", 17846677);
        setField(term6622, term6622.getClass(), "time", term6627);
        setField(term6535, term6535.getClass(), "createDate", term6622);
        setField(term6521, term6521.getClass(), "board", term6535);
        setIntField(term6632, term6632.getClass(), "id", 2049577015);
        setField(term6632, term6632.getClass(), "username", "ZUdnQXfzCI");
        setField(term6632, term6632.getClass(), "password", "EULDrUNQvw");
        setField(term6632, term6632.getClass(), "email", "BtvAvsJSei");
        setField(term6632, term6632.getClass(), "role", enum14);
        setField(term6632, term6632.getClass(), "oauth", "vqnBkkxoIa");
        setIntField(term6690, term6690.getClass(), "nanos", 295000000);
        setLongField(term6690, term6690.getClass(), "fastTime", 1597341597000L);
        setField(term6690, term6690.getClass(), "cdate", null);
        setField(term6632, term6632.getClass(), "createDate", term6690);
        setField(term6521, term6521.getClass(), "user", term6632);
        setIntField(term6694, term6694.getClass(), "year", 2018);
        setShortField(term6694, term6694.getClass(), "month", (short) 10);
        setShortField(term6694, term6694.getClass(), "day", (short) 17);
        setField(term6693, term6693.getClass(), "date", term6694);
        setByteField(term6698, term6698.getClass(), "hour", (byte) 5);
        setByteField(term6698, term6698.getClass(), "minute", (byte) 10);
        setByteField(term6698, term6698.getClass(), "second", (byte) 23);
        setIntField(term6698, term6698.getClass(), "nano", 571520422);
        setField(term6693, term6693.getClass(), "time", term6698);
        setField(term6521, term6521.getClass(), "createDate", term6693);
        term6703 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term6753 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6703, term6703.getClass(), "id", 1236004505);
        setField(term6703, term6703.getClass(), "username", "bycpZjxXFn");
        setField(term6703, term6703.getClass(), "password", "jQWttOAiwL");
        setField(term6703, term6703.getClass(), "email", "DzKFxEuEEC");
        setField(term6703, term6703.getClass(), "role", enum14);
        setField(term6703, term6703.getClass(), "oauth", "CAMnvfDLJL");
        setIntField(term6753, term6753.getClass(), "nanos", 263000000);
        setLongField(term6753, term6753.getClass(), "fastTime", 1713880355000L);
        setField(term6753, term6753.getClass(), "cdate", null);
        setField(term6703, term6703.getClass(), "createDate", term6753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = term6703;
        callMethod(klass, "setUser", argTypes, term6521, args);
    }

};


