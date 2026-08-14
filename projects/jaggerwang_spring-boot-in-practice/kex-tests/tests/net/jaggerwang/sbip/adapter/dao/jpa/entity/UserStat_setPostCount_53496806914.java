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

public class UserStat_setPostCount_53496806914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32272;
     Object term32305;

    public UserStat_setPostCount_53496806914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32273 = new Long(-5269076898456067678L);
        Long term32275 = new Long(2124275424075254005L);
        Long term32277 = new Long(-6616339196088014666L);
        Long term32279 = new Long(-1437596366836021966L);
        Long term32281 = new Long(8542753860527083778L);
        Long term32283 = new Long(-7981877752051488010L);
        term32272 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32285 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32290 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32300 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32272, term32272.getClass(), "id", term32273);
        setField(term32272, term32272.getClass(), "userId", term32275);
        setField(term32272, term32272.getClass(), "postCount", term32277);
        setField(term32272, term32272.getClass(), "likeCount", term32279);
        setField(term32272, term32272.getClass(), "followingCount", term32281);
        setField(term32272, term32272.getClass(), "followerCount", term32283);
        setIntField(term32286, term32286.getClass(), "year", 2027);
        setShortField(term32286, term32286.getClass(), "month", (short) 11);
        setShortField(term32286, term32286.getClass(), "day", (short) 17);
        setField(term32285, term32285.getClass(), "date", term32286);
        setByteField(term32290, term32290.getClass(), "hour", (byte) 8);
        setByteField(term32290, term32290.getClass(), "minute", (byte) 27);
        setByteField(term32290, term32290.getClass(), "second", (byte) 41);
        setIntField(term32290, term32290.getClass(), "nano", 737345800);
        setField(term32285, term32285.getClass(), "time", term32290);
        setField(term32272, term32272.getClass(), "createdAt", term32285);
        setIntField(term32296, term32296.getClass(), "year", 2028);
        setShortField(term32296, term32296.getClass(), "month", (short) 9);
        setShortField(term32296, term32296.getClass(), "day", (short) 4);
        setField(term32295, term32295.getClass(), "date", term32296);
        setByteField(term32300, term32300.getClass(), "hour", (byte) 2);
        setByteField(term32300, term32300.getClass(), "minute", (byte) 4);
        setByteField(term32300, term32300.getClass(), "second", (byte) 33);
        setIntField(term32300, term32300.getClass(), "nano", 927519741);
        setField(term32295, term32295.getClass(), "time", term32300);
        setField(term32272, term32272.getClass(), "updatedAt", term32295);
        term32305 = new Long(4486175312218543930L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32305;
        callMethod(klass, "setPostCount", argTypes, term32272, args);
    }

};


