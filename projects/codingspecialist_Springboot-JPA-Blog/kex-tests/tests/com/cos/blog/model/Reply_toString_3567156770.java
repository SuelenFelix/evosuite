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

public class Reply_toString_3567156770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1603;

    public Reply_toString_3567156770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1814 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term1813 = ((Class) term1814).getDeclaredField((String) "USER");
        ((Field) term1813).setAccessible(true);
        Object enum0 = ((Field) term1813).get((Object) null);
        Object term1702 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term1702, term1702.getClass(), "id", -1145578966);
        setField(term1702, term1702.getClass(), "content", null);
        setField(term1702, term1702.getClass(), "board", null);
        setField(term1702, term1702.getClass(), "user", null);
        setField(term1702, term1702.getClass(), "createDate", null);
        Object term1704 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term1704, term1704.getClass(), "id", 0);
        setField(term1704, term1704.getClass(), "content", null);
        setField(term1704, term1704.getClass(), "board", null);
        setField(term1704, term1704.getClass(), "user", null);
        setField(term1704, term1704.getClass(), "createDate", null);
        Object term1706 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term1706, term1706.getClass(), "id", 0);
        setField(term1706, term1706.getClass(), "content", null);
        setField(term1706, term1706.getClass(), "board", null);
        setField(term1706, term1706.getClass(), "user", null);
        setField(term1706, term1706.getClass(), "createDate", null);
        Object term1708 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term1708, term1708.getClass(), "id", 0);
        setField(term1708, term1708.getClass(), "content", null);
        setField(term1708, term1708.getClass(), "board", null);
        setField(term1708, term1708.getClass(), "user", null);
        setField(term1708, term1708.getClass(), "createDate", null);
        Object term1710 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term1710, term1710.getClass(), "id", -602026508);
        setField(term1710, term1710.getClass(), "content", null);
        setField(term1710, term1710.getClass(), "board", null);
        setField(term1710, term1710.getClass(), "user", null);
        setField(term1710, term1710.getClass(), "createDate", null);
        ArrayList term1700 = new ArrayList();
        ((ArrayList) term1700).add(term1702);
        ((ArrayList) term1700).add(term1704);
        ((ArrayList) term1700).add(term1706);
        ((ArrayList) term1700).add(term1708);
        ((ArrayList) term1700).add(term1710);
        term1603 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term1617 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term1644 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term1697 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1719 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1724 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term1726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1731 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1603, term1603.getClass(), "id", 1193880199);
        setField(term1603, term1603.getClass(), "content", "tPlsykYBqO");
        setIntField(term1617, term1617.getClass(), "id", -1087774327);
        setField(term1617, term1617.getClass(), "title", "bLPjGVBhlX");
        setField(term1617, term1617.getClass(), "content", "whBvTVIIlC");
        setIntField(term1617, term1617.getClass(), "count", -1530420153);
        setIntField(term1644, term1644.getClass(), "id", -469968304);
        setField(term1644, term1644.getClass(), "username", "IgRJUzaCwW");
        setField(term1644, term1644.getClass(), "password", "JUmudUmaaV");
        setField(term1644, term1644.getClass(), "email", "KoyGrUJeJW");
        setField(term1644, term1644.getClass(), "role", enum0);
        setField(term1644, term1644.getClass(), "oauth", "HqBOwkVqjD");
        setIntField(term1697, term1697.getClass(), "nanos", 244000000);
        setLongField(term1697, term1697.getClass(), "fastTime", 1345860612000L);
        setField(term1697, term1697.getClass(), "cdate", null);
        setField(term1644, term1644.getClass(), "createDate", term1697);
        setField(term1617, term1617.getClass(), "user", term1644);
        setField(term1617, term1617.getClass(), "replys", term1700);
        setIntField(term1715, term1715.getClass(), "year", 2019);
        setShortField(term1715, term1715.getClass(), "month", (short) 2);
        setShortField(term1715, term1715.getClass(), "day", (short) 21);
        setField(term1714, term1714.getClass(), "date", term1715);
        setByteField(term1719, term1719.getClass(), "hour", (byte) 5);
        setByteField(term1719, term1719.getClass(), "minute", (byte) 41);
        setByteField(term1719, term1719.getClass(), "second", (byte) 11);
        setIntField(term1719, term1719.getClass(), "nano", 859829782);
        setField(term1714, term1714.getClass(), "time", term1719);
        setField(term1617, term1617.getClass(), "createDate", term1714);
        setField(term1603, term1603.getClass(), "board", term1617);
        setIntField(term1724, term1724.getClass(), "id", 0);
        setField(term1724, term1724.getClass(), "username", null);
        setField(term1724, term1724.getClass(), "password", null);
        setField(term1724, term1724.getClass(), "email", null);
        setField(term1724, term1724.getClass(), "role", null);
        setField(term1724, term1724.getClass(), "oauth", null);
        setField(term1724, term1724.getClass(), "createDate", null);
        setField(term1603, term1603.getClass(), "user", term1724);
        setIntField(term1727, term1727.getClass(), "year", 2018);
        setShortField(term1727, term1727.getClass(), "month", (short) 9);
        setShortField(term1727, term1727.getClass(), "day", (short) 28);
        setField(term1726, term1726.getClass(), "date", term1727);
        setByteField(term1731, term1731.getClass(), "hour", (byte) 3);
        setByteField(term1731, term1731.getClass(), "minute", (byte) 37);
        setByteField(term1731, term1731.getClass(), "second", (byte) 46);
        setIntField(term1731, term1731.getClass(), "nano", 763326845);
        setField(term1726, term1726.getClass(), "time", term1731);
        setField(term1603, term1603.getClass(), "createDate", term1726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1603, args);
    }

};


