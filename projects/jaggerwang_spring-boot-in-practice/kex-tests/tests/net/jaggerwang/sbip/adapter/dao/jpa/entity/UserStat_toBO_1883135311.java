package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStat_toBO_1883135311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31872;

    public UserStat_toBO_1883135311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31873 = new Long(7048544371106200955L);
        Long term31875 = new Long(-6299955839293054069L);
        Long term31877 = new Long(3573273176206440433L);
        Long term31879 = new Long(8242382965219431687L);
        Long term31881 = new Long(-3092537062189928451L);
        Long term31883 = new Long(-6645699856048951433L);
        term31872 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term31885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31900 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31872, term31872.getClass(), "id", term31873);
        setField(term31872, term31872.getClass(), "userId", term31875);
        setField(term31872, term31872.getClass(), "postCount", term31877);
        setField(term31872, term31872.getClass(), "likeCount", term31879);
        setField(term31872, term31872.getClass(), "followingCount", term31881);
        setField(term31872, term31872.getClass(), "followerCount", term31883);
        setIntField(term31886, term31886.getClass(), "year", 2019);
        setShortField(term31886, term31886.getClass(), "month", (short) 8);
        setShortField(term31886, term31886.getClass(), "day", (short) 7);
        setField(term31885, term31885.getClass(), "date", term31886);
        setByteField(term31890, term31890.getClass(), "hour", (byte) 5);
        setByteField(term31890, term31890.getClass(), "minute", (byte) 54);
        setByteField(term31890, term31890.getClass(), "second", (byte) 59);
        setIntField(term31890, term31890.getClass(), "nano", 56284870);
        setField(term31885, term31885.getClass(), "time", term31890);
        setField(term31872, term31872.getClass(), "createdAt", term31885);
        setIntField(term31896, term31896.getClass(), "year", 2023);
        setShortField(term31896, term31896.getClass(), "month", (short) 9);
        setShortField(term31896, term31896.getClass(), "day", (short) 23);
        setField(term31895, term31895.getClass(), "date", term31896);
        setByteField(term31900, term31900.getClass(), "hour", (byte) 14);
        setByteField(term31900, term31900.getClass(), "minute", (byte) 52);
        setByteField(term31900, term31900.getClass(), "second", (byte) 34);
        setIntField(term31900, term31900.getClass(), "nano", 879945118);
        setField(term31895, term31895.getClass(), "time", term31900);
        setField(term31872, term31872.getClass(), "updatedAt", term31895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term31872, args);
    }

};


