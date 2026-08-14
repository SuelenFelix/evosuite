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

public class UserStat_UserStatBuilder_postCount_3666038403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4206;
     Object term4239;

    public UserStat_UserStatBuilder_postCount_3666038403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4207 = new Long(-9040825890007374809L);
        Long term4209 = new Long(1368340889161782793L);
        Long term4211 = new Long(-5786861555969446503L);
        Long term4213 = new Long(2354625302846375590L);
        Long term4215 = new Long(7276637106827860087L);
        Long term4217 = new Long(-3936701866695933852L);
        term4206 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4234 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4206, term4206.getClass(), "id", term4207);
        setField(term4206, term4206.getClass(), "userId", term4209);
        setField(term4206, term4206.getClass(), "postCount", term4211);
        setField(term4206, term4206.getClass(), "likeCount", term4213);
        setField(term4206, term4206.getClass(), "followingCount", term4215);
        setField(term4206, term4206.getClass(), "followerCount", term4217);
        setIntField(term4220, term4220.getClass(), "year", 2028);
        setShortField(term4220, term4220.getClass(), "month", (short) 1);
        setShortField(term4220, term4220.getClass(), "day", (short) 18);
        setField(term4219, term4219.getClass(), "date", term4220);
        setByteField(term4224, term4224.getClass(), "hour", (byte) 12);
        setByteField(term4224, term4224.getClass(), "minute", (byte) 4);
        setByteField(term4224, term4224.getClass(), "second", (byte) 39);
        setIntField(term4224, term4224.getClass(), "nano", 651287093);
        setField(term4219, term4219.getClass(), "time", term4224);
        setField(term4206, term4206.getClass(), "createdAt", term4219);
        setIntField(term4230, term4230.getClass(), "year", 2027);
        setShortField(term4230, term4230.getClass(), "month", (short) 7);
        setShortField(term4230, term4230.getClass(), "day", (short) 23);
        setField(term4229, term4229.getClass(), "date", term4230);
        setByteField(term4234, term4234.getClass(), "hour", (byte) 12);
        setByteField(term4234, term4234.getClass(), "minute", (byte) 6);
        setByteField(term4234, term4234.getClass(), "second", (byte) 19);
        setIntField(term4234, term4234.getClass(), "nano", 8025683);
        setField(term4229, term4229.getClass(), "time", term4234);
        setField(term4206, term4206.getClass(), "updatedAt", term4229);
        term4239 = new Long(1215116475929634177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4239;
        callMethod(klass, "postCount", argTypes, term4206, args);
    }

};


