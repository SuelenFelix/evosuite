package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatBO_PostStatBOBuilder_createdAt_12684515734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21198;
     Object term21226;

    public PostStatBO_PostStatBOBuilder_createdAt_12684515734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21199 = new Long(-8211859616692114655L);
        Long term21201 = new Long(7487838449539103993L);
        Long term21204 = new Long(7010148136855890340L);
        term21198 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21221 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21198, term21198.getClass(), "id", term21199);
        setField(term21198, term21198.getClass(), "postId", term21201);
        setBooleanField(term21198, term21198.getClass(), "likeCount$set", true);
        setField(term21198, term21198.getClass(), "likeCount$value", term21204);
        setIntField(term21207, term21207.getClass(), "year", 2016);
        setShortField(term21207, term21207.getClass(), "month", (short) 11);
        setShortField(term21207, term21207.getClass(), "day", (short) 20);
        setField(term21206, term21206.getClass(), "date", term21207);
        setByteField(term21211, term21211.getClass(), "hour", (byte) 17);
        setByteField(term21211, term21211.getClass(), "minute", (byte) 20);
        setByteField(term21211, term21211.getClass(), "second", (byte) 21);
        setIntField(term21211, term21211.getClass(), "nano", 340096364);
        setField(term21206, term21206.getClass(), "time", term21211);
        setField(term21198, term21198.getClass(), "createdAt", term21206);
        setIntField(term21217, term21217.getClass(), "year", 2024);
        setShortField(term21217, term21217.getClass(), "month", (short) 10);
        setShortField(term21217, term21217.getClass(), "day", (short) 28);
        setField(term21216, term21216.getClass(), "date", term21217);
        setByteField(term21221, term21221.getClass(), "hour", (byte) 5);
        setByteField(term21221, term21221.getClass(), "minute", (byte) 13);
        setByteField(term21221, term21221.getClass(), "second", (byte) 51);
        setIntField(term21221, term21221.getClass(), "nano", 605693001);
        setField(term21216, term21216.getClass(), "time", term21221);
        setField(term21198, term21198.getClass(), "updatedAt", term21216);
        term21226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21231 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term21227, term21227.getClass(), "year", 2029);
        setShortField(term21227, term21227.getClass(), "month", (short) 7);
        setShortField(term21227, term21227.getClass(), "day", (short) 19);
        setField(term21226, term21226.getClass(), "date", term21227);
        setByteField(term21231, term21231.getClass(), "hour", (byte) 4);
        setByteField(term21231, term21231.getClass(), "minute", (byte) 38);
        setByteField(term21231, term21231.getClass(), "second", (byte) 15);
        setIntField(term21231, term21231.getClass(), "nano", 260833456);
        setField(term21226, term21226.getClass(), "time", term21231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term21226;
        callMethod(klass, "createdAt", argTypes, term21198, args);
    }

};


