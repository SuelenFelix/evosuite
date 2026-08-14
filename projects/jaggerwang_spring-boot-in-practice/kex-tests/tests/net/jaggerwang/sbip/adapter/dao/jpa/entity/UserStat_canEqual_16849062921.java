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

public class UserStat_canEqual_16849062921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32532;
     Object term32565;

    public UserStat_canEqual_16849062921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32533 = new Long(-5466267958566655205L);
        Long term32535 = new Long(4066162530086558234L);
        Long term32537 = new Long(-1519007571673072893L);
        Long term32539 = new Long(-2965107112757796135L);
        Long term32541 = new Long(8628710602325472259L);
        Long term32543 = new Long(-6397802456253967096L);
        term32532 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32550 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32560 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32532, term32532.getClass(), "id", term32533);
        setField(term32532, term32532.getClass(), "userId", term32535);
        setField(term32532, term32532.getClass(), "postCount", term32537);
        setField(term32532, term32532.getClass(), "likeCount", term32539);
        setField(term32532, term32532.getClass(), "followingCount", term32541);
        setField(term32532, term32532.getClass(), "followerCount", term32543);
        setIntField(term32546, term32546.getClass(), "year", 2010);
        setShortField(term32546, term32546.getClass(), "month", (short) 8);
        setShortField(term32546, term32546.getClass(), "day", (short) 29);
        setField(term32545, term32545.getClass(), "date", term32546);
        setByteField(term32550, term32550.getClass(), "hour", (byte) 14);
        setByteField(term32550, term32550.getClass(), "minute", (byte) 6);
        setByteField(term32550, term32550.getClass(), "second", (byte) 52);
        setIntField(term32550, term32550.getClass(), "nano", 882272618);
        setField(term32545, term32545.getClass(), "time", term32550);
        setField(term32532, term32532.getClass(), "createdAt", term32545);
        setIntField(term32556, term32556.getClass(), "year", 2011);
        setShortField(term32556, term32556.getClass(), "month", (short) 3);
        setShortField(term32556, term32556.getClass(), "day", (short) 21);
        setField(term32555, term32555.getClass(), "date", term32556);
        setByteField(term32560, term32560.getClass(), "hour", (byte) 10);
        setByteField(term32560, term32560.getClass(), "minute", (byte) 56);
        setByteField(term32560, term32560.getClass(), "second", (byte) 39);
        setIntField(term32560, term32560.getClass(), "nano", 54553750);
        setField(term32555, term32555.getClass(), "time", term32560);
        setField(term32532, term32532.getClass(), "updatedAt", term32555);
        term32565 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32565;
        callMethod(klass, "canEqual", argTypes, term32532, args);
    }

};


