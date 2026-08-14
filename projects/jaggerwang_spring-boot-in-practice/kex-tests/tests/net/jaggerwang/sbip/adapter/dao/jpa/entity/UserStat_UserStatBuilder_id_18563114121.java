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

public class UserStat_UserStatBuilder_id_18563114121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4136;
     Object term4169;

    public UserStat_UserStatBuilder_id_18563114121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4137 = new Long(846579494941632714L);
        Long term4139 = new Long(6689117472719450333L);
        Long term4141 = new Long(5836128569274066678L);
        Long term4143 = new Long(-2177368829816872572L);
        Long term4145 = new Long(-8463029266761149071L);
        Long term4147 = new Long(3133860696238261492L);
        term4136 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4164 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4136, term4136.getClass(), "id", term4137);
        setField(term4136, term4136.getClass(), "userId", term4139);
        setField(term4136, term4136.getClass(), "postCount", term4141);
        setField(term4136, term4136.getClass(), "likeCount", term4143);
        setField(term4136, term4136.getClass(), "followingCount", term4145);
        setField(term4136, term4136.getClass(), "followerCount", term4147);
        setIntField(term4150, term4150.getClass(), "year", 2016);
        setShortField(term4150, term4150.getClass(), "month", (short) 2);
        setShortField(term4150, term4150.getClass(), "day", (short) 25);
        setField(term4149, term4149.getClass(), "date", term4150);
        setByteField(term4154, term4154.getClass(), "hour", (byte) 8);
        setByteField(term4154, term4154.getClass(), "minute", (byte) 54);
        setByteField(term4154, term4154.getClass(), "second", (byte) 40);
        setIntField(term4154, term4154.getClass(), "nano", 124525896);
        setField(term4149, term4149.getClass(), "time", term4154);
        setField(term4136, term4136.getClass(), "createdAt", term4149);
        setIntField(term4160, term4160.getClass(), "year", 2029);
        setShortField(term4160, term4160.getClass(), "month", (short) 1);
        setShortField(term4160, term4160.getClass(), "day", (short) 10);
        setField(term4159, term4159.getClass(), "date", term4160);
        setByteField(term4164, term4164.getClass(), "hour", (byte) 8);
        setByteField(term4164, term4164.getClass(), "minute", (byte) 46);
        setByteField(term4164, term4164.getClass(), "second", (byte) 35);
        setIntField(term4164, term4164.getClass(), "nano", 58807194);
        setField(term4159, term4159.getClass(), "time", term4164);
        setField(term4136, term4136.getClass(), "updatedAt", term4159);
        term4169 = new Long(7247160664318067468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4169;
        callMethod(klass, "id", argTypes, term4136, args);
    }

};


