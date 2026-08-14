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

public class UserStat_setId_192621054912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32202;
     Object term32235;

    public UserStat_setId_192621054912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32203 = new Long(-4773031420684190217L);
        Long term32205 = new Long(4815723481405472054L);
        Long term32207 = new Long(8621736372873134417L);
        Long term32209 = new Long(5106927272042726665L);
        Long term32211 = new Long(6913945762720683253L);
        Long term32213 = new Long(-7873197993099724563L);
        term32202 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32230 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32202, term32202.getClass(), "id", term32203);
        setField(term32202, term32202.getClass(), "userId", term32205);
        setField(term32202, term32202.getClass(), "postCount", term32207);
        setField(term32202, term32202.getClass(), "likeCount", term32209);
        setField(term32202, term32202.getClass(), "followingCount", term32211);
        setField(term32202, term32202.getClass(), "followerCount", term32213);
        setIntField(term32216, term32216.getClass(), "year", 2013);
        setShortField(term32216, term32216.getClass(), "month", (short) 5);
        setShortField(term32216, term32216.getClass(), "day", (short) 9);
        setField(term32215, term32215.getClass(), "date", term32216);
        setByteField(term32220, term32220.getClass(), "hour", (byte) 21);
        setByteField(term32220, term32220.getClass(), "minute", (byte) 29);
        setByteField(term32220, term32220.getClass(), "second", (byte) 31);
        setIntField(term32220, term32220.getClass(), "nano", 674914044);
        setField(term32215, term32215.getClass(), "time", term32220);
        setField(term32202, term32202.getClass(), "createdAt", term32215);
        setIntField(term32226, term32226.getClass(), "year", 2029);
        setShortField(term32226, term32226.getClass(), "month", (short) 10);
        setShortField(term32226, term32226.getClass(), "day", (short) 7);
        setField(term32225, term32225.getClass(), "date", term32226);
        setByteField(term32230, term32230.getClass(), "hour", (byte) 8);
        setByteField(term32230, term32230.getClass(), "minute", (byte) 43);
        setByteField(term32230, term32230.getClass(), "second", (byte) 49);
        setIntField(term32230, term32230.getClass(), "nano", 733700043);
        setField(term32225, term32225.getClass(), "time", term32230);
        setField(term32202, term32202.getClass(), "updatedAt", term32225);
        term32235 = new Long(-4539648422466320845L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32235;
        callMethod(klass, "setId", argTypes, term32202, args);
    }

};


