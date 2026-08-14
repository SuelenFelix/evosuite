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

public class UserStatBO_getPostCount_5024758537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11701;

    public UserStatBO_getPostCount_5024758537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11702 = new Long(1084801489398441516L);
        Long term11704 = new Long(6273754186658578034L);
        Long term11706 = new Long(0L);
        Long term11708 = new Long(0L);
        Long term11710 = new Long(0L);
        Long term11712 = new Long(0L);
        term11701 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11719 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11729 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11701, term11701.getClass(), "id", term11702);
        setField(term11701, term11701.getClass(), "userId", term11704);
        setField(term11701, term11701.getClass(), "postCount", term11706);
        setField(term11701, term11701.getClass(), "likeCount", term11708);
        setField(term11701, term11701.getClass(), "followingCount", term11710);
        setField(term11701, term11701.getClass(), "followerCount", term11712);
        setIntField(term11715, term11715.getClass(), "year", 2022);
        setShortField(term11715, term11715.getClass(), "month", (short) 4);
        setShortField(term11715, term11715.getClass(), "day", (short) 15);
        setField(term11714, term11714.getClass(), "date", term11715);
        setByteField(term11719, term11719.getClass(), "hour", (byte) 20);
        setByteField(term11719, term11719.getClass(), "minute", (byte) 58);
        setByteField(term11719, term11719.getClass(), "second", (byte) 46);
        setIntField(term11719, term11719.getClass(), "nano", 435562727);
        setField(term11714, term11714.getClass(), "time", term11719);
        setField(term11701, term11701.getClass(), "createdAt", term11714);
        setIntField(term11725, term11725.getClass(), "year", 2026);
        setShortField(term11725, term11725.getClass(), "month", (short) 10);
        setShortField(term11725, term11725.getClass(), "day", (short) 31);
        setField(term11724, term11724.getClass(), "date", term11725);
        setByteField(term11729, term11729.getClass(), "hour", (byte) 17);
        setByteField(term11729, term11729.getClass(), "minute", (byte) 6);
        setByteField(term11729, term11729.getClass(), "second", (byte) 30);
        setIntField(term11729, term11729.getClass(), "nano", 785931660);
        setField(term11724, term11724.getClass(), "time", term11729);
        setField(term11701, term11701.getClass(), "updatedAt", term11724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostCount", argTypes, term11701, args);
    }

};


