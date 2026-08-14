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

public class UserStat_getLikeCount_4112866187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32037;

    public UserStat_getLikeCount_4112866187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32038 = new Long(-8195504192950938590L);
        Long term32040 = new Long(-3141593811423226559L);
        Long term32042 = new Long(165312735504471081L);
        Long term32044 = new Long(7910323873668469704L);
        Long term32046 = new Long(-8034026767184380879L);
        Long term32048 = new Long(-1865079020076651952L);
        term32037 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32055 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32065 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32037, term32037.getClass(), "id", term32038);
        setField(term32037, term32037.getClass(), "userId", term32040);
        setField(term32037, term32037.getClass(), "postCount", term32042);
        setField(term32037, term32037.getClass(), "likeCount", term32044);
        setField(term32037, term32037.getClass(), "followingCount", term32046);
        setField(term32037, term32037.getClass(), "followerCount", term32048);
        setIntField(term32051, term32051.getClass(), "year", 2020);
        setShortField(term32051, term32051.getClass(), "month", (short) 3);
        setShortField(term32051, term32051.getClass(), "day", (short) 11);
        setField(term32050, term32050.getClass(), "date", term32051);
        setByteField(term32055, term32055.getClass(), "hour", (byte) 3);
        setByteField(term32055, term32055.getClass(), "minute", (byte) 24);
        setByteField(term32055, term32055.getClass(), "second", (byte) 7);
        setIntField(term32055, term32055.getClass(), "nano", 685767594);
        setField(term32050, term32050.getClass(), "time", term32055);
        setField(term32037, term32037.getClass(), "createdAt", term32050);
        setIntField(term32061, term32061.getClass(), "year", 2014);
        setShortField(term32061, term32061.getClass(), "month", (short) 9);
        setShortField(term32061, term32061.getClass(), "day", (short) 30);
        setField(term32060, term32060.getClass(), "date", term32061);
        setByteField(term32065, term32065.getClass(), "hour", (byte) 6);
        setByteField(term32065, term32065.getClass(), "minute", (byte) 5);
        setByteField(term32065, term32065.getClass(), "second", (byte) 42);
        setIntField(term32065, term32065.getClass(), "nano", 798954614);
        setField(term32060, term32060.getClass(), "time", term32065);
        setField(term32037, term32037.getClass(), "updatedAt", term32060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term32037, args);
    }

};


