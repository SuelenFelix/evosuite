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

public class UserStat_getId_14961687914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31938;

    public UserStat_getId_14961687914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31939 = new Long(-8653467709084853156L);
        Long term31941 = new Long(6135782592145916721L);
        Long term31943 = new Long(7930227263182470549L);
        Long term31945 = new Long(-2571841019708046378L);
        Long term31947 = new Long(-4682102699090617454L);
        Long term31949 = new Long(8018453258973130416L);
        term31938 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term31951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31966 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31938, term31938.getClass(), "id", term31939);
        setField(term31938, term31938.getClass(), "userId", term31941);
        setField(term31938, term31938.getClass(), "postCount", term31943);
        setField(term31938, term31938.getClass(), "likeCount", term31945);
        setField(term31938, term31938.getClass(), "followingCount", term31947);
        setField(term31938, term31938.getClass(), "followerCount", term31949);
        setIntField(term31952, term31952.getClass(), "year", 2016);
        setShortField(term31952, term31952.getClass(), "month", (short) 5);
        setShortField(term31952, term31952.getClass(), "day", (short) 15);
        setField(term31951, term31951.getClass(), "date", term31952);
        setByteField(term31956, term31956.getClass(), "hour", (byte) 13);
        setByteField(term31956, term31956.getClass(), "minute", (byte) 7);
        setByteField(term31956, term31956.getClass(), "second", (byte) 29);
        setIntField(term31956, term31956.getClass(), "nano", 36973761);
        setField(term31951, term31951.getClass(), "time", term31956);
        setField(term31938, term31938.getClass(), "createdAt", term31951);
        setIntField(term31962, term31962.getClass(), "year", 2028);
        setShortField(term31962, term31962.getClass(), "month", (short) 11);
        setShortField(term31962, term31962.getClass(), "day", (short) 8);
        setField(term31961, term31961.getClass(), "date", term31962);
        setByteField(term31966, term31966.getClass(), "hour", (byte) 11);
        setByteField(term31966, term31966.getClass(), "minute", (byte) 41);
        setByteField(term31966, term31966.getClass(), "second", (byte) 26);
        setIntField(term31966, term31966.getClass(), "nano", 234822620);
        setField(term31961, term31961.getClass(), "time", term31966);
        setField(term31938, term31938.getClass(), "updatedAt", term31961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31938, args);
    }

};


