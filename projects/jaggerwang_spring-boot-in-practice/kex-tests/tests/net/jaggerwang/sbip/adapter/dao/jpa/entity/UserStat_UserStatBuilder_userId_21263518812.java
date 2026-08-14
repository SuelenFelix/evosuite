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

public class UserStat_UserStatBuilder_userId_21263518812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4171;
     Object term4204;

    public UserStat_UserStatBuilder_userId_21263518812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4172 = new Long(2135754395358000892L);
        Long term4174 = new Long(-8085190702504231560L);
        Long term4176 = new Long(1672578078364590450L);
        Long term4178 = new Long(4949335493504695457L);
        Long term4180 = new Long(-5216789073301458893L);
        Long term4182 = new Long(-1832940336320585644L);
        term4171 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4199 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4171, term4171.getClass(), "id", term4172);
        setField(term4171, term4171.getClass(), "userId", term4174);
        setField(term4171, term4171.getClass(), "postCount", term4176);
        setField(term4171, term4171.getClass(), "likeCount", term4178);
        setField(term4171, term4171.getClass(), "followingCount", term4180);
        setField(term4171, term4171.getClass(), "followerCount", term4182);
        setIntField(term4185, term4185.getClass(), "year", 2016);
        setShortField(term4185, term4185.getClass(), "month", (short) 10);
        setShortField(term4185, term4185.getClass(), "day", (short) 20);
        setField(term4184, term4184.getClass(), "date", term4185);
        setByteField(term4189, term4189.getClass(), "hour", (byte) 18);
        setByteField(term4189, term4189.getClass(), "minute", (byte) 39);
        setByteField(term4189, term4189.getClass(), "second", (byte) 1);
        setIntField(term4189, term4189.getClass(), "nano", 196253988);
        setField(term4184, term4184.getClass(), "time", term4189);
        setField(term4171, term4171.getClass(), "createdAt", term4184);
        setIntField(term4195, term4195.getClass(), "year", 2019);
        setShortField(term4195, term4195.getClass(), "month", (short) 1);
        setShortField(term4195, term4195.getClass(), "day", (short) 6);
        setField(term4194, term4194.getClass(), "date", term4195);
        setByteField(term4199, term4199.getClass(), "hour", (byte) 18);
        setByteField(term4199, term4199.getClass(), "minute", (byte) 8);
        setByteField(term4199, term4199.getClass(), "second", (byte) 46);
        setIntField(term4199, term4199.getClass(), "nano", 934136445);
        setField(term4194, term4194.getClass(), "time", term4199);
        setField(term4171, term4171.getClass(), "updatedAt", term4194);
        term4204 = new Long(-8033714905181142681L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4204;
        callMethod(klass, "userId", argTypes, term4171, args);
    }

};


