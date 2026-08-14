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

public class UserStatBO_UserStatBOBuilder_followingCount_20886935535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12542;
     Object term12579;

    public UserStatBO_UserStatBOBuilder_followingCount_20886935535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12543 = new Long(8540994973773607992L);
        Long term12545 = new Long(-2338103433822116635L);
        Long term12548 = new Long(-1885698929232124806L);
        Long term12551 = new Long(5731563613239387113L);
        Long term12554 = new Long(3381333711768010594L);
        Long term12557 = new Long(3580984732036213717L);
        term12542 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        Object term12559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12574 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12542, term12542.getClass(), "id", term12543);
        setField(term12542, term12542.getClass(), "userId", term12545);
        setBooleanField(term12542, term12542.getClass(), "postCount$set", true);
        setField(term12542, term12542.getClass(), "postCount$value", term12548);
        setBooleanField(term12542, term12542.getClass(), "likeCount$set", true);
        setField(term12542, term12542.getClass(), "likeCount$value", term12551);
        setBooleanField(term12542, term12542.getClass(), "followingCount$set", false);
        setField(term12542, term12542.getClass(), "followingCount$value", term12554);
        setBooleanField(term12542, term12542.getClass(), "followerCount$set", false);
        setField(term12542, term12542.getClass(), "followerCount$value", term12557);
        setIntField(term12560, term12560.getClass(), "year", 2024);
        setShortField(term12560, term12560.getClass(), "month", (short) 9);
        setShortField(term12560, term12560.getClass(), "day", (short) 22);
        setField(term12559, term12559.getClass(), "date", term12560);
        setByteField(term12564, term12564.getClass(), "hour", (byte) 0);
        setByteField(term12564, term12564.getClass(), "minute", (byte) 11);
        setByteField(term12564, term12564.getClass(), "second", (byte) 7);
        setIntField(term12564, term12564.getClass(), "nano", 56643259);
        setField(term12559, term12559.getClass(), "time", term12564);
        setField(term12542, term12542.getClass(), "createdAt", term12559);
        setIntField(term12570, term12570.getClass(), "year", 2021);
        setShortField(term12570, term12570.getClass(), "month", (short) 12);
        setShortField(term12570, term12570.getClass(), "day", (short) 21);
        setField(term12569, term12569.getClass(), "date", term12570);
        setByteField(term12574, term12574.getClass(), "hour", (byte) 12);
        setByteField(term12574, term12574.getClass(), "minute", (byte) 59);
        setByteField(term12574, term12574.getClass(), "second", (byte) 52);
        setIntField(term12574, term12574.getClass(), "nano", 47081639);
        setField(term12569, term12569.getClass(), "time", term12574);
        setField(term12542, term12542.getClass(), "updatedAt", term12569);
        term12579 = new Long(5330761990446327930L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12579;
        callMethod(klass, "followingCount", argTypes, term12542, args);
    }

};


