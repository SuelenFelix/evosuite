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

public class UserFollow_UserFollowBuilder_id_10164563081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22584;
     Object term22611;

    public UserFollow_UserFollowBuilder_id_10164563081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22585 = new Long(3447455321955655601L);
        Long term22587 = new Long(-6503611645609982617L);
        Long term22589 = new Long(-7574091101944828886L);
        term22584 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22606 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22584, term22584.getClass(), "id", term22585);
        setField(term22584, term22584.getClass(), "followingId", term22587);
        setField(term22584, term22584.getClass(), "followerId", term22589);
        setIntField(term22592, term22592.getClass(), "year", 2020);
        setShortField(term22592, term22592.getClass(), "month", (short) 5);
        setShortField(term22592, term22592.getClass(), "day", (short) 31);
        setField(term22591, term22591.getClass(), "date", term22592);
        setByteField(term22596, term22596.getClass(), "hour", (byte) 17);
        setByteField(term22596, term22596.getClass(), "minute", (byte) 5);
        setByteField(term22596, term22596.getClass(), "second", (byte) 38);
        setIntField(term22596, term22596.getClass(), "nano", 709012300);
        setField(term22591, term22591.getClass(), "time", term22596);
        setField(term22584, term22584.getClass(), "createdAt", term22591);
        setIntField(term22602, term22602.getClass(), "year", 2021);
        setShortField(term22602, term22602.getClass(), "month", (short) 7);
        setShortField(term22602, term22602.getClass(), "day", (short) 6);
        setField(term22601, term22601.getClass(), "date", term22602);
        setByteField(term22606, term22606.getClass(), "hour", (byte) 12);
        setByteField(term22606, term22606.getClass(), "minute", (byte) 46);
        setByteField(term22606, term22606.getClass(), "second", (byte) 42);
        setIntField(term22606, term22606.getClass(), "nano", 512890850);
        setField(term22601, term22601.getClass(), "time", term22606);
        setField(term22584, term22584.getClass(), "updatedAt", term22601);
        term22611 = new Long(-6792339614909987294L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22611;
        callMethod(klass, "id", argTypes, term22584, args);
    }

};


