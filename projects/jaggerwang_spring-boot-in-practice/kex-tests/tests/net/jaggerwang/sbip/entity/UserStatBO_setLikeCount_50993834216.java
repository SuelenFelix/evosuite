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

public class UserStatBO_setLikeCount_50993834216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12004;
     Object term12037;

    public UserStatBO_setLikeCount_50993834216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12005 = new Long(-6587807377747738663L);
        Long term12007 = new Long(-6301101997917060727L);
        Long term12009 = new Long(0L);
        Long term12011 = new Long(0L);
        Long term12013 = new Long(0L);
        Long term12015 = new Long(0L);
        term12004 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12032 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12004, term12004.getClass(), "id", term12005);
        setField(term12004, term12004.getClass(), "userId", term12007);
        setField(term12004, term12004.getClass(), "postCount", term12009);
        setField(term12004, term12004.getClass(), "likeCount", term12011);
        setField(term12004, term12004.getClass(), "followingCount", term12013);
        setField(term12004, term12004.getClass(), "followerCount", term12015);
        setIntField(term12018, term12018.getClass(), "year", 2023);
        setShortField(term12018, term12018.getClass(), "month", (short) 5);
        setShortField(term12018, term12018.getClass(), "day", (short) 23);
        setField(term12017, term12017.getClass(), "date", term12018);
        setByteField(term12022, term12022.getClass(), "hour", (byte) 0);
        setByteField(term12022, term12022.getClass(), "minute", (byte) 50);
        setByteField(term12022, term12022.getClass(), "second", (byte) 5);
        setIntField(term12022, term12022.getClass(), "nano", 296286825);
        setField(term12017, term12017.getClass(), "time", term12022);
        setField(term12004, term12004.getClass(), "createdAt", term12017);
        setIntField(term12028, term12028.getClass(), "year", 2015);
        setShortField(term12028, term12028.getClass(), "month", (short) 2);
        setShortField(term12028, term12028.getClass(), "day", (short) 5);
        setField(term12027, term12027.getClass(), "date", term12028);
        setByteField(term12032, term12032.getClass(), "hour", (byte) 3);
        setByteField(term12032, term12032.getClass(), "minute", (byte) 26);
        setByteField(term12032, term12032.getClass(), "second", (byte) 49);
        setIntField(term12032, term12032.getClass(), "nano", 995758570);
        setField(term12027, term12027.getClass(), "time", term12032);
        setField(term12004, term12004.getClass(), "updatedAt", term12027);
        term12037 = new Long(8166095254618543564L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12037;
        callMethod(klass, "setLikeCount", argTypes, term12004, args);
    }

};


