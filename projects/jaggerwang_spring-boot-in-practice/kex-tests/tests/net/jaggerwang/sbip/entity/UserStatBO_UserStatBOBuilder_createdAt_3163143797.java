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

public class UserStatBO_UserStatBOBuilder_createdAt_3163143797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12620;
     Object term12657;

    public UserStatBO_UserStatBOBuilder_createdAt_3163143797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12621 = new Long(2145420811068634601L);
        Long term12623 = new Long(2191130532479601175L);
        Long term12626 = new Long(860079646007397083L);
        Long term12629 = new Long(3230472384687362867L);
        Long term12632 = new Long(-1145146470850585022L);
        Long term12635 = new Long(1993646237353405740L);
        term12620 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12642 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12652 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12620, term12620.getClass(), "id", term12621);
        setField(term12620, term12620.getClass(), "userId", term12623);
        setBooleanField(term12620, term12620.getClass(), "postCount$set", true);
        setField(term12620, term12620.getClass(), "postCount$value", term12626);
        setBooleanField(term12620, term12620.getClass(), "likeCount$set", false);
        setField(term12620, term12620.getClass(), "likeCount$value", term12629);
        setBooleanField(term12620, term12620.getClass(), "followingCount$set", false);
        setField(term12620, term12620.getClass(), "followingCount$value", term12632);
        setBooleanField(term12620, term12620.getClass(), "followerCount$set", false);
        setField(term12620, term12620.getClass(), "followerCount$value", term12635);
        setIntField(term12638, term12638.getClass(), "year", 2014);
        setShortField(term12638, term12638.getClass(), "month", (short) 1);
        setShortField(term12638, term12638.getClass(), "day", (short) 26);
        setField(term12637, term12637.getClass(), "date", term12638);
        setByteField(term12642, term12642.getClass(), "hour", (byte) 3);
        setByteField(term12642, term12642.getClass(), "minute", (byte) 31);
        setByteField(term12642, term12642.getClass(), "second", (byte) 56);
        setIntField(term12642, term12642.getClass(), "nano", 100873602);
        setField(term12637, term12637.getClass(), "time", term12642);
        setField(term12620, term12620.getClass(), "createdAt", term12637);
        setIntField(term12648, term12648.getClass(), "year", 2021);
        setShortField(term12648, term12648.getClass(), "month", (short) 12);
        setShortField(term12648, term12648.getClass(), "day", (short) 1);
        setField(term12647, term12647.getClass(), "date", term12648);
        setByteField(term12652, term12652.getClass(), "hour", (byte) 15);
        setByteField(term12652, term12652.getClass(), "minute", (byte) 30);
        setByteField(term12652, term12652.getClass(), "second", (byte) 5);
        setIntField(term12652, term12652.getClass(), "nano", 996341606);
        setField(term12647, term12647.getClass(), "time", term12652);
        setField(term12620, term12620.getClass(), "updatedAt", term12647);
        term12657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12662 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12658, term12658.getClass(), "year", 2016);
        setShortField(term12658, term12658.getClass(), "month", (short) 4);
        setShortField(term12658, term12658.getClass(), "day", (short) 18);
        setField(term12657, term12657.getClass(), "date", term12658);
        setByteField(term12662, term12662.getClass(), "hour", (byte) 15);
        setByteField(term12662, term12662.getClass(), "minute", (byte) 56);
        setByteField(term12662, term12662.getClass(), "second", (byte) 45);
        setIntField(term12662, term12662.getClass(), "nano", 248103350);
        setField(term12657, term12657.getClass(), "time", term12662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term12657;
        callMethod(klass, "createdAt", argTypes, term12620, args);
    }

};


